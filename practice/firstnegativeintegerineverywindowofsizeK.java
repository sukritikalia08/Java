package practice;

public class firstnegativeintegerineverywindowofsizeK {
    public static void main(String[] args){
        int arr[]={12,-1,-7,8,-15,30,16,28};
        int k=3;
        fnegative(arr, k);
    }
    public static void fnegative(int arr[], int k){
        boolean found=false;
        for(int j=0;j<arr.length-k+1;j++){  
           found=false;
            for(int i=0;i<k;i++){
                if(arr[i+j]<0){
                    System.out.println((arr[i+j])+" ");
                    found=true;
                    break;
                }

            }

            if(!found){
                System.out.println("0"+" ");
            }
        }
    }
}
