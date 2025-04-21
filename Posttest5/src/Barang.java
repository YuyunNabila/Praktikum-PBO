public class Barang {
    private String id;                    // ✅ private
    public String nama;                   // ✅ public
    int jumlah;                           // ✅ default (package-private)
    protected String kategori;            // ✅ protected

    private final int hargaAwal;
    private int hargaTertinggi;
    private Anggota pemilik;
    private Anggota penawarTertinggi;
    private int jumlahBid;
    private boolean butuhPersetujuan;
    private boolean sudahDilelang;
    private boolean butuhVerifikasiPembayaran;
    private long waktuBerakhir;

    // === Constructor ===
    public Barang(String id, String nama, int jumlah, String kategori, int hargaAwal, Anggota pemilik,
                  boolean butuhPersetujuan, boolean butuhVerifikasiPembayaran, boolean sudahDilelang) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
        this.kategori = kategori;
        this.hargaAwal = hargaAwal;
        this.hargaTertinggi = hargaAwal;
        this.pemilik = pemilik;
        this.penawarTertinggi = null; // No bid yet
        this.jumlahBid = 0;
        this.butuhPersetujuan = butuhPersetujuan;
        this.butuhVerifikasiPembayaran = butuhVerifikasiPembayaran;
        this.sudahDilelang = sudahDilelang;
        this.waktuBerakhir = System.currentTimeMillis() + (7 * 24 * 60 * 60 * 1000); 
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    // ✅ FINAL METHOD
    public final void tampilkanInfo() {
        System.out.printf("%-10s %-20s %-10s %-15s %15s %-15s%n", 
            "ID", "Nama", "Jumlah", "Kategori", "Harga Awal", "Pemilik");
        System.out.println("-----------------------------------------------------------------------------");

        System.out.printf("%-10s %-20s %-10d %-15s Rp%,12d %-15s%n", 
            id, nama, jumlah, kategori, hargaAwal, pemilik.getNama());
    }

    // === Getter dan Setter untuk id ===
    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
    

    public void setId(String id) {
        this.id = id;
    }

    // Getter dan Setter untuk kategori
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

// Getter untuk hargaAwal

    // Getter dan Setter untuk hargaTertinggi
    public int getHargaTertinggi() {
        return hargaTertinggi;
    }

    public void setHargaTertinggi(int hargaTertinggi) {
        this.hargaTertinggi = hargaTertinggi;
    }

    // Getter dan Setter untuk pemilik
    public Anggota getPemilik() {
        return pemilik;
    }

    public void setPemilik(Anggota pemilik) {
        this.pemilik = pemilik;
    }

    // Getter dan Setter untuk penawarTertinggi
    public Anggota getPenawarTertinggi() {
        return penawarTertinggi;
    }

    public void setPenawarTertinggi(Anggota penawarTertinggi) {
        this.penawarTertinggi = penawarTertinggi;
    }

    // Getter dan Setter untuk jumlahBid
    public int getJumlahBid() {
        return jumlahBid;
    }

    public void setJumlahBid(int jumlahBid) {
        this.jumlahBid = jumlahBid;
    }

    // Getter dan Setter untuk butuhPersetujuan
    public boolean isButuhPersetujuan() {
        return butuhPersetujuan;
    }

    public void setButuhPersetujuan(boolean butuhPersetujuan) {
        this.butuhPersetujuan = butuhPersetujuan;
    }

    // Getter dan Setter untuk sudahDilelang
    public boolean isSudahDilelang() {
        return sudahDilelang;
    }

    public void setSudahDilelang(boolean sudahDilelang) {
        this.sudahDilelang = sudahDilelang;
    }

    // Getter dan Setter untuk butuhVerifikasiPembayaran
    public boolean isButuhVerifikasiPembayaran() {
        return butuhVerifikasiPembayaran;
    }

    public void setButuhVerifikasiPembayaran(boolean butuhVerifikasiPembayaran) {
        this.butuhVerifikasiPembayaran = butuhVerifikasiPembayaran;
    }

    // Getter dan Setter untuk waktuBerakhir
    public long getWaktuBerakhir() {
        return waktuBerakhir;
    }

    public void setWaktuBerakhir(long waktuBerakhir) {
        this.waktuBerakhir = waktuBerakhir;
    }

    // === Tampilkan Informasi Barang ===
  

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
