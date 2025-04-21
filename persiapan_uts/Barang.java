package persiapan_uts;

public class Barang {
    String kode;
    String namaBarang;
    int stok;
    int hargaSatuan;

    Barang(String kode, String namaBarang, int stok, int hargaSatuan) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }

    void kurangiStok(int jumlahDibeli) {
        if (stok >= jumlahDibeli) {
            stok -= jumlahDibeli;
        }
    }

    void tampilData() {
        System.out.printf("%-10s %-15s %-10d %-10d\n", this.kode, this.namaBarang, this.stok,
        this.hargaSatuan);
    }


    
}
