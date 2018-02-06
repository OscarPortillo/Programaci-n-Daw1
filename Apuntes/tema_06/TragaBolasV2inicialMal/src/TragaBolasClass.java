
import java.util.Scanner;

public class TragaBolasClass {
	private String color;
	private Integer maxBolas;
	private Integer bolasComidas;
	
	public TragaBolasClass(){
		
	}
	public TragaBolasClass(String color, Integer maxBolas) {
		this.color = color;
		this.maxBolas = maxBolas;
		bolasComidas=0;
	}

	public String visualizar(){
		return "El color es " + color + " el numero maximo de bolas es " + maxBolas +" y lleva comidas un total de " + bolasComidas;
	}
	public String comer(){
		if (bolasComidas < maxBolas){
			bolasComidas ++;
			return "He comido una bola.";
		}
		else{
			return "No puedes comer mas";
		}
	}
	public String trotar(){
		if (bolasComidas >= 1){
			bolasComidas --;
			return "Estoy trotando";
		}
		else{
			return "No puedes trotar mas";
		}
	}
	public String dormir(){
		if(bolasComidas==maxBolas){
			bolasComidas= bolasComidas / 2;
			return "Tripa llena. ZZZZZZ";
		}
		else{
			return "No quiero dormir";
		}
	}
}