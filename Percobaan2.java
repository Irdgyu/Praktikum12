import java.util.Scanner;2
public class Percobaan2 {
    public static void main(String[] args) {
        Scanner input6 = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = input6.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input6.nextInt();
        System.out.println(hitungPangkat(bilangan, pangkat));
    }
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        }
        else {
            return (x * hitungPangkat(x, y-1));
        }
    }
}
