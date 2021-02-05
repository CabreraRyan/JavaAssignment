import java.util.Scanner;

public class Scanner {
	public static void main(String[] args) {
		System.out.print("Enter first number: ");
		Scanner x = new Scanner(System.in);
		int first = x.nextInt();
		
		System.out.print("Enter second number: ");
		Scanner y = new Scanner(System.in);
		int second = y.nextInt();
		
		System.out.print("Increment: ");
		Scanner z = new Scanner(System.in);
		int inc = z.nextInt();
		
		while(first<=second) {
			System.out.print(first + " ");
			first += inc;
		}
		
	}
}
