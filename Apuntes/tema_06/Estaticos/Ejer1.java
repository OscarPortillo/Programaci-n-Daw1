/*Hacer un programa que lea un n�mero N y nos escriba en la pantalla mediante un mensaje si es
� no primo (NOTA: N�mero primo es aqu�l que es divisible solo por s� mismo y por, la unidad)
Desarrollar este programa creando un m�todo llamado esPrimo que devuelva true si el n�mero
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













