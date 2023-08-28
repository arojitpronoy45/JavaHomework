package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe arojit = new AboutMe(); // constructor initialized here
		arojit.myName = "Arojit Pronoy"; // variable initialized
		arojit.myAge = 22;
		arojit.myBirthYear = 2001;
		arojit.myYearlySalary = 234241124;
		arojit.myDesiredBankBalance = 92313213213l;
		arojit.myHeight = 5.5f;
		arojit.myGrade = 3.3;
		arojit.myGender = 'M';
		arojit.usCitizen = true;
		arojit.aboutMe(); // method initialized here

		System.out.println("\n------------------------------------------");
		AboutMe alex = new AboutMe();
		alex.myName = "Alex";
		alex.myAge = 22;
		alex.myBirthYear = 2001;
		alex.myYearlySalary = 242314324;
		alex.myDesiredBankBalance = 32432453253245l;
		alex.myHeight = 5.5f;
		alex.myGrade = 3.3;
		alex.myGender = 'M';
		alex.usCitizen = true;
		alex.aboutMe();

	}

}
