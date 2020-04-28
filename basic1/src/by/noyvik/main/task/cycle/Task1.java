package by.noyvik.main.task.cycle;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. 
// А программа суммирует все числа от 1 до введенного пользователем числа.

public class Task1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int x;
		long sum = 1;
		
			
		do {
			System.out.println("Введите целое положительное число(до 2147483647) \n>>");
			
			while (!sc.hasNextInt()) {
				
				sc.nextLine();
				System.out.println("Ввод некорректен\n"
						+ "Введите целое положительное число(до 2147483647) \n>>");
			}

			x = sc.nextInt();
	
		} while (x < 1);
		
		System.out.println("Вы ввели " + x);
		
		
		int i = 1;
		
		while (i<x) {
			
			sum += ++i;
			
		}
		
		System.out.println("Просумированны положительные числа от 1 до " + i +
				"\nРезультат: " + sum );
		
	}

}
