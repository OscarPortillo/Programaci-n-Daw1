import java.util.*;
public class Principal {

	public static void main(String[] args) {
		/**
		 * Crea un proyecto que se llame TreemapNotasAlumnosPorApellido
		 * Escribe un programa en Java que:
		 *  Pida el apellido (se supone que no se repiten) y la calificación
		 *  obtenida por un alumno. La entrada de datos terminará cuando se 
		 *  introduzca como apellido “*”.
		 *   Muestre un listado por orden alfabético de los datos de cada alumno.
		 */
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
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
				tm.put(apellido, nota);
			}
		}while(!apellido.equals("*"));
		System.out.println(tm.toString());
	}//main
	/*public static void lol(){
		TreeMap<String,TreeSet<String>> mapReparto=new TreeSet<Integer,TreeSet<String>>new Comparator<Integer>();
		}*/
}//class
