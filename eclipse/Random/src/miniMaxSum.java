import java.util.Stack;

class miniMaxSum {
    public static void main(String[] args) {
        int[] arr = new int[] { 426980153, 354802167, 142980735, 968217435, 734892650 };
        /* Instance Variables */

        int currMax = 0;
        int sum = 0;

        Stack<Integer> stack = new Stack<>();
        /* Places int[] into Stack */
        for (int a : arr) {
            stack.push(a);
        }
        System.out.println(stack);
        long currMin = 0;
        /* Sets what will be the currMin */
        for (int c : stack) {
            currMin += c;
        }
        System.out.println(currMin);
        for (int i = stack.size() - 1; i >= 0; i--) {
            int holder = stack.remove(i);

            sum = 0;
            for (int b : stack) {
                sum += b;
            }
            if (sum < currMin) {
                currMin = sum;
            } else if (sum > currMax) {
                currMax = sum;
            }
            stack.push(holder);
        }
        System.out.println(currMin + " " + currMax);

    }
}