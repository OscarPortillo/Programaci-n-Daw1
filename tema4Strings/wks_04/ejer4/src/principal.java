import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		/*Leer una cadena de hasta 80 caracteres y pasarla en funci�n de una variable de opci�n a
		may�sculas � a min�sculas e imprimir la cadena resultante*/
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		@SuppressWarnings("unused")
		String frase,palabra;
		int opcion;
		System.out.println("Introduce una frase");
		frase = teclado.nextLine();
		System.out.println("1 - may�sculas");
		System.out.println("2 - min�sculas");
		opcion=teclado.nextInt();
	
		if(opcion==1){
			System.out.println(frase.toUpperCase());
		}else{
			System.out.println(frase.toLowerCase());
		}

	}

}
