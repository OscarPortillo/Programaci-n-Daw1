import java.util.*;
public class Principal {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);

		String parteLocal,dominio,correo; 

		int contErrores;
		contErrores=0; 
		do{
			System.out.println("Introduce la parte local del correco electr�nico");
			parteLocal=teclado.nextLine();
			for(int i=0;i<parteLocal.length();i++){//for para recorrer la parte local
				if((parteLocal.charAt(i) > 90 && parteLocal.charAt(i)<65)
						|| (parteLocal.charAt(i) < 122 && parteLocal.charAt(i) > 97)
						|| (parteLocal.charAt(i) < 48 && parteLocal.charAt(i) > 57 )
						|| (parteLocal.charAt(i)=='-' || parteLocal.charAt(i)=='_')
						||  parteLocal.charAt(i)=='.' ){//compruebo que esten entre los rangos permitidos
					//correcto = true;
					if( i > 0 ){//solo entro si ekl indice es mayor que cero para poder comprobar la posicion anterior
						if(parteLocal.charAt(i)=='.' &&  parteLocal.charAt(i-1)=='.'){//si empieza o finaliza ocn punto estar� mal

							//correcto=false;
							contErrores++;
						} //si son dos puntos seguidos
					}//cuando contador sea mayor que 0 para poder comprobar la anterior

				}//if
			}//for 
			if(parteLocal.charAt(0)=='.' || parteLocal.charAt(parteLocal.length()-1)=='.') {//si empieza o finaliza ocn punto estar� mal
				//correcto=false;
				contErrores++;
				System.out.println("No puede comenzar con punto ni terminar con punto");
			}

		}while(parteLocal.length() > 64 && contErrores!=0);


		if(contErrores==0){
			System.out.println(parteLocal+" @"+" Elige el dominio de tu correo: ");
			do{
				dominio=teclado.nextLine();
				for(int i=0 ; i<dominio.length(); i++){
					if(dominio.charAt(i) > 90 || dominio.charAt(i)<65
							|| dominio.charAt(i) < 122 || dominio.charAt(i) > 97
							|| dominio.charAt(i) < 48 || dominio.charAt(i) > 57 
							|| dominio.charAt(i)=='-' || dominio.charAt(i)=='_'){

					}//if
					else {
						contErrores++;


					}//for 
				}
				correo=parteLocal+"@"+dominio;
			}while(correo.length()>254);
			if(contErrores==0){
				System.out.println(correo);
			}
		}

	}//main

}//class