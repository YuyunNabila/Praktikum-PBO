public class Anggota {
    private String id;            // ✅ private: akses melalui getter/setter
    protected String nama;        // ✅ protected: bisa diakses subclass/package
    String noHp;                  // ✅ default/package-private
    public String password;       // ✅ public: bebas diakses

    // Constructor
    public Anggota(String id, String nama, String password, String noHp) {
        this.id = id;
        this.nama = nama;
        this.password = password;
        this.noHp = noHp;
    }

    // === Getter dan Setter untuk id ===
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // === Getter dan Setter untuk nama ===
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // === Getter dan Setter untuk noHp ===
    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    // === Getter dan Setter untuk password ===
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Tampilkan info dengan format rapi
    public void tampilkanInfo() {
        System.out.printf("%-10s %-20s %-15s %-10s%n", id, nama, noHp, password);
        System.out.println("------------------------------------------------------------");
    }
}
