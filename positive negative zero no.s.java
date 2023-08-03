                 //no. of positive negative zeros

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    int positiveCount=0;
	    int negativeCount=0;
	    int zeroCount=0;
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	        System.out.print("Enter your numbers: ");
	        int number=sc.nextInt();
	        if(number<0){
	            negativeCount++;
	        }
	        if(number==0){
	            zeroCount++;
	        }
	        if(number>0){
	            positiveCount++;
	        }
	    }
	    System.out.println("Number of negatives: "+negativeCount);
	    System.out.println("Number of zeroes: "+zeroCount);
	    System.out.println("Number of positives: "+positiveCount);
	    
	    
	    
	    
	    }
}