package Easy;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();

        System.out.println(isPalindrome(number));
    }

    private static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else {
            int y = x;
            int res = x%10;
            x /= 10;
            while (x > 0) {
                int temp = x % 10;
                res *= 10;
                res += temp;
                x /= 10;
            }
            if(res == y)
                return true;
        }
        return false;
    }
}