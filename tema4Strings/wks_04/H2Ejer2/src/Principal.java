import java.util.*;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner (System.in);
		/*
		 * Escribe un programa que pida por teclado una cadena y una letra, de manera que
		elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
		por pantalla.
		 */
		String frase="",fraseNueva=""; 
		char letra;
		String unaLetra = "",letraVacia="";

		System.out.println("Introduce una frase");
		frase=teclado.nextLine();

		System.out.println("Introduce una letra");
		letra=teclado.nextLine().charAt(0);
		fraseNueva=new String(frase);
		unaLetra=unaLetra+letra;

		for(int k=0;k<3;k++){
			if(letra == frase.charAt(k)){
				fraseNueva=frase.replace(unaLetra,letraVacia);
			}
		}
		System.out.println(fraseNueva);
	}//main

}//class