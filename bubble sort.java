                                   //BUBBLE SORT


import java.util.Scanner;
public class Main
{
     public static void printArray(int arr[]){
	        for(int i=0;i<arr.length;i++){
	            System.out.println(arr[i]+" ");
	        }
	    }
	public static void main(String[] args) {
	   
		Scanner sc=new Scanner(System.in);
		int arr[]={7,8,3,1,2};
		
		
		//time complexity=O(n^2)
		//bubble sort
	for(int i=0;i<arr.length-1;i++){   //n-1 times
	    for(int j=0;j<arr.length-i-1;j++){
	        if(arr[j]>arr[j+1]){
	             //swap
	             int temp=arr[j];
	             arr[j]=arr[j+1];
	             arr[j+1]=temp;
	        }
	    }
	}
	printArray(arr);
	}
}
