package by.noyvik.main.task.branch;

// Вычислить значение функции:
// F(x) = x2 = x²-3x+9, если x<=3
// F(x) = 1/(x³ + 6), если x>3



public class Task5 {

	public static void main(String[] args) {

		double x;
		double f;
		
		x = 3;
		
		
		f = (x<=3) ? (x * x - 3*x + 9) : (1 / (x*x*x + 6));
		
		
		System.out.println(f);

		
	}

}
