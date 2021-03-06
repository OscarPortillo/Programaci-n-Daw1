import java.util.Scanner;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer a�o;

	Fecha(Integer dia,Integer mes,Integer a�o){
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;
	}//constructor que recibe 3 parametros

	public Integer getDia() {
		return dia;
	}

	public void setDia(Integer dia) {
		this.dia = dia;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getA�o() {
		return a�o;
	}

	public void setA�o(Integer a�o) {
		this.a�o = a�o;
	}
	public   boolean esBisiesto() {
		boolean esBisiesto;

		if((a�o % 4 == 0)&& ((a�o % 100!= 0) || (a�o % 400 == 0))){
			esBisiesto=true;
		}else{
			esBisiesto=false;
		}
		return esBisiesto;
	}//metodo para saber si un a�o es bisiesto

	public   boolean esCorrecta(){//metodo para saber si la fecha es correcta
		boolean correcta=false;
		int contaErrores;
		contaErrores=0;
		if(mes==1){//enero
			if(dia<31 && dia>0){//si esta bien lo pongo a correcto
				correcta=true;
			}else{
				contaErrores++;//si esta mal algo le sumo 1
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} 
		if(mes==2){//Febrero
			if(esBisiesto()==true){//si es biciesto entrar� y febrero ser� de 29 d�as//febrero
				if((dia<29 && dia >0 ) && a�o <9999 && a�o >0){//febrero
					correcta=true;
				}else{
					contaErrores++;
				}
			}else{//si no es biciesto febrero tendr� 28 d�as
				if((dia<28 && dia >0 ) && a�o <9999 && a�o >0){
					correcta=true;
				}else{
					contaErrores++;
				}
			}
		}//2

		if(mes==3){//marzo
			if(dia<31 && dia >0 ){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o <9999 && a�o >0){//marzo
				correcta=true;
			}else{
				contaErrores++;
			}
		}


		if(mes==4){//abril
			if(dia<30 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o<0){
				correcta=true;
			}else{
				contaErrores++;
			}
		}

		if(mes==5){//mayo
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==6){//junio
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==7){//julio
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==8){//agosto
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==9){//septiembre
			if(dia<30 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==10){//octubre
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==11){//noviembre
			if(dia<30 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(mes==12){//diciebre
			if(dia<31 && dia >0){
				correcta=true;
			}else{
				contaErrores++;
			}
			if(a�o<9999 && a�o>0){
				correcta=true;
			}else{
				contaErrores++;
			}
		} //5
		if(contaErrores!=0){//si es distinto de 0 entonces no vale por que se ha equivocado en alguna parte
			correcta=false;
		}
		return correcta;
	}//metodo para ver si la fecha es correcta
	public void getCadenaMes(){//metodo mes Cadena

		String mesLetra = null;
		if(mes==1){
			mesLetra="Enero";
		}
		if(mes==2){
			mesLetra="Febrero";
		}
		if(mes==3){
			mesLetra="Marzo";
		}
		if(mes==4){
			mesLetra="Abril";
		}
		if(mes==5){
			mesLetra="Mayo";
		}
		if(mes==6){
			mesLetra="Junio";
		}
		if(mes==7){
			mesLetra="Julio";
		}
		if(mes==8){
			mesLetra="Agosto";
		}
		if(mes==9){
			mesLetra="Septiembre";
		}
		if(mes==10){
			mesLetra="Octubre";
		}
		if(mes==11){
			mesLetra="Noviembre";
		}
		if(mes==12){
			mesLetra="Diciembre";
		}
		System.out.print(mesLetra);
	}//metodo mes Cadena
	public void getDiaMes(){ 
		int dias = 0;
		if(mes==1){
			dias=31;
		}
		if(mes==2){
			if(esBisiesto()){
				dias=29;
			}else{
				dias=28;
			}
		}
		if(mes==3){
			dias=31;
		}
		if(mes==4){
			dias=30;
		}
		if(mes==5){
			dias=31;
		}
		if(mes==6){
			dias=30;
		}
		if(mes==7){
			dias=31;
		}
		if(mes==8){
			dias=31;
		}
		if(mes==9){
			dias=30;
		}
		if(mes==10){
			dias=31;
		}
		if(mes==11){
			dias=30;
		}
		if(mes==12){
			dias=31;
		} 
		System.out.print(" "+dias+"\n");
	}//metodo dias mes
	public void getCadenaFecha1(){
		System.out.println(dia+"-"+mes+"-"+a�o);
	}//metodo mostrar fecha
	public void getCadenaFecha2(){
		System.out.print(dia+" de ");
		getCadenaMes();
		System.out.println(" de "+a�o);
	}//metodo mostrar fecha cadena
	public Integer diferenciaFecha(Fecha fecha2) {
		Scanner teclado=new Scanner(System.in);
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
			if (esBisiesto() == true) {
				totalDias++; // un d�a m�s por febrero.
			}
			totalDias = i * 365;

		}
		for (i = 0; i < a�o1 - 1; i++) {
			if (esBisiesto() == true) {
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
}//class














