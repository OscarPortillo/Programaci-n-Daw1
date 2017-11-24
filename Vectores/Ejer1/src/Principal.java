import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings({  "resource" })
		Scanner teclado=new Scanner(System.in);
		@SuppressWarnings("unused")
		int edad;
		String nombreBuscar,nombreEncontrado="" ;
		
		
		String nombres[]={"Oscar","María","Jose","Waldo","Rene","Alex","David","Peña","Pablo","Gonzalo","Mardo","Messi","Lionel",
				"Andrés","Alvaro","Nelly","Beatrice","Ioana","Miriam","Kelly","Katherin","Mayra","Raquel",""};
		System.out.println("long vector: "+nombres.length);
		
		String vecNombres[]=new String[20];
		for(int k=0;k<20;k++){
			vecNombres[k]=nombres[(int)(Math.random()*15+1)];
			//vecNombres[k]=nombres[(int)(Math.random()*nombres.length+1)];
			
		}
		int num;
		num=1;
		int contaNombres = 0;
		boolean correcto=false;
		
		for(int k=0;k<20;k++){
		System.out.print(num+++" - "+vecNombres[k]+" ");//;=nombres[(int)(Math.random()*nombres.length+1)];
		}
		System.out.println();
		
		System.out.println("Introduce el nombre a buscar: ");	 
		nombreBuscar=teclado.nextLine();
		for(int j=0; j< 20; j++){
			 if(vecNombres[j].equals(nombreBuscar)){
				// nombreEncontrado=vecNombres[j];
				 contaNombres++;
				 System.out.println(nombreBuscar + " esta en el indice " + j);
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