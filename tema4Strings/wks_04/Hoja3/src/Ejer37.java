import java.util.*;
public class Ejer37 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado=new Scanner(System.in);
		/*37.-Generar una matriz de 4 filas y 5 columnas 
		 * con n�meros aleatorios entre 1 y 100, y hacer
		 * su matriz transpuesta.*/
		int vecNum[][]=new int[4][5];
		int i,k;
		Random azar=new Random();
		System.out.println("Generando matriz");
		for( i=0; i<5; i++){
			for(k=0;k<4;k++){
				vecNum[k][i]=azar.nextInt(100)+1;
			}
		}
		for(i = 0; i < 5 ; i++){
			
			for( k= 0; k<4;k++){				
				System.out.print(vecNum[k][i]+"  ");
			}
			System.out.println("");
		}
		
	}//main

}//class
