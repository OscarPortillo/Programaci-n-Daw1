import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		String vec[]={"este"," montaña "," letra"," bajo ","frio ","bajo "," bajo "," aleatorio "};
		HashSet<String> hs=new HashSet<String>();
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		TreeSet<String> ts=new TreeSet<String>();
		int num,num2;
		num=azar.nextInt(15)+1;
		System.out.println("Se van a generar 8 datos.");
		System.out.println("Insertando");
		for(int i=0;i<8;i++){			
			System.out.print(vec[i]+" * ");
			hs.add(vec[i]);
			lhs.add(vec[i]);
			ts.add(vec[i]);			
		}
		System.out.println("\n\nValores de objHashSet");
		for(String obHS:hs){
			System.out.print(obHS+" ");
		}
		System.out.println("\n\nValores de objLinkedHashSet");
		for(String ldhs:lhs){
			System.out.print(ldhs+" ");
		}
		System.out.println("\n\nValores de objTreeSet");
		for(String  obTS:ts){
			System.out.print(obTS+" ");
		}
		System.out.println("\n\nValores de objHashSet: "+hs.toString());
		System.out.println("Valores de objLinkedHashSet: "+lhs.toString());
		System.out.println("Valores de objTreeSet: "+ts.toString());
	}//main

}//class
