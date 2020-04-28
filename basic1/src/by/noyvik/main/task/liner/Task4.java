package by.noyvik.main.task.liner;

//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
//   Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task4 {

	public static void main(String[] args) {
		
		double r;
		
		r = 456.123;
		
		int integer;
		double fractional;
		
		r = r + .0005;
		integer = (int)r;
		fractional = (int)((r % 1) *1000 );

		r = (fractional * 1000 + integer) / 1000.0; 
		
		System.out.println(r);
	}

}
