import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner (System.in);
		/*
		 * Escribe un programa que pida por teclado una palabra y diga si es un palíndromo
			o no. Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
			derecha a izquierda.
		 */
		String palabra;
        char num,num2;
        int numCaracter,i,j;
        boolean esPalindromo;
        
        System.out.println("introduzca una palabra: ");
        palabra=teclado.nextLine();
        numCaracter=palabra.length();
        
        esPalindromo=true;
        
        for (i=0,j=numCaracter-1;i<palabra.length() && esPalindromo==true;i++,j--){
            num=palabra.charAt(i);
            num2=palabra.charAt(j);
            if(num!=num2){
                esPalindromo=false;
            }
        }
        if(esPalindromo==true){
            System.out.println("La palabra "+palabra+" es un palíndromo");
        }
        else{
            System.out.println("La palabra "+palabra+" no es un palíndromo");
        }
		
	}//main

}//class