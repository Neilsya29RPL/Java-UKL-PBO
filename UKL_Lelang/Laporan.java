package UKL_Lelang;

public class Laporan {

    public void laporan(Barang barang) {
        int x = barang.getJmlBarang();

        System.out.println();
        System.out.println("Tabel Barang Yang Dilelang");
        System.out.println("ID \tNama Barang \tHarga \tStatus ");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + barang.getNamaBarang(i) + "\t" + "\t" + "Rp." + barang.getHargaAwal(i) + "\t" + barang.getStatus(i));
        }
    }

    public void laporan(Masyarakat masyarakat, Barang barang) {
        int x = masyarakat.getJmlMasyarakat();

        System.out.println(" \n ");
        System.out.println("Tabel Masyarakat (Penawar)");
        System.out.println();
        System.out.println("ID \tNama   \tAlamat \tTelepon ");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i) + "    \t" + masyarakat.getAlamat(i) + "\t" + masyarakat.getTelepon(i));
        }
    }

    public void laporan(Petugas petugas) {
        int x = petugas.getJmlPetugas();

        System.out.println(" ");
        System.out.println("Tabel Petugas");
        System.out.println("ID \tNama       \tAlamat        \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + petugas.getNama(i) + "   \t"+ petugas.getAlamat(i) + "  \t" + petugas.getTelepon(i));
        }
        System.out.println(" ");
    }

    public void laporan(Masyarakat masyarakat) {
        int x = masyarakat.getJmlMasyarakat();

        System.out.println(" ");
        System.out.println("Tabel Masyarakat");
        System.out.println("ID \tNama       \tAlamat    \tTelepon");
        for (int i = 0; i < x; i++) {
            System.out.println(i + ".\t" + masyarakat.getNama(i) + "    \t" + masyarakat.getAlamat(i) + "      \t" + masyarakat.getTelepon(i));
        }
        System.out.println(" ");
    }

//    public void laporan(Lelang lelang, Barang barang) {
//        int x = lelang.getJmlLelang();
//
//        System.out.println();
//        System.out.println("Laporan Peminjaman");
//        System.out.println();
//        System.out.println("Nama Buku\tQty \tHarga \tJumlah");
//
//        int total = 0;
//        for (int i = 0; i < x; i++) {
//            int jumlah = lelang.getBanyaknya(i) * barang.getHargaAwal(lelang.getIdBarang(i));
//            total += jumlah;
//
//            System.out.println(barang.getNamaBarang(lelang.getIdBarang(i)) + "\t" + lelang.getBanyaknya(i) + "\t" + barang.getHargaAwal(lelang.getIdBarang(i)) + "\t" + jumlah);
//        }
//        System.out.println("Total Omset =" + total);
//
//    }
}
