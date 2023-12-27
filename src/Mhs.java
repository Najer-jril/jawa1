public class Mhs {
    private String nim;
    private String nama;
    private Pelanggaran pelanggaran;

    Mhs(String nim, String nama, Pelanggaran pelanggaran){
        this.nim = nim;
        this.nama = nama;
        this.pelanggaran = pelanggaran;
    }

    public String getNIM(){
        return this.nim;
    }

    public void setNIM(String nim){
        this.nim = nim;
    }

    public String getNama(){
        return this.nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public Pelanggaran getPelanggaran(){
        return this.pelanggaran;
    }

    public void setPelanggaran(Pelanggaran pelanggaran){
        this.pelanggaran = pelanggaran;
    }

    public String toString(){
        return "Mahasiswa : " + this.nim + ", " + this.nama + ", " + this.pelanggaran.getDeskripsi() + ", " + this.pelanggaran.getKategori() + ", " + this.pelanggaran.getSanksi() + ", " + this.pelanggaran.getSanksi();
    }
}
