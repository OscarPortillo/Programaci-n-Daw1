import java.util.*;
public class Principal {

	public static void main(String[] args) {

		TreeMap<String,Integer> alumno=new TreeMap<String,Integer>();
		Alumno[] alu=new Alumno[20];
		String nombreAux="";
		for(int i = 0; i < alu.length; i ++){
			alu[i]=new Alumno(nombreAzar(),enteroAzar(0,10));
			alumno.put(alu[i].getNombre(), alu[i].getNota());
		}
		for(String nombre:alumno.keySet()){
			Integer nota=alumno.get(nombre);
			System.out.println(nombre +" "+nota);
		}
	}//main
	public static String nombreAzar() {
		Random azar = new Random();

		String nombres[] = { "Santiago", "Sebasti�n", "Diego", "Thiago", "Nicol�s", "Samuel", "Dario", "Alejandro",
				"Mateo", "�ngel", "Mat�as", "Gabriel", "Tom�s", "David", "Emiliano", "Andr�s", "Joaqu�n", "Carlos",
				"Alexander", "Adri�n", "Lucas", "Sof�a", "Camila", "Valentina", "Isabella", "Valeria", "Daniela",
				"Mariana", "Sara", "Victoria", "Gabriela", "Ximena", "Andrea", "Natalia", "M�a", "Martina", "Luc�a",
				"Samantha", "Mar�a", "Paula", "Nicole" };

		return nombres[azar.nextInt(nombres.length)];
	}// nombreAzar
	public static int enteroAzar(int desde, int hasta) {
		Random azar = new Random();
		return azar.nextInt(hasta - desde + 1) + desde;
	}// enteroAzar
}//class