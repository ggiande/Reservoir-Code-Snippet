package unchecked;

class staircase2 {
    public static void main(String[] args) {
        int n = 6;
        /* Instance variables/ Field Variables */
        int counter = 1;
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        System.out.println(sb);
        for (int i = 1; i <= n; i++) {
            sb.setCharAt(n - counter, '#');
            counter++;
            System.out.println(sb);
        }

    }
}