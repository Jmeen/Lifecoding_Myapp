package dailycoding.conitional;

public class LoopArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * <li>min</li> <li>ok</li>
		 */

		String[] users = new String[3];
		users[0] = "min";
		users[1] = "ok";
		users[2] = "jae";

		for (int i = 0; i < users.length; i++) {
			System.out.println("<li>" + users[i] + "</li>");
		}
	}

}
