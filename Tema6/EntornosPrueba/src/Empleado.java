
/**
 * <h2>Clase Empleado, se utiliza para crear y leer empleados de una BD</h2>
 * 
 * Busca informaci�n de javadoc en  <a href="http://google.com">GOOGLE</a>
 * @see <a href="http://www.google.com">Google</a>
 * @version 1-2014
 * @author ARM
 * @since 1-1-2014
 */
/**
 * @author oscar portillo
 *
 */
public class Empleado {
    /**
     * Atributo Nombre del empleado
     */
    private String nombre;
    /**
     * Atributo apellido del empleado
     */
    @SuppressWarnings("unused")
	private String apellido;
    /**
     * Edad del empleado
     */
    private double salario;
 
    /**
     * Constructor con 3 parametros. Crea objetos empleado, con nombre, apellido y salario.
     * @param nombre Nombre del empleado
     * @param apellido Apellido del empleado
     * @param salario Salario del empleado
     */
    public Empleado(String nombre, String apellido, double salario){
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }
    
    //M�todos p�blicos
 
    /**
     * Sube el salario al empleado.
     * @see Empleado
     * @param subida
     * 
     */
    public void subidasalario (double subida){
           salario=salario + subida;
    }
 
    //M�todos privados
    /**
     * Comprueba que el nombre no este vac�o
     * @return <ul>
     *  <li>true: el nombre es una cadena vac�a</li>
     *  <li>false: el nombre no es una cadena vac�a</li>
     *  </ul>
     */
    @SuppressWarnings("unused")
	private boolean comprobar(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
   
}
