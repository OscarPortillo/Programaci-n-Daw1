
public class Indicador {
	private int nivel;
	private int tacometro;
	private String color;
	
	Indicador(){
		nivel=2;
		tacometro=10;
		color="Azul";
	}
	
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getTacometro() {
		return tacometro;
	}
	public void setTacometro(int tacometro) {
		this.tacometro = tacometro;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}//class