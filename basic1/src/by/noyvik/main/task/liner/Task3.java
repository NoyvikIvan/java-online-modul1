package by.noyvik.main.task.liner;

//3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//   (sin(x)+cos(y))*tg(xy)/(cos(x)-sin(y)

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		double result;
		
		x = 0.566;
		y = 0.321;
		
		result = (Math.sin(x) + Math.cos(y)) * Math.tan(x*y);
		result = result / (Math.cos(x) - Math.sin(y));
		
		System.out.println(result);
		


	}

}
