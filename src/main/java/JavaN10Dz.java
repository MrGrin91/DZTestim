import java.util.Scanner;

public class JavaN10Dz {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        double y;

        if (x >= 5) {
            y = (double) (x * x - 10) / (x + 7);
        }
        else if (-3 < x && x < 5) {

            y = (double) (x + 3) * (x * x - 2);
        }
        else {
            y = 420;
        }
        System.out.println(y);
    }
}
//        double x = scanner.nextDouble();
//
//        double y = (Math.pow(x, 2) - 10) / (x + 7);


