/*Hacer un programa para que pida una palabra de no más de 20 caracteres y efectúe todas
las rotaciones posibles de dicha palabra de forma que el último carácter pase al primero y
los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :
HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones.*/

import java.util.*;
public class T04H1Ej11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String palabra = "";
		final int MAX = 20;
		int k;
		do{
			System.out.println("Dame una palabra hasta max 20 caracteres");
			palabra = teclado.next();
		}while(palabra.length() > MAX);
		
		for(k=0; k < palabra.length(); k++){
			System.out.println(palabra);
			palabra = palabra.substring(palabra.length()-1) 
					+ palabra.substring(0,palabra.length()-1);
		}

	}//main

}//class
