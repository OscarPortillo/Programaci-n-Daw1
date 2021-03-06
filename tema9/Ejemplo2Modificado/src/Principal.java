public class Principal {
	public static void main(String[] args) {
		Persona persona[] = new Persona[3];
		int pos;
		for (pos = 0; pos < 3; pos++) {
			persona[pos] = new Persona();
		}

		Mamifero mamifero[] = new Mamifero[2];
		for (pos = 0; pos < 2; pos++) {
			mamifero[pos] = new Mamifero();
		}

		Animal animal = new Animal();
		String pers;
		int numCrias,numHuesos,numExtre;
		System.out.print("\n\tINSERCIÓN DE LOS DATOS DE LAS DIFERENTES PERSONAS:");
		for (pos = 0; pos < 3; pos++) {
			System.out.print("\n\t\tINSERTE LOS DATOS DE LA PERSONA "+ (pos + 1));
			numCrias=persona[pos].insertarDatos();
			numHuesos=persona[pos].insertarDatosMamif();
			numExtre=persona[pos].insertarDatosMamif();
			pers=persona[pos].insertarDatosPers();
			persona[pos]=new Persona(numCrias,numHuesos,numExtre,pers);
		}
		System.out.print("\n\tINSERCIÓN DE LOS DATOS DE LOS DIFERENTES MAMÍFEROS:");
		for (pos = 0; pos < 2; pos++) {
			System.out.print("\n\t\tINSERTE LOS DATOS DEL MAMÍFERO" + (pos + 1));
			numCrias=mamifero[pos].insertarDatos();
			numHuesos=mamifero[pos].insertarDatosMamif();
			numExtre=mamifero[pos].insertarDatosMamif();
			mamifero[pos]=new Mamifero(numCrias,numHuesos,numExtre);
		}
		pos = 0;
		System.out.println("\n\tINSERCIÓN DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		System.out.println("\n\t\tINSERTE LOS DATOS DEL ANIMAL " + (pos + 1));
		//animal.insertarDatos();
		numCrias=animal.insertarDatos();
		animal=new Animal(numCrias);
		System.out.println("\nVISUALIZACIÓN DE LOS DATOS DE LAS DIFERENTES PERSONAS: ");
		for (pos = 0; pos < 3; pos++) {
			System.out.println("\nPERSONA" + (pos + 1));
			persona[pos].visualizarDatos();
		}
		System.out
				.println("\nVISUALIZACIÓN DE LOS DATOS DE LOS DIFERENTES MAMÍFEROS: ");
		for (pos = 0; pos < 2; pos++) {
			System.out.println("\nMAMÍFERO" + (pos + 1));
			mamifero[pos].visDatosMamif();
		}
		System.out.println("\nVISUALIZACIÓN DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		animal.vis_datosanim();
		System.out.println("\n\tSE VA A PROCEDER A DAR DE COMER A TODAS LAS PERSONAS: ");
		for (pos = 0; pos < 3; pos++) {
			System.out.println("\n\t\tPERSONA" + (pos + 1));
			persona[pos].alimentarse();
		}
		System.out.println("\n\tTerminado de comer todas las personas, pasamos a que coman los mamíferos: ");
		System.out.println("\n\tSE VA A PROCEDER A DAR DE COMER A TODOS LOS MAMÍFEROS: ");
		for (pos = 0; pos < 2; pos++) {
			System.out.println("\n\t\t MAMÍFERO" + (pos + 1));
			mamifero[pos].alimentarse();
		}
		pos = 0;
		System.out.println("\n\tTerminado de comer todas los mamíferos, pasamos a que coma el único animal: ");
		System.out.println("\n\tSE VA A PROCEDER A DAR DE COMER AL RESTO DE LOS ANIMALES: ");
		System.out.println("\n\t\t ANIMAL " + (pos + 1));
		animal.alimentarse();
		System.out.println("\nFINALIZACIÓN DE TODO EL PROCESO. ");

	}
}
