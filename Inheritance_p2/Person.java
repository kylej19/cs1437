public class Person {
    public void main(String[] args) {
        System.out.println("Hello");
        Occupation mentor = new Teacher("John",47,"CS",20.0);
        Student mentee = new Student("Doe",23,"CS",3.2);
    }
}

abstract class Occupation{
    protected String name;
    protected int age;
    public Occupation(String name, int age){
        this.name = name;
        this.age = age;
    }
    // abstract methods
    abstract void work();
    abstract double getSalary();
    // concrete method
    public void introduce(){
        System.out.println("Hi i am "+name);
    }
}
class Teacher extends Occupation{
    private String subject;
    private double salary;
    public Teacher(String name, int age, String subject, double salary){
        super(name,age);
        this.subject = subject;
        this.salary = salary;
    }
    public void work(){
        System.out.println(name +" teaches "+subject);
    }
    public double getSalary(){
        return salary;
    }
}

class Student extends Occupation {
    private String major;
    private double gpa;
    public Student(String name, int age, String major, double gpa) {
        super(name, age);
        this.gpa = gpa;
        this.major = major;
    }
    public void work() {
        System.out.println(name + " teaches " + subject);
    }
    public double getSalary(){
        return 0.0;
    }

    public double getGPA() {
        return gpa;
    }
}
