import java.util.*;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        int ele1 = st.pop();
        if (ele1 == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        // Given input
        String[] commands = {"MinStack","push","push","push","getMin","pop","top","getMin"};
        int[][] values = { {}, {-2}, {0}, {-3}, {}, {}, {}, {} };

        List<Object> output = new ArrayList<>();

        MinStack minStack = null;

        for (int i = 0; i < commands.length; i++) {
            String cmd = commands[i];
            switch (cmd) {
                case "MinStack":
                    minStack = new MinStack();
                    output.add(null);
                    break;
                case "push":
                    minStack.push(values[i][0]);
                    output.add(null);
                    break;
                case "pop":
                    minStack.pop();
                    output.add(null);
                    break;
                case "top":
                    output.add(minStack.top());
                    break;
                case "getMin":
                    output.add(minStack.getMin());
                    break;
            }
        }

        System.out.println(output);
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */