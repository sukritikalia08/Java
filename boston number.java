                    //BOSTON NUMBER 

import java.util.*;
public class Main{
    public static int Sumno(int n){
        int sumn=0;
        while(n>0){
            int last=n%10;
            sumn+=last;
            n/=10;
        }
        return sumn;
    }
    public static int primefact(int n){
        int sum=Sumno(n);
        int i=2;
        int sumf=0;
        while(i<=n){
            if(n%i==0){
                sumf+=Sumno(i);
                n=n/i;
            }
            else{
                i++;
            }
        }
        if(sum==sumf){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(primefact(n));
    }
}