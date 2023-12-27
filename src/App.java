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

        // Kampus kampus1 = new Kampus("ITK", "Balikpapan", 'S');
        // Kampus kampus2 = new Kampus("ITS", "Surabaya", 'Z');
        // kampus1.ToString();
        // kampus2.ToString();

        // Mahasiswa mhs1 = new Mahasiswa("siswa1", kampus1, 3.5f);
        // mhs1.ToString();

        Kategori kategori1 = new Kategori("Kategori 1");
        Kategori kategori2 = new Kategori("Kategori 2");

        Sanksi sanksi1 = new Sanksi("Sanksi 1", 1);
        Sanksi sanksi2 = new Sanksi("Sanksi 2", 2);

        Pelanggaran pelanggaran1 = new Pelanggaran("Deskripsi 1", kategori1, sanksi1);
        Pelanggaran pelanggaran2 = new Pelanggaran("Deskripsi 2", kategori2, sanksi2);

        Mhs mhs1 = new Mhs("1123", "najril", pelanggaran1);
        Mhs mhs2 = new Mhs("1122", "nijril", pelanggaran2);

        System.out.println(kategori1.getJenis());
        System.out.println(kategori1.toString());
        System.out.println(kategori2.getJenis());
        System.out.println(kategori2.toString());
        System.out.println();

        System.out.println(sanksi1.getKeterangan());
        System.out.println(sanksi1.getPoin());
        System.out.println(sanksi1.toString());
        System.out.println(sanksi2.getKeterangan());
        System.out.println(sanksi2.getPoin());
        System.out.println(sanksi2.toString());
        System.out.println();

        System.out.println(pelanggaran1.getDeskripsi());
        System.out.println(pelanggaran1.getKategori());
        System.out.println(pelanggaran1.getSanksi());
        System.out.println(pelanggaran1.toString());
        System.out.println(pelanggaran2.getDeskripsi());
        System.out.println(pelanggaran2.getKategori());
        System.out.println(pelanggaran2.getSanksi());
        System.out.println(pelanggaran2.toString());
        System.out.println();

        System.out.println(mhs1.getNIM());
        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getPelanggaran());
        System.out.println(mhs1.toString());
        System.out.println(mhs2.getNIM());
        System.out.println(mhs2.getNama());
        System.out.println(mhs2.getPelanggaran());
        System.out.println(mhs2.toString());
    }
}
