import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int num,i;
		String asterisco="";

		System.out.println("Introduce un numero: ");
		num= teclado.nextInt();
		
		if(num < 1){
			System.out.println("Error");
		} else {
				for(  i = 1 ; i <= num ; i++ ) 
					asterisco += " ";			
				asterisco += "*";
				System.out.println(asterisco);

				for( i = 1 ; i < num ; i++){
					asterisco = asterisco.replace(" *", "**");
					System.out.println(asterisco);
				
			}
				
		}
		

		 
	}//main

}//class