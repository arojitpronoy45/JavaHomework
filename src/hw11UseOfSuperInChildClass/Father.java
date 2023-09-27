package hw11UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String FamilyName;

	public Father() {
		System.out.println();

	}

	public Father(String name, int age, char sex, boolean usCitizen, String familyName) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		FamilyName = familyName;
	}
	
	public void father() {
		System.out.println("");
	}

	public void FatherInfo(String name, int age, char sex, boolean usCitizen, String familyName) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		FamilyName = familyName;
		System.out.println("");
		
	}
	
}