import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Coche miCoche=new Coche();
		String color;
		int vel,ruedas;
		System.out.println("Datos nuevos del coche");
		System.out.println("Color: "+miCoche.getColor());
		System.out.println("Velocidad: "+miCoche.getVelocidad());
		System.out.println("Ruedas: "+miCoche.getRuedas());
		System.out.println();
		System.out.println("Cambiar datos del coche: ");
		System.out.println("Introduzca un color");
		color=teclado.nextLine();
		miCoche.setColor(color);
		System.out.println("Introduce la velocidad: ");
		vel=teclado.nextInt();
		miCoche.setVelocidad(vel);
		System.out.println("Introduce el n�mero de ruedas");
		ruedas=teclado.nextInt();
		miCoche.setRuedas(ruedas);
		/*System.out.println("Datos nuevos del coche");
		System.out.println("Color: "+miCoche.getColor());
		System.out.println("Velocidad: "+miCoche.getVelocidad());
		System.out.println("Ruedas: "+miCoche.getRuedas());*/
		miCoche.verCoche();
	}//main

}//class
