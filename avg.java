                     //AVERAGE OF NUMBERS
import java.util.*;
public class avg{
    public static void Average(int a, int b,int c){
        int avg=(a+b+c)/3;
        System.out.println(avg);
        return;
    }
        
    
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Average(a,b,c);
        
    }
}
    


 