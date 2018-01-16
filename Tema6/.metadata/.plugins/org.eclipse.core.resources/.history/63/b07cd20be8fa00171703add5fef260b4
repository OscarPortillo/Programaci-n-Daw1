import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		CuentaCorriente cuenta1,cuenta2;//=new CuentaCorriente("001",0,"Oscar Portillo");
		cuenta1=new CuentaCorriente("001",0,"Oscar Portillo");
		cuenta2=new CuentaCorriente("002",0,"Raquel Fernández");
		//cuenta1.visualiza();
		//cuenta2.visualiza();
		double ingreso,retiro;
		int opc;
		do{
			System.out.println("1: Ingresar en la cuenta 001");
			System.out.println("2: Ingresar en la cuenta 002");
			System.out.println("3: Retirar de la cuenta 001");
			System.out.println("4: Retirar de la cuenta 002");
			System.out.println("5: Visualizar ambas cuentas");
			System.out.println("0: Fin");
			opc=teclado.nextInt();
			switch(opc){
			case 1:
				System.out.println("Ingresa la cantidad a guardar:" );
				ingreso=teclado.nextDouble();
				cuenta1.ingresaEfectivo(ingreso);
				
				break;
			case 2:
				System.out.println("Ingresa la cantidad a guardar:" );
				ingreso=teclado.nextDouble();
				cuenta2.ingresaEfectivo(ingreso);
				
				break;
			case 3:
				System.out.println("Ingresa la cantidad a retirar:" );
				retiro=teclado.nextDouble();
				cuenta1.retiraEfectivo(retiro);
				
				break;
			case 4:
				System.out.println("Ingresa la cantidad a retirar:" );
				retiro=teclado.nextDouble();
				cuenta2.retiraEfectivo(retiro);
				
				break;
			case 5:
				cuenta1.visualiza();
				cuenta2.visualiza();
				break;
			}
		}while(opc!=0);
		teclado.close();
	}//main
	
}//class