package UKL_Lelang;

import java.util.ArrayList;

public class Masyarakat implements User {

    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Masyarakat() {
        this.namaMasyarakat.add("Rannia");
        this.alamat.add("Blitar");
        this.telepon.add("085806752070");

        this.namaMasyarakat.add("Nauraa");
        this.alamat.add("Malang");
        this.telepon.add("082133456731");
    }

    @Override
    public void setNama(String namaMasyarakat) {
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat) {
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat) {
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat) {
        return this.telepon.get(idMasyarakat);
    }

    public int getJmlMasyarakat() {
        return this.namaMasyarakat.size();
    }
}
