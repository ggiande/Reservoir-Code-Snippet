import java.util.Stack;

// Input and output are both stacks

// Input :  []
            [23, 92, 31, 3, 34, 98]

// Output : [3, 23, 31, 34, 92, 98]

// Input :  [3, 5, 1, 4, 2, 8]
// Output : [1, 2, 3, 4, 5, 8]

/**
 * stack
 */
public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(34);stack.push(3);stack.push(31);stack.push(98);stack.push(92);stack.push(23);
        Stack<Integer> tempStack = new Stack<Integer>();
        int first = stack.pop();
        
        while (!stack.isEmpty()) {
            int second = stack.pop();
            // compare 1,2. Lesser, pop into the stack
            if (first < second){
                tempStack.push(first);
            }
        }

    }
    
}