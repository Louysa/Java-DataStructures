//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        QLinkedList qLinkedList = new QLinkedList();
        System.out.println(qLinkedList.isEmpty());
        qLinkedList.enqueue(2);
        qLinkedList.enqueue(3);
        qLinkedList.enqueue(4);
        qLinkedList.enqueue(5);
        System.out.println(qLinkedList.isEmpty());

        System.out.println(qLinkedList.dequeue());
        System.out.println(qLinkedList.dequeue());
        System.out.println(qLinkedList.dequeue());
        System.out.println(qLinkedList.dequeue());



    }
}