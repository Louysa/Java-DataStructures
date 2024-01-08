public class Stack {
    private int size;
    private int top;
    private char[] chArray;
    public Stack(int size){
        top = -1;
        this.size = size;
        chArray = new char[size];
    }
    public boolean isEmpty(){
        return top<0;
    }
    public boolean push(char ch){
        if(top>=size){
            return false;
        }
        else {
            chArray[++top]=ch;
            return true;
        }
    }
    public char pop(){
        if (size<=0){
            System.out.println("Stack is empty!");
            return 0;
        }
        else {
            return chArray[top--];
        }
    }

    public String reverseString(String string){
        int length = string.length();
        char[] newCharArray = new char[length];
        char[] temp = string.toCharArray();


            for (int i = 0; i < length; i++) {
                newCharArray[i] = temp[(length-1)-i];
            }
            return  new String(newCharArray);

    }
}
