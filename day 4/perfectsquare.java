class  PerfectSquareExample {
    public static void main(String[] args) {
        int num = 16;

        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }


    static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }

        double squareRoot = Math.sqrt(num);
        return squareRoot - Math.floor(squareRoot) == 0;
    }
}
