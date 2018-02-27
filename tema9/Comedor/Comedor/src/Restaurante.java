public class Restaurante {

	private Ingredientes ingrediente;
	private String nombrePlato;
	private String bebida;
	private double precio;
	private String postre;


	public Restaurante(Ingredientes ingrediente, String nombrePlato, String bebida, String postre,double precio) {
		super();
		this.ingrediente = ingrediente;
		this.nombrePlato = nombrePlato;
		this.bebida = bebida;
		this.postre = postre;
		this.precio=precio;
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


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getPostre() {
		return postre;
	}


	public void setPostre(String postre) {
		this.postre = postre;
	}


	public void verCarta(){
		System.out.println("\tNOMBRE DEL PLATO: "+nombrePlato);
		System.out.println("\tINGREDIENTES");
		ingrediente.verIngre();
		System.out.println("\tBEBIDA: "+bebida);
		System.out.println("\tPOSTRE: "+postre);
		System.out.println("\tPRECIO: "+precio);

	}
}