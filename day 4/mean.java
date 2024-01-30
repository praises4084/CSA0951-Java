class MeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {66, 79, 84, 53, 28, 17, 91, 15};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

         double mean = (double) sum / numbers.length;

        System.out.println("The mean of the given list is: " + mean);
    }
}
