/**
 * Ejemplo: pruebas de c�rculos
 * @author AARRMM 2013
 * @version 1-2013
 */
/**
 * @author oscar portillo
 *
 */
 public class Circulo {
      private double centroX;
      private double centroY;
      private double radio;

  /**
   * Constructor.
   * @param cx centro: coordenada X.
   * @param cy centro: coordenada Y.
   * @param r radio.
  */
 public Circulo(double cx, double cy, double r) {
  centroX = cx;
  centroY = cy;
  radio = r;
  }

 /**
  * Getter.
  * @return centro: coordenada X.
  */
 public double getCentroX() {
      return centroX;
 }

 /**
 * Calcula la longitud de la circunferencia (per�metro del c�rculo).
 * @return circunferencia.
 * @see <a href="https://educacion.uncomo.com/articulo/como-calcular-el-perimetro-de-una-circunferencia-40007.html">Apuntes</a> 
 *  @see pruebadoc 
 */
 public double getCircunferencia() {
         return 2 * Math.PI * radio;
 }
 /**
 * Desplaza el c�rculo a otro lugar.
 * @param deltaX movimiento en el eje X.
 * @param deltaY movimiento en el eje Y.
 */
 public void mueve(double deltaX, double deltaY) {
    centroX = centroX + deltaX;
    centroY = centroY + deltaY;
}

/**
 * Escala el c�rculo (cambia su radio).
 * @param s factor de escala.
*/
public void escala(double s) {
     radio = radio * s;
   }
 }

