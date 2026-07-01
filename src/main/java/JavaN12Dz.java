import java.util.Scanner;

public class JavaN12Dz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            double dividend = scanner.nextDouble();
            double divisor = scanner.nextDouble();

            if (divisor == 0) {

                break;

            }
            double result = dividend / divisor;
            System.out.println(result);
        }
        scanner.close();
    }
}
