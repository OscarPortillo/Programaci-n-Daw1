
public class Comedor {
	/**
	 * 3.- 		Escribe un proyecto en Java que tenga:
			Una clase llamada Comedor en la que estará el método public static void main() y en la que se instanciarán
			los objetos de las clases que sean necesarias para:
		 Mostrar la carta de un restaurante en el que se ofrecen 6 platos. En cada plato se visualizarán los
			ingredientes que lo componen y el precio de ese plato.
		 Se supone que en el restaurante se pueden servir en un día un máximo de 100 menús. Cada menú
			consta de dos platos; a la bebida y al postre invita la casa.
		 A la hora de pagar se mostrará en pantalla: el detalle de los menús que tiene que pagar, indicando
			el precio de cada plato y el de cada menú, el total a pagar, el dinero entregado y el cambio. Nota:
			para cada mesa ocupada se anotará el número de menús y qué platos han formado cada uno.
		 Identificar clases atributos y métodos necesarios para la solución de este ejercicio.
	 * @param args
	 */
	public static void menu(){
		System.out.println(" 1 - Crear Plato.");
		System.out.println(" 2 - Mostrar Plato.");
		System.out.println(" 3 - Total a pagar.");
		/*System.out.println(" 4 - ");
		System.out.println(" 5 - ");*/
		System.out.println(" 0 - Salir");
	}
	public static void main(String[] args) {
		Restaurante rest[]=new Restaurante[200];
		int opc;
		do{
			menu();
			opc=Libreria.pedirEntero("Elije un opcion");
			switch(opc){
			case 1:
				crearPlato(rest);
				break;
			case 2:
				verPlato(rest);
				break;
			case 3:
				pagar(rest);
				break;	
			}
		}while(opc!=0);
		System.out.println("Adios buenas tardes");
	}//main
	public static void crearPlato(Restaurante rest[]){
		Ingredientes ingre;//=new Ingredientes(null, 0);

		for(int i=0;i<rest.length;i++){			
			ingre=new Ingredientes(Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5)
					,Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5),Libreria.ingredientesAzar(),Libreria.enteroAzar(1, 5));
			rest[i]=new Restaurante(ingre,Libreria.nombrePlatosAzar(),Libreria.bebidadAzar(),
					Libreria.postreAzar(),Libreria.enteroAzar(30, 50));

			//menu[i]=new Menu(rest[i],Libreria.enteroAzar(30, 50));
		}
	}
	public static void verPlato(Restaurante rest[]){
		//rest=new Restaurante[100];
		if(rest[0]==null){
			System.out.println("No hay platos para mostrar");
		}else{
			int pos=1,k;
			for(int i=0;i<rest.length;i++){
				k=1;
				System.out.println("---------*****************-------------");
				System.out.println("Menu N�: "+(pos));
				System.out.println("Plato N�: "+k);
				rest[i].verCarta();
				System.out.println("Plato N�: "+(k+1));
				rest[i+1].verCarta();
				i++;
				pos++;
				k++;

			}
		}

	}
	public static void pagar(Restaurante rest[]){
		//rest=new Restaurante[100];
		if(rest[0]==null){
			System.out.println("No hay platos para mostrar");
		}else{
			int pos=1;
			int total=0,pago;
			for(int i=0;i<rest.length;i++){

				System.out.println("---------*****************-------------");
				System.out.println("Menu N�: "+(pos));
				total=(int) (rest[i].getPrecio()+rest[i+1].getPrecio());
				pago=Libreria.enteroAzar(total, total+30);
				System.out.println("Cantidad con la que paga: "+pago);
				System.out.println("Total a pagar: "+total);
				System.out.println("Cambio: "+(pago-total));
				i++;
				pos++;

			}
		}

	}
}//class