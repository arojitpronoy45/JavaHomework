package hw3JavaVariables;

public class AboutMe {
	public String myName; // variable declared

	public String myFullName = "Arojit Pronoy";
	public byte myAge = 22;
	public short myBirthYear = 2001;
	public int myYearlySalary = 2147483647;
	public long myDesiredBankBalance = 9223372036854775807l;
	public float myHeight = 5.5f;
	public double myGrade = 3.1;
	public char myGender = 'M';
	public boolean usCitizen = true;

	// constructor declared
	public AboutMe() {
		// constructor initialized
		System.out.println(":------------ This is all about Myself ------------:");
	}

	// method implemented
	public void aboutMyself() {
		System.out.println("I am aboutMe method");

	}

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.myFullName);
		System.out.println(aboutMe.myAge);
		System.out.println(aboutMe.myBirthYear);
		System.out.println(aboutMe.myYearlySalary);
		System.out.println(aboutMe.myDesiredBankBalance);
		System.out.println(aboutMe.myHeight);
		System.out.println(aboutMe.myGrade);
		System.out.println(aboutMe.myGender);
		System.out.println(aboutMe.usCitizen);
	}

}