package by.noyvik.main.task.cycle;

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {

	public static void main(String[] args) {

		char ch = Character.MAX_VALUE;
		char ch1 = Character.MIN_VALUE;

		for (char i = ch1; i < ch; i++) {
			
			System.out.print("Символ " + i + " соответствует числу " + (int)i + ". ");
			
			if (i%10 == 0) {
				System.out.println("");
			}
		
		}

	}

}
