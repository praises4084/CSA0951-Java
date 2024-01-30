import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class HappyNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHappyNumber(number)) {
            System.out.println(number + " is a Happy Number.");
        } else {
            System.out.println(number + " is not a Happy Number.");
        }

        scanner.close();
    }

    private static boolean isHappyNumber(int num) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (num != 1 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = getSumOfSquaredDigits(num);
        }

        return num == 1;
    }

    private static int getSumOfSquaredDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
