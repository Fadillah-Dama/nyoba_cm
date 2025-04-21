package persiapan_uts;
import java.util.Scanner;

public class Service {
    Struk[] strk = new Struk[100];
    Barang[] brg;
    int idx;
    int idx2;

    Service(int jumlahData) {
        brg = new Barang[jumlahData];
    }

    void tambahBarang(Barang brgs) {
        if (idx < brg.length) {
            brg[idx] = brgs;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tambahStruk(Barang barang, int jumlah) {
        if (idx2 < strk.length) {
            strk[idx2] = new Struk(barang, jumlah);
            idx2++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampilSemuaData() {
        System.out.printf("%-10s %-15s %-10s %-10s\n", "Kode", "Nama", "Stok",
        "Harga");
        for (int i = 0; i < brg.length; i++) {
            brg[i].tampilData();
        }
    }

    Barang cariBarang(String key) {
        for (int i = 0; i < brg.length; i++) {
            if (brg[i].kode.equalsIgnoreCase(key)) {
                return brg[i];
            }
        }
        return null;
    }

    void tranksaksi(Scanner sc) {
        String lanjut = null;

        tampilSemuaData();

        do { 
            System.out.print("Masukkan kode barang : ");
            String key = sc.nextLine();

            Barang barangs = cariBarang(key);

            if (barangs == null) {
                System.out.println("Barang dengan kode itu tidak ditemukan");
                continue;
            }

            System.out.print("Masukkan jumlah item yg dibeli : ");
            int jumlah = sc.nextInt();
            sc.nextLine();

            if (jumlah > barangs.stok) {
                System.out.println("Stok tidak mencukupi");
                continue;
            }

            barangs.kurangiStok(jumlah);
            tambahStruk(barangs, jumlah);

            System.out.print("Ingin membeli barang lagi? (y/n)");
            lanjut = sc.nextLine();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println("----------STRUK----------");
        tampilStruk();
    }

    void tampilStruk() {
        int totalBayar = 0;

        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Kode", "Nama", "Jumlah",
        "Harga", "Total harga");
        for (int i = 0; i < idx2; i++) {
            strk[i].tampilStruk();
            totalBayar += strk[i].subtotal();
        }

        System.out.println("------------------------");
        System.out.printf("TOTAL     : Rp %d\n", totalBayar);
    }

    void sortMenurutStok() {
        for (int i = 0; i < brg.length - 1; i++) {
            for (int j = 0; j < brg.length - i - 1; j++) {
                if (brg[j].stok < brg[j+1].stok) {
                    Barang temp = brg[j];
                    brg[j] = brg[j+1];
                    brg[j+1] = temp;
                }
            }
        }

        tampilSemuaData();
    }

    

    

}
