import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		HashSet<Integer> hs=new HashSet<Integer>();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		int num,num2;
		num=azar.nextInt(15)+1;
		System.out.println("Se van a generar "+num+" datos.");
		System.out.println("Insertando");
		for(int i=0;i<num;i++){
			num2=azar.nextInt(1000)+8000;
			System.out.print(num2+" * ");
			hs.add(num2);
			lhs.add(num2);
			ts.add(num2);			
		}
		System.out.println("\n\nValores de objHashSet");
		for(Integer obHS:hs){
			System.out.print(obHS+" ");
		}
		System.out.println("\n\nValores de objLinkedHashSet");
		for(Integer ldhs:lhs){
			System.out.print(ldhs+" ");
		}
		System.out.println("\n\nValores de objTreeSet");
		for(Integer obTS:ts){
			System.out.print(obTS+" ");
		}
		System.out.println("\n\nValores de objHashSet: "+hs.toString());
		System.out.println("Valores de objLinkedHashSet: "+lhs.toString());
		System.out.println("Valores de objTreeSet: "+ts.toString());
	}//main

}//class
