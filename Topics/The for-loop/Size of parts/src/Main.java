import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int sampleValue = scanner.nextInt();
        int[] productValue = new int[sampleValue];
        for (int i = 0; i < sampleValue; i++) {
            productValue[i] = scanner.nextInt();
            if (productValue[i] == 1)
                larger++;
            if (productValue[i] == -1)
                smaller++;
            if (productValue[i] == 0)
                perfect++;
        }
        System.out.println(perfect + " " + larger + " " + smaller);



    }
}