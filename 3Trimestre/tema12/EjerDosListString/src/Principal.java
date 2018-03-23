import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		int num,num2;
		num=azar.nextInt(15)+1;
		ArrayList<String> arrayL=new ArrayList<String>();
		LinkedList<String> lList=new LinkedList<String>();
		String valor[]={"este "," montaña "," letra"," bajo "," frio "," bajo "," bajo "," aleatorio "};
		System.out.println("Se van a generar "+num+" datos");
		System.out.println("Insertando");
		for(int i=0;i<num;i++){
			num2=azar.nextInt(15)+1;
			System.out.print(num2+" * ");
			arrayL.add(valor[i]);
			lList.add(valor[i]);
		}
		System.out.println("\n\nValores de ArrayList");
		for(String a:arrayL){
			System.out.print(a+" ");
		}
		System.out.println("\n\nValores de LinkedList");
		for(String lL:lList){
			System.out.print(lL+" ");
		}
		System.out.println("\n\nValores de ArrayList: "+arrayL.toString());
		System.out.println("Valores de LinkedList: "+lList.toString());
		}//main
}
