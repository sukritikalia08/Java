package Lecture1;

public class basic {
 /**
 * @param args
 */
public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);   //reads
        // int n=sc.nextInt();           //taking input
        // System.out.println(n);
        // for(int i=1;i<=5;i++){
        //     System.out.println("hello");
        // }


    
        

        int n=5;
        int row=1;
        int nst=1;
        int nsp1=n-1;
        int nsp2=-1;
        while(row<=n){
            System.out.print(" ");

            //work
            for(int cst=1; cst<=nst; cst++){
                System.out.print(" * ");
            }
            //update
            // row+=1;
            if(row<n/2){
                nst-=2;
            }
            else{
                nst+=2;
            }
            row+=1;
            System.out.println();
            
                }
    }
}

