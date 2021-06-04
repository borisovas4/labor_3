class Node1{
    int value;
    Node1 next;

    Node1(int value, Node1 next){
        this.value=value;
        this.next=next;
    }
}
public class Primer2 {
    public static void main(String[] args) {
        Node1 head=new Node1(0, null);
        Node1 tail=head;

        for(int i=0; i<9; i++){
            tail.next=new Node1(i+1, null);
            tail=tail.next;
        }
        Node1 ref=head;
        while(ref!=null){
            System.out.print(" "+ref.value);
            ref=ref.next;
        }
    }
}
