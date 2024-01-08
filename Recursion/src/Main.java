//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       // recursivePrintBackward(3);
        int[] myArray = new int[6];
        myArray[0] = 1;
        myArray[1] = 18;
        myArray[2] = 10;
        myArray[3] = 20;
        myArray[4] = 5;
        myArray[5] = 7;
        // String string = "dogan";

        // 5 2 10 6 9 7
        //   System.out.println(myArray.length);
        // System.out.println(binarySearch(myArray,5,0,myArray.length));

        // binarySearch(myArray,23,0,myArray.length);
        //selectionSort(myArray);
        bubbleSort(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }

    public static void recursivePrint(int n){
        if (n>0){
            recursivePrint(n-1);
            System.out.println(n);

        }
    }
    public static void recursivePrintBackward(int n){
        if (n>0){
            System.out.println(n);
            recursivePrintBackward(n-1);
        }
    }
    public static int recursiveArraySum(int[] array,int size){
        if (size==0) {
            return 0;
        }else{
            return array[size-1] + recursiveArraySum(array, size-1);
        }
    }
    public static int recursiveStringLength(String string){
       if(string == ""){
           return 0;
       }else{
           return 1 + recursiveStringLength(string.substring(1));
       }
    }

    public static int binarySearch(int[] array,int target,int start, int end){
        // 5 10 15 20 23 25
        // 0 1   2  3 4  5
        int mid = (start+end) / 2 ;

        if(array[mid]==target)
            return mid;
        else if (target>array[mid]) {
            return binarySearch(array,target,mid,end);
        }
        else if(target<array[mid]) {
           return binarySearch(array,target,start,mid);
        }
        return -1;
    }
    public static void insertionSort(int[] array){
            //  5 2 6 4 3 7
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                int key = array[i];
                if(key>array[j]){
                    int temp = array[j];
                    array[j] = key;
                    array[i] = temp;
                }
            }
        }

    }

    public static void selectionSort(int[]array){
        // 5 2 10 6 9 7
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            int minId = i;
            for (int j = i+1; j <array.length; j++) {
                if (array[j] < array[i]){
                    int temp = array[j];
                    array[j]=array[minId];
                    array[minId] = temp;
                }
            }

        }
    }

    public static void bubbleSort(int[] array){
        // 5 2 10 6 9 7
        // Compare the first two
        // and swap since 11<12
        // 11 12 13 5 6
        // Compare 12<13
        // no swap
        // 11 12 13 5 6
        // Compare 5<13
        // swap
        // 11 12 5 13 6
        // Compare 6<13
        // swap 11 12 5 6 13
        // FIRST PASS FINISHES

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if(array[j+1]<array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                    
                }

            }

        }
    }
}