import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long a = scanner.nextLong();
        char b = scanner.next().charAt(0);
        long c = scanner.nextLong();





        switch (b) {
            case '+':
                System.out.println((a) + (c));
                break;
            case '-':
                System.out.println((a) - (c));
                break;
            case '/':
                if ((c) == 0){
                    System.out.println("Division by 0!");
                    break;}
                System.out.println((a) / (c));
                break;
            case '*':
                System.out.println((a) * (c));
                break;
            default:
                System.out.println("Unknown operator");
        }
    }
}