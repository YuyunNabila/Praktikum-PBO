public class AnggotaPremium extends Anggota {
    private int poinLoyalti;

    public AnggotaPremium(String id, String nama, String noHp, String password) {
        super(id, nama, noHp, password);
        this.poinLoyalti = 0;
    }
    

    public int getPoinLoyalti() {
        return poinLoyalti;
    }

    public void tambahPoin(int poin) {
        this.poinLoyalti += poin;
    }

    @Override
    public String getJenisAnggota() {
        return "Premium";
    }
}
