import java.util.Scanner;


public class principal {

	public static void main(String[] args) {

		/*	Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la
		frase o un mensaje indicando que no está.*/
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		String frase,palabra;
		System.out.println("Introduce una frase");
		frase = teclado.nextLine();
		System.out.println("Introduce una palabra");
		palabra = teclado.nextLine();

		if (frase.indexOf(" "+palabra+" ")!=-1){
			System.out.println(" La palabra " +palabra+ " se encuentra en la posición " +frase.indexOf(palabra));
		}else{
			System.out.println(" La palabra no existe");
		}
		if(frase.startsWith(palabra+" ")){
			System.out.println(" La palabra " +palabra+ " se encuentra en la posición " +frase.indexOf(palabra));

		}
		if(frase.endsWith(" "+palabra)){
			System.out.println(" La palabra " +palabra+ " se encuentra en la posición " +frase.indexOf(palabra));

		}
	}

}
