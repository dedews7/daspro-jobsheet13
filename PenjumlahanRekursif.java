import java.util.Scanner;

public class PenjumlahanRekursif {
    static int jumlahkanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlahkanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int hasil = jumlahkanRekursif(n);
        System.out.print("Penjumlahan " + n + " = ");

        // Menampilkan deret bilangan dengan format yang diminta
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print("+");
            }
        }

        System.out.println(" = " + hasil);
    }
}
