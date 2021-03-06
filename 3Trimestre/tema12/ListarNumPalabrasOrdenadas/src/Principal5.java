import java.util.*;
public class Principal5 {
	public static void main(String[] args) {
		/**
		 * 6) Crea un proyecto que se llame ListarNumPalabrasOrdenadas
		 * Escribe un programa en Java que:
		 *  Pida al usuario que introduzca un número indeterminado de palabras. 
		 * La introducción de datos terminará cuando introduzca un “*” 
		 * (que por supuesto no se tendrá en cuenta para hacer lo que se pide en
		 *  el ejercicio).
		 *   Pida que se diga un número entero positivo num que no puede ser
		 *   mayor que el número de palabras distintas que se han dado.
		 *    Muestre las num primeras palabras en orden alfabético de la 
		 *   lista de palabras que ha dado el usuario.
		 */
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		String palabra;
		int num,cont=0;
		TreeSet<String>tsString =new TreeSet<String>();
		System.out.println(" * - Para salir.");
		do{
			System.out.println("Introduce una palabra.");
			palabra=teclado.nextLine();
			if(tsString.contains(palabra)){
				System.out.println("La palabra ya existe");
				//cont++;
			}
			if(!palabra.equals("*")){
				tsString.add(palabra);
			}
		}while(!palabra.equals("*"));
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		while( num < 1 || num>tsString.size()){
			System.out.println("Introduce un numero menor que "+tsString.size());
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}
		Iterator<String> itr=tsString.iterator();
		for(int i=0;i<num;i++){			
			System.out.print(itr.next()+" ");
		}
	}//main
}//class