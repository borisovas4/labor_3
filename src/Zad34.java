import java.util.Scanner;

class Node4{

    public int value;
    public Node4 next;

    Node4(int value, Node4 next) {
        this.value = value;
        this.next = next;
    }
}
public class Zad34 {
    public static void main(String[] args) {
        int kol = 0, sum = 0, sr = 0, srl = 0, min = 0, max = 0, p1 = 0, p2 = 0;
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.println("введите кол-во n:");
        int n = sc.nextInt();
        System.out.println("введите элимент n: ");
        int k = sc.nextInt();
        Node4 head = new Node4(k, null);
        Node4 tail = head;
        if (((k%2)==0)&&(k>0)) {
            min = k;
            max = k;
            kol++;
            srl = k;
        }
        sum = k;
        for (int i = 1; i < n; i++) {
            k = sc.nextInt();
            tail.next = new Node4(k, null);
            tail = tail.next;
            if(((k%2)==0) && k>0) {
                kol++;
                if (min == 0){
                    min = k;
                }
                if (k < min){
                    min = k;
                }
                if (max  == 0){
                    max = k;
                }
                if (k > max){
                    max = k;
                }
                sr = srl + k + sr;
                srl = 0;
            }
            sum = sum + k;
        }
        p1 = min;
        p2 = max;
        Node4 ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
        System.out.println("сумма " + sum);
        if (kol != 0){
            System.out.println("кол-во четных = " + kol + "\nсредняя значение среди четных = " + sr / kol + "\nминимальное значение среди положительных четных " + min + "\n максимальное значение среди положительных четных " + max);
        }
        ref = head;
        while (ref != null) {
            if (ref.value == p1) {
                ref.value = p2;
            } else if (ref.value == p2) {
                ref.value = p1;
            }
            ref = ref.next;
        }
        ref = head;
        while (ref != null) {
            System.out.print(ref.value + " ");
            ref = ref.next;
        }
    }
}
