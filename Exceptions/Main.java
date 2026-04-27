import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        // Use a try-catch block to handle potential exceptions from the notEven method
        try {
            int num = kb.nextInt(); 
            // Call the notEven method with the user input
            notEven(num);
        } catch (Exception e) {
            // Print the exception message if an exception is thrown
            System.out.println(e.getMessage());
        }
        kb.nextLine(); // Consume the newline left by nextInt()



        // Test passwordValid method
        System.out.print("Enter a password: ");
        // Use a try-catch block to handle potential exceptions from the passwordValid method
        try {
            // Read the password input from the user
            String password = kb.nextLine();
            passwordValid(password);
        } catch (Exception e) { 
            // Print the exception message if an exception is thrown
            System.out.println(e.getMessage());
        }
        // Close the scanner to prevent resource leaks
        kb.close();
        }
    static void notEven(int e) throws Exception {
        if (e % 2 == 0) {
            throw new Exception("*EXCEPTION* Even number entered");
        } else {
            System.out.println("Odd number entered");
        }
    }

    static void passwordValid(String password) throws Exception {
        // Check if the password meets the specified criteria and throw exceptions with appropriate messages if it does not
        if (password.length() < 8) {
            throw new Exception("*EXCEPTION* Password must be at least 8 characters long");
        // Check if the password is longer than 20 characters
        } else if (password.length() > 20) {
            throw new Exception("*EXCEPTION* Password must be no more than 20 characters long");
        // Check if the password contains at least one uppercase letter
        } else if (!password.matches(".*[A-Z].*")) {
            throw new Exception("*EXCEPTION* Password must contain at least one uppercase letter");
        // Check if the password contains at least one lowercase letter
        } else if (!password.matches(".*[a-z].*")) {
            throw new Exception("*EXCEPTION* Password must contain at least one lowercase letter");
        } else if (!password.matches(".*\\d.*")) {
            throw new Exception("*EXCEPTION* Password must contain at least one digit");
        } else if (!password.matches(".*[!@#$%^&*()].*")) {
            throw new Exception("*EXCEPTION* Password must contain at least one special character (!@#$%^&*())");
        } else {
            System.out.println("Password is valid");
        }
    }
}
