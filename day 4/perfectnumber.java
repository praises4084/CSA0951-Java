class PerfectNumbers
{
    public static void main(String[] args)
    {
        int n = 3;
        int count = 0;
        int number = 1;

        while (count < n)
        {
            int sum = 0;

            for (int i = 1; i < number; i++)
            {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum == number)
            {
                System.out.println(number);
                count++;
            }

            number++;
        }
    }
}
