public class ServiceClass {
    TransaksiPembelian[] Trs = new TransaksiPembelian[5];
    Barang[] Brg = new Barang[5];
    int idx;
    int idx2;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (idx < Trs.length) {
            Trs[idx] = trP;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tambahDataBarang(Barang barangs) {
        if (idx2 < Brg.length) {
            Brg[idx2] = barangs;
            idx2++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    int searching(String key) {
        for (int i = 0; i < Brg.length; i++) {
            if (Trs[i].brg.kodeBarang.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    void sorting() {
        for (int i = 0; i < Brg.length-1; i++) {
            for (int j = 0; j < Brg.length- i - 1; j++) {
                if (Trs[j].brg.kodeBarang.compareToIgnoreCase(Trs[j+1].brg.kodeBarang)>0) {
                    TransaksiPembelian temp = Trs[j];
                    Trs[j] = Trs[j+1];
                    Trs[j+1] = temp;
                }
            }
        }
    }

    void tampilSemuaDataBarang() {
        System.out.printf("%-10s %-15s %-10s %-15s %-10s\n", "Kode", "Nama", "Kategori",
        "Stok", "Harga");
        for (int i = 0; i < Brg.length; i++) {
            Brg[i].tampilDataBarang();
        }
    }

    void tampilSemuaDataTransaksi() {
        System.out.printf("%-10s %-15s %-20s %-10s %-10s %-10s\n", "Kode", "Nama pembeli", "Tanggal pembelian",
        "Nama barang", "Kuantitas", "Harga");
        for (int i = 0; i < Trs.length; i++) {
            Trs[i].tampilDataTransaksi();
        }
    }

    void tampilPosisiSearch(String key, int posisi) {
        if (posisi != -1) {
            System.out.println("Barang dengan kode " + key + " ditemukan di index : " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(int posisi) {
        Trs[posisi].tampilDataTransaksi();
    }
}
