package cartas;
 
public class Principal {

	public static void main(String[] args) {
		
		String barajaOriginal[] = { "1♦","2♦","3♦","4♦","5♦","6♦","7♦","8♦","9♦","10♦",
									"1♥","2♥","3♥","4♥","5♥","6♥","7♥","8♥","9♥","10♥",
									"1♣","2♣","3♣","4♣","5♣","6♣","7♣","8♣","9♣","10♣",
									"1♠","2♠","3♠","4♠","5♠","6♠","7♠","8♠","9♠","10♠",
								  };
	
		int cartas = barajaOriginal.length; 
		
		while (cartas >0)
		{
		int pos = (int) (Math.random() * cartas);
		System.out.println(barajaOriginal[pos]);
		barajaOriginal[pos] = barajaOriginal[cartas-1];
		cartas--;
		}
		
		
		
	}//

}//
