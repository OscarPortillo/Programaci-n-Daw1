import java.util.Comparator;

public class ComparatorCilindrada implements Comparator <Automovil>{
	
	public int compare(Automovil a1, Automovil a2){
		return a1.getCilindrada()-a2.getCilindrada();
	}

}
