import java.util.Scanner;

public class JavaN10Dz {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();

        double y = (Math.pow(x, 2) - 10) / (x + 7);

        System.out.println(y);

        scanner.close();
    }
}