// Kelas Anggota
public class Anggota {
    String id, nama, password, noHp;

    public Anggota(String id, String nama, String password, String noHp) {
        this.id = id;
        this.nama = nama;
        this.password = password;
        this.noHp = noHp;
    }

    public void tampilkanInfo() {
        System.out.printf("%-10s %-20s %-15s %-10s%n", id, nama, noHp, password);
        System.out.println("------------------------------------------------------------");

    }
}
