public class Node {
    private Student data;
    private Node link;

    public Node(){

    }
    public Node(Student student){
        this.data = student;
    }
    public Node(Student student,Node linkValue){
        this.data = student;
        this.link = linkValue;
    }

    public Student getData() {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
