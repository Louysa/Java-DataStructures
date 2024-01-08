//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBack(new Student(1, "AAA", 3.5));
        list.insertAtFront(new Student(2, "BBB", 3.0));
        list.insertAtBack(new Student(4, "DDD", 2.0));
        list.insertAtBack(new Student(3, "CCC", 2.5));
        // BBB, AAA, DDD, CCC

        list.outputListBackward(); // CCC, DDD, AAA, BBB
    }
}