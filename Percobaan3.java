import java.util.Scanner;
public class Percobaan3 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        double saldoAwal;
        int tahun;
        System.out.print("Jumlah saldo awal: ");
        saldoAwal = input6.nextInt();
        System.out.print("Lamanya investasi (tahun): ");
        tahun = input6.nextInt();
        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
    static double hitungLaba(double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        }
        else {
            return (1.11 * hitungLaba(saldo, tahun -1));
        }
    }
}
