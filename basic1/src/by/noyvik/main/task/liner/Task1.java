package by.noyvik.main.task.liner;

		//1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task1 {

	public static void main(String[] args) {

		double a; 
		double b;
		double c;
		double z;
		
		a = 3;
		b = 4.3;
		c = 9.87654321;
		
		z = a - 3;
		z = z * b / 2;
		z = z + c;
		
		System.out.println("z = " + z);

	}
	
}

