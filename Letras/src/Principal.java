import java.util.*;
public class Principal {

	public static void main(String[] args) {
		TreeMap<String,String> cancion=new TreeMap<String,String>();
		int opc;
		cancion.put("Psycho", "Damn, my AP goin' psycho, lil' mama bad like Michael\n"
				+ "Can't really trust nobody with all this jewelry on you\n"
				+ "My roof look like a no-show, got diamonds by the boatload\n"
				+ "Come with the Tony Romo for clowns and all the bozos\n"
				+ "My AP goin' psycho, lil' mama bad like Michael\n"
				+ "Can't really trust nobody with all this jewelry on you\n"
				+ "My roof look like a no-show, got diamonds by the boatload\n"
				+ "Don't act like you my friend when I'm rollin' through my ends, though\n"
				+ "You stuck in the friend zone, I tell that four-five the fifth, ay\n"
				+ "Hunnid bands inside my shorts, DeChino the shit, ay\n"
				+ "Try to stuff it all in, but it don't even fit, ay\n"
				+ "Know that I been with the shits ever since a jit, ay\n"
				+ "I made my first million, I'm like, Shit, this is it, ay\n"
						+ "30 for a walkthrough, man, we had that bitch lit, ay\n"
						+ "Had so many bottles, gave ugly girl a sip\n"
						+ "Out the window of the Benzo, we could send in the ren'\n"
						+ "And I'm like Woah, man, my neck so goddamn cold\n"
								+ "Diamonds weigh, my teeths is sore\n"
								+ "I got homies, let it blow, oh\n\n"
								+ "My money thick, won't ever fold\n"
								+ "She said, Can I have some to hold?\n"
										+ "And I can't ever tell you no\n"
										+ "Damn, my AP goin' psycho, lil' mama bad like Michael\n"
										+ "Can't really trust nobody with all this jewelry on you\n"
										+ "My roof look like a no-show, got diamonds by the boatload\n"
										+ "Come with the Tony Romo for clowns and all the bozos\n"
										+ "My AP goin' psycho, lil' mama bad like Michael\n"
										+ "Can't really trust nobody with all this jewelry on you\n"
										+ "My roof look like a no-show, got diamonds by the boatload\n"
										+ "Don't act like you my friend when I'm rollin' through my ends, though\n"
										+ "The AP goin' psycho, my Rollie goin' brazy\n"
										+ "I'm hittin' lil' mama, she wanna have my babies\n"
										+ "Sippy on the Panky, chain so stanky\n"
										+ "You should see the whip, promise I can take yo bitch\n"
										+ "Dolla ridin' in an old school Chevy, it's a drop top\n"
										+ "Boolin' with a thot-thot, she gon' give me top-top\n"
										+ "Just one switch, I can make the ass drop (hey)\n"
										+ "Uh, take you to the smoke shop\n"
										+ "We gon' get high, ay, we gon' hit Rodeo\n"
										+ "Call up Valentino, we gon' hit Pico\n"
										+ "Take you where I'm from, take you to the slums\n"
										+ "This ain't happen overnight, no, these diamonds real bright\n"
										+ "Saint Laurent jeans, still in my Vans though\n"
										+ "All VVSs, put you in a necklace\n"
										+ "Girl, you look beautiful tonight\n"
										+ "Stars on the roof, they matching with the jewelry\n"
										+ "Damn, my AP goin' psycho, lil' mama bad like Michael\n"
										+ "Can't really trust nobody with all this jewelry on you\n"
										+ "My roof look like a no-show, got diamonds by the boatload\n"
										+ "Come with the Tony Romo for clowns and all the bozos\n"
										+ "My AP goin' psycho, lil' mama bad like Michael\n"
										+ "Can't really trust nobody with all this jewelry on you\n"
										+ "My roof look like a no-show, got diamonds by the boatload\n"
										+ "Don't act like you my friend when I'm rollin' through my ends, though");
		do{
			menu();
			opc=Leer.pedirEntero("Elije una opción");
			switch(opc){
			case 1:
				System.out.println(cancion.toString());
				break;
			}
		}while(opc!=0);
	}//main
	public static void menu(){
		System.out.println("1 - Ver letras de canciones.");
		System.out.println("0 - Salir");
	}
	public static void menu2(){
		System.out.println("1 - Buscar por titulo de canción.");
		System.out.println("2 - Listar las canciones que hay.");
	}
}//class
