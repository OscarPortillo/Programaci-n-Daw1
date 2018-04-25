import java.util.*;
public class Principal {

	public static void main(String[] args) {

		TreeMap<String,Integer> mapaDeNombresYNotas=new TreeMap<String,Integer>();
		TreeMap<Integer,String> mapaDeNotasYCadenaDeNombres=new TreeMap<Integer,String>();
		TreeMap<Integer,TreeSet<String>> mapaDeNotasYTreeSetDeNombre=new TreeMap<Integer,TreeSet<String>>();
		String nombre;
		Integer nota;

		nombre=Leer.pedirCadena("Introduce el nombre del alumno.  * - para salir:");
		while(!nombre.equals("*")){
			nota=Leer.pedirEntero("Introduce la nota de "+nombre);
			if(!mapaDeNombresYNotas.containsKey(nombre)){
				mapaDeNombresYNotas.put(nombre, nota);
				

			}else{
				System.out.println(nombre+" ya existe.");
				nota=Leer.pedirEntero("Introduce una nota para "+nombre);
				mapaDeNombresYNotas.put(nombre, nota);
				for (String clave : mapaDeNombresYNotas.keySet()) {//nombre
					Integer valor=mapaDeNombresYNotas.get(clave);//nota
					if(mapaDeNotasYTreeSetDeNombre.containsKey(valor)){
						
						//clave2+=" * "+mapaDeNotasYTreeSetDeNombre.get(valor);
						//mapaDeNotasYTreeSetDeNombre.put(valor, clave2);
					}
				}
				
			}//else si existe la clave con ese nombre


			nombre=Leer.pedirCadena("Introduce el nombre del alumno.  * - para salir:");
		}

		System.out.println("Listado ordenado por nombre");
		for (String clave : mapaDeNombresYNotas.keySet()) {
			Integer valor=mapaDeNombresYNotas.get(clave);
			System.out.println(clave + " " + valor);
		}
		System.out.println();
		System.out.println("Listado ordenado por nota.");

		/*for (String clave : mapaDeNombresYNotas.keySet()) {
			Integer valor=mapaDeNombresYNotas.get(clave);
			if(mapaDeNotasYCadenaDeNombres.containsKey(valor)){
				clave+=" * "+mapaDeNotasYCadenaDeNombres.get(valor);
				mapaDeNotasYCadenaDeNombres.put(valor, clave);
			}else{
				mapaDeNotasYCadenaDeNombres.put(valor, clave);
			}
		}*/
		for (Integer clave : mapaDeNotasYCadenaDeNombres.keySet()) {
			System.out.println(clave+" "+ mapaDeNotasYCadenaDeNombres.get(clave));			
		}
	}//main

	/*public static String nombreAzar() {
		Random azar = new Random();

		String nombres[] = { "Santiago", "Sebastián", "Diego", "Thiago", "Nicolás", "Samuel", "Dario", "Alejandro",
				"Mateo", "Ángel", "Matías", "Gabriel", "Tomás", "David", "Emiliano", "Andrés", "Joaquín", "Carlos",
				"Alexander", "Adrián", "Lucas", "Sofía", "Camila", "Valentina", "Isabella", "Valeria", "Daniela",
				"Mariana", "Sara", "Victoria", "Gabriela", "Ximena", "Andrea", "Natalia", "Mía", "Martina", "Lucía",
				"Samantha", "María", "Paula", "Nicole" };

		return nombres[azar.nextInt(nombres.length)];
	}// nombreAzar
	public static int enteroAzar(int desde, int hasta) {
		Random azar = new Random();
		return azar.nextInt(hasta - desde + 1) + desde;
	}// enteroAzar*/
}//class