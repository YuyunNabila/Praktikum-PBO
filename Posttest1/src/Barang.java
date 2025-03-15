
public class Barang {
    String id;
    String nama;
    int jumlah;
    String kategori;
    int hargaAwal;
    String pemilik; 
    boolean butuhPersetujuan;
    boolean sudahDilelang;
    boolean butuhVerifikasiPembayaran;
    int hargaTertinggi;
    String penawarTertinggi;
    int jumlahBid;
    long waktuBerakhir;

    public Barang(String id, String nama, int jumlah, String kategori, int hargaAwal, String pemilik, boolean butuhPersetujuan, boolean butuhVerifikasiPembayaran, boolean sudahDilelang) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.hargaAwal = hargaAwal;
        this.pemilik = pemilik;
        this.butuhPersetujuan = butuhPersetujuan;
        this.butuhVerifikasiPembayaran = butuhVerifikasiPembayaran;
        this.sudahDilelang = sudahDilelang;
        this.hargaTertinggi = hargaAwal;
        this.penawarTertinggi = "Belum ada bid";
        this.jumlahBid = 0;
        this.waktuBerakhir = System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000); 
    }

    public void tampilkanInfo() {

        System.out.printf("%-10s %-20s %-10s %-15s %15s %-15s%n", 
            "ID", "Nama", "Jumlah", "Kategori", "Harga Awal", "Pemilik");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.printf("%-10s %-20s %-10d %-15s Rp%,12d %-15s%n", 
            id, nama, jumlah, kategori, hargaAwal, pemilik);
    }
    
    public void tampilkanInfoLelang() {
        long waktuSekarang = System.currentTimeMillis();
        long sisaWaktu = (waktuBerakhir - waktuSekarang) / 1000;
        String statusWaktu = (sisaWaktu > 0) ? (sisaWaktu + " detik tersisa") : "Lelang sudah berakhir";

        System.out.printf("%-10s %-20s %15s %15s %-20s %-10s %-20s%n", 
            "ID", "Nama", "Harga Awal", "Harga Tertinggi", "Penawar Tertinggi", "Jumlah Bid", "Status Waktu");
        System.out.println("-----------------------------------------------------------------------------------------------");

        System.out.printf("%-10s %-20s Rp%,12d Rp%,12d %-20s %-10d %-20s%n", 
            id, nama, hargaAwal, hargaTertinggi, penawarTertinggi, jumlahBid, statusWaktu);
    }
}