import java.util.*;
public class Matriz {

	public static void main(String[] args) {
		Random azar=new Random();
		int matriz[][] =new int[3][3] ;
		 matriz[0][0]=azar.nextInt(20);
		 matriz[0][1]=azar.nextInt(20);
		 matriz[0][2]=azar.nextInt(20);
		 matriz[1][0]=azar.nextInt(20);
		 matriz[1][1]=azar.nextInt(20);
		 matriz[1][2]=azar.nextInt(20);
		 matriz[2][0]=azar.nextInt(20);
		 matriz[2][1]=azar.nextInt(20);
		 matriz[2][2]=azar.nextInt(20);
		for (int k=0;k<matriz.length;k++){			 
			  for(int i=0;i<matriz [k].length;i++){
			 System.out.print(matriz[k][i]);
		}
		}
	}

}