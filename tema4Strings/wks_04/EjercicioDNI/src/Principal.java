import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		 
		int posicionLetra;
		int numero;
		@SuppressWarnings("unused")
		String caracter;
		final int max=8;
		
		String numeroString;
		boolean correcto=false;
		char letra=' ';
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		
		posicionLetra=0;
		 
		//System.out.println(numeroString.length());
		
		while(!correcto){
			do{
				System.out.println("Introduce un numero m�ximo 7 caracteres: ");
				numero =teclado.nextInt();
				numeroString=Integer.toString(numero);//paso mi numero entero a estrig para poder ver la longitud en el siguiente while
				
			}while(numeroString.length()>max || numeroString.length()<max);//pregunto si es mayor que 8 o menor que 8 lo vuelvo a pedir
			
			if(numero<1 && numero>99999999){
				correcto=false;
			}else{
				 /*teclado = new Scanner (System.in);
				System.out.println("Introduce una letra");
				caracter=teclado.nextLine().toUpperCase();//.charAt(0);
				letra=caracter.charAt(0);*/
				posicionLetra=letras.charAt(numero%23);//me guardo en char posicionLetra la division de numero entre 23
				letra= (char)+posicionLetra;//paso a char "el caracter ascii" el caracter que pertenece
				if(letra==posicionLetra){
					correcto=true;
				}else{
					correcto=false;
				}
			}
			if(!correcto){
				System.out.println("Error: "+numero+letra+" DNI invalido");
			}else{
				System.out.println("DNI Correcto: "+numero+letra);
			}
		}//while
		
	}//main

}//class
