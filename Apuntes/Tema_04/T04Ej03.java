/*3. Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la
frase o un mensaje indicando que no está.*/
import java.util.*;
public class T04Ej03 {

	public static void main(String[] args) {
		String frase,palabra ;
		int n, r;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime una frase");
		frase = teclado.nextLine();
		System.out.println("Dime una palabra");
		palabra = teclado.nextLine();
	
		if (frase.startsWith(palabra + " ")){
			System.out.println("La palabra está en la posición " 
					+ frase.indexOf(palabra));// "0"
		}else if (frase.indexOf(" " + palabra + " ")!= -1){
			System.out.println("La palabra está en la posición "  
					//+  frase.indexOf(" " + palabra + " ") + 1  );
					+ ( frase.indexOf(" " + palabra + " ") + 1 ) );
		}else if (frase.endsWith(" " + palabra)){
			System.out.println("La palabra está en la posición " 
					+ frase.lastIndexOf(palabra));
		}else{
			System.out.println("La palabra no está en la frase");
		}
	}//main
}//class