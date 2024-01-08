public class QLinkedList {
    private Node front;
    private Node rear;
    private int size;
    public QLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty(){
        return front==null;
    }
    public void enqueue(int data){
        Node newNode = new Node();
        newNode.setData(data);
        if(isEmpty()){
            rear = front = newNode;
        }
        else{
            rear.setNext(newNode);
            rear = newNode;
            size++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        else{
            int number = front.getData();
            front = front.getNext();
            size--;
            return number;
        }
    }

}
