import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово из пяти букв");
        String s = scanner.nextLine();
        String a=s.toLowerCase();
        if (s.length() > 5) {
            System.out.println("Вы ввели слово длинее  чем 5 букв");

        } else if (s.length() < 5) {
            System.out.println("Вы ввели слово меньше  чем 5 букв");
        } else if ((a.charAt(0) == a.charAt(4)) && (a.charAt(1) == (a.charAt(3)))) {
            System.out.println("Слово " + s + " является полиндромом");
        } else {
            System.out.println("Слово " + s + " не является полиндромом");
        }
    }
}
