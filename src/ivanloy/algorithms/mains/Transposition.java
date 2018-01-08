package ivanloy.algorithms.mains;

public class Transposition {
	
	public static void main (String[] args) {
		final int[][] input={{1,4,2,3},{3,3,2,1},{1,4,3,2},{3,2,1,2}};
		int nR=input.length;
		int nC=input[0].length;
		int[][] output=new int[nC][nR];
		for(int row=0; row<nR; row++){
			for(int col=0; col<nC; col++){
				output[row][col]=input[col][row];
				System.out.print(output[row][col]+" ");
			}
			System.out.println("");
		}
	}
}
