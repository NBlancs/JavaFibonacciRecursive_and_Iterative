import java.util.Scanner;

public class FibonacciSequenceRecursive {

	public static void main(String[] args) {		
	        System.out.println("=========FIBONACCI SEQUENCE========\n");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please input a number: ");

	        int input = scanner.nextInt();
	        System.out.print("Fibonacci Series till " + input + " terms: ");
	        
	        for (int i = 1; i <= input; i++) {
	            System.out.println(fibonacciRecursive(i) + " ");
	        }
	    }

	    // Recursive method to calculate the nth Fibonacci number
	    public static int fibonacciRecursive(int n) {
	        if (n <= 1) {
	            return n;
	        } else {
	            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	        }
	    }
	}
