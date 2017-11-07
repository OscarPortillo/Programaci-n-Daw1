import java.util.Scanner;
public class T04Ejer09 {
	/*Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro primeros sean num�ricos y contenidos entre 1990-1995 (un a�o),
	 *  el quinto car�cter sea solo (H � M) sexo, el sexto un numero que representa el curso 1 � 2 y los caracteres s�ptimo y octavo pueden tener cualquier
	 *   valor. Deben rechazarse los c�digos que no cumplan estas condiciones, la finalizaci�n de entrada de c�digos se produce cuando se introduce el 
	 *   c�digo �00000000�. Al final el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay matriculados en primero y segundo y cu�ntos
	 *    c�digos correctos han sido le�dos.*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String auxiliar;
		System.out.println( "Escribe el c�digo de persona de 8 caracteres: ");
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
			System.out.println( "Escribe el c�digo correctamente, son 8 car�cteres, los cuatro primeros son n�meros, el quinto es H � M, el sexto 1 o 2 : ");
			palabra=teclado.next();
			numLetras=palabra.length();
		}

		while(!palabra.equalsIgnoreCase("00000000")){
			auxiliar=palabra.substring(0, 4);
			correcto=true;
			if(auxiliar.compareTo("1990")<0 || auxiliar.compareTo("1995")>0){
				System.out.println( "Error, c�digo introducido mal escrito: ");
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
					else{System.out.println( "Error, c�digo introducido mal escrito: ");}
					//else correcto=false;
				}
				else{System.out.println( "Error, c�digo introducido mal escrito: ");
				}
			}
		
		//else correcto=false;


		System.out.println( "Escribe el pr�ximo c�digo: ");
		palabra=teclado.next();
		numLetras=palabra.length();
		while(numLetras!=8){
			System.out.println( "Escribe el c�digo correctamente, son 8 car�cteres, los cuatro primeros son n�meros, el quinto es H � M, el sexto 1 o 2 : ");
			palabra=teclado.next();
			numLetras=palabra.length();
		}
	}
	System.out.println("En Primero hay: "+hPrimero+" hombres y "+mPrimero+" mujeres.");
	System.out.println("En Segundo hay: "+hSegundo+" hombres y "+mSegundo+" mujeres.");
}//main
}//class