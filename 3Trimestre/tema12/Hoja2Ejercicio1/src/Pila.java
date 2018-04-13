import java.util.ArrayList;

public class Pila {
	private ArrayList<Integer> unaPila;
	
	public Pila(){
		unaPila=new ArrayList<Integer>();
	}
	public void tamañoPila(){
		System.out.println(unaPila.size());
	}
	public void apilar(Integer num){
		unaPila.add(num);
	}
	public String desapilar(){
		Integer ultimo;
		Integer borrado;
		ultimo=unaPila.size()-1;
		borrado=unaPila.get(ultimo);
		unaPila.remove(ultimo);
		return borrado+" Desapilado.";
	}
	public void visualizarYBorrar(){
		System.out.println();
		for(int i=0;i<unaPila.size();i++){
			System.out.println(unaPila.get(i)+" Borrado.");
			unaPila.remove(i);
		}
	}
}
