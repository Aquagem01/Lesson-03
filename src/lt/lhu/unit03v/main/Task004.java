package lt.lhu.unit03v.main;

import java.util.Scanner;

public class Task004 {

	public static void main(String[] args) {
		System.out.print("Insert number: \n>");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			String ero = sc.nextLine();
			System.out.print("Please insert number: ");}
		int a = sc.nextInt();
		System.out.print("\n>");
		int b = sc.nextInt();
		System.out.println(a==b? "ravno" : "ne ravno"); 

	}

}
