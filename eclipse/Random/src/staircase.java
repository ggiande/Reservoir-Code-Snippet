class staircase {
    public static void main(String[] args) {
        int x = 6;
        int space = x - 1;
        int pounds = 1;

        for (int i = 1; i <= x; i++) { // from line 1 - 6
            for (int f = 0; f < space; f++) { // 5
                System.out.print(" ");

                // System.out.println("Space: " + space);
            }
            space--;
            for (int p = 1; p <= pounds; p++) { // 1 - 6
                System.out.print("#");

            }
            pounds++;
            System.out.print("\n");
        }
    }
}