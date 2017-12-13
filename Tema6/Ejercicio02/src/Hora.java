
@SuppressWarnings("unused")
public class Hora {
	private int segundo;
	private int minuto;
	private int hora;
	Hora (){
		segundo = 0;
		minuto = 0;
		hora = 0;
	}
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public void verHora(){
		String hora2="";
		String min="";
		String seg="";
		if(hora<10){
			hora2=0+""+hora;
		}else{
			hora2=""+hora;
		}
		if(minuto<10){
			min=0+""+minuto;
		}else{
			min=""+minuto;
		}
		if(segundo<10){
			seg=0+""+segundo;
		}
		else{
			seg=""+segundo;
		}
		System.out.println(hora2+":"+min+":"+seg);
		
	}
	
}
