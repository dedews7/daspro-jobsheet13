import java.util.Scanner;

public class CekPrimaRekursif {
    static boolean cekPrimaRekursif(int n, int i) {
        if (n <= 1) {
            return false;
        }

        if (i == n) {
            return true;
        }

        if (n % i == 0) {
            return false;
        }

        return cekPrimaRekursif(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = scanner.nextInt();

        if (cekPrimaRekursif(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
