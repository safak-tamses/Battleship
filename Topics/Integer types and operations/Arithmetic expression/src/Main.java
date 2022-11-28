import java.util.Scanner;

class Main {

    public static void func(int inp) {
        int x = ((inp + 1) * inp + 2) * inp + 3;
        System.out.println(x);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inpt = scanner.nextInt();

        func(inpt);


    }


}


