public class AnggotaPremium extends Anggota implements PointReward {
    private int poinLoyalti;

    public AnggotaPremium(String id, String nama, String noHp, String password) {
        super(id, nama, password, noHp);
        this.poinLoyalti = 0;
    }

    public int getPoinLoyalti() {
        return poinLoyalti;
    }

    public void tambahPoin(int poin) {
        this.poinLoyalti += poin;
    }

    public void tampilkanPoin() {
        System.out.println("Poin saat ini: " + poinLoyalti);
    }

    public void beriBonus(int poin) {
        System.out.println("Bonus " + poin + " poin diberikan!");
        this.poinLoyalti += poin;
    }

    @Override
    public String getJenisAnggota() {
        return "Premium";
    }

    @Override
    public void tampilkanInfo(boolean tampilkanPassword) {
        if (tampilkanPassword) {
            System.out.printf("ID: %s, Nama: %s, No HP: %s, Password: %s, Poin: %d%n", 
                getId(), getNama(), getNoHp(), getPassword(), poinLoyalti);
        } else {
            System.out.printf("ID: %s, Nama: %s, No HP: %s, Poin: %d%n", 
                getId(), getNama(), getNoHp(), poinLoyalti);
        }
    }
}
