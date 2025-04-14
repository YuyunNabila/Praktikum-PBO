import java.util.Date;

public class Transaksi {
    private Barang barang;             // ✅ private
    protected String penawar;          // ✅ protected
    int harga;                         // ✅ default
    public Date tanggal;               // ✅ public

    // Constructor
   // Add a new constructor to match the required parameters
    public Transaksi(Barang barang, Anggota penawar, int harga, Date tanggal) {
        // Initialize fields using the provided parameters
        this.barang = barang;
        this.penawar = penawar.getNama(); // Assuming penawar is stored as a String (name)
        this.harga = harga;
        this.tanggal = tanggal;
    }

    // === Getter dan Setter untuk barang ===
    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    // === Getter dan Setter untuk penawar ===
    public String getPenawar() {
        return penawar;
    }

    public void setPenawar(String penawar) {
        this.penawar = penawar;
    }

    // === Getter dan Setter untuk harga ===
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // === Getter dan Setter untuk tanggal ===
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    // Menampilkan informasi transaksi
    public void tampilkanInfo() {
        System.out.printf("%-20s %-15s %-15s %15s %-15s%n", 
            "Barang", "Penjual", "Penawar", "Harga (Rp)", "Tanggal");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s Rp%,12d %-15s%n", 
            barang.getNama(), barang.getPemilik(), penawar, harga, tanggal);
    }
}
