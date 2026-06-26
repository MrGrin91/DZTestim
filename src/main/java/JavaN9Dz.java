import java.util.Scanner;

public class JavaN9Dz {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {

            int i = a + 1;

            while (i < b) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        }
        scanner.close();
    }
}
