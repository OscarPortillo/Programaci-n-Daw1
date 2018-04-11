import java.util.*;
public class Principal5 {

	public static void main(String[] args) {
		/**
		 * Escribe un programa en Java que pida n�meros al usuario hasta que teclee el -9999. Una vez
		 * dado ese valor escribe en orden creciente todos los elementos distintos de la secuencia de
		 * n�meros introducida por el usuario.
		 * Para almacenar los n�meros que diga el usuario se crear� un objeto TreeSet<Integer>.
		 */
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		int num;
		System.out.println("-9999 - Para salir.");

		do{
			System.out.println("Introduce un numero.");
			num=teclado.nextInt();
			if(num!=-9999){
				ts.add(num);
			}
		}
		while(num!=-9999);
		System.out.println(ts.toString());
	}//kmain

}//class