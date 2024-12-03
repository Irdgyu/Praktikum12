import java.util.Scanner;
public class Tugas06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        prosesHitung(scanner);
    }
    public static int[] inputAngka(Scanner scanner, int n) {
        int[] angka = new int[n];
        for (int i = n; i > 0; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[n - i] = scanner.nextInt();
        }
        return angka;
    }
    public static int hitungRekursif(int[] angka, int n) {
        if (n == 0) {
            return 0;
        }
        return angka[n - 1] + hitungRekursif(angka, n - 1);
    }
    public static int hitungIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }
    public static void prosesHitung(Scanner scanner) {
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = scanner.nextInt();
        int[] angka = inputAngka(scanner, n);
        int totalRekursif = hitungRekursif(angka, n);
        System.out.println("Total (rekursif) dari " + n + " angka yang dimasukkan adalah: " + totalRekursif);
        int totalIteratif = hitungIteratif(angka, n);
        System.out.println("Total (iteratif) dari " + n + " angka yang dimasukkan adalah: " + totalIteratif);
    }
}
