import java.util.Scanner;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		/**
		 * Crea un proyecto que se llame TreemapNotasAlumnosPorNota
		 * Modifica el programa del ejercicio anterior para que
		 * podamos mostrar un listado ordenado por notas,
		 * teniendo en cuenta que puede haber repeticiones
		 * de notas.
		 **/
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		String apellido;
		Integer nota;
		do{
			System.out.println("Introduzca el apellido del alumno.");
			teclado=new Scanner(System.in);
			apellido=teclado.nextLine();
			teclado=new Scanner(System.in);			
			if(apellido.equals("*")){				
			}else{//si apellido no es un asterisco entrio y pido la nota
				System.out.println("Introduzca la nota del alumno");
				nota=teclado.nextInt();
				tm.put( nota,apellido);
			}
		}while(!apellido.equals("*"));//lo repite mientras no sea asterisco
		System.out.println(tm.toString());
	}

}
