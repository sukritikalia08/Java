                                    //search for a given number x and print the indices 
 

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
		int x=sc.nextInt();
		
		for(int i=0;i<rows;i++){
		    for(int j=0;j<col;j++){
		        //compare with x
		     if(numbers[i][j]==x){
		         System.out.println("x is found at location ("+ i+ ","+j+")");
		     }
		    }
		   
		}
		
	}
}
