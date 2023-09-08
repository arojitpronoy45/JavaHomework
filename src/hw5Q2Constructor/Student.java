package hw5Q2Constructor;

public class Student {
	public String stName;
	public int stID;
	public char studentGender;
	public boolean isProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from the default Constructor of the Student class");
	}

	public Student(String stName, int stID, char studentGender, boolean isProgrammer, float grade) {
		this.stName = stName;
		this.stID = stID;
		this.studentGender = studentGender;
		this.isProgrammer = isProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Gender: " + studentGender + ", Grade: "
				+ grade + ", and is programmer? Ans: " + isProgrammer);

	}
}
