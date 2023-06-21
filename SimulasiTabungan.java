import java.util.ArrayList;
import java.util.Scanner;

public class SimulasiTabungan {

    public static void main(String[] args) {
        ArrayList<Tabungan> listTabungan = new ArrayList<Tabungan>();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        while (pilihan != 4) {
            System.out.println("========================");
            System.out.println("| MENU SIMULASI TABUNGAN |");
            System.out.println("========================");
            System.out.println("1. Tambah Tabungan");
            System.out.println("2. Tampil Tabungan");
            System.out.println("3. Hapus Tabungan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            System.out.println();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pemilik tabungan: ");
                    scanner.nextLine();
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan saldo awal tabungan: ");
                    int saldo = scanner.nextInt();
                    Tabungan tabungan = new Tabungan(nama, saldo);
                    listTabungan.add(tabungan);
                    System.out.println("Tabungan berhasil ditambahkan.");
                    System.out.println();
                    break;
                case 2:
                    if (listTabungan.isEmpty()) {
                        System.out.println("Belum ada data tabungan.");
                        System.out.println();
                    } else {
                        System.out.println("DATA TABUNGAN");
                        System.out.println("-------------");
                        for (int i = 0; i < listTabungan.size(); i++) {
                            System.out.println("Nomor Tabungan: " + (i+1));
                            System.out.println("Nama Pemilik: " + listTabungan.get(i).getNama());
                            System.out.println("Saldo Awal: " + listTabungan.get(i).getSaldo());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    if (listTabungan.isEmpty()) {
                        System.out.println("Belum ada data tabungan.");
                        System.out.println();
                    } else {
                        System.out.print("Masukkan nomor tabungan yang akan dihapus: ");
                        int nomorTabungan = scanner.nextInt();
                        if (nomorTabungan > 0 && nomorTabungan <= listTabungan.size()) {
                            listTabungan.remove(nomorTabungan-1);
                            System.out.println("Tabungan berhasil dihapus.");
                            System.out.println();
                        } else {
                            System.out.println("Nomor tabungan tidak valid.");
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan aplikasi simulasi tabungan.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    System.out.println();
                    break;
            }
        }
        scanner.close();
    }

}

class Tabungan {
    private String nama;
    private int saldo;

    public Tabungan(String nama, int saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }
}
