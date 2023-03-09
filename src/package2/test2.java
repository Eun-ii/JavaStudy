package package2;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean istrue = true;
		while(istrue) {
			int i1 = sc.nextInt();
			int i2 = sc.nextInt();
			int result = sum(i1, i2);
			System.out.println("합 : " + result);
		}
		
	}
	public static int sum(int i1, int i2) {
		int result = i1 + i2;
		return result;
	}
}