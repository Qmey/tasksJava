import java.util.Arrays;

public class arloop_task2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArr));
    }
}
