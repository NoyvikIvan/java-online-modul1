package by.noyvik.main.task.cycle;


//4. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task4 {

	public static void main(String[] args) {

		long result;
		long nextRes;
		
		int i = 1;
		
		result = 1;
		nextRes = 1;
		do  {
			
			result *= Math.pow(i, 2);
			nextRes =  (result * i * i);
			i++;
			
			if (!(result<=nextRes)) {
				System.out.println("Вычисления остановлены на " + i + "-ом числе, по причине выхода за предел переменной , при корректной точности." );
				break;
			}
			
		}
		while ( i<200);

		System.out.println("Произведение квадратов чисел от 1 до " + (i-1) +
				"равно: " + result );
		
	}

}
