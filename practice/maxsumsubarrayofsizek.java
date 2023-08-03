package practice;

public class maxsumsubarrayofsizek {
    public static void main(String[] args){
     int arr[]={1,3,-7,8,2,-5,9,4,-10};
     int k=4;
     sumk(arr, k);

    }
    public static int sumk(int[] arr,int k){
        int start=0;
        int end=0;
        int sum=0;
        int maxSum= Integer.MIN_VALUE;
        while(end<arr.length){
            maxSum=sum+arr[end];
            if(end-start+1< k){
                end++;
            }
            else if(end-start+1==k){
                
                sum=sum-arr[start]+arr[end];
                maxSum=Math.max(maxSum,sum);
                start++;
                end++;


            }
        }
        System.out.println(maxSum);
        return maxSum;

    }
}
