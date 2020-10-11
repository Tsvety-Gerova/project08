package zadacha4;

import java.util.Random;
import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Random rand = new Random();

String[] karta = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
String[] boq = {"Pika", "Kupa", "Karo", "Spatiq"};

String karta1 = karta[rand.nextInt(karta.length)]
		+ boq[rand.nextInt(boq.length)];
System.out.println(karta1);



String karta2 = karta[rand.nextInt(karta.length)]
		+ boq[rand.nextInt(boq.length)];
for (int i = 0; i < 256; i++) {
	if (karta2 == karta1) {
		karta2 = karta[rand.nextInt(karta.length)]
				+ boq[rand.nextInt(boq.length)];
}else {
	System.out.println(karta2);
	break;
}
}
	


String karta3 = karta[rand.nextInt(karta.length)]
			+ boq[rand.nextInt(boq.length)];
	for (int i = 0; i < 256; i++) {
	if (karta3 == karta1 || karta3 == karta2) {
		karta3 = karta[rand.nextInt(karta.length)]
				+ boq[rand.nextInt(boq.length)];
}else {
	System.out.println(karta3);
	break;
}
	
}

	
	
	String karta4 = karta[rand.nextInt(karta.length)]
			+ boq[rand.nextInt(boq.length)];
	for (int i = 0; i < 256; i++) {
	if (karta4 == karta1 || karta4 == karta2 || karta4 == karta3) {
		karta4 = karta[rand.nextInt(karta.length)]
				+ boq[rand.nextInt(boq.length)];
}else {
	System.out.println(karta4);
	break;
}
	
}
	}
}


