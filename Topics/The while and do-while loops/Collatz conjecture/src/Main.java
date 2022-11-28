import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        while (a != 1) {
            System.out.print(a + " ");
            if (a % 2 == 0)
                a = a / 2;
            else a = (a * 3) + 1;

        }
        System.out.print(a);
    }
}