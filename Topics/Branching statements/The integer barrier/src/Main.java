import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        while (sum <= 1000) {
            int num = input.nextInt();
            if (num!= 0) {
                sum += num;
            } if (num == 0){
                break;
            } if (sum >= 1000) {
                break;
            }
        }
        if (sum < 1000){
            System.out.println(sum);
        } else {
            System.out.println(sum - 1000);
        }
    }
}