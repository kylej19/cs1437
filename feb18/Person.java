import java.util.*;

public class Person {

    static double maxPoint = 0, point = 0;
    static int count = 0;

    public static void addPoint() {
	System.out.println("Enter points: ");
	Scanner kb = new Scanner(System.in);
	int new_point = kb.nextInt();
	if (maxPoint < new_point) {
	    maxPoint = point;
	}
	point += new_point;
	count++;
    }

    public static void getAveragePoint() {
	System.out.printf("AVG: %d\n", (point/count));
    }

    public static void main(String[] args) {

	Scanner kb = new Scanner(System.in);
	System.out.print("How many scores? ");
	int rounds = kb.nextInt();

	for (int i = 1; i <= rounds; i++) {
	    addPoint();
	}

	System.out.println("SUM: " + point);
	System.out.println("MAX: " + maxPoint);
	getAveragePoint();

    }


}
