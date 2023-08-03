                      //print armstrong number 

import java.util.*;
public class Main{
    int findArm(int n,int a){
        int x;
        if(n!=0){
            x=n%10;
            a=a+(x*x*x); 
            n/=10;
            
            return findArm(n,a);
            //n=number x=remainder a=sum
        }
        return a;
    }
    public static void main(String args[]){
        int n1,n2;
        Scanner sc=new Scanner (System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        Main A=new Main(); 
        // main class me object bnaya hae taki limit set kr ske
        int arm;
        for(int num=n1;num<=n2;num++){
            arm=A.findArm(num,0); //limit set krne ke leye
            if(arm==num){
                System.out.println(num);
            }
        }
    }
}
