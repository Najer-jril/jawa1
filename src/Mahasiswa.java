public class Mahasiswa {
    private String nama;
    private Kampus kampus;
    private float ipk;
    
    Mahasiswa(String nama, Kampus kampus, float ipk){
        this.nama = nama;
        this.kampus = kampus;
        this.ipk = ipk;
    }
    
    public void getName(){
        System.out.println(this.nama);
    }

    public void setName(String name){
        this.nama = name;
    }

    public void getIPK(){
        System.out.println(this.ipk);
    }

    public void getKampus(){
        System.out.println(this.kampus);
    }

    public void ToString(){
        System.out.println("Mahasiswa (" + this.nama + ", " + this.kampus.getNama() + ", " + this.ipk + ")");
    }

}
