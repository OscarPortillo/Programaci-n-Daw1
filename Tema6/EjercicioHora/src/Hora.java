import java.util.Calendar;
import java.util.GregorianCalendar;
public class Hora {
	private int segundo;
	private int minuto;
	private int hora;
	Hora (){
		segundo = 0;
		minuto = 0;
		hora = 0;
	}
	Calendar tiempo=new GregorianCalendar();
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
		
		if(tiempo.get(Calendar.HOUR_OF_DAY)<10){
			hora2=0+""+tiempo.get(Calendar.HOUR_OF_DAY);
		}else{
			hora2=""+tiempo.get(Calendar.HOUR_OF_DAY);
		}
		if(tiempo.get(Calendar.MINUTE)<10){
			min=0+""+tiempo.get(Calendar.MINUTE);
		}else{
			min=""+tiempo.get(Calendar.MINUTE);
		}
		if(tiempo.get(Calendar.SECOND)<10){
			seg=0+""+tiempo.get(Calendar.SECOND);
		}
		else{
			seg=""+tiempo.get(Calendar.SECOND);
		}
		System.out.println();
		System.out.println("Hora real");
		System.out.println(hora2+":"+min+":"+seg);
		System.out.println();		
	}
	public void verHoraModificada(){
		while(minuto>=60){//si minuto es mayor que 60
			minuto=minuto-60;// a minuto le resto 60
			hora++;	//y le sumo 1 a hora osea que en total tendria si minuto valira 64 tendria 01:04		
		}
		while(segundo>=60){
			segundo=segundo-60;
			minuto++;
			
		}
		if(hora<10){
			System.out.print(0+""+hora+":");
		}else{
			System.out.print(hora+":");
		}
		if(minuto<10){
			System.out.print(0+""+minuto+":");
		}else{
			System.out.print(minuto+":");
		}
		if(segundo<10){
			System.out.print(0+""+segundo);
		}
		else{
			System.out.print(+segundo);
		}
		System.out.println();
		//System.out.println(hora2+":"+min+":"+seg);
		System.out.println();
		
	}//ver hora modificada
	
}//class
