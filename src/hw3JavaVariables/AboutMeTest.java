package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println("my Full Name: " + aboutMe.myFullName + "\nMy Age: " + aboutMe.myAge + "\nMy Birth Year: "
				+ aboutMe.myBirthYear + "\nMy Yearly Salary: " + aboutMe.myYearlySalary + "\nMy Desired Bank Balance: "
				+ aboutMe.myDesiredBankBalance + "\nMy Height: " + aboutMe.myHeight + "\nMy Grade: " + aboutMe.myGrade
				+ "\nMy Gender: " + aboutMe.myGender + "\nUs Citizen: " + aboutMe.usCitizen);

		// Method Initialized
		aboutMe.aboutMyself();

	}

}
