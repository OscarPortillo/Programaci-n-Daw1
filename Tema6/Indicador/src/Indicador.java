public class Indicador {
	private int valorActual;
	private int limiteSuperior;

	Indicador(){
		valorActual=0;
		limiteSuperior=100;
	}//Indicador

	public int getValorActual() {
		return valorActual;
	}

	public void setValorActual(int valorActual) {
		if(valorActual>limiteSuperior)
			this.valorActual=limiteSuperior;
		else
			this.valorActual = valorActual;
	}
	public void incrementar(){
		if(valorActual<limiteSuperior)
			valorActual++;
	}//incrementar
	public void incrementar(int incremento){
		if(valorActual+incremento<=limiteSuperior)
			valorActual=valorActual+incremento;
		else
			this.valorActual=limiteSuperior;
	}//incrementar
}// class



