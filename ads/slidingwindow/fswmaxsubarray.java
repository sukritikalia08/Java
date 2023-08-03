package ads.slidingwindow;

public class fswmaxsubarray {
    public static void main(String[] args){
        int[] arr={1,3,-7,8,2,-5,9,4,-10};
        int k=3;
        sumk(arr, k);


    }
    public static int sumk(int[] arr,int k){
        int start=0;
        int end=k-1;
        int sum=0;
        
        for(int i=start;i<=end;i++){
            sum+=arr[i];      //window ka sum liya 
        }
        int maxSum=sum;
        for(end=k; end<arr.length;end++){   //iss loop me window ko slide kra aur sum ki value update kri
            sum=sum+arr[end]-arr[start];    //end ko add kr rhe aur start htaa rhe
            start++;
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        System.out.println(maxSum);
        return maxSum;
    }
}
