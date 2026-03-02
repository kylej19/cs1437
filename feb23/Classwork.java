// Classwork.java
//
// Description: Practice & exercises with objects
//
// Lesson and instruction provided by Dr. Kanybek Duisheev
// written by Kyle Johnson


class Lesson {
	String title;
	int id;
	String subject;
	double hours;

	public String view() {
		return "Title: " + title + "\nID: " + id + "\nSubject: " + subject + "\nHours: " + hours;
	}
}


public class Classwork {
	public static void main(String[] args) {

		Lesson lesson_1 = new Lesson();
		lesson_1.id = 6;
		lesson_1.title = "Objects";
		lesson_1.subject = "Programming Fundamentals II";
		lesson_1.hours = 1.667;

		Lesson lesson_2 = new Lesson();
		lesson_2.id = 5;
		lesson_2.title = "Arithmetic and Flags";
		lesson_2.hours = 1.667;
		lesson_2.subject = "Computer Organization & Architecture";

		Lesson lesson_3 = new Lesson();
		lesson_3.id = 4;
		lesson_3.title = "Methods";
		lesson_3.subject = "Programming Fundamentals II";
		lesson_3.hours = 1.667;

		System.out.println(lesson_1.view());
		System.out.println(lesson_2.view());
		System.out.println(lesson_3.view());
		
	}
}
