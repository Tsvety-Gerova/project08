package zadacha5;

import java.util.Scanner;

public class zadacha5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
 
int[][] array = new int[5][5];
int sum = 0;
int sumRow = 0;
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 5; j++) {
		System.out.println("Enter a value for row " + i + ", column " + j);
		array[i][j] = sc.nextInt();
		
	}
}
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 5; j++) {
		System.out.print(array[i][j] + " ");
		}
	System.out.println();
}

for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 5; j++) {
		sumRow += array[i][j];
			} 
	  if (sumRow > sum) {
		sum = sumRow;
		sumRow = 0;
	}
	}
	System.out.println("The largest sum is " +  sum);
	}

	
	}



