package by.noyvik.main.task.branch;

// 2. Найти max{min(a, b), min(c, d)}.

public class Task2 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int d;
		int minAB;
		int minCD;
		int max;
		
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		
		
		minAB = (a <= b) ? a : b;
		minCD = (c <= d) ? c : d;
		max = (minAB >= minCD) ? minAB : minCD;
		
		System.out.println(max);
		
	}

}
