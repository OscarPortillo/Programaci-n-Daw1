import java.util.Random;

import java.util.Scanner;

public class Ejer41 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner (System.in);
		Random azar=new Random();
		int tabla[][][]=new int[5][10][20];
		int k,i,j;
		for(k=0;k<5;k++){
			for(i=0;i<10;i++){
				for(j=0;j<20;j++){
					tabla[k][i][j]=azar.nextInt(10)+1;
				}//tercer for
			}//segundo for
		}//primer for
		
		@SuppressWarnings("unused")
		double suma;
		suma=0;
		for(k=0;k<5;k++){//centro
			for(i=0;i<10;i++){//curso
				 //suma[k][i]=0;
				for(j=0;j<20;j++){//alumno
					System.out.print(tabla[k][i][j] +"  ");
				}//tercer for
				System.out.println();
			}//segundo for
			System.out.println();
		}//primer for
	}

}
