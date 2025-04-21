package persiapan_uts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang : ");
        int jumlahData = sc.nextInt();

        Service list = new Service(jumlahData);

        while (true) {
            System.out.println("PILIH MENU");
            System.out.println("1. Input Barang");
            System.out.println("2. Penjualan Barang");
            System.out.println("3. Cek stok barang terbanyak");
            System.out.println("4. Search barang terlaris");
            System.out.println("5. Tampil semua data barang");
            System.out.println("6. Exit Program");
            System.out.print("Pilih menu (1-5) : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Input Data Barang");
                    for (int i = 0; i < jumlahData; i++) {
                        System.out.print("Kode : ");
                        String kodeBarang = sc.nextLine();
                        System.out.print("Nama : ");
                        String namaBarang = sc.nextLine();
                        System.out.print("Stok : ");
                        int stok = sc.nextInt();
                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        list.tambahBarang(new Barang(kodeBarang, namaBarang, stok, harga));
                    }
                    break;
                case 2:
                    list.tranksaksi(sc);
                    break;
                case 3:
                    list.sortMenurutStok();
                    break;
                case 4:
                    list.searchTerlaris();
                    break;
                case 5:
                    list.tampilSemuaData();
                    break;
                case 6:
                    System.out.println("Program dihentikan");
                    return;
                default:
                    System.out.println("Menu invalid, input ulang Menu !!!");
                    break;
            }
        }

    }
}
