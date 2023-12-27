public class Kampus {
    private String nama;
    private String alamat;
    private char akreditas;

    public Kampus(String nama, String alamat, char akreditas){
        this.nama = nama;
        this.alamat = alamat;
        this.akreditas = akreditas;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String alamat(){
        return this.alamat;
    }

    public char akreditas(){
        return this.akreditas;
    }

    public void ToString(){
        System.out.println("Kampus (" + this.nama + ", " + this.alamat + ", " + this.akreditas + ")");
    }

}
