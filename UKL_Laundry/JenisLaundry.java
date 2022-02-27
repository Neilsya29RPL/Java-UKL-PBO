package UKL_Laundry;

import java.util.ArrayList;

public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();

    public JenisLaundry() {
        this.jenisLaundry.add("Laundry Cepat");
        this.harga.add(9000);
        this.durasi.add(1);
        this.jenisLaundry.add("Laundry Medium");
        this.harga.add(7000);
        this.durasi.add(3);
        this.jenisLaundry.add("Laundry Slow");
        this.harga.add(5000);
        this.durasi.add(4);
    }

    public int getJmlJenisLaundry() {
        return this.jenisLaundry.size();
    }

    public void setJenisLaundry(String jenisLaundry) {
        this.jenisLaundry.add(jenisLaundry);
    }

    public String getJenisLaundry(int idJenisLaundry) {
        return this.jenisLaundry.get(idJenisLaundry);
    }

    public void setDurasi(int durasi) {
        this.durasi.add(durasi);
    }

    public int getDurasi(int idJenisLaundry) {
        return this.durasi.get(idJenisLaundry);
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idJenisLaundry) {
        return this.harga.get(idJenisLaundry);
    }
}
