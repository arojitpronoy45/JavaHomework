package hw11UseOfSuperInChildClass;

public class Father {
	public String Name;
	public String fName;
	public int Age;
	public char sex;
	public boolean usCitizen;

	public Father() {
		System.out.println("This is a default constructor from the Parent Class Father");
	}

	public Father(String name, String fName, int age, char sex, boolean usCitizen) {
		super();
		Name = name;
		this.fName = fName;
		Age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("From Parent Class, Father Name: " + name + " Family Name: " + fName + " Age: " + age
				+ " Gender: " + sex + " US Citizen: " + usCitizen);
	}

	public void father() {
		System.out.println("This is a void type method from the Parent Class Father");
	}

	public void fatherInfo(String name, String fName, int age, char sex, boolean usCitizen) {
		/*
		 * super();
		 * 
		 */
		Name = name;
		this.fName = fName;
		Age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("\n----------From Parent Class, Father Name: " + name + " Family Name: " + fName + " Age: "
				+ age + " Gender: " + sex + " US Citizen: " + usCitizen);
	}

}
