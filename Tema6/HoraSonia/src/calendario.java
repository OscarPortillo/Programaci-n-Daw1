/*Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de 
tipo int para hora, minutos y segundos. Deber� tener un constructor para inicializar la hora 
a 0 o a una hora determinada (hora, minutos, segundos).Se deber� poder sumar y restar 
horas, as� como imprimir y leer una hora. El formato de impresi�n y lectura ser� hh:mm:ss, 
todo en modo 24 horas.*/

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendario {

	private int hora;
	private int minutos;
	private int segundos;

	Calendar calendario =new GregorianCalendar();

	calendario(){
		hora=calendario.get(Calendar.HOUR_OF_DAY);
		minutos=calendario.get(Calendar.MINUTE);
		segundos=calendario.get(Calendar.SECOND);
	}//constructor



	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	public Calendar getCalendario() {
		return calendario;
	}
	public void setCalendario(Calendar calendario) {
		this.calendario = calendario;
	}



	public void Darhora () {
		
		int horaAux=calendario.get(Calendar.HOUR_OF_DAY)+hora;
		while (horaAux>=24){
			hora=hora-24; 
			System.out.println(hora);
		}
		while (minutos>60) {
			minutos=minutos-60;
			hora++;

		}
		while(segundos>60) {
			segundos=segundos-60;
			minutos++;
		}
		if(hora<10){
			System.out.print( "0"+hora+":");
		}else{
			System.out.print(  hora+":");
		}
		
		if(minutos<10){
			System.out.print( "0"+minutos+":");		
		}else{
			System.out.print( minutos+":");
		}
		if(segundos<10){
			System.out.print( "0"+segundos);
		}else{
			System.out.print(segundos);
		}
		//System.out.println(hora+":"+minutos+":"+segundos);

	}//metodo ver hora

}//class