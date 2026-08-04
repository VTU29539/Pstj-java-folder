import java.util.Scanner;

public class Task8NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
        } else if (n == 0) {
            System.out.println("Nth Fibonacci number is: 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci number is: 1");
        } else {
            int a = 0, b = 1, c = 0;

            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            System.out.println("Nth Fibonacci number is: " + b);
        }

        sc.close();
    }
}
