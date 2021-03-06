
public class Alumno {
	private String nombre;
	private Integer edad;
	private Asignatura[] asig;
	private double nota;
	private String fechaNac;
	
	public Alumno(String nombre, String fechaNac) {
		super();
		this.nombre = nombre;
		this.edad = Libreria.enteroAzar(10, 25);
		this.asig =asignatura();
		this.nota = Libreria.enteroAzar(0, 10);
		this.fechaNac = fechaNac;
		//a�adirAsignatura(asig, Libreria.asignaturaAzar());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Asignatura[] asignatura(){
		for(int i=0;i<asig.length;i++){
			asig[i].verAsig();
		}
		return asig;
	}
	public void verAlumno(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Fecha Nacimiento: "+fechaNac);
		System.out.println("Asignatura: ");
		for(int i=0;i<asig.length;i++){
			asig[i].verAsig();
		}
		System.out.println("Nota: "+nota);
		System.out.println(verNota());
	}
	public void cambiarNombre(String nombre){
		System.out.println("Introduce el nuevo nombre");
		this.nombre=nombre;
	}
	public void modificarFechaNacimiento(int dia,int mes,int a�o){
		this.fechaNac=dia+"-"+mes+"-"+a�o;
	}
	public String  verNota(){
		if(nota>=6){
			return "Aprobado";
		}else{
			return "Suspendido";
		}
	}
	public void notaMedia(){
		
	}
	public int a�adirAsignatura(Asignatura unaAsig[],String nuevaAsig){
		int repetida=0;
		for(int i=0;i < unaAsig.length && repetida==0;i++){
			if(unaAsig[i].getNombreAsig().equals(nuevaAsig)){
				repetida=1;
				System.out.println("Esta Asiganatura ya esta inscrita");
			}else{
				
				System.out.println("Asignatura a�adida");
				repetida=0;
			}
		}
		return repetida;
	}
}
