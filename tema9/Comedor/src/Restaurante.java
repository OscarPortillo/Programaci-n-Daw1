
public class Restaurante {
	
	private Ingredientes ingrediente;
	private String nombrePlato;
	private String bebida;
	
	public Restaurante(double precio, Ingredientes ingrediente, String nombrePlato, String bebida, String postre) {
		this.ingrediente = ingrediente;
		this.nombrePlato = nombrePlato;
		this.bebida = bebida;
	}
	public Ingredientes getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(Ingredientes ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public void verCarta(){
		System.out.println("---------*****************-------------");
		System.out.println("NOMBRE DEL PLATO: "+nombrePlato);
		System.out.println("INGREDIENTES");
		ingrediente.verIngre();
		System.out.println("BEBIDA: "+bebida);
		System.out.println("---------*****************-------------");
	}
}
