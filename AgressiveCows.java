import java.util.Scanner;
import java.util.Arrays;

public class AgressiveCows {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<arr.length; i++)
		{
			arr[i] = scn.nextInt();
		}
		int noc = scn.nextInt();
		Arrays.sort(arr);
		int low = 0;
		int high = arr[arr.length-1];
		int result = Integer.MIN_VALUE;
				
		while(low<=high) {
			
			int mid = (low+high)/2;
			boolean ans = isPossible(arr, mid, noc);
			if(ans == true)
			{
				low = mid+1;
				result = Math.max(result, mid);
			}
			else {
				high = mid - 1;
			}
		}
		System.out.println(result);
		
	}
	public static boolean isPossible(int arr[], int mid, int noc)
	{
		// int last palce
		//cows place so fare
		int cpsf = 1;
		int lp = arr[0];
		for(int i = 1; i<arr.length;i++)
		{
			if(arr[i]-lp >= mid)
			{
				cpsf++;
				lp = arr[i];
				
			}
		}
		if(cpsf >= noc)
		{
			return true;
		}
		return false;
	}

}