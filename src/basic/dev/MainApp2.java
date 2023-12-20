package basic.dev;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		int first = 0, second = 1;
		int count = 0;

		System.out.println("100 so Fibonacci dau tien:");

		while (count < n) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;

			count++;
		}
	}

}
