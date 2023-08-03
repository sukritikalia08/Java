                                    //reverse the string 
 

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		
		for(int i=0;i<sb.length()/2;i++){   // /2 because we are taking the half starting elements to back and vice versa 
		    int front=i;  //i is index
		    int back=sb.length()-1-i; //5-1-0 =4
		    char frontchar=sb.charAt(front);   //front character nikalne ke leye
		    char backChar=sb.charAt(back);   //back character nikalne ke leye
		    
		    sb.setCharAt(front,backChar);  //front ke back me chlae jayege
		    sb.setCharAt(back,frontchar);
		    
		}
		System.out.println(sb);
		   
		}
		
	}

