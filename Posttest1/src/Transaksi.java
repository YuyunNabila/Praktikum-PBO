import java.util.Date;
public class Transaksi {
    Barang barang;
    String penawar;
    int harga;
    Date tanggal;

    public Transaksi(Barang barang, String penawar, int harga, Date tanggal) {
        this.barang = barang;
        this.penawar = penawar;
        this.harga = harga;
        this.tanggal = tanggal;
    }

    public void tampilkanInfo() {
        System.out.printf("%-20s %-15s %-15s %15s %-15s%n", 
            "Barang", "Penjual", "Penawar", "Harga (Rp)", "Tanggal");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s Rp%,12d %-15s%n", 
            barang.nama, barang.pemilik, penawar, harga, tanggal);
    }
}