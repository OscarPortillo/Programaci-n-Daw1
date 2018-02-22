import java.util.Comparator;

public class CompararModelo implements Comparator <Automovil>{
	
	public int compare(Automovil a1, Automovil a2){
		return a1.getModelo().compareTo(a2.getModelo());
	}
}