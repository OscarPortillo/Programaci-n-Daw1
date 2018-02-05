/*Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es
ó no primo (NOTA: Número primo es aquél que es divisible solo por sí mismo y por, la unidad)
Desarrollar este programa creando un método llamado esPrimo que devuelva true si el número
es primo y false si no lo es*/
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		int numero;	
		numero = Estaticos.pideNumPositivo();
		//if (esPrimo(numero))
		if (Estaticos.esPrimo(numero) == true)
			System.out.println("El numero es primo");
		else
			System.out.println("El numero no es primo");
		
		//if (!esPrimo(numero))
		if (Estaticos.esPrimo(numero) == false)
			System.out.println("El numero no es primo");		
		else
			System.out.println("El numero es primo");
	}//main


}//class













