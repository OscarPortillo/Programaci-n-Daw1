import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Random azar=new Random();
		
		String vect[]=new String [3];
		String m;
		for(int i = 0;i < 3;i++){
			vect [i]=new String (Libreria.asignaturaAzar());			
		}
		int cont=0;
		System.out.println("Comprobando si se repiten");
		System.out.println();
		do{
			m=Libreria.asignaturaAzar();
			for(int i=0; i<vect.length;i++){				
				if(vect[i].equals(m)){
					System.out.println(m+" Se repite introduce uno nuevo");
					m=Libreria.asignaturaAzar();
					while(vect[i].equals(m)){
						m=Libreria.asignaturaAzar();
						vect[i]=new String (m);
					}
					
					cont++;
				}else{
					cont=0;
				}
			}
		}while(cont!=0);
		for(int i = 0;i < 3;i++){
			System.out.println(vect [i]);
		}
		/*int num;
		int vec[]=new int[10];
		for(int i=0;i<3;i++){
			num=azar.nextInt(15)+2;
			vec[i]=num;
		}
		System.out.println("Luego de introducir");
		for(int i=0;i<vec.length;i++){
			if(vec[i]!=0){
				System.out.print(vec[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Al revez");
		int n=0;
		for(int i=vec.length-1;i>=0;i--){
			if(vec[i]!=0){
				System.out.print(vec[i]+" ");
			}else{
				n=i;
			}
		}
		System.out.println("Le a�ado");
		for(int i=n;i<5;i++){
			num=azar.nextInt(15)+2;
			vec[i]=num;
		}
		System.out.println("Lo muestro lo que tenia mas lo a�adido");
		for(int i=0;i<vec.length;i++){
			if(vec[i]!=0){
				System.out.print(vec[i]+" ");
			}
		}*/
	}

}
