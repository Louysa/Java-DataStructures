//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(1, "A", 3);
        Student st2 = new Student(2, "B", 2.3);

        CircularLinkedList list = new CircularLinkedList();
        list.addStudent(st1);
        list.addStudent(st2);
        list.addStudent(new Student(3, "C", 3.6));

        list.outputList();
    }
}