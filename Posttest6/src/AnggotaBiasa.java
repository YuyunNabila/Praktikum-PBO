public class AnggotaBiasa extends Anggota {
    public AnggotaBiasa(String id, String nama, String noHp, String password) {
        super(id, nama, noHp, password);
    }

    @Override
    public String getJenisAnggota() {
        return "Biasa";
    }

    @Override
    public void tampilkanInfo(boolean lengkap) {
        if (lengkap) {
            System.out.println("ID: " + getId());
            System.out.println("Nama: " + getNama());
            System.out.println("No HP: " + getNoHp());
            System.out.println("Password: " + getPassword());
        } else {
            System.out.println("Nama: " + getNama());
        }
    }
}
