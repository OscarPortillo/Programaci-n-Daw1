import java.util.Scanner;

public class Estaticos {
	private static final double PI=3.141592;

	static public int pideNumPositivo(){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("¿Numero mayor que 0?");
		num=teclado.nextInt();
		while(num <= 0){
			System.out.println("¿Numero mayor que 0?");
			num=teclado.nextInt();
		}
		return num;
	}//pideNumPositivo

	static public boolean esPrimo(int n)
	{		
		/*int divisor, contaDivisores=0;// contaDivisores cuenta los divisores del numero
		for (divisor=2; divisor<=n-1;divisor++){
			if (n%divisor==0)
				contaDivisores++;
		}*/
		//if (contaDivisores!=0){// si no hay cero divisores no es primo y en caso contrario si, lo es
		if (cuantosDiv(n) > 2){
			return false;
		}else{
			return true;
		}		
	}//esPrimo
	static public int cuantosDiv(int n)
	{	

		int divisor, contaDivisores=0;// contaDivisores cuenta los divisores del numero
		for (divisor=1; divisor<=n;divisor++){
			if (n%divisor==0)
				contaDivisores++;
		}
		return contaDivisores;

	}// fin del metodo cuantos_div

}//class
