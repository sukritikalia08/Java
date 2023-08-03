package ads.slidingwindow;
//leetcode 713

public class vssubarrayproduct {
    public static void main(String[] args){

    }
    public int numSubArrayProductlessthank(int[] num,int k){
        int start=0;
        long product=1;
        int count=0;
        for(int end=0;end<num.length;end++){
            product *=product*num[end];
            while(start <=end && product > k){
                product/=num[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}
