package encapsulation;

public class Call_Enc {

	public static void main(String[] args) {

		Enc_One obj = new Enc_One();

		// set methods calling
		obj.setName("Akka");
		obj.setCity("USA");
		obj.setAge(36);

		// get methods calling
		System.out.println(obj.getName());
		System.out.println(obj.getCity());
		System.out.println(obj.getAge());
		
		
		//Bava
		obj.setName("Bava");
		obj.setCity("USA");
		obj.setAge(37);

		// get methods calling
		System.out.println(obj.getName());
		System.out.println(obj.getCity());
		System.out.println(obj.getAge());
		
		//Bro
		obj.setName("Bro");
		obj.setCity("Kurnool");
		obj.setAge(35);

		// get methods calling
		System.out.println(obj.getName());
		System.out.println(obj.getCity());
		System.out.println(obj.getAge());
		

	}
	
	

}
