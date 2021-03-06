
public class CuentaCorriente {
	private String numCuenta;
	private double saldo;
	private String cliente;
	
	CuentaCorriente(String cuenta,double cantidad,String cliente){
		this.numCuenta=cuenta;
		this.saldo=cantidad;
		this.cliente=cliente;
	}
	public void ingresaEfectivo(double cantidad){
		saldo=saldo+cantidad;
	}
	public void retiraEfectivo(double cantidad){
		if(saldo-cantidad<0){
			System.out.println("No tienes suficiente saldo.");
		}else{
			saldo=saldo-cantidad;
			System.out.println("Se ha retirado correctamente.");
		}
	}
	
	public void visualiza(){
		System.out.println("Numero de cuenta: "+numCuenta);
		System.out.println("Saldo Actual: "+saldo);
		System.out.println("Nombre del cliente: "+cliente);
		System.out.println();
	}
}//class