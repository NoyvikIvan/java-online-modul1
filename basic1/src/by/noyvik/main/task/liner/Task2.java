package by.noyvik.main.task.liner;

		//2. Вычислить значение выражения по формуле
		// (все переменные принимают действительные значения):
		// ((b+sqrt(b^2+4ac))/2a)-(a^3)c+(b^-2)

public class Task2 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double result;
		
		a = 3.5;
		b = 9.39;
		c = -1;
		
		
		if (a*c<0 && (b * b < Math.abs(4 * a * c)) ){
			System.out.println("Уравнение не имеед действительного решения");
		}
		
		double up;
		double first;
		double second;
		double third;
		
		
		up = b + Math.sqrt(b * b + 4 * a * c);
		first = up / (2 * a);
		second = Math.pow(a, 3) * c;
		third = Math.pow(b, -2);

		
		result = first - second + third;
		
		System.out.println(result);
		
		
	}
	
		
}
