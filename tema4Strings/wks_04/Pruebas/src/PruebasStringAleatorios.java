import java.util.*;
public class PruebasStringAleatorios {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		String nombres[]={"oscar","waldo","nelly","raquel","mar�a","jaime","lolo","lala","lol","bruhh","yisus"};
		String nomAle[]=new String[5];
		for(int k=0;k<5;k++){
			nomAle[k]=nombres[(int)(Math.random()*nombres.length+1)];
		}
		for(int k=0;k<5;k++){
			System.out.print(nomAle[k]+" ");//=nombres[(int)(Math.random()*nombres.length+1)];
		}
	}

}
