import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Random azar=new Random();
		int num;
		num=8;
		HashSet<String> hash=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		String valor[]={"este "," monta�a "," letra"," bajo "," frio "," bajo "," bajo "," aleatorio "};
		@SuppressWarnings("unused")
		String aux;
		System.out.println("se van a generar "+num+" datos");
		for(int i=0;i<num;i++){
			System.out.print(valor[i]+" * ");
			hash.add(valor[i]);
			lhs.add(valor[i]);
			ts.add(valor[i]);
		}
		System.out.println("\n\nValores de objHashSet (no hay orden):");
		for(String StringHS:hash){
			System.out.print(StringHS+" ");
		}
		System.out.println("\n\nValores de objLinkHashSet (por orden de inserci�n):");
		for(String valorLHS:lhs){
			System.out.print(valorLHS+" ");
		}
		System.out.println("\n\nValores de objTreeSet (orden alfab�tico):");
		for(String valorTS:ts){
			System.out.print(valorTS+" ");
		}
		System.out.println("\n");
		System.out.println("Valores de objHashSet: "+hash.toString());
		System.out.println("Valores de objLinkHashSet: "+lhs);
		System.out.println("Valores de objTreeSet: "+ts);
		
	}

}