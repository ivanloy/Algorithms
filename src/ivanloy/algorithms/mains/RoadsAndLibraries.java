package ivanloy.algorithms.mains;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadsAndLibraries {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int n = 0;
        int m = 0;
        long x = 0;
        long y = 0;
        int[][] cities = {{0}};
        for(int a0 = 0; a0 < q; a0++){
            
        
        n = in.nextInt();
        boolean[] memo = new boolean[n+1]; //bool[]
        m = in.nextInt(); //SACAR DECLARACIONES
        x = in.nextLong();
        y = in.nextLong();
        cities = new int[m][2];
            
        for(int a1 = 0; a1 < m; a1++){
                
        	int city_1 = in.nextInt();
        	int city_2 = in.nextInt();
	                
        	cities[a1][0] = city_1;
        	cities[a1][1] = city_2;
                    
                
        }
            
        final LinkedList<Integer>[] adjacencyList;
        adjacencyList = (LinkedList<Integer>[]) new LinkedList[n+1];
       
        for(int i = 1; i < n+1; i++) {
            	
        	adjacencyList[i] = new LinkedList<Integer>();
            	
        }
            
        for(int i = 0; i < m; i++) {
            			
        	adjacencyList[cities[i][0]].add(cities[i][1]);
        	adjacencyList[cities[i][1]].add(cities[i][0]);
    	   
        }
            	
        System.out.println(getCost(memo, adjacencyList, (int)x, (int)y));
            	
        }
        
    }
    
    
                                     //bool[]
	public static int getCost(boolean[] memo, LinkedList<Integer>[] adjacencyList, int libCost, int roadCost) {
		
		int tot = 0;
		
		for(int i = 1; i < adjacencyList.length; i++) {
			
			int gs = getSize(memo, adjacencyList, i);
			
			if(libCost > roadCost) {
				
				tot += gs > 0 ? (gs-1) * roadCost : 0;
				tot += gs > 0 ? libCost : 0;
				
			}else tot += gs * libCost;
			
		}
		
		return tot;
		
	}
	                                 //bool[]
	public static int getSize(boolean[] memo, LinkedList<Integer>[] adjacencyList, int index) {
		
		
		boolean[] miniMemo = new boolean[adjacencyList.length];
		if(!memo[index]) miniMemo[index] = true; //bool[] //MINIMEMO
		if(!memo[index]) memo[index] = true; //bool[]
		
		for(int i = 0; i < adjacencyList[index].size(); i++) {  
			
			int n = adjacencyList[index].get(i);
			
			if(!memo[n]) { //bool[]
				
                getSize(memo, adjacencyList, n, miniMemo);			
				
			}
			
		}
		
		int numNodes = 0;
		
		//System.out.println("length = " + miniMemo.length);
		for(int i = 1; i < miniMemo.length; i++) {
			
			//System.out.println("miniMemo[i] = " + miniMemo[i]);
			//System.out.println("memo[i] = " + memo[i]);
			if (miniMemo[i]) numNodes++;
			
		}
		//System.out.println("numNodes = " + numNodes);
		return numNodes; //num of trues
		
	}
	                                  //bool[]
	public static void getSize(boolean[] memo, LinkedList<Integer>[] adjacencyList, int index, boolean[] miniMemo) {
		
		
		if(!memo[index]) miniMemo[index] = true; //bool[] //MINIMEMO
		if(!memo[index]) memo[index] = true; //bool[]
		
		for(int i = 0; i < adjacencyList[index].size(); i++) {
			
			int n = adjacencyList[index].get(i);
			
			if(!memo[n]) {//bool[]
				
                getSize(memo, adjacencyList, n, miniMemo);			
				
			}
			
		}
		
	}

}

