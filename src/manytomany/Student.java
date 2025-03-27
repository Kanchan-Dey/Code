package manytomany;

public class Student {
	String name;
	Course[] courses;
	int count = 0;

	public Student(String name, int size) {
		this.name = name;
		courses = new Course[size];
	}

	public void addCourse(Course course) {
		if (count < courses.length) {
			courses[count++] = course;
			System.out.println(course);
		} else {
			System.out.println("array is full");
		}
	}
}
