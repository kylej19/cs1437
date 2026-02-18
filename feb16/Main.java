import java.util.*;

public class Main {
    
    public static void main(String[] args) {
	my_print("Hello", 5);
	System.out.printf("%d\n", my_pow(2,2));
	System.out.println(authorizedUser());
    }
    
    public static int my_pow(int num, int exp) {
	int result = 1;
	for (int i = exp; i > 0; i--)
	    {
		result *= num;
	    }
	return result;
    }
    
    private static void my_print(String msg, int count) {
	for (int i = 0; i < count; i++)
	    System.out.printf("%s\n", msg);
    }
    
    public static String authorizedUser() {
	Scanner keyboard = new Scanner(System.in);
	System.out.printf("Enter your name: ");
	String name = keyboard.nextLine();
	return name;
    }
}
