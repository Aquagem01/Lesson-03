package lt.lhu.unit03v.main;

import java.util.Scanner;

public class Task003 {

	public static void main(String[] args) {
		System.out.print("Insert number: \n>");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			String ero = sc.nextLine();
			System.out.println("Please insert number: ");}
		int num = sc.nextInt();
		if (num<3) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
