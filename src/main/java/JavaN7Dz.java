import java.util.Scanner;

public class JavaN7Dz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите этаж");
                int value = scanner.nextInt();

        if (value >=1 && value <=4) {
            System.out.println("Малоэтажный дом");
        }
        else if (value >=5 && value <=8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (value >=9) {
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
}
