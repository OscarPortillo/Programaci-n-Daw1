import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar fecha=new GregorianCalendar();
		Scanner teclado=new Scanner(System.in);
		Integer dia;
		Integer mes;
		Integer a�o;
		Integer dia2;
		Integer mes2;
		Integer a�o2;
		dia=fecha.get(Calendar.DAY_OF_MONTH);
		mes=fecha.get(Calendar.MONTH)+1;
		if(mes>12){
			mes=12;
		}
		a�o=fecha.get(Calendar.YEAR);
		System.out.println(dia+" "+mes+" "+a�o);
		Fecha hoy=new Fecha(dia,mes,a�o);

		System.out.println(hoy.esBisiesto()+" .... bisiesto");
		System.out.println(hoy.esCorrecta()+" .... fecha ");
		hoy.getCadenaMes(); 
		hoy.getDiaMes();

		hoy.getCadenaFecha1();
		hoy.getCadenaFecha2();
		System.out.println("Introduzca una fecha v�lida");
		System.out.println("Introduzca el d�a");
		dia2=23;//teclado.nextInt();
		System.out.println("Introduzca el mes");
		mes2=2;//teclado.nextInt();
		System.out.println("Introduzca el a�o");
		a�o2=2028;//teclado.nextInt();
		Fecha hoy2=new Fecha(dia2,mes2,a�o2);
		System.out.println("FECHA INTRODUCIDA MANUALMENTE");
		System.out.println(hoy2.esBisiesto()+" .... bisiesto");
		System.out.println(hoy2.esCorrecta()+" .... fecha ");
		hoy2.getCadenaMes(); 
		hoy2.getDiaMes();

		hoy2.getCadenaFecha1();
		hoy2.getCadenaFecha2();
		hoy2.diferenciafecha(hoy2);
		
	}//main

}//class
