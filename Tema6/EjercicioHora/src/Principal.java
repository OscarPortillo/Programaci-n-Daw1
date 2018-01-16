import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		Hora reloj;
		reloj = new Hora ();
		System.out.println("hora inicializada a cero");
		reloj.verHoraModificada();
		int minutos,segundo;
		reloj.verHora();
		System.out.println("Introduce los minutos");
		minutos=teclado.nextInt();
		reloj.setMinuto(minutos);
		System.out.println("Introduce los segundos");
		segundo=teclado.nextInt();
		reloj.setSegundo(segundo);
		System.out.println("Hora insertada manualmente");
		
		reloj.verHoraModificada();
		reloj.verHora();
		
	}//main

}//class
