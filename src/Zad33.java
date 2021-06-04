class Node3{

    public int value;
    public Node3 next;

    Node3(int value, Node3 next) {
        this.value = value;
        this.next = next;
    }
}
public class Zad33 {
    public static void main(String[] args) {
        int k = 10;
        Node3 head = createHead(k);
        toString(head);

        head = createTail(k);
        toString(head);

        Node3 node = new Node3(5, null);
        head = addFirst(node, head);
        toString(head);

        node = new Node3(5, null);
        head = addLast(node, head);
        toString(head);

        node = new Node3(9, null);
        head = Insert(node, head, 4);
        toString(head);

        head = RemoveFirst(head);
        toString(head);

        head = RemoveLast(head);
        toString(head);

        head = Remove(head, 4);
        toString(head);

        head = createHeadRec(10);
        toString(head);

        head = createTailRec(10, null);
        toString(head);

        System.out.println(toStringRec(head));
    }
    private static Node3 createHead(int k) {
        Node3 head = new Node3(0, null);
        Node3 tail = head;

        for (int i = 0; i<(k-1); i++) {
            tail.next = new Node3(i+1, null);
            tail = tail.next;

        }
        return head;
    }
    private static Node3 createTail(int k){
        Node3 head=null;
        for(int i=(k-1); i>=0; i--){
            head=new Node3(i,head);
        }
        return head;
    }
    private static void toString(Node3 head){
        Node3 ref=head;
        while (ref!=null){
            System.out.print(" "+ ref.value);
            ref=ref.next;
        }
        System.out.print("\n");
    }
    private static Node3 addFirst(Node3 node, Node3 head){
        node.next=head;
        return node;
    }
    private static Node3 addLast(Node3 node, Node3 head){
        Node3 ref=head;
        while (ref.next!=null){
            ref=ref.next;
        }
        ref.next=node;
        return head;
    }
    private static Node3 Insert(Node3 node, Node3 head, int n){
        Node3 ref=head;
        int k=1;
        while(ref.next!=null && (k<n)){
            ref=ref.next;
            k++;
        }
        node.next=ref.next;
        ref.next=node;
        return head;
    }
    private static Node3 RemoveFirst(Node3 head) {
        head = head.next;
        return head;
    }
    private static Node3 RemoveLast(Node3 head) {
        Node3 ref = head;
        while (ref.next.next !=null) {
            ref = ref.next;
        }
        ref.next = null;
        return head;
    }
    private static Node3 Remove(Node3 head, int n) {
        Node3 ref = head;
        int k = 1;
        while (ref.next != null && k < (n-1)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        return head;
    }
    private static Node3 createHeadRec(int k) {
        if (k>0) {
            return new Node3(k, createHeadRec(k-1));
        }
        return new Node3(k, null);
    }
    private static Node3 createTailRec(int k, Node3 node) {
        if (k>0) {
            k--;
            Node3 head;
            if (node == null) {
                head = new Node3(k, null);

            } else {
                head = new Node3(k, node);
            }
            return createTailRec(k, head);
        }
        return node;
    }
    private static String toStringRec(Node3 head) {
        if (head.next != null) {
            return Integer.toString(head.value) + " " + toStringRec(head.next);
        }
        return Integer.toString(head.value);
    }
}
