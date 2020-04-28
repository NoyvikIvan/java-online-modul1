package by.noyvik.main.task.liner;

//6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:
	
	
public class Task6 {

	public static void main(String[] args) {

		int x;
		int y;
		boolean flag;
		boolean upX;
		boolean downX;
		boolean point;
		
		x = 0;
		y = -1;
		
		
		upX = (x <= 2 && x >= -2 && y <= 4 && y>=0);
		downX = (x <= 4 && x >= -4 && y <= 0 && y>=-3);
		point = (x == 0 && y == -1);
		flag = upX || downX && !point;
			

		System.out.println(flag);
	}

}
