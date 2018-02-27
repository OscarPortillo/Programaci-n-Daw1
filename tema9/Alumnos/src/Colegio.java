
public class Colegio {

	public static void main(String[] args) {
		Asignatura asig[]=new Asignatura[6];
		Alumno alu[]=new Alumno[3];
		System.out.println(nivel());
		int opc;
		crearAsig(asig);		
		crearAlu(alu, asig);
		do{
			menu();
			opc=Libreria.pedirEntero("Elije opcion");
			switch(opc){
			case 1:
				verAsig(asig);
				break;
			case 2:
				verAlu(alu);
				break;

			}
		}while(opc!=0);


	}//main
	public static  void menu(){
		System.out.println(" 1 - Ver asignaturas");
		System.out.println(" 2 - Ver alumnos");
		/*System.out.println(" 3 - ");
		System.out.println(" 4 - ");
		System.out.println(" 5 - ");*/
		System.out.println(" 0 - Salir");
	}
	public static void crearAlu(Alumno alu[], Asignatura[] asig){
		String materia;
		for(int i=0;i<alu.length;i++){
			for(int k=0;k<6;k++){				

				materia=Libreria.asignaturaAzar();
				asig[k].getNombreAsig().equals(materia);
				asig[k]=new Asignatura(Libreria.asignaturaAzar(),Libreria.enteroAzar(1, 9),nivel());
				alu[i]=new Alumno(Libreria.nombreAzar(),Libreria.enteroAzar(15, 25),asig,Libreria.enteroAzar(1, 10),Libreria.fechaNacimientoAzar());
			}

		}
	}
	public static void verAlu(Alumno alu[]){

		for(int i=0;i<alu.length;i++){
			System.out.println("========================================");
			System.out.println("Alumno numero: "+(i+1));
			alu[i].verAlumno();

		}
	}
	public static void crearAsig(Asignatura asig[]){
		for(int i=0;i<asig.length;i++){
			asig[i]=new Asignatura(Libreria.asignaturaAzar(),Libreria.enteroAzar(1, 9),nivel());
		}
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
