package mypack;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("구구단을 외자");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int i = sc.nextInt();
			int i2 = sc.nextInt();
			
			System.out.println(i * i2);	
		}
		sc.close();
	}
}