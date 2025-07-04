import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }

    public void push(int x) {
        // move all from main to helper
        while (!main.isEmpty()) {
            helper.add(main.remove());
        }

        // add x into main
        main.add(x);

        // move all back from helper to main
        while (!helper.isEmpty()) {
            main.add(helper.remove());
        }
    }

    public int pop() {
        return main.remove();
    }

    public int top() {
        return main.peek();
    }

    public boolean empty() {
        return main.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        // equivalent to ["MyStack", "push", "push", "top", "pop", "empty"]
        // [[], [1], [2], [], [], []]
        
        MyStack myStack = new MyStack();
        System.out.println("null"); // constructor

        myStack.push(1);
        System.out.println("null"); // push(1)

        myStack.push(2);
        System.out.println("null"); // push(2)

        int top = myStack.top();
        System.out.println(top); // should print 2

        int popped = myStack.pop();
        System.out.println(popped); // should print 2

        boolean isEmpty = myStack.empty();
        System.out.println(isEmpty); // should print false
    }
}