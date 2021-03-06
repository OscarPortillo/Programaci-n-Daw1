
import java.util.Scanner;


public class TragabolasMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String color;
		Integer  maxBolas;

		
		int opcion;
		TragaBolasClass tragaBolasClass = null;
		if( tragaBolasClass==null){
			do{
				System.out.println("1 : Crear Traga Bolas.");
				System.out.println("2 : Salir.");
				opcion=teclado.nextInt();
				switch(opcion){
				case 1:
					teclado.nextLine();
					do {
						System.out.println("Color del tragaBolas (amarillo/azul/verde/rojo)");
						color = teclado.nextLine();
						color = color.toLowerCase();
					}while(color.equals("amarillo")== false && color.equals("azul")== false && color.equals("verde")== false && color.equals("rojo")== false);

					System.out.println("Numero maximo de bolas");
					maxBolas = teclado.nextInt();
					tragaBolasClass = new TragaBolasClass(color,maxBolas);

					do{
						do{
							System.out.println("1: Darle de comer. \n2: Trotar. \n3: Hacerle dormir. \n4: Ver estado. \n0: Fin.");
							opcion = teclado.nextInt();	
						}while(opcion < 0 || opcion > 4);
						switch(opcion){
						case 1:				
							System.out.println(tragaBolasClass.comer());
							break;
						case 2:
							System.out.println(tragaBolasClass.trotar());
							break;
						case 3:
							System.out.println(tragaBolasClass.dormir());
							break;
						case 4:
							System.out.println(tragaBolasClass.visualizar());
							if(tragaBolasClass!=null){
								System.out.println("No se puede crear otro traga bolas");
								
								}else{
									tragaBolasClass = new TragaBolasClass(color,maxBolas);
									
								}
							break;
						case 0:
							System.out.println("Finalizaste");
						}
					}while(opcion != 0);
					break;
				}
			}while(opcion!=0);

		}//si es nulo se crea y si no que diga que ya existe el objeto
		else{
			System.out.println("Ya existe un tragabolas");
		}//else

	}//main
}//class

