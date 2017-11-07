import java.util.*;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribir un programa que lea c�digos de personas de 8 caracteres de modo que los cuatro primeros sean num�ricos y contenidos entre 1990-1995 (un a�o),
		 *  el quinto car�cter sea solo (H � M) sexo, el sexto un numero que representa el curso 1 � 2 y los caracteres s�ptimo y octavo pueden tener cualquier
		 *   valor. Deben rechazarse los c�digos que no cumplan estas condiciones, la finalizaci�n de entrada de c�digos se produce cuando se introduce el 
		 *   c�digo �00000000�. Al final el programa debe sacar un informe indicando cu�ntos hombres y mujeres hay matriculados en primero y segundo y cu�ntos
		 *    c�digos correctos han sido le�dos.*/
		Scanner teclado=new Scanner(System.in);
		String codigo;
		String auxiliar;
		int numLetras;
		int hombreDePrimero;
		int mujeresDePrimero;
		int hombreDeSegundo;
		int mujeresDeSegundo;
		int sumaCorrectos;
		boolean correcto  ;
		System.out.println("Introduce el codigo de 8 caracteres:");
		codigo=teclado.nextLine();
		numLetras=codigo.length();
		while(numLetras!=8){
			System.out.println("Introduce el codigo de 8 caracteres:");
			codigo=teclado.nextLine();
			numLetras=codigo.length();
		}//while mietras sea distinto de 8 vuelvo a pedir los datos
		hombreDePrimero=0;
		mujeresDePrimero=0;
		hombreDeSegundo=0;
		mujeresDeSegundo=0;
		sumaCorrectos=0;
		while(!codigo.equalsIgnoreCase("00000000")){
			auxiliar=codigo.substring(0,4);
			correcto=true;
			if(auxiliar.compareTo("1990")<0 || auxiliar.compareTo("1995")>0){
				System.out.println("Vuelve a introducir el codigo");
			}//primer if para comparar los a�os
			else{
				if(codigo.charAt(4)=='H' || codigo.charAt(4)=='M'){ //compara el 5 caracter 
					if(codigo.charAt(5)=='1'){ //si es primero
						if(codigo.charAt(4)=='H'){//si es hombre
							hombreDePrimero++; //si es primero le sumo 1
						}
						else if(codigo.charAt(4)=='M'){ //si es M a mPrimero le sumo 1
							mujeresDePrimero++;
						} //else if

					} //si son de primero
					else if(codigo.charAt(5)=='2'){//
						if(codigo.charAt(4)=='H'){
							hombreDeSegundo++;
						}else if(codigo.charAt(4)=='M'){
							mujeresDeSegundo++;
						}
					}//si son de segundo
					else{
						System.out.println("Error, vuelve a introducir el codigo");
					}
				} //Perimer if
				else{
					System.out.println("Error vuelve a introducir el codigo");
				}
			} //else
			System.out.println("Escribe el siguiente codigo");
			codigo=teclado.nextLine();
			numLetras=codigo.length();
			while(numLetras!=8){
				System.out.println( "Escribe el c�digo correctamente");
				codigo=teclado.next();
				numLetras=codigo.length();
			}
			sumaCorrectos=mujeresDePrimero+hombreDePrimero+mujeresDeSegundo+hombreDeSegundo;
			} //if externo
		System.out.println("Mujeres de primero: "+ mujeresDePrimero+" Hombres de primero "+hombreDePrimero);
		System.out.println("Mujeres de segundo: "+ mujeresDeSegundo+" Hombres de segundo "+hombreDeSegundo);
		System.out.println("Hay en total "+sumaCorrectos+" En total");
	}//main

}//class