import java.util.*;
public class Ejer33 {

	public static void main(String[] args) {
		String array[]={"oscar","mardo","messi","pirlo","totti","morata","neymar","eminem","2PAc"
				,"50Cent","wiz Khalifa","Camila","Amanda","Cerny","vin","Diesel","Paul","Walker","Dominic","Toreto"};
		 int pos=0;
		 Random azar=new Random();
		 
		for(String nombre:array){
			pos++;
			  System.out.print(pos+" "+nombre+" ");
		  }
	}
}
