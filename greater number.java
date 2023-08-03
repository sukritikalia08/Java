                     //Greater Number
import java.util.*;
public class Main{
    public static void Greater(int a,int b){
        if(a>b){
            System.out.println("a is greater");
        }
        else if (a==b){
            System.out.println("a and b are equal");
        } 
        else{
            System.out.println("b is greater");
        }
        return;
    }
    
        
    
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Greater(a,b);
        
        
    }
}
    


 