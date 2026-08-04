import java.util.Scanner;

public class Task10SumLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int lastDigit1 = Math.abs(a % 10);
        int lastDigit2 = Math.abs(b % 10);

        int sum = lastDigit1 + lastDigit2;

        System.out.println("Last digit of first number: " + lastDigit1);
        System.out.println("Last digit of second number: " + lastDigit2);
        System.out.println("Sum of last digits: " + sum);

        sc.close();
    }
}
