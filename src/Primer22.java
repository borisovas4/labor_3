class Node2{
    int value;
    Node2 next;

    Node2(int value, Node2 next){
        this.value=value;
        this.next=next;
    }
}
public class Primer22 {
    public static void main(String[] args) {
        Node2 head=null;
        for(int i=9; i>=0; i--){
            head=new Node2(i,head);
        }
        Node2 ref=head;
        while (ref!=null){
            System.out.print(" "+ ref.value);
            ref=ref.next;
        }
    }
}
