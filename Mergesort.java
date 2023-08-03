public class Mergesort {
    //Time Complexity- O(nlogn)

    public static void conquer(int arr[], int si,int ei,int mid){
     //O(n)

    int[] merged= new int[ei-si+1]; //merged array create krni hae!
    int idx1=si; //phela array ko indicate kr rha
    int idx2=mid+1; //dusra array ko indicate kr rha
    int x=0; //merged array ko indicate kr rha 

    while(idx1<=mid && idx2<=ei){
        if(arr[idx1]<=arr[idx2]){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        else{
            merged[x]=arr[idx2];
            x++;
            idx2++; 
        }
        //just in case agr ek purii array sort ho gye n ek bch gye to uske leye lopp bnayege
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }

        //original array me merged ke elements ko copy krne ke leye loop bnayage
        for(int i=0,j=si; i<merged.length; i++,j++){
          arr[j]=merged[i];
        }

    }
    }

public static void divide(int arr[],int si,int ei){
     //O(log n)

    if(si>=ei){
        return;
    }
      int mid=si+(ei-si)/2; //(si+ei)/2 is not used because  it give the issue of space complexity
      divide(arr,si,mid);
      divide(arr,mid+1,ei);
      conquer(arr,si,mid,ei);
}

    public static void main(String args[]){
        int arr[]={6,3,9,5,2,8};
        int n=arr.length;
        divide(arr,0,n-1);
        //print
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
