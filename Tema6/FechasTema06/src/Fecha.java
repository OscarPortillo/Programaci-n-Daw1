import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
	private Integer dia;
	private Integer mes;
	private Integer a�o;

	Fecha(int dia,int mes,int a�o){
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
	public static boolean esBisiesto() {
		boolean esBisiesto;
		Calendar fecha=new GregorianCalendar();
		int a�o;
		a�o=fecha.get(Calendar.YEAR);
		if((a�o % 4 == 0)&& ((a�o % 100!= 0) || (a�o % 400 == 0))){
			esBisiesto=true;
		}else{
			esBisiesto=false;
		}
		return esBisiesto;
	}//metodo para saber si un a�o es bisiesto

	public static boolean esCorrecta(){
		boolean correcta=false;
		@SuppressWarnings("unused")
		int contaErrores;
		contaErrores=0;
		Calendar fecha=new GregorianCalendar();
		@SuppressWarnings("unused")
		int dia,mes,a�o;
		dia=fecha.get(Calendar.DAY_OF_MONTH);
		mes=fecha.get(Calendar.MONTH)+1;//le sumo 1 para que no de mes 0
		//mes=mes-1;
		a�o=fecha.get(Calendar.YEAR);
		if(mes ==13 ){//si mes es mayor que 12 le resto 1 
			mes=mes-1;
		}
		if(mes==1){
			if(dia<31 && dia>0){
				correcta=true;
			}else{
				contaErrores++;
			}
			 

		}else{
			contaErrores++;
		}//1
	/*	if(mes==2){//Febrero
			if(Fecha.esBisiesto()==true){//si es biciesto entrar� y febrero ser� de 29 d�as//febrero
				if((dia<29 && dia >0 ) && a�o <9999 && a�o >0){//febrero
					esCorrecta=true;
				}else{
					esCorrecta=false;
				}
			}else{//si no es biciesto febrero tendr� 28 d�as
				if((dia<28 && dia >0 ) && a�o <9999 && a�o >0){
					esCorrecta=true;
				}else{
					esCorrecta=false;
				}
			}
		}//2
		if(mes==3 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//marzo
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//3
		if(mes==4 && (dia<30 && dia >0 )&& a�o <9999 && a�o >0){//abril
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//4
		if(mes==5 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//mayo
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//5
		if(mes==6 && (dia<30 && dia >0 )&& a�o <9999 && a�o >0){//junio
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//6
		if(mes==7 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//julio
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//7
		if(mes==8 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//agosto
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//8
		if(mes==9 && (dia<30 && dia >0 )&& a�o <9999 && a�o >0){//septiembre
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//9
		if(mes==10 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//Octubre
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//10
		if(mes==11 && (dia<30 && dia >0 )&& a�o <9999 && a�o >0){//noviembre
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//11
		if(mes==12 && (dia<31 && dia >0 )&& a�o <9999 && a�o >0){//diciembre
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}//12
		return esCorrecta;*/
		return correcta;
	}//metodo para ver si la fecha es correcta
}//class














