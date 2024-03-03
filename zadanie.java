public class zadanie {
    public static void main(String[] args) {
        int[] liczby = {5, 10, 15, 20, 25};


        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }

        double srednia = (double) suma / liczby.length;

        System.out.println("Tablica liczb całkowitych:");
        for (int liczba : liczby) {
            System.out.print(liczba + " ");
        }
        System.out.println("\nSuma: " + suma);
        System.out.println("Średnia: " + srednia);
    }
}
