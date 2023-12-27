public class Siswa {
    private static int total = 0;

    private String name;
    private int umur;

    Siswa(String name, int umur) {
        this.name = name;
        this.umur = umur;

        total += 1;
    }

    public String getName() {
        return name;
    }

    public int getUmur() {
        return umur;
    }

    public void displayName() {
        System.out.println(name);
    }

    public static void displayTotal() {
        System.out.println(total);
    }
}