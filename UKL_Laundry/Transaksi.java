
package UKL_Laundry;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

//    public Transaksi() {
//        this.idClient.add(0);
//        this.idJenisLaundry.add(0);
//        this.banyak.add(2);
//        this.idClient.add(0);
//        this.idJenisLaundry.add(1);
//        this.banyak.add(3);
//        this.idClient.add(1);
//        this.idJenisLaundry.add(0);
//        this.banyak.add(1);
//        this.idClient.add(1);
//        this.idJenisLaundry.add(2);
//        this.banyak.add(2);
//    }

    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry jenislaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println();
        System.out.println("<<<<< Silahkan Laundry >>>>>");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));
        ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode Jenis Laundry :");
            temp = myObj.nextInt();
            if (temp != 99) {
                idJenisLaundry.add(temp);
                System.out.print(jenislaundry.getJenisLaundry(idJenisLaundry.get(i)) + " sebanyak (kg): ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 99);
        
        System.out.println();
        System.out.println("Transaksi Laundry " + client.getNama(idClient) + " sebagai berikut ");
        System.out.println("Jenis Laundry \tBanyak(kg) \tHarga \tJumlah \t");

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenislaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenislaundry.getJenisLaundry(idJenisLaundry.get(j)) + "\t" + banyak.get(j) + "\t" + jenislaundry.getHarga(idJenisLaundry.get(j)) + "\t" + jumlah);
            transaksi.setTransaksi(jenislaundry, idClient, idJenisLaundry.get(j), banyak.get(j));
        }

        System.out.println("Total Belanja : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
    }

    public void setTransaksi(JenisLaundry jenislaundry, int idClient, int idJenisLaundry, int banyaknya) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyaknya);
    }

    public int getIdJenisLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyaknya(int id) {
        return this.banyak.get(id);
    }

    public int getIdClient(int id) {
        return this.idClient.get(id);
    }

    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}
