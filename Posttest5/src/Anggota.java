public abstract class Anggota {
    private String id;
    protected String nama;
    String noHp;
    public String password;

    public Anggota(String id, String nama, String password, String noHp) {
        this.id = id;
        this.nama = nama;
        this.password = password;
        this.noHp = noHp;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getNoHp() { return noHp; }
    public void setNoHp(String noHp) { this.noHp = noHp; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getJenisAnggota() {
        return this instanceof AnggotaPremium ? "Premium" : "Biasa";
    }

    public boolean isPremium() {
        return this instanceof AnggotaPremium;
    }

    // Method abstract yang WAJIB di-override
    public abstract void tampilkanInfo(boolean tampilkanPassword);
}
