package zadacha1;

import java.util.Random;

public class zadacha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers = new int[20];
Random rand = new Random();

for (int i = 0; i < 20; i++){
	numbers[i] = rand.nextInt(1000);
	System.out.println(numbers[i] + " ");
} 


 	}

}
