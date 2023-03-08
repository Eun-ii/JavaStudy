package mypack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		try {
			System.out.println("구구단을 외자");
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNextInt()) {
				int i1 = sc.nextInt();
				int i2 = sc.nextInt();
				int result = i1 * i2;
				
				System.out.printf("%d x %d = %d\n", i1, i2, result);
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}