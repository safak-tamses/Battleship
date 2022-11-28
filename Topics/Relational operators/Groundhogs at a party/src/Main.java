import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int b = scanner.nextInt();
        boolean a = scanner.nextBoolean();

        if (a == true) {
            if (b >= 15 && b <= 25) {
                System.out.println(true);
            } else System.out.println(false);
        }
        if (a == false) {
            if (b >= 10 && b <= 20) {
                System.out.println(true);
            } else
                System.out.println(false);
        }
    }
}
