package by.noyvik.main.task.branch;

//1. Даны два угла треугольника (в градусах). 
//   Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class Task1 {

	public static void main(String[] args) {

		int cornerA;
		int cornerB;
		
		cornerA = 30;
		cornerB = 60;
		
		if (cornerA >0 && cornerB >0 && (180 - cornerA - cornerB) > 0) {
			
			System.out.print("Треугольник с такими углами существует");
			
			if (cornerA == 90 || cornerB == 90 || (cornerA + cornerB) == 90) { 
				
				System.out.println(", и является прямоугольным.");
				
			}
						
		}
	
		else {
			
			System.out.println("Треугольник с такими углами не существует ");

		}
		
	
		
		
	}

}
