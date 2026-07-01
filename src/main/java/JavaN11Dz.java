import java.util.Scanner;

public class JavaN11Dz {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Введите город");
        String city = s.nextLine();

        switch (city){
            case "Москва", "Владивосток", "Ростов":
                System.out.println("Россия");
                break;
            case "Рим", "Милан", "Турин":
                System.out.println("Италия");
                break;
            case "Ливерпуль", "Мюнхен", "Кёльн":
                System.out.println("Германия");
                break;
            default:
                System.out.println("Неизвестный город");
        }
    }
}