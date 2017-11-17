import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner teclado=new Scanner(System.in);
		String palabra;
		@SuppressWarnings("unused")
		char primero;
		@SuppressWarnings("unused")
		char ultimo;
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		
		for(int i=0;i<palabra.length();i++){
			primero=palabra.charAt(0);
			
		}
	}//main

}//class
