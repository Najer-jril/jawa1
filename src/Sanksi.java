public class Sanksi {
    private String keterangan;
    private int poin;

    Sanksi(String keterangan, int poin) {
        this.keterangan = keterangan;
        this.poin = poin;
    }

    public String getKeterangan() {
        return this.keterangan;
    }

    public void setketerangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getPoin() {
        return this.poin;
    }

    public void setPoin(int poin) {
        this.poin = poin;
    }

    public String toString() {
        return "Sanksi : " + this.keterangan + ", " + this.poin;
    }

}
