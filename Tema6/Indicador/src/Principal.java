/*clase que se llame Indicador que sea la
representaci�n de un indicador de la vida real (indicadores de nivel,
 de velocidad, tac�metros, etc). Deber� tener los m�nimos 
 elementos para representar valores, ajustarlos con un valor de 
 inicio, imprimir el valor, modificarlos a un valor determinado e
incrementar y disminuir el valor con el que cuentan.*/
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int v,k;
		Indicador velocimetro = new Indicador();
		System.out.println("Voy a " + velocimetro.getValorActual());
		System.out.println("Nueva velocidad?");
		v= teclado.nextInt();
		velocimetro.setValorActual(v);
		System.out.println("Voy a " + velocimetro.getValorActual());
		for(k=1;k<=10;k++){//incrementamos la velocidad en 1 Km/h
			velocimetro.incrementar();
			System.out.println("Voy a " + velocimetro.getValorActual());
		}
		System.out.println("Voy a " + velocimetro.getValorActual());
		teclado.close();
	}//main

}//class




