//Introducir un numero menor de 5000 y pasarlo a numero romano
import java.util.Scanner;
public class VictorCampos {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		int num, longitud, indice, diguniint, digcenteint, digdeceint, digmilint;
		String vmil[] = {"", "M", "MM", "MMM", ("\n" +"__" + "\n" + "IV ")};//vector para mil
		String vcen[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC","DCCC", "CM"};//vector para centenas
		String vdec[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};//vector para decenas
		String vuni[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};//vector para unidades
		String numstring, numromano, diguni, digcente, digdece, digmil;

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero, entre 1 y 4999");

		num = teclado.nextInt();//pedimos el numero en int
		while (num>=5000 || num<1){//comprobamos si esta en el rango que queremos
			System.out.println("Error introduce un numero entre 1 y 4999");
			num = teclado.nextInt();
		}

		numstring = Integer.toString(num);//lo pasamos a string para comprobar la longitud

		longitud = numstring.length();//guardamos la longitud en una variable int

		switch (longitud) {//hay 4 casos 
		case 1://solo un digito
			numromano = vuni[num];
			System.out.println("El numero " + num + " en numeros romanos se escribe " + numromano);
			break;
		case 2://numero de dos digitos
			digdece = numstring.substring(0, 1);//sacamos el valor de la decena
			diguni = numstring.substring(1, 2);//sacamos el valor de la unidad
			digdeceint = Integer.parseInt(digdece);//pasamos a int las decenas
			diguniint = Integer.parseInt(diguni);//pasamos a int las unidades
			numromano = vdec [digdeceint] + vuni[diguniint];
			System.out.println("El numero " + num + " en numeros romanos se escribe " + numromano);
			break;
		case 3://tres digitos
			digcente = numstring.substring(0,1);
			digdece = numstring.substring(1, 2);
			diguni = numstring.substring(2, 3);
			digcenteint = Integer.parseInt(digcente);
			digdeceint = Integer.parseInt(digdece);
			diguniint = Integer.parseInt(diguni);
			numromano =vcen[digcenteint] + vdec [digdeceint] + vuni[diguniint];
			System.out.println("El numero " + num + " en numeros romanos se escribe " + numromano);
			break;
		case 4://cuatro digitos
			digmil = numstring.substring(0,1);
			digcente = numstring.substring(1,2);
			digdece = numstring.substring(2, 3);
			diguni = numstring.substring(3, 4);
			digmilint = Integer.parseInt(digmil);
			digcenteint = Integer.parseInt(digcente);
			digdeceint = Integer.parseInt(digdece);
			diguniint = Integer.parseInt(diguni);
			numromano = vmil [digmilint] + vcen[digcenteint] + vdec [digdeceint] + vuni[diguniint];
			System.out.println("El numero " + num + " en numeros romanos se escribe " + numromano);
			break;
		default:
			break;

		}



	}

}
