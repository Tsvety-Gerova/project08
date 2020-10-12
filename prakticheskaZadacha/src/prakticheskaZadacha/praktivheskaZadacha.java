package prakticheskaZadacha;

import java.util.Scanner;

public class praktivheskaZadacha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
System.out.println("Enter 5 different numbers:");
System.out.println("Array 1:");
for (int i = 0; i < 5; i ++){			
			System.out.println("Enter a number for position " + (i + 1));
			arr1[i] = sc.nextInt();
			
		}
		for (int i = 0; i < 5; i++){
			System.out.print(arr1[i]);
			System.out.print(" ");
		}
		
		System.out.println();
		System.out.println("Enter 5 different numbers");
		System.out.println("Array 2:");
		for (int i = 0; i < 5; i ++){		
			System.out.println("Enter a number for position " + (i + 1));
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++){
			System.out.print(arr2[i]);
			System.out.print(" ");
		}
		System.out.println();
		
		
		int obshtElement;
		
		for (int i = 0; i < 5; i ++){
			for (int j = 0; j < 5; j ++){
				if( arr1[j] == arr2[i]){
					obshtElement = arr2[i];
					System.out.print(obshtElement);
					System.out.print(" ");
				} 
			}
		}		
		
	}

}
