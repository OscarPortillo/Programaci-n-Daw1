import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings({  "resource" })
		Scanner teclado=new Scanner(System.in);
		@SuppressWarnings("unused")
		int edad;
		String nombreBuscar,nombreEncontrado="" ;


		String nombres[]={"Oscar","Mar�a","Jose","Waldo","Rene","Alex","David","Pe�a","Pablo","Gonzalo","Mardo","Messi","Lionel",
				"Andr�s","Alvaro","Nelly","Beatrice","Ioana","Miriam","Kelly","Katherin","Mayra","Raquel","Vycky"};
		System.out.println("long vector: "+nombres.length);

		String vecNombres[]=new String[20];
		for(int k=0;k<20;k++){
			vecNombres[k]=nombres[(int)(Math.random()*nombres.length)];//introduzco nombres del vector nombres al azar entre 1 y 15 en el vector vecNombres
		}
		int num;
		num=1;
		int contaNombres = 0;
		boolean correcto=false;

		for(int k=0;k<20;k++){
			System.out.print(num+++" - "+vecNombres[k]+" ");//muetsro los nombres que intruje en el vector
		}
		System.out.println();
		System.out.println("Introduce el nombre a buscar: ");	 
		
		nombreBuscar=teclado.nextLine();
		for(int j=0; j< 20; j++){
			if(vecNombres[j].equals(nombreBuscar)){
				// nombreEncontrado=vecNombres[j];
				contaNombres++;//me guardo en contaNombres las veces que se repite el nombre a buscar en el vector
				System.out.println(nombreBuscar + " esta en el indice " + j);//muetro el nombre y en la posicipon del vector en la que se encuetra 
				correcto=true;
			}

		}

		if(correcto==true){
			System.out.println("El nombre: "+nombreEncontrado+" se repite : "+contaNombres+" veces en el vector");

		}else{
			System.out.println("el nombre "+nombreBuscar+ " no existe en el vector.");
		}
	}//main

}//class