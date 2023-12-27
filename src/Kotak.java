public class Kotak {
    private float sisi;

    Kotak(float sisi){
        this.sisi = sisi;
    };

    public static float luas(Kotak kotak){
        return kotak.sisi * kotak.sisi;

    }

    public float luas(){
        return this.sisi * this.sisi;
    }

}
