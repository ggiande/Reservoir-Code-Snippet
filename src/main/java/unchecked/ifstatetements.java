package unchecked;

class iftstatements{
    public static void main(String[] args) {
        int x = 6;

        if(x > 5){
            System.out.println("GREATER than 5");
        }
        if (x > 9) {
            System.out.println("greater than 5");
        } else if (x < 4) {
            System.out.println("less than 6");
        }
    }
}