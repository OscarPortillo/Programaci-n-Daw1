/*Dados dos n�meros P y Q que leeremos por teclado y que deben ser positivos, hacer un
programa que nos diga cual de los dos tiene m�s divisores, con un mensaje que diga �P tiene
mas divisores que Q� � viceversa.
Este programa debe llamar a un m�todo que calcule los divisores de un numero, y lo aplique
para P y para Q y luego compare y decida*/

public class Ejer2 {

	public static void main(String[] args) {
		int p,q;
		p=Estaticos.pideNumPositivo();
		q=Estaticos.pideNumPositivo();
		
		if(Estaticos.cuantosDiv(p) > Estaticos.cuantosDiv(q)){
			System.out.println(p + " tiene mas divisores que " + q);
		}else if(Estaticos.cuantosDiv(q) > Estaticos.cuantosDiv(p)){
			System.out.println(q + " tiene mas divisores que " + p);
		}else{
			System.out.println("Tienen el mismo numero de divisores");
		}
	}// main

}// class
