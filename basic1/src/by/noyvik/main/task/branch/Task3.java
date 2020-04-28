package by.noyvik.main.task.branch;

//3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

// (х-х1)/(х2-х1)=(у-у1)/(у2-у1). - уравнение прямой.
// (х-х1)(у2-у1)=(у-у1)(х2-х1)

public class Task3 {

	public static void main(String[] args) {

		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		
		
		x1 = -1;
		y1 = 1;
		x2 = 2;
		y2 = 4;
		x3 = -3;
		y3 = -1;
		
		
		if ((x3-x1)*(y2-y1)==(y3-y1)*(x2-x1)) {
			
			System.out.println("Все три точки находятся на одной прямой");
			
		}
		else {
			
			System.out.println("Точки не находятся на одной прямой");
			
		}
		
	}

}
