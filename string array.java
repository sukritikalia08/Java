       //String array


import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int size=sc.nextInt();
    String name[]=new String[size];
    
    //input
    for(int i=0;i<size;i++){
        name[i]=sc.next();
    }
    
    //output
    for(int i=0;i<size;i++){
        System.out.println(name[i]);
    }
	}
}
