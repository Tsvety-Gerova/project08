package zadacha2;

import java.util.Random;
import java.util.Scanner;

public class zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
int[] array;
array = new int[10];
 for (int i = 0; i < 10; i++) {
	System.out.println("Enter number " + (i + 1)); 
	array[i] = sc.nextInt(); }
 Random rand = new Random();
  
  for (int i = 0; i < 10; i++) {
	  int randomPosition = rand.nextInt(array.length);
	  int swap = array[i];
	  array[i] = array[randomPosition];
	  array[randomPosition] = swap;    
  }
 for (int i = 0; i < 10; i++) {
	 System.out.println(array[i]);
 }
	}
 
	}


