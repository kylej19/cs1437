import java.util.*;

public class Main {
	public static void main(String[] srgs) {

		ArrayList<Person> occupants = new ArrayList<>(4);
		occupants.add(new Person("Bob","1111111111","bob@mail.com"));
		occupants.add(new Person("Alice","222222222","alice@mail.com"));
		occupants.add(new Employee("0001","Dan","333333333","dan@mail.com"));
		occupants.add(new Employee("0002","Cheyenne","444444444","cheyenne@mail.com"));

		for (Person p: occupants) {
			System.out.println(p);
		}

	}
}

public class Person {

	private String name;
	private String phone;
	private String email;
	
	public Person() {
		name = "";
		phone = "";
		email = "";
	}
	public Person(String n, String p, String e) {
		name = n;
		phone = p;
		email = e;
	}

	// ACCESSORS
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}

	// MUTATORS
	public void setName(String n) {
		name = n;
	}
	public void setPhone(String p) {
		phone = p;
	}
	public void setEmail(String e) {
		email = e;
	}

	// STRING
	public String toString() {
		return "name=\""+name+"\",phone=\""+phone+"\",email=\""+email+"\"";
	}


}

public class Employee extends Person {
	// employee number
	private String id;
	// CONSTRUCTORS
	public Employee() {
		super();
		id = "";
	}
	public Employee(String i, String n, String p, String e) {
		super(n,p,e);
		id = i;
	}
	// ACCESSORS
	public String getId() {
		return id;
	}
	// MUTATORS
	public void setId(String i) {
		id = i;
	}
	// STRING
	public String toString() {
		return super.toString() + ",empId=\""+id+"\"";
	}

}
