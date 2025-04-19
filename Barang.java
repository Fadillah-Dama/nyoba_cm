public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stok;
    int harga;

    Barang(String kodeBarang, String nama, String kategori, int stok, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.harga = harga;
    }

    void tampilDataBarang() {
        System.out.printf("%-10s %-15s %-10s %-10d %-10d\n", this.kodeBarang, this.nama, this.kategori,
        this.stok, this.harga);
    }
}
