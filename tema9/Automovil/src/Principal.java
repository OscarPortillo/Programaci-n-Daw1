import java.util.Arrays;
import java.util.Random;

public class Principal {
	/**
	 * Sea la clase Automovil que tiene los siguiente atributos:
		marca (string)
		modelo (string)
		cilindrada (Integer)
		precio (Integer)
		Realizar un programa que utilice un vector de 5000 automóviles (objetos), implementando las siguientes funciones:
		 Generar n automóviles aleatoriamente pasándole como parámetros el vector y un tamaño n menor que
		5000
		 Ordenar los objetos del vector que se le pasa como parámetro, junto con el atributo por el que queremos
		ordenar.
		 Imprimir los datos de los automóviles existentes en nuestro vector, pero paginando la salida de x en x líneas,
		es decir, cada x objetos se para el listado y nos pide: "pulsa enter para continuar"; x lo sumnistra el usuario
	 * @param args
	 */

	public static void main(String[] args) {
		Random azar=new Random();
		String mar,mod;
		String marca[]={"Opel", "Ford", "Chevrolet", "Nissan", "Jaguar", "Renault", "Audi", "BMW", "Toyota", "Suzuki", "Citroen","Mini", 
				"Jeep", "Mazda", "Mercedes", "Mitsubishi","Koenigsegg","Lamborghini","Ferrari","Porsche"};
		String modelo[]={"Modelo1A", "Modelo2A", "Modelo3A", "Modelo4A", "Modelo5A", "Modelo6A",
				"Modelo1B", "Modelo2B", "Modelo3B", "Modelo4B", "Modelo5B", "Modelo6B"};
		int cilindrada[]={100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 650, 700, 750, 800, 850, 900, 950, 1000};
		int precio,cil, opcComparar;
		@SuppressWarnings("unused")
		int numAle,marcaAle,clinAle,modelAle,precioAle,opc;
		Automovil coche[] ;
		numAle=azar.nextInt(30)+1;
		coche=new Automovil[numAle];
		do{
			menu();
			opc=Leer.pedirEntero("Elije opcion");
			switch(opc){
			case 1:
				Leer.mostrarEnPantalla("Generando coches automaticamente.");
				Leer.mostrarEnPantalla("Se han creado "+ numAle+" Coches.");
				for(int i=0;i <numAle;i++){
					mar=marca[azar.nextInt(marca.length)];
					mod=modelo[azar.nextInt(modelo.length)];
					cil=cilindrada[azar.nextInt(cilindrada.length)];
					precio=azar.nextInt(70000)+20000;
					coche[i]=new Automovil(mar,mod,cil,precio);
				}
				break;
			case 2:
				/*System.out.println();
				//numAle=azar.nextInt(25);
				ordMarca(coche,numAle);
				System.out.println();*/
				ordenar();
				opcComparar=Leer.pedirEntero("Elije opcion");
				switch (opcComparar) {
				case 1:
					Leer.mostrarEnPantalla("Ordenado por marca");
					Arrays.sort(coche, new CompararMarca());
					break;
				case 2:
					Leer.mostrarEnPantalla("Ordenado por modelo");
					Arrays.sort(coche, new CompararModelo());
					//ordModelo(coche,numAle);
					break;
				case 3:
					Leer.mostrarEnPantalla("Ordenado por precio");
					Arrays.sort(coche, new CompararPrecio());
					break;
				case 4:
					Leer.mostrarEnPantalla("Ordenado por clindrada");
					Arrays.sort(coche, new ComparatorCilindrada());
					break;

				default:
					break;
				}
				break;
			case 3:
				System.out.println();
				for(int i=0;i<numAle;i++){
					//Leer.mostrarEnPantalla("Coche numero: "+(i+1));
					coche [i].verCoche();
				}
				System.out.println();
				break;
			}
		}while(opc!=0);


	}//main


	public static void ordMarca(Automovil A[], int numAle){//pasamos el vector de objetos Automovil y el número aleatorio 
		int numSalto, j;
		Automovil posAux;
		boolean cambios;
		for(numSalto=numAle/2; numSalto!=0; numSalto/=2){
			cambios=true;
			while(cambios==true){ // Mientras se intercambie algún elemento
				cambios=false;
				for(j=numSalto; j< numAle; j++) // se da una pasada
					if((A[j-numSalto].getMarca().compareTo(A[j].getMarca()))>0){ // y si están desordenados
						posAux=A[j]; // se reordenan
						A[j]=A[j-numSalto];
						A[j-numSalto]=posAux;
						cambios=true; // y se marca como cambio.
					}//if
			}//while
		}//1 for
	}
	public static void ordModelo(Automovil A[],int numAle){
		boolean cambio=false;Automovil aux;
		while(true){
			for(int i=1;i<numAle;i++){
				if(A[i-1].getModelo().compareTo(A[i].getModelo())>0){
					aux=A[i];
					A[i]=A[i-1];
					A[i-1]=aux;
					cambio=true;
				}
			}
		}
	}
	public static void menu(){
		System.out.println();
		System.out.println("1 - Generar coches Automaticamente");
		System.out.println("2 - Ordenar los objetos del vector");
		System.out.println("3 - Ver los coches generados");
		System.out.println();
	}
	public static void ordenar(){
		System.out.println();
		System.out.println("1 - Ordenar por marca");
		System.out.println("2 - Ordenar por modelo");
		System.out.println("3 - Ordenar por precio");
		System.out.println("4 - Ordenar por cilindrada");
		System.out.println();
	}
}//class