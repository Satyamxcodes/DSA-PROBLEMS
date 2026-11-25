public class WITHOUT3RD {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping without a third variable
        a = a + b; // a = 15 + 25 = 40
        b = a - b; // b = 40 - 25 = 15 (original value of a)
        a = a - b; // a = 40 - 15 = 25 (original value of b)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}