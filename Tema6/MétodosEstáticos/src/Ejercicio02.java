import java.util.*;
public class Ejercicio02 {
	public static void main(String[] args) {
		/**
		 * Dados dos n�meros P y Q que leeremos por teclado y que deben ser positivos, 
		 * hacer unprograma que nos diga cual de los dos tiene m�s divisores, con un mensaje que diga �P tiene
		 * mas divisores que Q� � viceversa.
		 * Este programa debe llamar a un m�todo que calcule los divisores de un numero, y lo aplique
		 * para P y para Q y luego compare y decida.
		 */
		Scanner teclado=new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Introduce un numero:");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero:");
		num2=teclado.nextInt();
		
		if(Estaticos.divisores(num1) > Estaticos.divisores(num2)){
			System.out.println(num1 +" tiene m�s divisores que "+num2);
		}else if(Estaticos.divisores(num1) < Estaticos.divisores(num2)){
			System.out.println(num2 +" tiene m�s divisores que "+num1);
		}else{
			System.out.println("tienen los mismos divisores");
		}
		
	}//main
}//class ejercicio02