/* Escribe un programa que pida por teclado dos nombres con su apellido cada uno del
siguiente modo:
Introduce un nombre y un apellido:
Manuel García
Introduce otro nombre y apellido:
Jimena Pérez
Después debe intercambiar los apellidos a los nombres y mostrarlos:
Jimena García
Manuel Pérez
*/
import java.util.Scanner;
public class T04H2Ej04v1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase1, frase2, nombre1="", nombre2="", apellido1="", apellido2="";
		int posEspacio1, posEspacio2;

		System.out.println("Primer nombre y apellido?: ");
		frase1=teclado.nextLine();  
		System.out.println("Segundo nombre y apellido?: ");
		frase2=teclado.nextLine();

		posEspacio1=frase1.indexOf(' ');
		posEspacio2=frase2.indexOf(' ');

		if (posEspacio1 !=-1){
			nombre1=frase1.substring(0,posEspacio1);
			apellido1=frase1.substring(posEspacio1);
		}//if
		if (posEspacio2 !=-1){
			nombre2=frase2.substring(0,posEspacio2);
			apellido2=frase2.substring(posEspacio2);
		}//if
		System.out.println(frase1.replaceFirst(nombre1,nombre2));
		System.out.println(frase2.replaceFirst(nombre2,nombre1));
		
		System.out.println("*********************  De otra forma **********************");
		System.out.println(nombre2 + apellido1);
		System.out.println(nombre1 + apellido2);
	}//main

}
