
public class GestionContinentes {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ListaDePaises[] listaContinentes;
		listaContinentes = new ListaDePaises[5];
		@SuppressWarnings("unused")
		String[] nomContinentes = new String[5];
		Integer opcion;
		@SuppressWarnings("unused")
		String nombre;
		menuPaises();
		opcion = Leer.pedirEntero("Elija opcion:");

		while (opcion != 0) {
			//gestionPaises(opcion, listaContinentes, nomContinentes);
			menuPaises();
			opcion = Leer.pedirEntero("Elija opcion:");

		}

	}// main
/*
	public static void gestionPaises(Integer opcion, ListaDePaises [] listaContinentes, String [] nomContinentes){
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				listaContinentes=crearListaPaises();
				break;
			case 2://A�adir un nombre
				if(listaContinentes.anyadir(Leer.pedirCadena("que pais vas a a�adir"))){
					Leer.mostrarEnPantalla("Se ha a�adido");
				}else{
					Leer.mostrarEnPantalla("Lista completa. No se puede a�adir");
				}
				break;
			case 3://Borrar un nombre
				nombre = Leer.pedirCadena("Nombre a borrar?");
				listaContinentes.borrar(nombre);
				break;
			case 4://Listar todos los nombres
				for(int i = 0; i < listaContinentes.numElementos(); i++){
					Leer.mostrarEnPantalla(listaContinentes.mostrar(i));
				}
				break;
			case 5://Borrar todos los nombres
				listaContinentes.vaciarLista();
				break;
			}

			menuPaises();
			opcion = Leer.pedirEntero("Elija opcion:");
		}
	}//gestionPaises
*/
	public static void menuPaises() {
		Leer.mostrarEnPantalla("1- Crear lista");
		Leer.mostrarEnPantalla("2- A�adir un nombre");
		Leer.mostrarEnPantalla("3- Borrar un nombre");
		Leer.mostrarEnPantalla("4- Listar todos los nombres");
		Leer.mostrarEnPantalla("5- Borrar todos los nombres");
		Leer.mostrarEnPantalla("0 Fin");
	}

	public static void menuContinentes() {
		Leer.mostrarEnPantalla("1- Crear lista de continentes");
		Leer.mostrarEnPantalla("2- A�adir un continente");
		Leer.mostrarEnPantalla("3- Borrar un continente");
		Leer.mostrarEnPantalla("4- Listar todos los continentes");
		Leer.mostrarEnPantalla("5- Borrar todos los continentes");
		Leer.mostrarEnPantalla("6- Gestionar un continente");
		Leer.mostrarEnPantalla("0 Finalizar el programa");
	}

	public static ListaDePaises crearListaPaises() {
		ListaDePaises miListaPaises;
		Integer cuantos;
		cuantos = Leer.pedirEntero("�Cuantos paises tendra la lista?");
		miListaPaises = new ListaDePaises(cuantos);
		return miListaPaises;
	}
		
		

}// class
