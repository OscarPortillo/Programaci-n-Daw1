import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random azar=new Random();
		Integer[]copia;
		Integer pila[]=new Integer[10];
		copia=new Integer[pila.length];
		for(int i=0;i<pila.length;i++){
			pila[i]=new Integer(azar.nextInt(50));
		}
		System.out.println("Normal");
		for(int i=0;i<pila.length;i++){
			System.out.print(pila[i]+" ");
		}
		System.out.println();
		System.out.println("Al revez");
		for(int i=pila.length-1;i>=0;i--){
			System.out.print(pila[i]+" ");
		}
		System.out.println();
		System.out.println("Copia");

		for(int i=0;i<copia.length;i++){
			copia[i]=pila[i];
		}
		for(int i=0;i<copia.length;i++){
			System.out.print(copia[i]+" ");
		}
		System.out.println();
		System.out.println("For EACH");
		for(int num:copia){
			System.out.print(num+" ");
		}
		//string vector
		String nom[]=new String [12];
		String copiaS[]=new String [nom.length];
		for(int i=0;i<nom.length;i++){
			nom[i]=new String(a_nombreAzar());
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<nom.length;i++){
			System.out.print(nom[i]+" ");
		}
		for(int i=0;i<6;i++){
			copiaS[i]=nom[i];
		}

		System.out.println();
		System.out.println();
		System.out.println("Copia Strings al revez");
		for(int i=copiaS.length-1;i>=0;i--){
			if(copiaS[i]!=null){
				System.out.print(copiaS[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Copia FOR EACH");
		for(String nombre:copiaS){
			if(nombre!=null){
				System.out.print(nombre+" ");
			}
		}

	}
	static public String a_nombreAzar() {
		Random azar= new Random();

		String nombreAzar[]={"Santiago","Sebasti�n","Diego","Thiago","Nicol�s","Samuel","Dario","Alejandro","Mateo",
				"�ngel","Mat�as","Gabriel","Tom�s","David","Emiliano","Andr�s","Joaqu�n","Carlos","Alexander","Adri�n","Lucas",
				"Sof�a","Camila","Valentina","Isabella","Valeria","Daniela","Mariana","Sara","Victoria","Gabriela","Ximena",
				"Andrea","Natalia","M�a","Martina","Luc�a","Samantha","Mar�a","Paula","Nicole","Beatrice","Ionice","Fabi�n","Gonz�lo","Raquel"};

		return nombreAzar[azar.nextInt(nombreAzar.length)];
	}



}//class