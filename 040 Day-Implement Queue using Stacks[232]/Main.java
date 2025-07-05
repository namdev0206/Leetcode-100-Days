import java.util.Stack;

class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        while(!main.isEmpty()){
            helper.push(main.pop());
        }
        main.push(x);
        while(!helper.isEmpty()){
            main.push(helper.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        // Corresponds to:
        // ["MyQueue", "push", "push", "peek", "pop", "empty"]
        // [[], [1], [2], [], [], []]

        MyQueue myQueue = new MyQueue(); // null

        myQueue.push(1); // null
        myQueue.push(2); // null

        int peek = myQueue.peek(); // return 1
        System.out.println(peek);

        int pop = myQueue.pop(); // return 1
        System.out.println(pop);

        boolean empty = myQueue.empty(); // return false
        System.out.println(empty);
    }
}
