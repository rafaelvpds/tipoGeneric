package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintService pr = new PrintService();
		System.out.print("How many values: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Entre com um numero:");
			int numbers = sc.nextInt();
			pr.addValue(numbers);

		}

		pr.print();
		System.out.println("First: " + pr.first());
		sc.close();
	}

}
