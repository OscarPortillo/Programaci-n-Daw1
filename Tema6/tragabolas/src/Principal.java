import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		tragaBolas miTragaBolas;
		String color;
		int maxBolas;
		miTragaBolas=new tragaBolas();
		System.out.println("TRAGABOLAS");
		System.out.println("Color: "+miTragaBolas.getColor());
		System.out.println("Bolas comidas: "+miTragaBolas.getBolasComidas());
		System.out.println("Máximo de bolas: "+miTragaBolas.getMaxBolas());
		
		System.out.println("Introduce un color.");
		color=teclado.nextLine();
		miTragaBolas.setColor(color);
		System.out.println("Intoduce el máximo de bolas.");
		maxBolas=teclado.nextInt();
		miTragaBolas.setMaxBolas(maxBolas);
		System.out.println("TRAGABOLAS");
		System.out.println("Color: "+miTragaBolas.getColor());
		System.out.println("Bolas comidas: "+miTragaBolas.getBolasComidas());
		System.out.println("Máximo de bolas: "+miTragaBolas.getMaxBolas());
		
		
		
		
	}//main

}//class