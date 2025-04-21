public class TransaksiPembelian {
   String kodeTransaksi;
   String namaPembeli;
   String tanggalPembelian;
   int qty;
   Barang brg;
   

   TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg){
    this.kodeTransaksi = kodeTransaksi;
    this.namaPembeli = namaPembeli;
    this.tanggalPembelian = tanggalPembelian;
    this.qty = qty;
    this.brg = brg;
   }

   void tampilDataTransaksi(){
    System.out.printf("%-10s %-15s %-20s %-15s %-15s %-10d %-10s\n", this.kodeTransaksi, this.namaPembeli, this.tanggalPembelian,
    this.brg.kodeBarang, this.brg.nama, this.qty, this.brg.harga);
   }
}
