
import java.util.Scanner;


public class TragabolasMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String color;
		Integer  maxBolas;
		
		do {
			System.out.println("Color del tragaBolas (amarillo/azul/verde/rojo)");
			color = teclado.nextLine();
			color = color.toLowerCase();
		}while(color.equals("amarillo")== false && color.equals("azul")== false && color.equals("verde")== false && color.equals("rojo")== false);
		
		System.out.println("Numero maximo de bolas");
		maxBolas = teclado.nextInt();
		
		
		TragaBolasClass TragabolasClass = new TragaBolasClass();

		int opcion;
		do{
			do{
				System.out.println("1: Darle de comer. \n2: Trotar. \n3: Hacerle dormir. \n4: Ver estado. \n0: Fin.");
				opcion = teclado.nextInt();	
			}while(opcion < 0 || opcion > 4);
			switch(opcion){
			case 1:				
				System.out.println(TragabolasClass.comer());
				break;
			case 2:
				System.out.println(TragabolasClass.trotar());
				break;
			case 3:
				System.out.println(TragabolasClass.dormir());
				break;
			case 4:
				System.out.println(TragabolasClass.visualizar());
				break;
			case 0:
				System.out.println("Finalizaste");
			}
		}while(opcion != 0);
	}//main
}//class
