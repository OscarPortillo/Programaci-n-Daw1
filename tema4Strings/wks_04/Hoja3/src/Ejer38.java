import java.util.*;
public class Ejer38 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner (System.in);
		Random azar=new Random();
		/*
		 * 38.-Cargar en una matriz las notas de los alumnos de 
		 * un colegio en función del número de
		 * cursos (filas) y del número de alumnos por curso (columnas).
		 */
		
		int curso[][]=new int[3][6];
		int k,i;
		for(i=0; i<3; i++){
			for(k=0; k<6; k++){
				curso[i][k]=azar.nextInt(10)+1;
			}
		}
		for(i=0; i<3; i++){
			for(k=0; k<6; k++){
				System.out.print(curso[i][k]+" ");
			}
			System.out.println();
		}
		
	}//main

}
