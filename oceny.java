import java.util.Scanner;

public class oceny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę ocen:");
        int liczbaOcen = scanner.nextInt();

        int[] oceny = new int[liczbaOcen];

        System.out.println("Podaj oceny:");
        for (int i = 0; i < liczbaOcen; i++) {
            oceny[i] = scanner.nextInt();
        }

        double suma = 0;
        for (int ocena : oceny) {
            suma += ocena;
        }
        double srednia = suma / liczbaOcen;

        String stopien;
        if (srednia >= 90) {
            stopien = "A";
        } else if (srednia >= 80) {
            stopien = "B";
        } else if (srednia >= 70) {
            stopien = "C";
        } else if (srednia >= 60) {
            stopien = "D";
        } else {
            stopien = "F";
        }

        System.out.println("Średnia ocen: " + srednia);
        System.out.println("Stopień zaliczenia: " + stopien);
    }
}
