import java.util.Scanner;

public class Ejer35 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int [] notas={10,5,6,2,4,7,8,10,3};
		int num,nota = 0;
		System.out.println("Introduce el numero menor que 1o y mayor que 0");
		num=teclado.nextInt();
		for(int k=0;k<notas.length;k++){
			if(num==notas[k]){
				nota=notas[k];
			} 
		}
		System.out.println(nota);
	}

}
