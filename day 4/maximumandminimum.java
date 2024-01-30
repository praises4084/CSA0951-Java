class MaximumAndMinimum {
    public static void main(String[] args)
    {
        int arr[] = {19, 14, 11, 16, 17, 22};
        int len = arr.length;

        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int m = 1, n = 3;
        int max = arr[len - m];
        int min = arr[n - 1];

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
        int sum = max+min;
        int diff = max-min;
        System.out.println("sum is: " + sum);
        System.out.println("diffence is :" + diff);
    }
}
