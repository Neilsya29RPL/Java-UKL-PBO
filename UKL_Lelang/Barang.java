package UKL_Lelang;

import java.util.ArrayList;
import java.util.Scanner;

public class Barang {

    Scanner input = new Scanner(System.in);
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> hargaAwal = new ArrayList<Integer>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();

    public Barang() {
        System.out.print("Masukkan Barang yang mau dilelang  : ");
        this.namaBarang.add(input.next());
        System.out.print("Masukkan harga awal barang         : Rp.");
        this.hargaAwal.add(input.nextInt());
        System.out.print("Apakah barang bisa ditawar?(yes/no): ");
        String answer = input.next();
        if ("yes".equals(answer)) {
            this.status.add(true);
            System.out.println("Barang dapat ditawar");
        } else {
            System.out.println("Barang tidak boleh ditawar");
            this.status.add(false);
        }
    }

    public int getJmlBarang() {
        return this.namaBarang.size();
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang.add(namaBarang);
    }

    public String getNamaBarang(int idBarang) {
        return this.namaBarang.get(idBarang);
    }

    public void setStatus(boolean status) {
        this.status.add(status);
    }

    public boolean getStatus(int idBarang) {
        return this.status.get(idBarang);
    }

    public void editStatus(int idBarang, boolean status) {
        this.status.set(idBarang, status);;
    }

    public void setHargaAwal(int hargaAwal) {
        this.hargaAwal.add(hargaAwal);
    }

    public int getHargaAwal(int idBarang) {
        return this.hargaAwal.get(idBarang);
    }
}