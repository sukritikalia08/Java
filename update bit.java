                 //UPDATE BIT

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int oper =sc.nextInt();
	    //oper=1 :set oper=0 : clear
		int n=5;
		int pos=1;
		int bitMassk=1<<pos;
	    if(oper == 1){
	        //set 
	        
		int newNumber=bitMassk | n;
		System.out.println(newNumber);
	    }
	    else{
	       //clear
	       int newBitMask=~(bitMassk);
	       int newNumber=newBitMask & n;
	       System.out.println(newNumber);
	    }
	
		
		
		   
		}
		
	}

