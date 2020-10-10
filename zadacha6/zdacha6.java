package zadacha6;

import java.util.Scanner;

public class zdacha6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n;
int[][] arr = new int[20][20];
System.out.println("Number of rows and columns:");
n = sc.nextInt();

for (int i = 0; i < n; i ++) {
	for (int j = 0; j < n; j ++) {
		System.out.println("Enter a value for row " + i + ", column " + j);
	 arr[i][j] = sc.nextInt();
	}
}

for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
		System.out.print(arr[i][j]);	
		
	} 
	System.out.println("");
	}
System.out.println();

for (int i = 0; i < n; i++) {
	for (int j = 0; j < n; j++) {
		System.out.print(arr[j][i]);
	}
	System.out.println();
}


	}

	
}
