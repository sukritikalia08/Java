
public class kadane
{
	public static void main(String[] args) {
       int arr[]={-1,-2,-3,-4,-5};
       int maxSum=Integer.MIN_VALUE;
       for(int si=0;si<arr.length;si++){
           int sum=0;
           for(int ei=si;ei<arr.length;ei++){
               sum+=arr[ei];
            //   for(int k=si;k<=ei;k++){
            //       sum+=arr[k];
            //     //   System.out.println(arr[k]);
            //   }
            if(sum>maxSum)
            maxSum=sum;
            //   System.out.println(sum);
           }
       }
       System.out.print(maxSum);
	}
	
	public static void kadenes(int[] arr){
	    int sum=0;
	    int maxSum=Integer.MIN_VALUE;
	    for(int i=0;i<arr.length;i++){
	        sum+=arr[i];
	        maxSum=Math.max(maxSum,sum);
	        if(sum<0){
	            sum=0;
	        }
	       // if(sum>maxSum){                           //maxSum=Math.max(maxSum,sum); this can be also use instead of this
	       //     maxSum=sum;
	       // }
	    }
	    System.out.println(maxSum);
	}
	}

