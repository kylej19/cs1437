public class ClassConcepts {

	class Student{
		private String name;
		private int id;

		// CONSTRUCTOR
		public Student(String n, int i) {
			name = n;
			id = i;
		}

		// ACCESSORS
		public String getName() {
			return fullName;
		}

		public int getID() {
			return id;
		}

		// MUTATORS
		public void setName(String n) {
			name = n;
		}

		public void setID(int i) {
			id = i;
		}
	}

	public static void main(String[] args) {

		Student newStudent_1 = new Student("John", 000123);
		Student newStudent_2 = new Student("Mary", 000456);
		Student newStudent_3 = new Student("David", 000789);

		System.out.println(newStudent_1.getName());
		System.out.println(newStudent_1.getID());

		System.out.println(newStudent_1.getName());
		System.out.println(newStudent_1.getID());

		System.out.println(newStudent_1.getName());
		System.out.println(newStudent_1.getID());
	}
}
