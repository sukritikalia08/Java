                     //SUM OF ODD NUMBERS
import java.util.*;
public class Main{
    public static void OddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
            
        }
        System.out.println(sum);
        return;
    }
        
    
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        OddSum(n);
        
        
    }
}
    


 