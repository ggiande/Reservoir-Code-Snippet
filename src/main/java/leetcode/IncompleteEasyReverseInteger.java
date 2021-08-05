package leetcode;

public class IncompleteEasyReverseInteger {
    public static void main(String[] args) {
        int x = 123;

        System.out.println(x % 10);
        // return the integer
    }

    public int reverse(int x) {
        boolean negativeInt = false;
        if (x < 0) {
            // negative, use abs, but check a boolean
            negativeInt = true;
            x = Math.abs(x);
        }
        //123
        int temp = 0;
        int currRev = 0;
        while (x % 10 != 0){
            temp = x % 10; // 3
            currRev =+ temp;


        }
        return -1;
    }
}
