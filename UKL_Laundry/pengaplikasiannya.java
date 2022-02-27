package UKL_Laundry;

public class pengaplikasiannya {

    public static void main(String[] args) {
        JenisLaundry jenis = new JenisLaundry();
        Petugas petugas = new Petugas();
        Laporan lp = new Laporan();
        Client client = new Client();
        Transaksi tr = new Transaksi();
        
        lp.laporan(jenis);
        lp.laporan(client);
        lp.laporan(tr, jenis);
        
        tr.prosesTransaksi(client, tr, jenis);
        lp.laporan(tr, jenis);
        lp.laporan(jenis);
        lp.laporan(client);
    }
}
