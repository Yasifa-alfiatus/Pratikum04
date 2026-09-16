import java.util.Scanner;

public class KategoriUsia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();

        if (usia < 0) {
            System.out.println("Input tidak valid");
        } else if (usia <= 12) {
            System.out.println("Kategori: Anak");
        } else if (usia <= 19) {
            System.out.println("Kategori: Remaja");
        } else if (usia <= 64) {
            System.out.println("Kategori: Dewasa");
        } else {
            System.out.println("Kategori: Lansia");
        }

        input.close(); 
    }
}