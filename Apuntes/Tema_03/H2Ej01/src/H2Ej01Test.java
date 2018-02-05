import java.util.Scanner;
public class H2Ej01Test { 

	public static void main(String[] arg) {

		int num1, num2, suma, k;
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Primer número?");
		num1 = teclado.nextInt();
		System.out.print("¿Segundo número?");
		num2 = teclado.nextInt();

		while (num1>num2) {
			System.out.print("Error, el primero debe ser menor o igual que el segundo");
			num2=teclado.nextInt();
		}//bucle filtro.
		suma = 0;
		for (k = num1; k <= num2; k++){
			if ( k % 2 != 0){
				suma = suma + k;
			}//si
		}//for
		System.out.print("la suma de los números es " + suma);

	}//main

}//class










