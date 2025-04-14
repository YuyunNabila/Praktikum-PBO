public class AnggotaBiasa extends Anggota {
    public AnggotaBiasa(String id, String nama, String noHp, String password) {
        super(id, nama, noHp, password);
    }

    @Override
    public String getJenisAnggota() {
        return "Biasa";
    }
}
