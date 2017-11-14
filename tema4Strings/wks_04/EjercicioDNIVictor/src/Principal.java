import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String documento = new String();
		char lista[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','C'};
		char letrafin;
		String nie = new String();
		String dni = new String();
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int indice, intdni, intnie;
		System.out.println("Introduce tu DNI/NIE:");
		documento = teclado.nextLine().toUpperCase();
		while(documento.length() > 9){
			System.out.println("ERROR");
			System.out.println("Introduce tu DNI/NIE:");
			documento = teclado.nextLine().toUpperCase();
			for(indice = 1; indice < (documento.length()-2); indice++){
				if(documento.charAt(indice) > 57 || documento.charAt(indice) < 48){
					System.out.println("ERROR");
					System.out.println("Introduce tu DNI/NIE:");
					documento = teclado.nextLine();
				}
			}
		}
		letrafin = documento.charAt(8);
		if(documento.charAt(0) <= 57 && documento.charAt(0) >= 48){
			dni = documento.substring(0, 8);
			intdni = Integer.parseInt(dni);
			intdni = intdni % 23;
			if(lista[intdni] == letrafin){
				System.out.println("DNI VERIFICADO");
			}else{
				System.out.println("ERROR");
			}
		}
		if(documento.charAt(0) <= 90 && documento.charAt(0) >= 88){
			nie = documento.substring(0, 8);

			if(documento.charAt(0) == 88){
				nie = nie.replace('X', '0');
				intnie = Integer.parseInt(nie);
				intnie = intnie % 23;
				if(lista[intnie] == letrafin){
					System.out.println("NIE VERIFICADO");
				}else{
					System.out.println("ERROR");
				}
			}
			if(documento.charAt(0) == 89){
				nie = nie.replace('Y', '1');
				intnie = Integer.parseInt(nie);
				intnie = intnie % 23;
				if(lista[intnie] == letrafin){
					System.out.println("NIE VERIFICADO");
				}else{
					System.out.println("ERROR");
				}
			}
			if(documento.charAt(0) == 90){
				nie = nie.replace('Z', '2');
				intnie = Integer.parseInt(nie);
				intnie = intnie % 23;
				if(lista[intnie] == letrafin){
					System.out.println("NIE VERIFICADO");
				}else{
					System.out.println("ERROR");
				}
			}
		}else{
			System.out.println("ERROR");
		}

	}
}
											