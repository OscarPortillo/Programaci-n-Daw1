
import java.util.Scanner;

public class TragabolasMain {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String color;
		Integer maxBolas;
		TragaBolasClass miTragaBolas = null;

		int opcion;
		do {
			if (miTragaBolas == null) {
				System.out.println("1: Crear Tragabolas. ");

			} else {
				System.out.println("\n2: Darle de comer. " + "\n3: Trotar. " + "\n4: Hacerle dormir. "
						+ "\n5: Ver estado. " + "\n0: Fin.");
			}
			opcion = teclado.nextInt();
			// Crear TragaBolas
			if (opcion == 1 && miTragaBolas == null) {
				teclado.nextLine();
				System.out.println("Color del tragaBolas (amarillo/azul/verde/rojo)");
				color = teclado.nextLine();
				color = color.toLowerCase();
				while (color.equals("amarillo") == false && color.equals("azul") == false
						&& color.equals("verde") == false && color.equals("rojo") == false) {
					System.out.println("Color del tragaBolas (amarillo/azul/verde/rojo)");
					color = teclado.nextLine();
					color = color.toLowerCase();
				}

				System.out.println("Numero maximo de bolas");
				maxBolas = teclado.nextInt();

				miTragaBolas = new TragaBolasClass(color, maxBolas);
			} else if (miTragaBolas != null) {

				// Resto de opciones
				switch (opcion) {

				case 2:
					System.out.println(miTragaBolas.comer());
					break;
				case 3:
					System.out.println(miTragaBolas.trotar());
					break;
				case 4:
					System.out.println(miTragaBolas.dormir());
					break;
				case 5:
					System.out.println(miTragaBolas.visualizar());
					break;
				case 0:
					System.out.println("Finalizaste");
				}
			}
		} while (opcion != 0);

	}// main
}// class
