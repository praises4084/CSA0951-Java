import java.util.Arrays;

class medianarray {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};
        Arrays.sort(array);
        int length = array.length;

        if (length % 2 != 0)
        {
            int medianIndex = length / 2;
            int median = array[medianIndex];
        } else
        {
            int medianIndex1 = length / 2 - 1;
            int medianIndex2 = length / 2;
            int median = (array[medianIndex1] + array[medianIndex2]) / 2;
        }
    }
}