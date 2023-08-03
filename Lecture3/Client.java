public class Client {
    public static void main(String args[]){
        LinkedList ll=new LinkedList();
        for(int i=1;i<=5;i++){
            ll.addLast(i);
        }
        ll.display();
        System.out.println();
        System.out.println(ll.size());
    }
}
