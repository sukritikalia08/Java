                                    //taking input output in 2-D array


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
		
		//output
		for(int i=0;i<rows;i++){
		    for(int j=0;j<col;j++){
		        System.out.print(numbers[i][j]+ " ");
		    }
		    System.out.println();
		}
		
	}
}
