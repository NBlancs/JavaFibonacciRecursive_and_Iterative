import java.util.Scanner;

public class FibonacciSequenceIterative{
	public static void main(String[] args) {
		
		System.out.println("=========FIBONACCI SEQUENCE========\n");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input a number: ");

		int input = scanner.nextInt(),firstTerm = 0,secondTerm =1;
		System.out.print("Fibonacci Series till " + input + " terms: ");
		
		for (int i = 1; i <= input; i++) {
		    System.out.println(firstTerm);

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}	
	}
}
