package wijas_p1;

import java.util.Scanner;

public class Decrypter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int temp, a, b, c, d;
		
		System.out.println("Please enter a number: ");
		a = scanner.nextInt();
		
		System.out.println("Please enter a number: ");
		b = scanner.nextInt();
		
		System.out.println("Please enter a number: ");
		c = scanner.nextInt();
		
		System.out.println("Please enter a number: ");
		d = scanner.nextInt();
		
		temp = a;
		a = c;
		c = temp;

		temp = b;
		b = d;
		d = temp;

		a += 10 % a;
		b += 10 % b;
		c += 10 % c;
		d += 10 % d;

		a = a - 7;
		b = b - 7;
		c = c - 7;
		d = d - 7;

		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);

	}

}
