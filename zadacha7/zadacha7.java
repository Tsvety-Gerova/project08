package zadacha7;

import java.util.Scanner;

public class zadacha7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int points = 0;
String[][] array = {{"A","B","A","C","C","D","E","E","A","D"},
					{"D","B","A","B","C","A","E","E","A","D"},
					{"E","D","D","A","C","B","E","E","A","D"},
					{"C","B","A","E","D","C","E","E","A","D"},
					{"A","B","D","C","C","D","E","E","A","D"},
					{"B","B","E","C","C","D","E","E","A","D"},
					{"B","B","A","C","C","D","E","E","A","D"},
					{"E","B","E","C","C","D","E","E","A","D"}
					};

     String[] key = {"D","B","D","C","C","D","A","E","A","D"};

String letterInKey;
String chosenLetter;

for (int i = 0; i < 8; i++) {
	for (int j = 0; j < 10; j++) {
		chosenLetter = array[i][j];
		letterInKey = key[j];
		if (chosenLetter == letterInKey){
			points += 1;
		}else if (chosenLetter != letterInKey && points != 0) {
			points -= 0;
			}else if (chosenLetter != letterInKey && points == 0) {
				points = 0;
			}		
		}
	System.out.println("Student " + (i + 1) + " has " + points + " points");
	points = 0;
}
	}

}
