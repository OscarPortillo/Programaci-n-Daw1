
public class Ejer34 {

	public static void main(String[] args) {
		
		int [] notas={10,5,6,2,4,7,8,10,3};
		int suma;
		int media;
		
		suma=0;
		media=0 ;
		for(int k=0;k<notas.length;k++){
			suma=suma+notas[k];
			 
		}
		
		media=suma/notas.length;
		System.out.println(suma);
		System.out.println(media);
	}

}
