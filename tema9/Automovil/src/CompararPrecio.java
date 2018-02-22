import java.util.Comparator;

public class CompararPrecio implements Comparator <Automovil>{
	
	public int compare(Automovil a1, Automovil a2){
		return a2.getPrecio()-a1.getPrecio();
	}

}
