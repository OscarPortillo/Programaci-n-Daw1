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

		String nombres[] = { "Santiago", "Sebastián", "Diego", "Thiago", "Nicolás", "Samuel", "Dario", "Alejandro",
				"Mateo", "Ángel", "Matías", "Gabriel", "Tomás", "David", "Emiliano", "Andrés", "Joaquín", "Carlos",
				"Alexander", "Adrián", "Lucas", "Sofía", "Camila", "Valentina", "Isabella", "Valeria", "Daniela",
				"Mariana", "Sara", "Victoria", "Gabriela", "Ximena", "Andrea", "Natalia", "Mía", "Martina", "Lucía",
				"Samantha", "María", "Paula", "Nicole" };

		return nombres[azar.nextInt(nombres.length)];
	}// nombreAzar
	public static int enteroAzar(int desde, int hasta) {
		Random azar = new Random();
		return azar.nextInt(hasta - desde + 1) + desde;
	}// enteroAzar
}//class