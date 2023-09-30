package hw12Polymorphism;
/*
 * When different methods exist with the same method name with same parameters or signature but with different syntax or logic
 */

public class Niece extends Sister {
	@Override
	public void sister(String age1, int age2, int age3) {
		int total1 = Integer.parseInt(age1) * age2 + age3;
		System.out.println("Total number of sister: " + total1);

	}

	@Override
	public int sister(int age1, String age2, int age3, int age4, int age6) {
		int total2 = age1 + Integer.parseInt(age2) / age3 + age4 + age6;
		System.out.println("Total number of sister: " + total2);
		return total2;
	}

	@Override
	public int sister(int age1, int age2, String age4, int age5, int age6) {
		int total3 = age1 + age2 / age2 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("Total number of sister: " + total3);
		return total3;
	}
	/*
	 * Static method is a local member of a class Static method cannot be override
	 * 
	 * @Override public static int sister(int age1, String age4, int age5, int age6)
	 * { int total4 = age1 + Integer.parseInt(age4) + age5 + age6;
	 * System.out.println("Total number of sister: " + total4); return total4; }
	 * 
	 * // Final type cannot be overridden because it is a final method
	 * 
	 * @Override public final int sister(int age1, String age4, int age5, int age6,
	 * String age2) { int total5 = age1 + Integer.parseInt(age4) + age5 + age6 +
	 * Integer.parseInt(age2); System.out.println("Total number of sister: " +
	 * total5); return total5;
	 */
}
