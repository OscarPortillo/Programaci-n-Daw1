import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner (System.in);
		/*
		 * Escribir un programa que pida por teclado una cadena y una letra, de manera que
			ponga en may�sculas cada ocurrencia de la letra que haya en la cadena y lo
			muestre por pantalla.
		 */
		String frase,fraseNueva = null;
		String letra;
		char caracter;
		char caracterNuevo;
		
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("Introduce una letra");
		letra = teclado.next();
		caracter=letra.charAt(0); 
		for(int k=0;k<frase.length();k++){
			if(caracter==frase.charAt(k)){
				 caracterNuevo=frase.toUpperCase().charAt(k);
				 fraseNueva=frase.replace(frase.charAt(k), caracterNuevo);
			}
			 
		}
		System.out.println(fraseNueva);
		
	}//main

}//class