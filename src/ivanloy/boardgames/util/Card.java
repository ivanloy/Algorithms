package ivanloy.boardgames.util;

public final class Card {

	private char suit;
	private int rank;
	
	public Card(int rank, char suit) {
		
		this.suit = suit;
		this.rank = rank;
		
	}
	
	public char getSuit() { return suit; }
	
	public int getRank() { return rank; }
	
	public String getRankString() { 
		
		String ret = "";
		
		switch(rank) {
			
			case 1 : 
				ret = "Ace"; break;
				
			case 2 : case 3 : case 4 : case 5 : case 6 : case 7 : case 8 : case 9 : case 10 : 
				ret = Integer.toString(rank); break;
				
			case 11:
				ret = "Jack"; break;
				
			case 12:
				ret = "Queen"; break;
				
			case 13:
				ret = "King"; break;
			
			default : 
				ret = "X"; break;
				
		}
		
		return ret;
		
	}
	
	public String getSuitString() {
		
		String ret = "";
		
		switch(suit) {
		
			case 's' : ret = "spades"; break;
			case 'd' : ret = "diamonds"; break;
			case 'c' : ret = "clubs"; break;
			case 'h' : ret = "hearts"; break;
		
		}
		
		return ret;
		
	}
	
	public String toString() {
		
		return this.getRankString() + " of " + this.getSuitString();
		
	}
	
}
