import java.util.*;

public class ArrayPractice {

	public static void main(String[] args) {
		// 1st way
		int numbers[] = {10,20,30,40,50,60,70,80,90};
		// prints hashed address of numbers
		System.out.println(numbers);
		// we can access them by indexed subscript
		System.out.println(numbers[0]);

		System.out.println();

		int [] a = new int[3];
		a[0] = 10;
		a[1] = 10;
		a[2] = 10;
		
		// does not initialize anything
		int [] x;

		// initializes the variable at 0
		int [] y = new int[2];
		
		System.out.println(y[0]);
		// crashes program (uninitialized variable)
		//System.out.println(x[0]);

		System.out.println();

		// arrays of strings, doubles
		//String cars[] = {"Ford","Toyota","Kia","Dodge"};
		double salary[] = {12.2,45.2,23.01};
		// element access like any other array
		// System.out.println(cars[0]);
		System.out.println();

		// comparing arrays is not as straightforward
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};

		System.out.println("arr1: " + arr1);
		System.out.println("arr2: " + arr2);
		
		System.out.println("arr1==arr2 --> " + (arr1==arr2));
		// there is a dedicated method to compare from the Arrays class (java.util.Arrays) 
		System.out.println("Arrays.equals(arr1,arr2) --> "+Arrays.equals(arr1,arr2));

		System.out.println();
		// we can have arrays of objects as well
		// Student csStudents[] = { new Student("John",123), new Student("Doe",456) };

		// our accessors can be used on the elements within the array
	
		// System.out.println(csStudents[0].getName());
		// System.out.println(csStudents[1].getName());


		System.out.println();
		System.out.println();
		
		Scanner kb = new Scanner(System.in);

		String cars[] = new String[3];
		for (int i = 0; i < cars.length; i++) {
			System.out.print("Enter car name: ");
			cars[i] = kb.nextLine();
		}
		for (int i = 0; i < cars.length; i++) {
			System.out.printf("car %d: %s ", i, cars[i]);
		}

		System.out.printf("\n");

	}
	// example 
	class Student {
		private String name;
		private int id;

		public Student(String name, int id) {
			this.name = name;
			this.id = id;
		}
		public String getName() {
			return name;
		}
	}
}
