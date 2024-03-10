package encapsulation;


public class Get_A {
	
	//declare private variables first
	private String company;
	private String mobile;
	private int model;
	
	//set the methods with one parameter and assign the value
	public void setCompany(String value) {
		company = value;
	}
	
	public void setMobile(String value) {
		mobile = value;
	}
	
	public void setModel(int value) {
		model = value;
	}
	
	
	//create data type get methods so that it has to return the value
	public String getCompany() {
		return company;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public int getModel() {
		return model;
	}

}
