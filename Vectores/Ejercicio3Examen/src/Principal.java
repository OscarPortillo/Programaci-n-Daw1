import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String frase,numero = "";
		char numString;
		int k,num,suma;
		
		System.out.println("Introduce una frase");
		
		frase = teclado.nextLine();
		suma=0;
		for (k=0; k < frase.length(); k++){
			if (frase.charAt(k)<=57 && frase.charAt(k) >= 48){
				numero=""+ frase.charAt(k);//guardamos en numero el codigo el caracter con posicion k
				num=Integer.parseInt(numero);//convertimos a entero el vcaracter guardado en numero
				suma=suma+num;//guardamos en suma el caracater convertido
			}
		}
		System.out.println("Suma "+suma);
	}//main

}//class
