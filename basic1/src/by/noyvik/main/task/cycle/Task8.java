package by.noyvik.main.task.cycle;

//8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

public class Task8 {

	public static void main(String[] args) {

		int a;
		int b;
		int extrA;
		int extrB;
		int copyA;
		int copyB;

		a = 7932011;
		b = 1123452689;

		for (int i = 0; i <= 9; i++) {
			
			copyA = a;

			while (copyA != 0) {

				extrA = copyA % 10;
				copyA /= 10;

				if (extrA == i) {

					copyB = b;

					while (copyB != 0) {

						extrB = copyB % 10;
						copyB /= 10;

						if (extrA == extrB) {
							System.out.println("Цифра " + extrA + " входит в запись как первого так и второго числа");
							break;
						}
					}

					break;

				}

			}

		}
	}

}
