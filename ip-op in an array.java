       //taking input output in an array 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		int[] marks =new int[3];
// 		marks[0]=97;  //phy
// 		marks[1]=98;  //chem
// 		marks[2]=95;  //eng
		
// // 		System.out.println(marks[0]);
// // 		System.out.println(marks[1]);
// // 		System.out.println(marks[2]);

// for(int i=0;i<3;i++){
//     System.out.println(marks[i]);
// }

// int marks1[]={10,20,30};
// for(int j=0;j<3;j++){
//     System.out.println(marks1[j]);
// }


 Scanner sc=new Scanner(System.in);
 int size=sc.nextInt();
 int numbers[]=new int[size];
 
 //input
 for(int i=0;i<size;i++){
     numbers[i]=sc.nextInt();
 }
 
 //output
 for(int i=0;i<size;i++){
     System.out.println(numbers[i]);
 }
	}
}
