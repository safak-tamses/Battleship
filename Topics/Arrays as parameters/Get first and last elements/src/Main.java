import java.util.*;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] x) {
        int[] a = new int[2];
        a[0] = x[0];
        a[1] = x[x.length - 1];

        return a;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}