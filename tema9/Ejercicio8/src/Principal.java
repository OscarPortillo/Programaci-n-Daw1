import java.util.Random;

//import java.util.Random;

public class Principal {
	public static void main(String[] args) {
		//Random azar=new Random();
		/*Cliente cli=new Cliente();
		cli.pedirTodosDatos();		
		cli.visualizarTodosDatos();
		Empleado emp=new Empleado();
		emp.pedirTodosDatos();
		emp.visualizarTodosDatos();*/
		Random azar=new Random();
		@SuppressWarnings("unused")
		String nom;
		String nombres[]={"Oscar","Jorge","Nelson","Nestor","Beatrice","Fabián","Gonzalo","Oscar","Ricardo","Reus","Alexis","Neymar","Javier","Firminho","Alexander"};
		Cliente cli[];
		cli=new Cliente[10];
		for(int i=0;i<cli.length;i++){			
			cli[i]=new Cliente(nombres[azar.nextInt(nombres.length)]);
		}
		for(int i=0;i<cli.length;i++){			
			cli[i].verNom();
		}
		System.out.println();
		System.out.println("REVES");
		System.out.println();
		for(int i=cli.length-1;i>=0;i--){			
			cli[i].verNom();
		}
	}//main
	
}//class 