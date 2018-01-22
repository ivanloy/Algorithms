package ivanloy.algorithms.mains;

import ivanloy.algorithms.apis.dataS.RandomQueue;
import ivanloy.boardgames.util.Card;

public class Bridge {

	public static void main(String[] args) {
		
		RandomQueue<Card> deck = new RandomQueue<Card>(52);
		
		for(int rank = 1; rank <= 13; rank++) {
			for(int suit = 0; suit < 4; suit++) {
				
				char suitChar;
				
				switch(suit) {
				
					case 0 : suitChar = 's'; break;
					case 1 : suitChar = 'd'; break;
					case 2 : suitChar = 'h'; break;
					case 3 : suitChar = 'c'; break;
					default : suitChar = ' ';
				
				}
				
				deck.enqueue(new Card(rank, suitChar));			
				
			}
		}
		
		for(int i = 0; i < 13; i++) System.out.println(deck.dequeue().toString());
		
	}

}
