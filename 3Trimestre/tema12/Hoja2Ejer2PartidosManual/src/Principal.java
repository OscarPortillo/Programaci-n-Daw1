import java.lang.reflect.Array;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		String nombrePartido;
		Integer votosPartido,numPartidos;

		TreeMap<String,Integer> partidos=new TreeMap<String,Integer>();
		Integer array []=new Integer[5];
		int cociente;
		int mayor=0;
		numPartidos=Leer.pedirEntero("Cunatos partidos quiere crear?");
				for(int i=0;i<numPartidos;i++){
					nombrePartido=Leer.pedirCadena("Introduzca el nombre del partido.");
					votosPartido=Leer.pedirEntero("Cuantos votos tiene "+nombrePartido);
			partidos.put(nombrePartido, votosPartido);			
		}

		/*TreeMap<Integer, TreeSet<String>> mapReparto = new TreeMap<Integer, TreeSet<String>>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});*/
		//	System.out.println();
		TreeMap<String,ArrayList<Integer>> partido2=new TreeMap<String,ArrayList<Integer>>();

		for(String nombrePart:partidos.keySet()){//guardas en nombrePart la clave
			Integer numVotos=partidos.get(nombrePart);//obtiene el valor de la clave asociada
			for(int divisor=1;divisor<=5;divisor++){//recorro los esca�os desde 1 hasta esca�os hay
				cociente=numVotos/divisor;//el numero de votos por partido dividido por el esca�o
				if (!partido2.containsKey(nombrePart)){//si partido2 no tiene esta clave
					partido2.put(nombrePart, new ArrayList<Integer>());//le agrego el nombre del partido como clave y un array list de enteros como valor
				}//if
				partido2.get(nombrePart).add(cociente);//obtengo el nombre del partido y le a�ado como clave el cociente
				//System.out.println(nombrePart+" Esca�os: "+divisor+" divisiones: "+partido2.get(nombrePart).toString());
				//System.out.println();
			}//for interno
		}//for externo		
		for(String partFinal:partido2.keySet()){
			ArrayList<Integer> valorEsca�o=partido2.get(partFinal);
			System.out.println(partFinal+" "+valorEsca�o);
		}
		System.out.println("\nLos 5 esca�os mayores");
		for(String nombre:partido2.keySet()){
			ArrayList<Integer> esca�o=partido2.get(nombre);
			Iterator<Integer> itr=esca�o.iterator();
			for(int k=0;k<esca�o.size();k++){
				array[k]=itr.next();
				System.out.print(array[k]+" ");
				mayor=array[0];
			}
			System.out.println("\n"+mayor);
		}//for each
	}//main

}//class