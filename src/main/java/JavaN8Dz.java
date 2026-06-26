import java.util.Scanner;

public class JavaN8Dz {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}