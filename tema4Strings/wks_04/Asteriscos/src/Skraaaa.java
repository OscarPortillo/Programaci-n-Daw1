import java.util.*;
public class Skraaaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random azar=new Random ();
		int num=azar.nextInt(5)+1;
		int j,i;
		for ( i = 0; i < num; i++ ) { 
			// Imprimo blancos 
			for ( j = i; j < num - 1; j++ ) 
				System.out.print(' '); 
			// Imprimo asteriscos 
			for ( j = num - i; j <= num; j++ ) 
				System.out.print('*'); 

			System.out.println(); 
		} 
	}
}

