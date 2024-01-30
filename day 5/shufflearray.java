import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ShuffleArray {
    public static void main(String[] args) {
        Integer[] array = {4, 8, 3, 9, 7};

        List<Integer> list = Arrays.asList(array);
        Collections.shuffle(list);

        System.out.println("Array of elements: " + Arrays.toString(array));
    }
}
