/**
 * @author oscar portillo
 *
 */
public class pruebadoc {
/**
* El m�todo main visualiza la longitud de la circunferencia.
* <ol>
* <li> coordx
* <li> coordy
* <li> radio
* </ol>
* @see <a href="http://www.google.es">Googlec</a> 
* @see Circulo 
*/
/**
 * 
 * @param ar es un nada
 */
public static void main(String[] ar){
	double coordx =10;
	double coordy=20;
	double radio=5;

	 Circulo cir=new Circulo(coordx,coordy,radio);
	 System.out.println("La longitud de la crcunferencia es: " + cir.getCircunferencia());
 }
	
}