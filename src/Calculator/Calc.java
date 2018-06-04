package Calculator;

import java.util.Scanner;

public class Calc {
	@SuppressWarnings("resource")
	public static int sum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число");
		int a = sc.nextInt();
		System.out.println("Введите второе число");
		int b = sc.nextInt();
		return a + b;

	}

	@SuppressWarnings("resource")
	public static int min() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ведите первое число ");
		int a = sc.nextInt();
		System.out.println("Ведите второе число ");
		int b = sc.nextInt();
		return a - b;
	}

	@SuppressWarnings("resource")
	public static int mn() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ведите первое число ");
		int a = sc.nextInt();
		System.out.println("Ведите второе число ");
		int b = sc.nextInt();
		return a * b;
	}

	@SuppressWarnings("resource")
	public static int dl() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ведите первое число ");
		int a = sc.nextInt();
		System.out.println("Ведите второе число ");
		int b = sc.nextInt();
		return a / b;
	}

}
