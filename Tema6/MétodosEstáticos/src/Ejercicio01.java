import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		/**
		 * Hacer un programa que lea un n�mero N y nos 
		 * escriba en la pantalla mediante un mensaje si es
		 * � no primo (NOTA: N�mero primo es aqu�l que es 
		 * divisible solo por s� mismo y por, la unidad)
		 * Desarrollar este programa creando un m�todo 
		 * llamado primo que devuelva true si el n�mero
		 * es primo y false si no lo es.
		 */
		int num;
		
		Scanner teclado=new Scanner(System.in);		
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		//Estaticos saberPrimo=new Estaticos(num);
		
		
		Estaticos.primo(num);
		teclado.close();
	}//main

}//class
