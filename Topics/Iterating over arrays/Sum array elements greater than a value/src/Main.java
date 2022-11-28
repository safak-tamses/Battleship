import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        int[] array = new int[arraySize];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        int n = s.nextInt();
        for (int value : array) {
            if (value > n) {
                count += value;
            }
        }
        System.out.println(count);
    }
}