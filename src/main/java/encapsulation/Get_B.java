package encapsulation;

public class Get_B {

	Get_A objOne;

	public void objOne() {

		objOne = new Get_A();

		objOne.setCompany("OnePlus");
		objOne.setMobile("Pro");
		objOne.setModel(9);
		getMethods();

		objOne.setCompany("RealMe");
		objOne.setMobile("Go");
		objOne.setModel(10);
		getMethods();

		objOne.setCompany("Vivo");
		objOne.setMobile("Z");
		objOne.setModel(1);
		getMethods();

	}

	public static void main(String[] args) {

		Get_B objTwo = new Get_B();
		objTwo.objOne();

	}

	public void getMethods() {
		System.out.println(objOne.getCompany());
		System.out.println(objOne.getMobile());
		System.out.println(objOne.getModel());

	}

}
