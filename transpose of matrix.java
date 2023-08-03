                                    //transpose of matrix
 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int col=sc.nextInt();
		int[][] numbers=new int[rows][col];
		
		//input
		//rows
		for(int i=0;i<rows;i++){
	   //col
		for(int j=0;j<col;j++){
		    numbers[i][j]=sc.nextInt();
		} 
		}
		
		//transpose
		for(int j=0;j<col;j++){
		    for(int i=0;i<rows;i++){
		        
		         System.out.print(numbers[i][j]+ " ");
		     }
		    System.out.println();
		   
		}
		
	}
}
