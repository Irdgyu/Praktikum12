import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = input6.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input6.nextInt();
        System.out.print(cetakDeret(bilangan, pangkat,""));
        System.out.print(" = " + hitungPangkat(bilangan, pangkat));
    }
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        }
        else {
            return (x * hitungPangkat(x, y-1));
        }
    }
    static String cetakDeret (int x, int y, String deret) {
        if (y == 0) {
            return deret + " x 1";
        }
        else {
            if (deret.length() > 0) {
                deret += " x ";
            }
            return cetakDeret(x, y - 1, deret + x);
        }
    }
}
