package Calculator;

import java.util.Scanner;

public class Showm {
	public  void menu() {
		System.out.println("1.Выполнить сложение");
		System.out.println("2.Выполнить вычитание");
		System.out.println("3.Выполнить умножение");
		System.out.println("4.Выполнить деление");
		System.out.println("5.Выход из программы");
		System.out.println("Выберите операцию");
	}

@SuppressWarnings("resource")
public void run() {
	Scanner sc = new Scanner(System.in);
	int x;
	String d;
	menu();
	x = sc.nextInt();

	do {
		switch (x) {
		case 1:
			System.out.println(Calc.sum());
			break;
		case 2:
			System.out.println(Calc.min());
			break;
		case 3:
			System.out.println(Calc.mn());
			break;

		case 4:
			System.out.println(Calc.dl());
			break;
		default:
			System.out.println("Неверная выбрана операция");

		}

	
	System.out.println("Желаете продолжить? Y/N");
	d = sc.next();
	if (d.equalsIgnoreCase("Y")) {
		menu();
		x = sc.nextInt();

	}
	else if (d.equalsIgnoreCase("N")) {
		System.exit(0);
	}
	else
		System.out.println("Некоректно введины данные");
	}
 while (true);

	
}

}
