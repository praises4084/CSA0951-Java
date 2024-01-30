import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SadNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSadNumber(number)) {
            System.out.println(number + " is a Sad Number.");
        } else {
            System.out.println(number + " is not a Sad Number.");
        }

        scanner.close();
    }

    private static boolean isSadNumber(int num) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (num != 4 && !seenNumbers.contains(num)) {
            seenNumbers.add(num);
            num = getSumOfSquaredDigits(num);
        }

        return num == 4;
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
