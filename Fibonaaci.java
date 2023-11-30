public class Fibonaaci {
    static int hitungPasanganMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 1) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        int jumlahPasangan = hitungPasanganMarmut(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahPasangan);
    }
}
