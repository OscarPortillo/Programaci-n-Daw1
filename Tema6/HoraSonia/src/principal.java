import java.util.*;

/*Desarrollar un programa en Java que utilice una clase que se llame Hora con miembros de 
tipo int para hora, minutos y segundos. Deber� tener un constructor para inicializar la hora 
a 0 o a una hora determinada (hora, minutos, segundos).Se deber� poder sumar y restar 
horas, as� como imprimir y leer una hora. El formato de impresi�n y lectura ser� hh:mm:ss, 
todo en modo 24 horas.*/
public class principal {
	

	public static void main(String[] args) {
		int n;
		
		
		Scanner teclado= new Scanner(System.in);
		calendario tiempo;
		
		tiempo=new calendario();
		
		System.out.print( "hora: " + tiempo.getHora()+":"+tiempo.getMinutos()+":"+tiempo.getSegundos() );
		
		
		if(tiempo.getHora()<10){
			System.out.print( "0"+tiempo.getHora());
		}
		
		if(tiempo.getMinutos()<10){
			System.out.print( "0"+tiempo.getHora());
		
		}
		if(tiempo.getSegundos()<10){
			System.out.print( "0"+tiempo.getHora());
		}
		System.out.println();
		System.out.println("dame un numero para las horas");
		n=teclado.nextInt();
		tiempo.setHora(n);
		
	//System.out.println(tiempo.getHora()+":"+tiempo.getMinutos()+":"+tiempo.getSegundos()) ;
	}//main

}//class
