import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner (System.in);
		int numero;
		String numeroString,letraDni;
		String letrasDisponibles="TRWAGMYFPDXBNJZSQVHLCKE";
		boolean correcto=false;
		char letra=' ';
		int opc;
		//System.out.println(letrasDisponibles.charAt(14));
		while(!correcto){
			do{
				System.out.println("1 - Introducir DNI");
				System.out.println("2 - Introducir NIE");
				System.out.println("0 - Salir");
				opc=teclado.nextInt();
				switch(opc){
				case 1:
					do{
						System.out.println("Introduce un numero");
						numero=teclado.nextInt();
						numeroString=Integer.toString(numero);

					}while(numeroString.length()<8 || numeroString.length()>8);//mientras que sea menor o mayor que 8 lo vuelvo a pedir

					if(numero<1 && numero>99999999 ){
						correcto=false;
					}else{

						teclado=new Scanner (System.in);

						System.out.println("Introduce la letra del DNI");
						letraDni=teclado.nextLine().toUpperCase();
						letra=letraDni.charAt(0);

						if(letra==letrasDisponibles.charAt(numero % 23)){//divido el numero introducido por 23 y el resultado es la posicion de la variable letrasDisponibles
							correcto=true;
						}

					}
					if(!correcto){
						System.out.println("Dni incorrecto  "+numero+letra);
					}else{
						System.out.println("Dni valido  "+numero+letra);
					}
					break;
				case 2:
					System.out.println();
					System.out.println("En construción");
					System.out.println("Tenga muy buenas tardes");
					System.out.println();
					break;
				}
			}while(opc!=0);
			System.out.println("Adios.");

		}//while correcto
	}//mian

}//class
