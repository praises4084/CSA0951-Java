class DigitFactorial {
    public static void main(String[] args) {
        int number = 143; // Change this to the desired number
        calculateDigitFactorial(number);
    }

    static void calculateDigitFactorial(int number) {
        while (number > 0) {
            int digit = number % 10;
            long factorial = calculateFactorial(digit);
            System.out.println("Factorial of digit " + digit + ": " + factorial);
            number /= 10;
        }
    }

    static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
