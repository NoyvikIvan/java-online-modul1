package by.noyvik.main.task.cycle;

//5. Даны числовой ряд и некоторое число е. 
//Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
//Общий член ряда имеет вид:a(n)=(1/(2^n))+(1/(3^n))

public class Task5 {

	public static void main(String[] args) {

		double sum;
		double e;
		double a;
		int n;
		
		sum = 0;
		e = 0.00053;
		a=1;
		n=1;
		
		
		while (true) {
			
			a = (1/(Math.pow(2, n)))+(1/(Math.pow(2, n)));
			
			if (Math.abs(a)>=e) {
				
				sum+=a;
				n++;
				
			} else {
				break;
			}
			
		}

		System.out.println("Результат: " + sum);
	}

}
