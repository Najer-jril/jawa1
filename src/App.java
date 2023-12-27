public class App {
    public static void main(String[] args) throws Exception {
        // Siswa siswa1 = new Siswa("siswa 1", 4);
        // Siswa siswa2 = new Siswa("siswa 2", 17);

        // System.out.println(siswa1.getName() + siswa1.getUmur());
        // System.out.println(siswa2.getName() + siswa2.getUmur());
        // // siswa1.displayName();
        // // siswa2.displayName();
        // Siswa.displayTotal();

        // Mahasiswa siswa1 = new Mahasiswa("siswa 1", 2.6f);
        // Mahasiswa siswa2 = new Mahasiswa(4, 3.4f);
        
        // siswa1.getName();
        // siswa1.setName("siswa3");
        // siswa1.getName();
        // siswa2.getName();

        // Kotak kotak1 = new Kotak(6.5f);

        // System.out.println(Kotak.luas(kotak1));
        // System.out.println(kotak1.luas());
        
        Kampus kampus1 = new Kampus("ITK", "Balikpapan", 'S');
        Kampus kampus2 = new Kampus("ITS", "Surabaya", 'Z');
        kampus1.ToString();
        kampus2.ToString();

        Mahasiswa mhs1 = new Mahasiswa("siswa1", kampus1, 3.5f);
        mhs1.ToString();
    }
}
