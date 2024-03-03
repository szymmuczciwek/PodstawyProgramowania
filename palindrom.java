import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo:");
        String slowo = scanner.nextLine();

        boolean czyPalindrom = true;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                czyPalindrom = false;
                break;
            }
        }

        if (czyPalindrom) {
            System.out.println("Podane słowo jest palindromem.");
        } else {
            System.out.println("Podane słowo nie jest palindromem.");
        }
    }
}
