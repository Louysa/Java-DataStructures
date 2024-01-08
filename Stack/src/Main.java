//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10);
        System.out.println(stack.isEmpty());
        System.out.println("--------------------------");
        System.out.println(stack.push('a'));
        System.out.println(stack.push('b'));
        System.out.println(stack.push('c'));
        System.out.println(stack.push('d'));
        System.out.println(stack.push('e'));
        System.out.println(stack.push('f'));
        System.out.println(stack.push('g'));
        System.out.println(stack.push('h'));
        System.out.println(stack.push('o'));
        System.out.println(stack.push('i'));
        for (int i = 0; i <10; i++) {
            System.out.println(stack.pop());
        }
        System.out.println("--------------------------");
        System.out.println(stack.reverseString("asdfghjklo"));


    }

}