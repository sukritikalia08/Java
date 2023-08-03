package queue;

public class basicoperations {
    static class queue{
        static int arr[];   //static isley taki agle usme bhi use kr ske
        static int size;
        static int rear=-1; //front already 0 hta hae and -1 isley kyuki ye btata hae ki queue empty hae

    queue(int n){       //class ka constructor queue bnaya hae
        arr=new int[n];
        this.size=n; //size naam ke variable me n store krege
    }
    public static boolean isEmpty(){  //ye func hme btayega ki queue empty hae ya nii
        return rear==-1;  //agr empty hae to true return krega nhi to false return krega
    }

    //enqueue
    public static void add(int data){
        if(rear==size-1){
            System.out.println("full queue");
            return;
        }
        rear++;  //agr queue empty ni hae to rear ko inc krvayege taki vo empty ki trf ishara kre and hm apna element store ya add kr paye
        arr[rear]=data;  //isme rear wale element ko data me store kra hae
    }

    //dequeue- O(n)
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;   
        }
        int front=arr[0];  //delete krne ke leye first element ko access krna prta
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];  //taki baki elements ko ek-ek aage shift kr ske
        }
        rear--; //as we shifted all elements to previous place so now our rear should also shift to its previous place/ mtlb rear aage ko bdh jana chahiye
        return front;
    }

    //peek- O(n)
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return arr[0];
    }

    }

public static void main(String[] args){
    queue q=new queue(5); 
    q.add(1);
    q.add(2);
    q.add(3);
    //1 2 3 ....
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

}
}
