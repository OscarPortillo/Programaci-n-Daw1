import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		Integer num,num2;
		HashSet<Integer> hash=new HashSet<Integer>();
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		TreeSet<Integer> ts=new TreeSet<Integer>();
		num=azar.nextInt(15)+1;
		System.out.println("Se van a generar "+num+" datos.");
		System.out.println("Insertando:");
		for(int i=0;i<num;i++){
			num2=azar.nextInt(1000)+8000;			
			System.out.print(num2+" * ");
			hash.add(num2);
			lhs.add(num2);
			ts.add(num2);
		}
		System.out.println("\n\nValores de HashSet");
		for(Integer hset:hash){
			System.out.print(hset+" ");
		}
		System.out.println("\n\nValores de LinkedHashSet");
		for(Integer link:lhs){
			System.out.print(link+" ");
		}
		System.out.println("\n\nValores de TreeSet");
		for(Integer tree:ts){
			System.out.print(tree+" ");
		}
		System.out.println("\n");
		System.out.println("Valores de HashSet: "+hash);
		System.out.println("Valores de LinkedHashSet: "+lhs);
		System.out.println("Valores de TreeSet: "+ts);
	
	}

}