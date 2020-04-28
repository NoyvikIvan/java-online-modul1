package by.noyvik.main.task.liner;

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
//   Вывестиданное значение длительности в часах, минутах и секундах в следующей форме:
//   ННч ММмин SSc.

public class Task5 {

	public static void main(String[] args) {
		long t;
	
		t = 10000000L;
		
		long hour;
		int min;
		int sec;
		
		hour = t / 3600;
		min = (int)(t % 3600 /60);
		sec = (int)(t % 3600 % 60);
		
		System.out.println(hour + "ч " + min + "мин " + sec + "с");

		

	}

}
