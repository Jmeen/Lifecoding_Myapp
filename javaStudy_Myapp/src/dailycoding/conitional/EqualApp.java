package dailycoding.conitional;

public class EqualApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String o1 = "Java";
		String o2 = new String("Java");
		
		String o3 = "java2";
		String o4 = "java2";
		
		System.out.println(o1==o2);
		System.out.println(o1.equals(o2));
		
		System.out.println(o3==o4);
		System.out.println(o3.equals(o4));
		
	}

}
