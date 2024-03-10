package encapsulation;

public class Enc_One {

	// create class level variables
	private String name;
	private String city;
	private int age;

	// create set methods with the parameter
	public void setName(String value) {
		name = value;
	}

	public void setCity(String value) {
		city = value;
	}

	public void setAge(int value) {
		age = value;
	}

	// create data type get methods with return

	String getName() {
		return name;
	}

	String getCity() {
		return city;
	}

	int getAge() {
		return age;
	}

}
