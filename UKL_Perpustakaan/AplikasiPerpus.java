package UKL_Perpustakaan;

import java.util.Scanner;

public class AplikasiPerpus {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int temp = 0;
        do {
            Siswa siswa = new Siswa();
            Petugas petugas = new Petugas();
            Buku buku = new Buku();
            Laporan laporan = new Laporan();
            Peminjaman peminjaman = new Peminjaman();

            laporan.laporan(buku);
            laporan.laporan(siswa);
            laporan.laporan(peminjaman, buku);

            peminjaman.setProsesPeminjaman(siswa, peminjaman, buku, laporan);
            laporan.laporan(buku);
            laporan.laporan(siswa);
            System.out.println("Lanjutkan atau Matikan 1 : 99");
            temp = myObj.nextInt();
        } while (temp != 99);
        System.exit(0);
    }
}
