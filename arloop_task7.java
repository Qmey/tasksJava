public class arloop_task7 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
