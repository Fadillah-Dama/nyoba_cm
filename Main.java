import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceClass list = new ServiceClass();

        Barang brg1 = new Barang("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang brg2 = new Barang("Br002", "You C1000", "Minuman", 10, 7000);
        Barang brg3 = new Barang("Br003", "Teh Pucuk", "Minuman", 10, 4000);
        Barang brg4 = new Barang("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang brg5 = new Barang("Br005", "Mama Lemon", "Sabun", 10, 1000);

        list.tambahDataBarang(brg1);
        list.tambahDataBarang(brg2);
        list.tambahDataBarang(brg3);
        list.tambahDataBarang(brg4);
        list.tambahDataBarang(brg5);

        TransaksiPembelian tr1 = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, brg1, brg1.harga);
        TransaksiPembelian tr2 = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 2, brg2, brg2.harga);
        TransaksiPembelian tr3 = new TransaksiPembelian("Tr003", "Siska", "23-04-2024", 3, brg3, brg3.harga);
        TransaksiPembelian tr4 = new TransaksiPembelian("Tr004", "MeiMei", "23-04-2024", 1, brg3, brg3.harga);
        TransaksiPembelian tr5 = new TransaksiPembelian("Tr005", "Ihsan", "24-04-2024", 1, brg2, brg2.harga);
        
        list.tambahDataTransaksi(tr1);
        list.tambahDataTransaksi(tr2);
        list.tambahDataTransaksi(tr3);
        list.tambahDataTransaksi(tr4);
        list.tambahDataTransaksi(tr5);

        while (true) {
            System.out.println("Pilih MENU : ");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. exit");
            System.out.print("Pilih Menu (1-5) :");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
            case 1:
                list.tampilSemuaDataBarang();
                break;
            case 2:
                list.tampilSemuaDataTransaksi();
                break;
            case 3:
                System.out.print("Masukkan kode barang : ");
                String key = sc.nextLine();
                list.searching(key);
                break;
            case 4:
                System.out.println("Sorting Tranksaksi ASC sesuai kode barang");
                list.sorting();
                list.tampilSemuaDataTransaksi();
                break;
            case 5:
                System.out.println("Program dihentikan");
                return;
            default:
                break;
        }
            
        }
    }
}
