/* Escribir un programa que lea códigos de personas de 8 caracteres de modo que los 
cuatro primeros sean numéricos y contenidos entre 1990-1995 (un año), 
el quinto carácter sea solo (H ó M) sexo, el sexto un numero
que representa el curso 1 ó 2, deben rechazarse los códigos que no cumplan estas 
condiciones,  la finalización de entrada de códigos se produce cuando se introduce 
el código “00000000”.
Al final el programa debe sacar un informe indicando cuántos hombres y mujeres hay 
matriculados en primero y segundo y cuántos códigos correctos han sido leídos. */

import java.util.Scanner;

public class T04Ej09 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		boolean banyo,bsexo,bcurso;
		String anyo="", codigo="", sexo="",curso="", salida="00000000";
		int cod_correcto=0, cod_incorrecto=0, contaMujeresPrimero,contaHombresPrimero, contaMujeresSegundo, contaHombresSegundo;

		do{
			System.out.println("Introduce el código de alumno de 8 digitos: ");
			System.out.println("ó 00000000 (8 ceros) para salir: ");
			codigo=teclado.nextLine();
		}while(codigo.length()!=8);//OBLIGAMOS A DAR CODIGOS DE 8 DIGITOS
		contaMujeresPrimero = contaHombresPrimero = contaMujeresSegundo = contaHombresSegundo = 0;
		while (!codigo.equals(salida)){// o while (codigo.equals(salida)==false)
			banyo=false;
			bsexo=false;
			bcurso=false;
			sexo=codigo.substring(4,5);
			curso=codigo.substring(5,6);
			
			//if (codigo.startsWith("1990") || codigo.startsWith("1991") || codigo.startsWith("1992") || codigo.startsWith("1993") || codigo.startsWith("1994") || codigo.startsWith("1995")){^
			if(codigo.substring(0, 4).compareTo("1990")>=0 && codigo.substring(0, 4).compareTo("1995")<=0){
				banyo=true;
			}
			if (sexo.equals("H") || sexo.equals("M") ){
				bsexo=true;
			}
			if (curso.equals("1") || curso.equals("2") ){
				bcurso=true;
			}
			if ((banyo==true) && (bcurso==true) && (bsexo==true)){
				
				cod_correcto++;
				if(curso.equals("1") && sexo.equals("M"))
					contaMujeresPrimero++;
				else if (curso.equals("2") && sexo.equals("M"))
					contaMujeresSegundo++;
				else if (curso.equals("1") && sexo.equals("H"))
					contaHombresPrimero++;
				else if(curso.equals("2") && sexo.equals("H"))
					contaHombresSegundo++;
			}				
			else{
				cod_incorrecto++;
				System.out.println("CODIGO INCORRECTO");
			}
			
			do{
				System.out.println("Introduce el código de alumno de 8 digitos");
				System.out.println("ó 00000000 (8 ceros) para salir: ");
				codigo=teclado.nextLine();
			}while(codigo.length()!=8);//OBLIGAMOS A DAR CODIGOS DE 8 DIGITOS
		}
		System.out.println("******************");
		System.out.println(" FIN DEL PROGRAMA");
		System.out.println("******************");
		System.out.println("CODIGOS CORRECTOS:   " + cod_correcto);
		System.out.println("CODIGOS INCORRECTOS: " + cod_incorrecto);
		System.out.println("MUJERES EN PRIMERO:   " + contaMujeresPrimero);
		System.out.println("MUJERES EN SEGUNDO:   " + contaMujeresSegundo);
		System.out.println("HOMBRES EN PRIMERO:   " + contaHombresPrimero);
		System.out.println("HOMBRES EN SEGUNDO:   " + contaHombresSegundo);

	}//main

}//class
