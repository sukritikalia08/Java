
                      //BINARY SEARCH

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int a[]={-4,-1,3,7,10,11};
		int key=sc.nextInt();
		System.out.println(binarySearch(a,key));
	}
	public static int binarySearch(int a[],int key){
	    int low=0;
	    int high=a.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(a[mid]==key){
	            return mid;
	        }
	        else if(key>a[mid]){
	            low=mid+1;
	        }
	        else{
	            high=mid-1;
	        }
	    }
	    return -1;    //when the key is not present in the array
	}
}
