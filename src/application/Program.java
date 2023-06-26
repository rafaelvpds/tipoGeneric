package application;

import java.util.Scanner;

import service.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// parametrização do tipo desejado quando instaciamos a classe

		PrintService<Integer> pr = new PrintService<>();
		System.out.print("How many values: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Values:");
			int lista = sc.nextInt();
			pr.addValue(lista);

		}

		pr.print();
		System.out.println("First: " + pr.first());
		sc.close();
	}

}
