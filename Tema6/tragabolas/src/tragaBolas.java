
public class tragaBolas {
	private String color;
	private int bolasComidas;
	private int maxBolas;
	tragaBolas(){
		color="Azul";
		bolasComidas=0;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBolasComidas() {
		return bolasComidas;
	}
	public void setBolasComidas(int bolasComidas) {
		this.bolasComidas = bolasComidas;
	}
	public int getMaxBolas() {
		return maxBolas;
	}
	public void setMaxBolas(int maxBolas) {
		this.maxBolas = maxBolas;
	}
	public void verEstado(){
		if(bolasComidas!=0){
			maxBolas=maxBolas-1;
			
		}
	}
}
