import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int a�o;
	private int sumaDias;

	Scanner teclado = new Scanner(System.in);

	Fecha(int a�o, int mes, int dia) {

		this.a�o = a�o;
		this.mes = mes;
		this.dia = dia;

	}// class

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public int getSumaDias() {
		return sumaDias;
	}

	public boolean esBisiesto() {

		if ((a�o % 4 == 0) && (a�o % 100 != 0) && (a�o % 400 == 0)) {
			// System.out.println("el a�o es bisiesto.");
			return true;
		} else {
			// System.out.println("el a�o no es bisiesto.");
			return false;
		}
	}// esBisiesto

	public boolean esBisiesto(int i) {

		if ((a�o % 4 == 0) && (a�o % 100 != 0) && (a�o % 400 == 0)) {
			// System.out.println("el a�o es bisiesto.");
			return true;
		} else {
			// System.out.println("el a�o no es bisiesto.");
			return false;
		}

	}// esBisiesto

	public boolean esCorrecta() {
		boolean correcto = true;

		esBisiesto();

		if ((a�o >= 0 && a�o <= 2018)) {
			if (mes >= 1 && mes <= 12) {
				if (dia >= 1 && dia <= 31) {
					correcto = true;
				}
			}
		} else {
			correcto = false;
		}
		return correcto;

	}// esCorrecta

	public String getCadenaMes() {
		String mesesA�o[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		String mesCorrecto = "";

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				// si mes == 1
				mesCorrecto = mesesA�o[i];
				// mesCorrecto=Enero
			}
		}

		return mesCorrecto;
	}

	public int getDiasMes() {
		String mesesA�o[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int mesCorrecto = 0;

		esBisiesto(); // lo llamamos para comprobar si el a�o es bisiesto. (Dado
		// que lo habremos escrito anteriormente, sabr� de que
		// a�o hablamos).

		mesesA�o[1] = "31";
		mesesA�o[2] = "28";
		mesesA�o[3] = "31";
		mesesA�o[4] = "30";
		mesesA�o[5] = "31";
		mesesA�o[6] = "30";
		mesesA�o[7] = "31";
		mesesA�o[8] = "31";
		mesesA�o[9] = "30";
		mesesA�o[10] = "31";
		mesesA�o[11] = "30";
		mesesA�o[12] = "31";

		if (esBisiesto() == true) {
			mesesA�o[1] = "29"; // febrero = 29 si es bisiesto.
		}

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				mesCorrecto = Integer.parseInt(mesesA�o[i]);
			}
		}
		return mesCorrecto;
	}

	public String getCadenaFecha1() {
		String cadena;
		String diaString, mesString, a�oString;

		// dd-mm-yyyy

		if (dia >= 0 && dia <= 9) {
			diaString = "0" + dia;
		} else {
			diaString = "" + dia;
		}
		if (mes >= 0 && mes <= 9) {
			mesString = "0" + mes;
		} else {
			mesString = "" + mes;
		}
		if (a�o >= 0 && a�o <= 9) {
			a�oString = "000" + a�o;
		} else if (a�o >= 10 && a�o <= 99) {
			a�oString = "00" + a�o;
		} else if (a�o >= 100 && a�o <= 999) {
			a�oString = "0" + a�o;
		} else {
			a�oString = "" + a�o;
		}

		cadena = diaString + "/" + mesString + "/" + a�oString;

		return cadena;
	}

	public String getCadenaFecha2() {
		String cadena;

		getCadenaMes();

		cadena = "" + dia + " de " + getCadenaMes() + " de " + a�o;

		return cadena;
	}

	public Integer diferenciaFecha(Fecha fecha2) {

		Integer difDias = 0;
		int totalDias = 0, totalDias1 = 0, i, dia1, mes1, a�o1;
		int diasMeses[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// dado que el mes 0 no existe, lo ponemos a 0 y as� cuando compruebe si
		// tiene 30 o 31 d�as lo ignorar� y pasar� al siguiente (para suma de
		// meses)
		if (esBisiesto() == true) {
			diasMeses[2] = 29;
		}

		System.out.println("Dame un d�a");
		dia1 = teclado.nextInt();

		System.out.println("Dame un mes");
		mes1 = teclado.nextInt();

		System.out.println("Dame un a�o");
		a�o1 = teclado.nextInt();

		fecha2 = new Fecha(a�o1, mes1, dia1);

		while (a�o > a�o1) {

			System.out.println("El primer a�o debe ser inferior al segundo.");
			System.out.println();

			System.out.println("Dame un segundo a�o (mayor que el primero).");
			a�o1 = teclado.nextInt();

		}
		// vamos a obtener cuantos d�as hay desde un punto de referencia (0) en
		// las dos fechas, y luego las restaremos entre ellas.

		for (i = 0; i < a�o - 1; i++) { // es -1 el a�o porque no es el a�o
										// completo, no son 365 d�as. Eso lo
										// calculamos m�s adelante.
			if (esBisiesto(i) == true) {
				totalDias++; // un d�a m�s por febrero.
			}
			totalDias = i * 365;

		}
		for (i = 0; i < a�o1 - 1; i++) {
			if (esBisiesto(i) == true) {
				totalDias1++;
			}
			totalDias1 = i * 365;
		}

		for (i = 0; i < mes; i++) {
			if (diasMeses[i] == 31) {
				totalDias = totalDias + 31;
			}
			if (diasMeses[i] == 30) {
				totalDias = totalDias + 30;
			}
		}

		for (i = 0; i < mes1; i++) {
			if (diasMeses[i] == 31) {
				totalDias1 = totalDias1 + 31;
			}
			if (diasMeses[i] == 30) {
				totalDias1 = totalDias1 + 30;
			}
		}

		totalDias = totalDias + dia;
		totalDias1 = totalDias1 + dia1;

		difDias = totalDias1 - totalDias;

		return difDias;
	}

	public Fecha sumaDias(Integer num) {

		int mesesA�o[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (esBisiesto() == true) {
			mesesA�o[2] = 29; // febrero = 29 si es bisiesto.
		}

		dia = num + dia;

		while (dia > mesesA�o[mes]) {

			mes++;
			dia = dia - mesesA�o[mes];

			if (mes > 12) {
				mes = 1;
				a�o++;

			}
		}

		sumaDias = dia;
		return new Fecha(a�o, mes, dia);

	}

}// class
