
public class Principal {

	public static void main(String[] args) {

		String ciudades[]={"","Zaragoza","Madrid","Valencia","Barcelona","Logro�o"};
		String tabla[][]=new String[5][5];
		for(int k=0;k<5;k++){
			for(int j=0;j<5;j++){
				tabla[k][j]=ciudades[j];
			}
		}
		for(int k=0;k<5;k++){
			System.out.println();
			for(int j=0;j<5;j++){
				System.out.print(tabla[k][j]);
			}
		}
	}//

}//