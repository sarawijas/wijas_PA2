package wijas_p1;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		System.out.println("What do you want to do?");
		System.out.println("1. Encrypt\n2. Decrypt");
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		if(i == 1) {
			int temp, a, b, c, d;
			
			System.out.println("Please enter a number: ");
			a = scanner.nextInt();
			
			System.out.println("Please enter a number: ");
			b = scanner.nextInt();
			
			System.out.println("Please enter a number: ");
			c = scanner.nextInt();
			
			System.out.println("Please enter a number: ");
			d = scanner.nextInt();
			
			a = a + 7;
			b = b + 7;
			c = c + 7;
			d = d + 7;
			
			a = a % 10;
			b = b % 10;
			c = c % 10;
			d = d % 10;
			
			temp = a;
			a = c;
			c = temp;
			
			temp = b;
			b = d;
			d = temp;
			
			System.out.print(a);
			System.out.print(b);
			System.out.print(c);
			System.out.print(d);
		}
		
		if(i== 2) {
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

}
