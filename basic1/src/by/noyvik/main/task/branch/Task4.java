package by.noyvik.main.task.branch;

//  Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
//  Определить, пройдет ли кирпич через отверстие.

public class Task4 {

	public static void main(String[] args) {
		
		int A;
		int B;
		int x;
		int y;
		int z;
		
		A = 65;
		B = 120;
		x = 250;
		y = 120;
		z = 65;
		
		int max;
		int min1;
		int min2;
		
		max = Math.max(z, y);
		max = Math.max(max, x);
		
		if (max == x) {
			
			min1 = y;
			min2 = z;
			
		} else {
			
			if (max == y) {
				
				min1 = x;
				min2 = z;
				
			} else {
				
				min1 = y;
				min2 = x;
				
			}
		}
		
		
		
		if (A >= min1 && B >= min2 || A >= min2 && B >= min1) {
			
			System.out.println("Кирпич пройдет через отверстие.");
			
		} else {
			
			System.out.println("Кирпич не пройдет через отверстие.");

		}
		
			
		

	}

}
