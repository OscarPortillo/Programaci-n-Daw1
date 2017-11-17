package ejer2;
import java.util.*;
public class principal {

	public static void main(String[] args) {
		/* 2. Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas
		 * 
		mayúsculas y minúsculas tiene y lo imprima*/
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		final int max_long=80;
		int mayus,minus;
		String frase;
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println(frase.length());
		 while (frase.length()>max_long) {
			System.out.println("Introduce una frase");
			frase=teclado.nextLine();
		}
		 mayus=0;
		 minus=0;
		 for (int k=0;k<frase.length();k++){
			 if (frase.charAt(k)>65 && frase.charAt(k)<90){
				 mayus ++;
			 }//if
			 if (frase.charAt(k)>97 && frase.charAt(k)<122){
				 minus ++; 
			 }
		 }//for
		 System.out.println("Hay " +mayus + " letras mayúsculas en la frase");
		 System.out.println("Hay " +minus + " letras minúsculas en la frase");
	}//main

}//class
