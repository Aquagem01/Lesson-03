package lt.lhu.unit03v.main;

import java.util.Scanner;

public class Task005 {

	public static void main(String[] args) {
		System.out.print("Insert number: \n>");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()){
			String err = sc.nextLine();
			System.out.print("Please insert number: \n>");}
		
		int a = sc.nextInt();
		System.out.print("\n>");
		int b = sc.nextInt();
		int min=0;
		
		if (a<=b){
			min = a;
		}else if (b<=a)
		{min=b;}
		
			System.out.print("Naimenshee chislo = "+ min);
		}
	}


