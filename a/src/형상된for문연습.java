
public class 형상된for문연습 {
	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3, 4, 5};
		float b[] = new float[] {3,14f, 5.2f, 9.1f};
		String c[] = {"seoul", "robot", "high", "school"};

		System.out.println("\n예제1----------------");
		for (int i : a)
			System.out.println(i);
		
		System.out.println("\n예제2----------------");
		float sum = 0;
		for (float f:b) {
			System.out.println(f);
			sum = sum + f;
		}
		System.out.println("SUM: " + sum);
		
		System.out.println("\n예제3----------------");
		for(String s:c)
			System.out.println(s);
		
		System.out.println("\n예제4----------------");
		for (String s : c)
			s = "TEST";
		for(String s : c)
			System.out.println(s);
	}

}
