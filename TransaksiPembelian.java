public class TransaksiPembelian {
   String kodeTransaksi;
   String namaPembeli;
   String tanggalPembelian;
   int qty;
   Barang brg;
   int harga;
   

   TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg, int harga){
    this.kodeTransaksi = kodeTransaksi;
    this.namaPembeli = namaPembeli;
    this.tanggalPembelian = tanggalPembelian;
    this.qty = qty;
    this.brg = brg;
    this.harga = harga;
   }

   void tampilDataTransaksi(){
    System.out.printf("%-10s %-15s %-20s %-15s %-10d %-10s\n", this.kodeTransaksi, this.namaPembeli, this.tanggalPembelian,
    this.brg.nama, this.qty, this.harga);
   }
}
