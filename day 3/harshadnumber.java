import java.util.Scanner;

class HarshadNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        scanner.close();
    }

    private static boolean isHarshadNumber(int num) {
        int sum = 0;
        int originalNum = num;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return originalNum % sum == 0;
    }
}
