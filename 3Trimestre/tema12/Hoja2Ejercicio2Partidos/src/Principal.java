import java.util.*;
public class Principal {

	public static void main(String[] args) {
		String nombrePartido[]={"Partido1","Partido2","Partido3","Partido4"};
		Integer votosPartido[]={10000,25000,30000,12000};
		TreeMap<String,Integer> partidos=new TreeMap<String,Integer>();
		int cociente;
		for(int i=0;i<nombrePartido.length;i++){
			partidos.put(nombrePartido[i], votosPartido[i]);			
		}
		for(String clave:partidos.keySet()){
			Integer valor=partidos.get(clave);
			System.out.println(clave+" "+valor);
		}
		TreeMap<Integer, TreeSet<String>> mapReparto = new TreeMap<Integer, TreeSet<String>>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		TreeMap<String,ArrayList<Integer>> partido2=new TreeMap<String,ArrayList<Integer>>();
		for(String nombrePart:partidos.keySet()){
			Integer numVotos=partidos.get(nombrePart);
			for(int divisor=1;divisor<=5;divisor++){
				cociente=numVotos/divisor;
				if (){
					
				}
			}
		}
	}//main

}//class