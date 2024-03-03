public class launch {
    public static void main(String[] args) {
        double a = 10; // Pierwsza wartość
        double b = 5;  // Druga wartość

        double suma = a + b;
        System.out.println("Wynik dodawania: " + suma);

        double roznica = a - b;
        System.out.println("Wynik odejmowania: " + roznica);

        double iloczyn = a * b;
        System.out.println("Wynik mnożenia: " + iloczyn);

        if (b != 0) {
            double iloraz = a / b;
            System.out.println("Wynik dzielenia: " + iloraz);
        } else {
            System.out.println("Nie można dzielić przez zero.");
        }
    }
}
