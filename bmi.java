import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wagę w kilogramach:");
        double waga = scanner.nextDouble();

        System.out.println("Podaj swój wzrost w metrach:");
        double wzrost = scanner.nextDouble();

        double bmi = waga / (wzrost * wzrost);

        System.out.println("Twoje BMI wynosi: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Masz niedowagę.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Twoja waga jest w normie.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Masz nadwagę.");
        } else {
            System.out.println("Masz otyłość.");
        }
    }
}
