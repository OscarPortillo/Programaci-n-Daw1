import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		/*
		 * Hacer un programa para que pida una palabra de no m�s de 20 caracteres y efect�e todas
		las rotaciones posibles de dicha palabra de forma que el �ltimo car�cter pase al primero y
		los dem�s corran un espacio, es decir si la palabra fuera �HOLA� el resultado debe ser :
		HOLA
		AHOL
		LAHO
		OLAH
		 */
		final int max=80;
		String palabra;
		String palabraInvertida;
		int numLetras;
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		numLetras=palabra.length();
		while (palabra.length()>max){
			System.out.println("Introduce una palabra");
			palabra=teclado.nextLine();
			numLetras=palabra.length();
			
		}//while
		for(int k=0;k<numLetras;k++){
			System.out.println(palabra);
			palabraInvertida=palabra.substring(numLetras-1);//lo que hago es guardar en desde el caracter 0 hasta el final menos 1 
			palabra=palabraInvertida+palabra.substring(0,numLetras-1);//guardo en palabra la palabra invertida  m�s lo que vale palabra desde 0 hasta el final menos 1
		}
	}//main

}//class