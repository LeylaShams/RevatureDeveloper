package day1;

public class NestedLoop2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			for(int j = 5; j >= i; j--) {
				System.out.println(j);
				System.out.println("* ");
			}
		}
		System.out.println();
	}

}
