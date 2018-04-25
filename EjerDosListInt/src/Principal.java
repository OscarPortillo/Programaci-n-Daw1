import java.util.*;
public class Principal {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		int num,num2;
		Random azar=new Random();
		System.out.println("Se van a generar "+(num=azar.nextInt(15)+1)+" datos.");
		System.out.print("Inserando ");
		for(int i=0;i<num;i++){			
			num2=azar.nextInt(15)+1;
			
			System.out.print(num2+" * ");
			al.add(num2);
			ll.add(num2);
		}
		System.out.println("\n\nValores de objArrayList");
		for(Integer v1:al){
			System.out.print(v1+" * ");
		}
		System.out.println("\n\nValores de objLinkedList");
		for(Integer v2:ll){
			System.out.print(v2+" * ");
		}
		System.out.println("\n\nValores de objArrayList"+al.toString());
		System.out.println("Valores de objLinkedList"+ll.toString());
	}//main

}
