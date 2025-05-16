public class IfElse {
    public static void main(String[] args) {
        int age = 20;

        // Check if age is 18 or older
        if (age >= 18) {
            System.out.println("You are an adult.");
        } 
        // Otherwise, this block runs if age is less than 18
        else {
            System.out.println("You are a minor.");
        }

        // You can add more conditions with else if
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age < 20) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are an adult or older.");
        }
    }
}
