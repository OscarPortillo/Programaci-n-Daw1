
public class Colegio {

	public static void main(String[] args) {
		Asignatura asig[]=new Asignatura[6];
		Alumno alu[]=new Alumno[3];
		//System.out.println(nivel());
		int opc;
		crearAsig(asig);
		
		do{
			menu();
			opc=Libreria.pedirEntero("Elije opcion");
			switch(opc){
			case 1:
				verAsig(asig);
				break;
			case 2:
				
				break;

			}
		}while(opc!=0);


	}//main
	public static  void menu(){
		System.out.println(" 1 - Ver asignaturas");
		System.out.println(" 2 - Ver alumnos");
		System.out.println(" 0 - Salir");
	}
	/*public static void crearAlu(Alumno alu[]){
		for(int i=0;i<alu.length;i++){
			alu[i]=new Alumno(Libreria.nombreAzar(),Libreria.fechaNacimientoAzar());
		}
	}
	public static void verALu(Alumno alu[]){
		for(int i=0;i<alu.length;i++){
			alu[i].verAlumno();
			alu[i].notaMedia();
		}
	}
*/
	public static void crearAsig(Asignatura asig[]){
		int cont=0;
		String m;
		for(int i=0;i<asig.length;i++){
			m=Libreria.asignaturaAzar();
			asig[i]=new Asignatura (m,Libreria.enteroAzar(1, 7),nivel());
		}
		System.out.println("Comprobando si se repiten");
		do{
			m=Libreria.asignaturaAzar();
			for(int i=0; i<asig.length;i++){				
				if(asig[i].equals(m)){
					System.out.println(m+" Se repite introduce uno nuevo");
					m=Libreria.asignaturaAzar();
					while(asig[i].equals(m)){
						m=Libreria.asignaturaAzar();
						asig[i]=new Asignatura (m,Libreria.enteroAzar(1, 7),nivel());
					}
					
					cont++;
				}else{
					cont=0;
				}
			}
		}while(cont!=0);
	}
	public static void verAsig(Asignatura asig[]){
		for(int i=0;i<asig.length;i++){
			System.out.println("Asignatura numero: "+(i+1));
			asig [i].verAsig();
		}
	}//verAsig
	public static String nivel(){
		int opc;
		String nivel="";
		opc=Libreria.enteroAzar(1, 2);
		if(opc==1){
			nivel="1�";
		}else if(opc==2){
			nivel="2�";
		}
		return nivel;
	}//nivel
}//claas
