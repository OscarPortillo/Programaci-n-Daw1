
public class GestionMueble {

	public static void main(String[] args) {
		Mueble mueble[]=new Mueble[15];//GENERO UN VECTOR PARA CREAR 15 OBJETOS
		Almacen alma[]=new Almacen[4];//GENERO UN VECTOR PARA CREAR 4 OBJETOS
		int opc;
		crearMueble(mueble);//VOY AL METODO CREAR MUEBLE
		creaAlmacen(alma);//creo los almcenes en el metodo
		crearInfoAlma( alma, mueble);//metodo crearInfoAlma
		do{
			menu();
			opc=Libreria.pedirEntero("Elije opcion");
			switch(opc){
			case 1://mostrar todos los muebles				
				verMueble(mueble);//VOY AL METODO MOSTRAR MUEBLE
				break;
			case 2:		//ver todos los almacenes		
				verAlmace(alma);//voy al metodo crear alamcenes
				break;
			case 3://ver la informacion de los alamecenes con los muebles qu eguarda
				
				verInfoAlma(alma);//verInfoAlma
				break;
			}
		}while(opc!=0);
		System.out.println("ADIOS BUENAS TARDES");

	}//main
	public static void crearInfoAlma(Almacen alma[],Mueble mueble[]){//ver informacion del almacen y los muebles qu eguarda
		/*String nombreAlma[]={"Almacen izquierdo","Almacen derecho","Almacen central","Almacen temporal"};
		String dir[]={"Calle la luz Nº7","Paseo Sagasta Nº21","Avenida Valencia Nº78","Avenida Navarra Nº13"};*/
		int numMuebles=0;
		for(int i=0;i<alma.length;i++){
			numMuebles=Libreria.enteroAzar(0, mueble.length);//genro un numero azar entre 0 y la longitud del vector muebles
			for(int k=0;k<numMuebles;k++){//mientras k sea menor que el numero generado al azar
				alma[i]=new Almacen (alma[i].getNombre(), mueble[k], alma[i].getDireccion());//pasará el nombre y tantos
				//muebles como se han generado al azar entre 0 y la longitud del vector muebles 
			}//for interno
		}//for
	}
	public static void verInfoAlma(Almacen alma[]){
		for(int i=0;i<alma.length;i++){
			System.out.println("=======================================");
			if(alma[i]!=null){//sin la posiicion no es null entra
				alma[i].mostrarAlmacen();
			}else{//si la posicion es null entra
				System.out.println("No hay informacion sobre este almacen");
			}
		}
	}
	public static void creaAlmacen(Almacen alma[]){//crear almacen
		String nombreAlma[]={"Almacen izquierdo","Almacen derecho","Almacen central","Almacen temporal"};
		String dir[]={"Calle la luz Nº7","Paseo Sagasta Nº21","Avenida Valencia Nº78","Avenida Navarra Nº13"};
		for(int i=0;i<alma.length;i++){
			alma[i]=new Almacen(nombreAlma[i],dir[i]);//relleno el vector con el vector de nombre y direcion con posicion ++
		}
	}
	public static void verAlmace(Almacen alma[]){//mostrar almacen
		for(int i=0;i<alma.length;i++){
			if(alma[i]!=null){//sin la posiicion no es null entra
				System.out.println(alma[i].muestraAlmacen());
			}else{//si la posicion es null entra
				System.out.println("No hay almacenes creados");
			}
		}
	}
	public static void crearMueble(Mueble mueble[]){//metodo crear muebles
		String nomMueble[]={"Es una mesa","Es una silla","Este es un armario",//los nombres se los voy dando con posicion i en el for por que miguel angel nos lo dijo
				" Es un Escritorio ","Sofá muy comodo","Reposa pie para relajarte.","Estanteria para poner la tv","Perchero para su ropa"
				,"Zapatero muy barato","Sillón muy bonito","Cama bonita y barata","Litera para 2 personas","Guarda platos de madera"
				,"Guarda Vasos de plastico","Mesa de bar con Ron incluido","Silla Gamer para los niños","Mesa 2 para comer en familia"
				,"Cama Matrimonial muy barata"};//le paso descripciones con posicion ++
		for(int i=0;i<mueble.length;i++){
			mueble[i]=new Mueble(nomMueble[i],Libreria.enteroAzar(100, 120),Libreria.enteroAzar(70, 180),Libreria.enteroAzar(50, 90));//relleno el vector
		}//for
	}
	public static void verMueble(Mueble mueble[]){//mostrar muebles
		for(int i=0;i<mueble.length;i++){//
			if(mueble[i]!=null){//si la posicion no es null entra y lo muestra
				System.out.println(mueble[i].muestraMueble());//lista la informacion del mueble con posicion i
			}else{//si la posicion es null entra
				System.out.println("No hay muebles");
			}//if else
		}//for
	}
	public static void menu(){
		System.out.println(" 1 - Ver muebles.");
		System.out.println(" 2 - Ver los almacenes");
		System.out.println(" 3 - Iformacion de los amacenes.");
		System.out.println(" 0 - Salir.");
	}

}//class principal