
/* Se usa un TreeMap con clave el nombre del partido y valor asociado un objeto
  de clase Partido. Y además:

TreeMap con clave el nombre del partido y valor asociado un arrayList que en cada elemento
guarda los cocientes obtenidos por ese partido.

Si hay M escaños los M primeros elementos de los ArrayList que se guardan en el mapa nos indican a quien
corresponden los escaños. En este ejercicio nos interesa recorrer los nodos del mapa mapReparto
tantas veces como escaños hay para repartir. Buscaremos el valor mas grande de los cocientes,
sumaremos un escaño al partido que le corresponda y eliminaremos ese elemento del ArrayList*/

import java.util.*;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Partido> mapPartidos = new TreeMap<String, Partido>();
		TreeMap<String, ArrayList<Integer>> mapReparto = new TreeMap<String, ArrayList<Integer>>();

		int numEscanios;
		int numPartidos;
		numEscanios = Leer.pedirEntero("Número de escaños");
		numPartidos = Leer.pedirEntero("Número de partidos");
		// creamos los partidos antes de las elecciones
		rellena(mapPartidos, numPartidos);
		Leer.mostrarEnPantalla("Estos son los partidos:");
		Leer.mostrarEnPantalla(mapPartidos.toString());
		// celebramos las elecciones y calculamos los cocientes
		votacion(mapReparto, mapPartidos, numEscanios);
		Leer.mostrarEnPantalla("\nEstos son los partidos y los resultados antes del reparto:");
		Leer.mostrarEnPantalla(mapPartidos.toString());
		Leer.mostrarEnPantalla("\nEstos son los cocientes:");
		Leer.mostrarEnPantalla(mapReparto.toString());
		// Reparto de escaños
		calcula(mapReparto, mapPartidos, numEscanios);
		Leer.mostrarEnPantalla("\n*************************************************");
		Leer.mostrarEnPantalla(mapPartidos.toString());
		Leer.mostrarEnPantalla("\n*************************************************");

	}

	public static void rellena(TreeMap<String, Partido> mapPartidos, int numPartidos) {
		String partido;
		Partido part;
		for (int i = 1; i <= numPartidos; i++) {
			partido = "Partido" + i;
			part = new Partido(partido);
			mapPartidos.put(partido, part);
		}
	}

	
	public static void votacion(TreeMap<String, ArrayList<Integer>> mapReparto, TreeMap<String, Partido> mapPartidos,
			int numEscanios) {
		String nombrePartido = "";
		Partido unPartido;
		ArrayList<Integer> listaCocientes;
		Integer votosAUnPartido, totalVotos = 0;

		for (Map.Entry<String, Partido> nodoDeMapaPartidos : mapPartidos.entrySet()) {
			votosAUnPartido = (int) (Math.random() * 10000 + 3000);
			nombrePartido = nodoDeMapaPartidos.getKey();
			unPartido = nodoDeMapaPartidos.getValue();
			unPartido.setVotos(votosAUnPartido);
			mapPartidos.put(nombrePartido, unPartido);
			totalVotos += votosAUnPartido;
		} // recorre partidos asignando los votos

		eliminarPartidosConPocosVotos(mapPartidos, totalVotos);

		// calcula los cocientes de los votos de los partidos que quedan para el reparto
		for (Map.Entry<String, Partido> nodoDeMapaPartidos : mapPartidos.entrySet()) {
			unPartido = nodoDeMapaPartidos.getValue();
			votosAUnPartido = unPartido.getVotos();
			listaCocientes=new ArrayList<Integer>();
			for (int i = 1; i <= numEscanios; i++) {
				listaCocientes.add(votosAUnPartido/i);
			} // calcula cocientes
			mapReparto.put(unPartido.getNombre(),listaCocientes);
		}

	} // votacion

	public static void eliminarPartidosConPocosVotos(TreeMap<String, Partido> mapPartidos, Integer totalVotos) {
		Iterator<Map.Entry<String, Partido>> it = mapPartidos.entrySet().iterator();
		// Recorremos el mapa de partidos
		Leer.mostrarEnPantalla("\n/*/*/*/*/*/* eliminarPartidosConPocosVotos /*/*/*/*/*/*/*/*");
		Leer.mostrarEnPantalla("------------------> el 5% de los votos es: " + totalVotos * 0.05);
		while (it.hasNext()) {
			Map.Entry<String, Partido> nodoDeMapaPartidos = (Map.Entry<String, Partido>) it.next();
			Leer.mostrarEnPantalla(nodoDeMapaPartidos.getKey() + ": " + nodoDeMapaPartidos.getValue());
			// Eliminamos del mapa a los que han obtenido menos del 5% de los
			// votos
			if (nodoDeMapaPartidos.getValue().getVotos() < totalVotos * 0.05) {
				it.remove();
			}
		}
		Leer.mostrarEnPantalla("\n/*/*/*/*/*/* eliminarPartidosConPocosVotos /*/*/*/*/*/*/*/*\n");
	}// eliminarPartidosConPocosVotos

	public static void calcula(TreeMap<String, ArrayList<Integer>> mapReparto, TreeMap<String, Partido> mapPartidos,
			int numEscanios) {

		String nombrePartido, partSeleccionado = null;
		Partido unPartido;
		ArrayList<Integer> listaDeCocientes;
		int valorCociente;
		for (int i = 1; i <= numEscanios; i++) { // se asigna el escaño i
			valorCociente = 0; // buscamos el partido que tenga el mayor valor de
							// cociente
			for (Map.Entry<String, ArrayList<Integer>> nodoDeMapaReparto : mapReparto.entrySet()) {
				nombrePartido = nodoDeMapaReparto.getKey();
				listaDeCocientes = nodoDeMapaReparto.getValue();
				if ( listaDeCocientes.get(0) > valorCociente ) {
					partSeleccionado = nombrePartido;
					valorCociente = listaDeCocientes.get(0);
				}
			}
			// en el nodo del partido que tenga el mayor valor de cociente
			listaDeCocientes = mapReparto.get(partSeleccionado);
			// eliminamos ese cociente
			listaDeCocientes.remove(0);
			// actualizamos el nodo despues de quitar el cociente del ArrayList
			mapReparto.put(partSeleccionado, listaDeCocientes);
			// asignamos el escaño al partido
			unPartido = mapPartidos.get(partSeleccionado);
			unPartido.setEscaños(unPartido.getEscaños() + 1);
			// actualizamos el nodo en el mapa de partidos
			mapPartidos.put(partSeleccionado, unPartido);
		}

	}// calcula
}
