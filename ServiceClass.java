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

    void searching(String key) {
        boolean isFounded = false; 
        System.out.printf("%-10s %-15s %-20s %-15s %-15s %-10s %-10s\n", "Kode", "Nama pembeli", "Tanggal pembelian",
        "Kode barang", "Nama barang", "Kuantitas", "Harga");

        for (int i = 0; i < Trs.length; i++) {
            if (Trs[i].brg.kodeBarang.equalsIgnoreCase(key)) {
                Trs[i].tampilDataTransaksi();
                isFounded = true;
            }
        }

        if (!isFounded) {
            System.out.println("Tranksaksi dengan kode barang " + key + " tidak ditemukan");
            System.out.println("--------------------------------------------------");
        }
        
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
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n", "Kode", "Nama", "Kategori",
        "Stok", "Harga");
        for (int i = 0; i < Brg.length; i++) {
            Brg[i].tampilDataBarang();
        }
    }

    void tampilSemuaDataTransaksi() {
        System.out.printf("%-10s %-15s %-20s %-15s %-15s %-10s %-10s\n", "Kode", "Nama pembeli", "Tanggal pembelian", "Kode barang",
        "Nama barang", "Kuantitas", "Harga");
        for (int i = 0; i < Trs.length; i++) {
            Trs[i].tampilDataTransaksi();
        }
    }

}
