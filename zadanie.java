import java.util.Scanner;

public class zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą:");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {
            System.out.println("Podana liczba " + liczba + " jest parzysta.");
        } else {
            System.out.println("Podana liczba " + liczba + " jest nieparzysta.");
        }
    }
}
