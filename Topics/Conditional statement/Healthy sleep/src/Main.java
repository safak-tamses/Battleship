import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(c>=a && c<=b)
            System.out.println("Normal");
        if(c>b)
            System.out.println("Excess");
        if(c<a)
            System.out.println("Deficiency");

    }
}