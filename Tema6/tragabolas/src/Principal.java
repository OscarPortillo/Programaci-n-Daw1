import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		tragaBolas miTragaBolas;
		String color;
		int maxBolas,comer;
		int opc;
		miTragaBolas=new tragaBolas();
		do{
			System.out.println("1: Crear tragabolas");
			System.out.println("2: Darle de comer");
			System.out.println("3: Hacerle dormir");
			System.out.println("4: Ver estado");
			System.out.println("0: fin");
			opc=teclado.nextInt();
			switch(opc){
			case 1:
				teclado=new Scanner(System.in);
				System.out.println("Introduce un color: ");
				color=teclado.nextLine();
				miTragaBolas.setColor(color);
				System.out.println("Introduce un m�ximo de bolas");
				maxBolas=teclado.nextInt();
				miTragaBolas.setBolasComidas(0);
				miTragaBolas.setMaxBolas(maxBolas);
				
				System.out.println();
				System.out.println("Color: "+miTragaBolas.getColor());
				
				System.out.println("Bolas comidas: "+miTragaBolas.getBolasComidas());
				
				System.out.println("M�ximo de bolas: "+miTragaBolas.getMaxBolas());
				System.out.println();
				break;
			case 2:
				System.out.println("Introducir un numero para darle de comer");
				comer=teclado.nextInt();
				miTragaBolas.setBolasComidas(comer);
				break;
			case 3:
				
				break;
			case 4:
				miTragaBolas.verEstado();
				break;
			}
		}while(opc!=0);
		
		
		
		
	}//main

}//class