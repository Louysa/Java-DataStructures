public class DoublyLinkedList {

    private Node first;
    private Node last;

    public DoublyLinkedList(){

    }
    public boolean isEmpty(){
        return first == null;
    }
    public void insertAtFront(Student student){
        Node newNode = new Node(student);
        if(isEmpty()){
            first = last = newNode;
        }
        else {
            newNode.setNext(first);
            first.setPrev(newNode);
            first = newNode;
        }
    }
    public void insertAtBack(Student student){
        Node newNode = new Node(student);
        if(isEmpty()){
            first = last = newNode;
        }
        else {
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        }
    }
    public boolean removeFromFront(Student student){
        if(isEmpty()){
            return false;
        }
        else{
            if(first==last){
                first=last=null;
            }else{
                first = first.getNext();
                first.setPrev(null);
            }
            return true;
        }
    }
    public boolean removeFromBack(Student student){
        if(isEmpty())
            return false;
        else{
            if(first==last){
                first=last=null;
            }else{
                last = last.getPrev();
                last.setNext(null);
            }
            return true;
        }
    }
    public void outputList(){
        if(isEmpty()){
            System.out.println("List is empty!");
        }
        else{
            while(first!=null){
                System.out.println(first.getItem().toString());
                first = first.getNext();
            }
        }
    }
    public void outputListBackward(){
        if(isEmpty()){
            System.out.println("List is Empty!");
        }
        else{
            while(last!=null){
                System.out.println(last.getItem().toString());
                last = last.getPrev();
            }
        }
    }
}
