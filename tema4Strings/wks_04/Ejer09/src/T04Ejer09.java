import java.util.Scanner;
public class T04Ejer09 {
	/*Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro primeros sean numéricos y contenidos entre 1990-1995 (un año),
	 *  el quinto carácter sea solo (H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y octavo pueden tener cualquier
	 *   valor. Deben rechazarse los códigos que no cumplan estas condiciones, la finalización de entrada de códigos se produce cuando se introduce el 
	 *   código “00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero y segundo y cuántos
	 *    códigos correctos han sido leídos.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String auxiliar;
		System.out.println( "Escribe el código de persona de 8 caracteres: ");
		String palabra=teclado.nextLine();
		int numLetras;
		int i;
		int hPrimero;
		int mPrimero;
		int hSegundo;
		int mSegundo;
		boolean correcto;

		numLetras=palabra.length();
		hPrimero=0;
		mPrimero=0;
		hSegundo=0;
		mSegundo=0;

		while(numLetras!=8){
			System.out.println( "Escribe el código correctamente, son 8 carácteres, los cuatro primeros son números, el quinto es H ó M, el sexto 1 o 2 : ");
			palabra=teclado.next();
			numLetras=palabra.length();
		}

		while(!palabra.equalsIgnoreCase("00000000")){
			auxiliar=palabra.substring(0, 4);
			correcto=true;
			if(auxiliar.compareTo("1990")<0 || auxiliar.compareTo("1995")>0){
				System.out.println( "Error, código introducido mal escrito: ");
			}else{
				if(palabra.charAt(4)=='H' || palabra.charAt(4)=='M'){
					if(palabra.charAt(5)=='1'){
						if(palabra.charAt(4)=='H'){
							hPrimero++;
						}
						else if(palabra.charAt(4)=='M'){
							mPrimero++;
						}
					}
					else if(palabra.charAt(5)=='2'){
						if(palabra.charAt(4)=='H'){
							hSegundo++;
						}
						else if(palabra.charAt(4)=='M'){
							mSegundo++;
						}
					}
					else{System.out.println( "Error, código introducido mal escrito: ");}
					//else correcto=false;
				}
				else{System.out.println( "Error, código introducido mal escrito: ");
				}
			}
		
		//else correcto=false;


		System.out.println( "Escribe el próximo código: ");
		palabra=teclado.next();
		numLetras=palabra.length();
		while(numLetras!=8){
			System.out.println( "Escribe el código correctamente, son 8 carácteres, los cuatro primeros son números, el quinto es H ó M, el sexto 1 o 2 : ");
			palabra=teclado.next();
			numLetras=palabra.length();
		}
	}
	System.out.println("En Primero hay: "+hPrimero+" hombres y "+mPrimero+" mujeres.");
	System.out.println("En Segundo hay: "+hSegundo+" hombres y "+mSegundo+" mujeres.");
}//main
}//class