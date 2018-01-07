

public class ordArray {
	
	public static void main (String[] args) {
		final boolean[][] input={{false,true,true,false},{false,false,true,true},{true,true,true,false},{true,false,true,false}};
		for(int row=0; row<input.length; row++){
			for(int col=0; col<input[0].length; col++){
				System.out.print(row+", "+col+" : ");
				if(input[row][col]) System.out.println("*");
			}
		}
	}
}

