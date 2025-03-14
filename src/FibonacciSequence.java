import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int terms = scanner.nextInt();
        if (terms <= 0) {
            System.out.println("You must enter a positive Number");
        } else {
            System.out.print(fibonacci(terms));
            }
        scanner.close();
        }
        public static int fibonacci(int r) {
            if (r <= 1) {
                return r;
            } else {
                return fibonacci(r-1) +fibonacci(r-2);
            }
        }
        }

