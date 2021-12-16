package sut;

import java.util.Scanner;

public class PrimeAdd {
	public static boolean isPrime(int num) {
		boolean flag = true;
		int temp = (int) Math.sqrt(num);

		for (int i = 2; i <= temp; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static int primeAdd(int num1, int num2) {
		int sum = 0;

		if (num1 == num2) {
			System.out.println("Please change two deifferent nums:");
		}

		while (num1 != num2) {
			if (num1 > num2) {
				int temp = 0;
				temp = num1;
				num1 = num2;
				num2 = temp;
			}

			for (int i = num1; i <= num2; i++) {
				if (isPrime(i)) {
					sum += i;
				}
			}
			break;
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input 2 different int nums:");
		while (true) {
			int a1 = sc.nextInt();
			int a2 = sc.nextInt();
			if (a1 == a2) {
				primeAdd(a1, a2);
			} else {
				System.out.println("The sum of prime nums between " + a1 + 
						" and " + a2 + " is: " + primeAdd(a1, a2));
				break;
			}
		}
	}
}
