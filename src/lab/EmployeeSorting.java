package lab;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Student(
	    int rollNumber,
	    String name,
	    String course,
	    double grade
	) {
	    // Optional: Compact constructor for validation
	    public Student {
	        if (rollNumber <= 0) {
	            throw new IllegalArgumentException("Roll number must be positive.");
	        }
	        if (grade < 0.0 || grade > 100.0) {
	            throw new IllegalArgumentException("Grade must be between 0.0 and 100.0.");
	        }
	    }

	    // Optional: Custom helper method
	    public boolean hasPassed() {
	        return grade >= 40.0;
	    }
	}

public class EmployeeSorting {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();

		students.add(new Student(104, "Aarav Sharma", "Computer Science", 85.5));
		students.add(new Student(101, "Priya Patel", "Information Technology", 92.0));
		students.add(new Student(107, "Rohan Verma", "Electronics", 74.0));
		students.add(new Student(102, "Ananya Iyer", "Computer Applications", 95.5));
		students.add(new Student(105, "Vikram Singh", "Mechanical", 68.5));
		students.add(new Student(103, "Sneha Reddy", "Information Technology", 89.0));
		students.add(new Student(106, "Aditya Deshmukh", "Computer Science", 81.5));
		
		students.sort(Comparator.comparingInt(Student::rollNumber));
		
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
