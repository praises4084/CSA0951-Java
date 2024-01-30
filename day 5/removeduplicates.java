import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!uniqueList.contains(array[i])) {
                uniqueList.add(array[i]);
            }
        }

        int[] uniqueArray = new int[uniqueList.size()];

        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArray[i] = uniqueList.get(i);
        }

        System.out.println(Arrays.toString(uniqueArray));
    }
}
