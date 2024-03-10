package testing_check;

public class Test_File {

	String name = "David";

	static String city = "Kurnool";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test_File obj = new Test_File();
		jesus();
		 

		int sal = obj.salary();
		int fullsalary = obj.bonus(sal);
		System.out.println(sal);
		System.out.println(fullsalary);

	}

	int salary() {
		return 30000;
	}

	int bonus(int salaryOnly) {
		int bonusOnly = 5000;
		int fullsalary = salaryOnly + bonusOnly;
		return fullsalary;
	}
	
	
	static void jesus() {
		System.out.println("Jesus Loves You");
	}
}
