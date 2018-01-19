import java.util.*;

public class Fecha {

	private int dia;
	private int mes;
	private int año;
	private int sumaDias;

	Scanner teclado = new Scanner(System.in);

	Fecha(int año, int mes, int dia) {

		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getSumaDias() {
		return sumaDias;
	}

	public boolean esBisiesto() {

		if ((año % 4 == 0) && (año % 100 != 0) && (año % 400 == 0)) {
			// System.out.println("el año es bisiesto.");
			return true;
		} else {
			// System.out.println("el año no es bisiesto.");
			return false;
		}
	}// esBisiesto

	public boolean esBisiesto(int i) {

		if ((año % 4 == 0) && (año % 100 != 0) && (año % 400 == 0)) {
			// System.out.println("el año es bisiesto.");
			return true;
		} else {
			// System.out.println("el año no es bisiesto.");
			return false;
		}

	}// esBisiesto

	public boolean esCorrecta() {
		boolean correcto = true;

		esBisiesto();

		if ((año >= 0 && año <= 2018)) {
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
		String mesesAño[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		String mesCorrecto = "";

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				// si mes == 1
				mesCorrecto = mesesAño[i];
				// mesCorrecto=Enero
			}
		}

		return mesCorrecto;
	}

	public int getDiasMes() {
		String mesesAño[] = { "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };
		int mesCorrecto = 0;

		esBisiesto(); // lo llamamos para comprobar si el año es bisiesto. (Dado
		// que lo habremos escrito anteriormente, sabrá de que
		// año hablamos).

		mesesAño[1] = "31";
		mesesAño[2] = "28";
		mesesAño[3] = "31";
		mesesAño[4] = "30";
		mesesAño[5] = "31";
		mesesAño[6] = "30";
		mesesAño[7] = "31";
		mesesAño[8] = "31";
		mesesAño[9] = "30";
		mesesAño[10] = "31";
		mesesAño[11] = "30";
		mesesAño[12] = "31";

		if (esBisiesto() == true) {
			mesesAño[1] = "29"; // febrero = 29 si es bisiesto.
		}

		for (int i = 1; i < 13; i++) {

			if (mes == i) {
				mesCorrecto = Integer.parseInt(mesesAño[i]);
			}
		}
		return mesCorrecto;
	}

	public String getCadenaFecha1() {
		String cadena;
		String diaString, mesString, añoString;

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
		if (año >= 0 && año <= 9) {
			añoString = "000" + año;
		} else if (año >= 10 && año <= 99) {
			añoString = "00" + año;
		} else if (año >= 100 && año <= 999) {
			añoString = "0" + año;
		} else {
			añoString = "" + año;
		}

		cadena = diaString + "/" + mesString + "/" + añoString;

		return cadena;
	}

	public String getCadenaFecha2() {
		String cadena;

		getCadenaMes();

		cadena = "" + dia + " de " + getCadenaMes() + " de " + año;

		return cadena;
	}

	public Integer diferenciaFecha(Fecha fecha2) {

		Integer difDias = 0;
		int totalDias = 0, totalDias1 = 0, i, dia1, mes1, año1;
		int diasMeses[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// dado que el mes 0 no existe, lo ponemos a 0 y así cuando compruebe si
		// tiene 30 o 31 días lo ignorará y pasará al siguiente (para suma de
		// meses)
		if (esBisiesto() == true) {
			diasMeses[2] = 29;
		}

		System.out.println("Dame un día");
		dia1 = teclado.nextInt();

		System.out.println("Dame un mes");
		mes1 = teclado.nextInt();

		System.out.println("Dame un año");
		año1 = teclado.nextInt();

		fecha2 = new Fecha(año1, mes1, dia1);

		while (año > año1) {

			System.out.println("El primer año debe ser inferior al segundo.");
			System.out.println();

			System.out.println("Dame un segundo año (mayor que el primero).");
			año1 = teclado.nextInt();

		}
		// vamos a obtener cuantos días hay desde un punto de referencia (0) en
		// las dos fechas, y luego las restaremos entre ellas.

		for (i = 0; i < año - 1; i++) { // es -1 el año porque no es el año
										// completo, no son 365 días. Eso lo
										// calculamos más adelante.
			if (esBisiesto(i) == true) {
				totalDias++; // un día más por febrero.
			}
			totalDias = i * 365;

		}
		for (i = 0; i < año1 - 1; i++) {
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

		int mesesAño[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (esBisiesto() == true) {
			mesesAño[2] = 29; // febrero = 29 si es bisiesto.
		}

		dia = num + dia;

		while (dia > mesesAño[mes]) {

			mes++;
			dia = dia - mesesAño[mes];

			if (mes > 12) {
				mes = 1;
				año++;

			}
		}

		sumaDias = dia;
		return new Fecha(año, mes, dia);

	}

}// class
