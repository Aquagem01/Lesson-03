package lt.lhu.unit03v.main;

import java.util.Scanner;

public class Task009 {

	public static void main(String[] args) {
		System.out.print("Vvedite razmer trox storon treugolnika:\n");
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			String err = sc.nextLine();
			System.out.print("Neobxodimo celoe chislo \n");
		}
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print(a==b&&b==c?"treugolnik ravnostoronniy":"treugolnik ne ravnostoronniy");
	}

}
