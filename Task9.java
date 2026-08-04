import java.util.Scanner;

public class Task9PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;
        int temp = Math.abs(num);

        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }

        if (Math.abs(original) == reversed) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is not a Palindrome Number");
        }

        sc.close();
    }
}
