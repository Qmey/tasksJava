public class task74 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int num3 = 7;
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Largest number: " + max);
    }
}
