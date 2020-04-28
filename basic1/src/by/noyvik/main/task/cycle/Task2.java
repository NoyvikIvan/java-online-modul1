package by.noyvik.main.task.cycle;


 // Вычислить значения функции на отрезке [а,b] c шагом h: y=x, при x>2 и y=-x, при x>=2


public class Task2 {

	public static void main(String[] args) {

		double a = -1;
		double b = 3;
		double h = 0.25;

		double y;
		double x;
		double z;
		
		if (a <= b) {
			
			x = a;
			z = b;
			h = Math.abs(h);
			
		} else {
			
			x = b;
			z = a;
			h = -Math.abs(h);
			
		}
		
		
		for (; x <= z; x += h) {

			if (x <= 2) {

				y = -x;
				System.out.println("x = " + x + ", y = " + y);

			} else {

				y = x;
				System.out.println("x = " + x + ", y = " + y);
			}
		}
	}
}
