import java.util.*;
public class romanos {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner teclado = new Scanner (System.in);
		String unidades[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String decenas[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String centenas[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC",""};
		String millares[]={"","M","MM","MMM","IV"};
		
		//int numero=(int)(Math.random()*10+1);
		@SuppressWarnings("unused")
		int num,posicion;
		@SuppressWarnings("unused")
		char numeros;
		
		
		String numero;
		do{
			System.out.println("Introducir numero");
			num=teclado.nextInt();
		}while(num>=5000 || num<1);
		
		numero =Integer.toString(num);
		
		//System.out.println(numero.length());
		if (numero.length() == 1){
			//numeros=numero.charAt(0);
			//posicion=(char)+numeros-48;
			System.out.println("Numero Introducido: "+num);
			System.out.println(unidades[numero.charAt(0)-48]);
		}
		if (numero.length() == 2){
			System.out.println("Numero Introducido: "+num);
			 System.out.println(decenas[numero.charAt(0)-48]+unidades[numero.charAt(1)-48]);
		}
		if (numero.length() == 3){
			System.out.println("Numero Introducido: "+num);
			 System.out.println(centenas[numero.charAt(0)-48]+decenas[numero.charAt(1)-48]+unidades[numero.charAt(2)-48]);
		}
		if (numero.length() == 4){
			 System.out.println("Numero Introducido: "+num);
			 System.out.println("__\n"+millares[numero.charAt(0)-48]+centenas[numero.charAt(1)-48]+decenas[numero.charAt(2)-48]+unidades[numero.charAt(3)-48]);
		}
		/*String romanos[]={"","I","X","L","C","M"};
		int valores[]={0,1,10,50,100,1000};
		int num,posicion;
		@SuppressWarnings("unused")
		char numeros;	
		String numero;
		do{
			System.out.println("Introducir numero");
			num=teclado.nextInt();
		}while(num>=5000 || num<1);		
		numero =Integer.toString(num);
		int k,j,i;
		i=0;
		j=0;
		k=0;
		for( ; k<6;k++){
			for( ; j<6;j++){
				for( ; i<6;i++){
					if(num==romanos[k]){
						
					}
				}
			}
		}
		*/
	}

}