import java.util.Scanner;

public class PemilihanBilangan30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan sebuah angka: ");
        int angka = sc.nextInt();

        System.out.println(
            (angka % 2 == 0)
            ? "Angka " + angka + " termasuk bilangan genap"
            : "Angka " + angka + " termasuk bilangan ganjil"
        );
    }
}