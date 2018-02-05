/*41.-Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se refieren al centro, al
curso y al número de alumnos de un colegio respectivamente. Imprimir la nota media por curso
y la nota media máxima y su centro de pertenencia*/

public class PsH3Ej41 {

	public static void main(String[] args) {
		int centro, curso, alu, suma ;
		int tablaNotas[][][] = new int [5][10][20];
		double media, maxMedia, tablaMedias[][] = new double[5][10];
		
		for(centro = 0; centro < 5; centro++){
			//System.out.println("\nCentro: " + (centro+1));
			System.out.printf("\n--------------------------------------------------------------------------------------------\n");
			System.out.printf("\nCentro%3d\n\n\t", centro+1);
			for(alu = 0; alu < 20; alu++){
				System.out.printf("  alu%2d", alu+1);
			}
			System.out.printf("\n--------------------------------------------------------------------------------------------\n");
			for(curso = 0; curso < 10; curso++){
				System.out.printf("\ncurso%2d", curso+1);
				
				for(alu = 0; alu < 20; alu++){
					tablaNotas[centro][curso][alu] = (int)(Math.random() * 10 + 1);
					System.out.printf("%7d", tablaNotas[centro][curso][alu]);
				}
			}
		}
		System.out.print("\n\t");
		for(curso = 0; curso < 10; curso++){
			System.out.printf("  cur%2d", curso+1);
		}
		
		for(centro = 0; centro < 5; centro++){
			System.out.printf("\ncentro%d", centro+1);
			for(curso = 0; curso < 10; curso++){
				suma = 0;
				for(alu = 0 ; alu < 20; alu++){
					suma = suma + tablaNotas[centro][curso][alu];
				}//
				//media del curso "curso" en el centro "centro"
				media = (double) suma/20;
				tablaMedias[centro][curso] = media;
				System.out.printf("%7.2f", media);
			}
		}
		//buscamos la maxima mas alta
		maxMedia = 0;
		for(centro = 0; centro < 5; centro++){
			for(curso = 0; curso < 10; curso++){
				if(tablaMedias[centro][curso] > maxMedia){
					maxMedia = tablaMedias[centro][curso];
				}
			}
		}
		//si la nota maxima se repite en varios centros queremos verla
		System.out.println();
		for(centro = 0; centro < 5; centro++){
			for(curso = 0; curso < 10; curso++){
				if(tablaMedias[centro][curso] == maxMedia){
					System.out.println("\nEl centro " + centro + " tiene una media igual a la maxima: " + maxMedia);
				}
			}
		}
		
	}//main

}//class
