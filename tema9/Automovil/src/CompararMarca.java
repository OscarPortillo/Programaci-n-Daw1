import java.util.Comparator;

public class CompararMarca implements Comparator <Automovil>{
	
	public int compare(Automovil a1, Automovil a2){
		return a1.getMarca().compareTo(a2.getMarca());
	}

}