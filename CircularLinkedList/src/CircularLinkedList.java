public class CircularLinkedList {
    private Node first;
    private Node last;
    public CircularLinkedList(){
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void addStudent(Student value){
        Node newNode = new Node(value);
        if(isEmpty())
            first=last=newNode;
        else{
            last.setLink(newNode);
            last = newNode;
            last.setLink(first);
        }
    }
    public void outputList(){
        Node current= first;
        if(isEmpty())
            System.out.println("List is empty!");
        else{
            do {
                System.out.println(current.getData().toString());
                current = current.getLink();
            }while(current!=first);
        }
    }
}
