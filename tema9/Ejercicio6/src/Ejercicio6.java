
public abstract class Ejercicio6 {
	@SuppressWarnings("unused")
	private String nombre;
	
	
	public Ejercicio6(String nombre) {
		super();
		this.nombre = nombre;
	}


	public void metodo(){
		
		System.out.println("soy "+nombre);
	}
	/*public abstract void metodoAbs();
	public abstract void metodoAbs1();//no se puede ponerle ponerle cuerpo 
	//es un metodo abstracto y ellos no tienen cuerpo
	/*
	 * puede que tenga metodos normales o puede que no
	 * puede que tenga metodos abstractos o puede que no
	 */
	/**
	 * puede tener metodos 
	 * Pero atributos abstractos no pueden habar
	 * "private abstract String nombre"-----> NO DEJA
	 * si la clase es abstracta se usa para que otras hereden de ella
	 * si hay metodos abstractos la clase hija tiene la +
	 * obligacion  de desarrollar el cuerpo del metodo
	 */
}
