import java.util.*;

public class Principal {

	public static void main(String[] args) {
		String nombres[] = { "Oscar", "Juan", "Cristina", "Raquel", "Beatrice", "Ioana", "Nestor", "Patricia", "Arturo",
				"Mar�a" };
		String apellidos[] = { "Portillo ", "Jim�nez", "Fernand�z", "S�arez", "Carbonel", "Pe�a", "Blanco", "Chav�z",
				"Hern�ndez", "Mej�a" };
		Alumnos miAlu = null;
		Random azar = new Random();
		Integer nota1, nota2, nota3, nomAzar, apeAzar;
		for (Integer i = 0; i < 50; i++) {
			nomAzar = azar.nextInt(nombres.length);
			apeAzar = azar.nextInt(apellidos.length);
			nota1 = azar.nextInt(100) + 1;
			nota2 = azar.nextInt(100) + 1;
			nota3 = azar.nextInt(100) + 1;
			miAlu = new Alumnos(nombres[nomAzar], apellidos[apeAzar], nota1, nota2, nota3);
			System.out.println(miAlu.verAlu());
			miAlu.crearAlu(miAlu);
		}
		for(Integer i = 0; i < 50; i++) {
			
		}

	}// main

}// class