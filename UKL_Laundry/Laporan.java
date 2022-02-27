package UKL_Laundry;

public class Laporan {

    public void laporan(JenisLaundry jenislaundry) {
        int x = jenislaundry.getJmlJenisLaundry();

        System.out.println();
        System.out.println("====== Tabel Jenis Laundry ======");
        System.out.println("Jenis Laundry \t Harga \t Durasi");
        for (int i = 0; i < x; i++) {
                    System.out.println(jenislaundry.getJenisLaundry(i) + "\t" + jenislaundry.getHarga(i)+"/kg" + "\t" + jenislaundry.getDurasi(i) + " hari ");
        }
    }

    public void laporan(Client client) {
        int x = client.getJmlClient();

        System.out.println();
        System.out.println("========= Tabel Client ==========");
        System.out.println("Nama \tAlamat \tTelepon \tSaldo");
        for (int i = 0; i < x; i++) {
            System.out.println(client.getNama(i) + "\t" + client.getAlamat(i) + "\t" + client.getTelepon(i) + "\t" + client.getSaldo(i));
        }
    }

    public void laporan(Transaksi transaksi, JenisLaundry jenislaundry) {
        int x = transaksi.getJmlTransaksi();

        System.out.println();
        System.out.println("======= Laporan Transaksi =======");
        System.out.println("Jenis Laundry \t Qty \t Harga \t Jumlah");

        int total = 0;
        for (int i = 0; i < x; i++) {
            int jumlah = transaksi.getBanyaknya(i) * jenislaundry.getHarga(transaksi.getIdJenisLaundry(i));
            total += jumlah;

            System.out.println(jenislaundry.getJenisLaundry(transaksi.getIdJenisLaundry(i)) + "\t" + transaksi.getBanyaknya(i) + "\t" + jenislaundry.getHarga(transaksi.getIdJenisLaundry(i)) + "\t" + jumlah);
        }
        System.out.println("Total Omset = " + total);
    }
}
