package by.noyvik.main.task.cycle;

import java.util.Scanner;

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

public class Task7 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int m;
		int n;

		do {
			System.out.println("Введите натуральное число m (от 1 до 2147483647) \nm>>");

			while (!sc.hasNextInt()) {

				sc.nextLine();
				System.out.println("Ввод некорректен\n" + "Введите натуральное число m (от 1 до 2147483647) \nm>>");
			}

			m = sc.nextInt();
			
			if (m < 1) {
				System.out.println("Ввод некорректен");
			}

		} while (m < 1);

		do {
			System.out.println("Введите натуральное число n (от 1 до 2147483647) \nn>>");

			while (!sc.hasNextInt()) {

				sc.nextLine();
				System.out.println("Ввод некорректен\n" + "Введите натуральное число n (от 1 до 2147483647) \nn>>");
			}

						
			n = sc.nextInt();
			
			if (n < 1) {
				System.out.println("Ввод некорректен");
			}

		} while (n < 1);

		System.out.println("Вы ввели число m = " + m);
		System.out.println("Вы ввели число n = " + n);

		int min;
		int max;

		if (m > n) {

			min = n;
			max = m;

		} else {

			min = m;
			max = n;
		}

		for (int i = (min); i <= max; i++) {

			System.out.print("В промежуток попадает чисто " + i + ". Его делители: ");
			
			int x = i;
			int d = 0;
			
			for (int j = 2; j < x; j++) {
				
				if ((x % j) == 0) {
					System.out.print(j + "  ");
					d++;
				}
				
			}
			
			if (d == 0) {
				System.out.print("отсутствуют.");
			}
			
			System.out.println("");
			

		}

	}

}
