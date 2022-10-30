public class Swap {

    public static void main(String[] args) {

        int a = 10, b = 5;

        System.out.println("Before swapping the numbers:");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        
        a = a ^ b; // The value of a becomes 15
        b = a ^ b; // The value of b becomes 10
        a = a ^ b; // The value of a becomes 5

        System.out.println("After swapping the numbers: ");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}
