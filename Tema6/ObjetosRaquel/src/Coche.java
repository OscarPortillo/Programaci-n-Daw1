
public class Coche {
	private String color;
	private int velocidad;
	private int ruedas;
	Coche(){
		color="Rojo";
		velocidad=0;
		ruedas=4;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public void verCoche(){
		System.out.println("Color del coche: "+color);
		System.out.println("Velocidad del coche: "+velocidad);
		System.out.println("Ruedas: "+ruedas);
	}
}//class
