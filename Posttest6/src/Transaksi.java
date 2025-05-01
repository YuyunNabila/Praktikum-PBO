import java.util.Date;

public final class Transaksi {
    private Barang barang;             
    protected String penawar;        
    int harga;                     
    public Date tanggal;            


    public Transaksi(Barang barang, Anggota penawar, int harga, Date tanggal) {

        this.barang = barang;
        this.penawar = penawar.getNama(); 
        this.harga = harga;
        this.tanggal = tanggal;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public String getPenawar() {
        return penawar;
    }

    public void setPenawar(String penawar) {
        this.penawar = penawar;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public void tampilkanInfo() {
        System.out.printf("%-20s %-15s %-15s %15s %-15s%n", 
            "Barang", "Penjual", "Penawar", "Harga (Rp)", "Tanggal");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%-20s %-15s %-15s Rp%,12d %-15s%n", 
            barang.getNama(), barang.getPemilik(), penawar, harga, tanggal);
    }
}
