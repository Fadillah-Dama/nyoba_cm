package persiapan_uts;

public class Struk {
    Barang brg;
    int jumlah;

    Struk(Barang brg, int jumlah) {
        this.brg = brg;
        this.jumlah = jumlah;
    }

    int subtotal() {
        return brg.hargaSatuan * jumlah;
    }

    void tampilStruk() {
        System.out.printf("%-10s %-15s %-10d %-10d %-10d\n", this.brg.kode, this.brg.namaBarang, this.jumlah,
        this.brg.hargaSatuan, subtotal());
    }
}
