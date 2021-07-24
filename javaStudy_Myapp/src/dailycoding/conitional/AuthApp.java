package dailycoding.conitional;

public class AuthApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "jmeen";
		String password = "1111";
		String inputid = args[0];
		String inputpw = args[1];
		
		System.out.println("Hi!");

		if ((inputid.equals(id)) && (inputpw.equals(password))) {
			System.out.println("Master!");
		} else {
			System.out.println("How are you?");
		}
	}
}
