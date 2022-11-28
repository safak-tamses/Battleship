import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        int count = 0;
        while (input1 > 0) {
            input1 = input1 - input2;
            count++;
            if (input1 <= 0)
                break;

            input1 = input1 + input3;
        }
        System.out.println(count);
    }
}