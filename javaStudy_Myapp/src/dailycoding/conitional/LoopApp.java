package dailycoding.conitional;

public class LoopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);

		int i = 0;
		// .. 반복과 관련된 변수가 손상될 수 있음
		System.out.println("===while====");
		while (i < 3) {
			System.out.println(2);
			System.out.println(3);
			//..
			i++;
		}
		System.out.println("===for====");
		
		// 정해진 횟수를 아는경우 for문을 쓰는게 나음.
		for (int j = 0; j < 3; j++) {
			System.out.println(2);
			System.out.println(3);
			j++;
		}

		System.out.println(4);

	}

}
