
public class Principal {

	public static void main(String[] args) {
		Integer cuantos1, cuantos2;
		String nombre, due�o, color, raza;
		Animal animal1[],animal2[];
		cuantos1=Leer.pedirEntero("�Cuantos perros quieres crear?");
		cuantos2=Leer.pedirEntero("�Cuantos gatos quieres crear?");
		animal1 = new Animal [cuantos1];
		animal2 = new Animal [cuantos2];
		for(int i=0; i<cuantos1; i++){	
			nombre=Leer.pedirCadena("Introduzca el nombre del perro");
			due�o=Leer.pedirCadena("Introduzca el nombre del due�o");
			raza=Leer.pedirCadena("Introduzca la raza");
			animal1[i]=new Perro(nombre, due�o, raza);
		}
		
		for(int i=0; i<cuantos2; i++){	
			nombre=Leer.pedirCadena("Introduzca el nombre del gato");
			due�o=Leer.pedirCadena("Introduzca el nombre del due�o");
			color=Leer.pedirCadena("Introduzca el color");
			animal2[i]=new Gato(nombre, due�o, color);
		}
		for(int i=0; i<animal1.length;i++){	
			if(animal1[i] instanceof Perro){
				Perro p;
				p = (Perro)animal1[i];
				p.verDatos();
			}
		}
		System.out.println();
		for(int i=0; i<animal2.length;i++){	
			if(animal2[i] instanceof Gato){
				Gato g;
				g = (Gato)animal2[i];
				g.verDatos();
			}
		}
		
	}

}
