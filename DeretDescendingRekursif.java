import java.util.Scanner;

public class DeretDescendingRekursif {
    static void tampilkanRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            tampilkanRekursif(n - 1);
        }
    }
    static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Fungsi Rekursif:");
        tampilkanRekursif(n);

        System.out.println("\nFungsi Iteratif:");
        tampilkanIteratif(n);
    }
}
