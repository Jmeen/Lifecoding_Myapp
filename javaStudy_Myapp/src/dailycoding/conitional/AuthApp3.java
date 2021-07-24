package dailycoding.conitional;

public class AuthApp3 {

	public static void main(String[] args) {

//		String[] users = { "jmeen", "ok", "won" };
		String[][] users = { { "jmeen", "1111" }, { "ok", "2222" }, { "won", "3333" } };

		String inputId = args[0];
		String inputPw = args[1];

		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];

			if (current[0].equals(inputId) && (current[1].equals(inputPw))) {
				isLogined = true;
				break;
			}
		}
		if (isLogined) {
			System.out.println("Hi, Master");

		} else {
			System.out.println("Who are you?");
		}
	}
}
