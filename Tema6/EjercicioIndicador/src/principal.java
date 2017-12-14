import java.util.Scanner;

public class principal {

	public static void main(String[] args) {

		Indicador miIndicador;
		int nivel,tacometro;
		String color;
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		miIndicador=new Indicador();
		System.out.println("Nivel del indicador: "+miIndicador.getNivel());
		System.out.println("Nivel de velocidad tacometro: "+miIndicador.getTacometro());
		System.out.println("Color de mi tacometro: "+miIndicador.getColor());
		System.out.println();
		System.out.println("Vamos a cambiar los datos del tacometro");
		System.out.println();
		System.out.println("Introduce un nivel para el tacometro: ");
		nivel=teclado.nextInt();
		System.out.println("Introduce un nivel de velocidad: ");
		tacometro=teclado.nextInt();
		teclado=new Scanner(System.in);
		System.out.println("Introduce un color: ");
		color=teclado.nextLine();
		miIndicador.setNivel(nivel);
		miIndicador.setTacometro(tacometro);
		miIndicador.setColor(color);
		System.out.println();
		System.out.println("LOS DATOS CAMBIADOS");
		System.out.println("Nivel del indicador: "+miIndicador.getNivel());
		System.out.println("Nivel de velocidad tacometro: "+miIndicador.getTacometro());
		System.out.println("Color de mi tacometro: "+miIndicador.getColor());
		
	}//main

}//class
