package zadacha3;

import java.util.Scanner;

public class zadacha3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number " + (i + 1));
			array[i] = sc.nextInt();
		}
		int	x = array[0];
		for (int i = 0; i < 10; i++) {
				if (1 <= i) {
				array[i - 1] = array[i];		
		}
		}array[9] = x;
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}

}
