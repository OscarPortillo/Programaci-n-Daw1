import java.util.Scanner;
public class EjemReadLine {

	public static void main(String[] args) {
		String cadena;
		int num;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Nombre?");
		cadena = teclado.nextLine();
		System.out.println("Numero?");
		num = teclado.nextInt(); teclado.nextLine();
		System.out.println("Nombre?");
		cadena = teclado.nextLine();
		System.out.println("Numero?");
		num = teclado.nextInt();
		
	}//main

}//class
