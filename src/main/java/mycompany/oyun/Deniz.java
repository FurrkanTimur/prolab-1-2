package mycompany.oyun;


abstract class Deniz extends SavasAraclari {
    public Deniz(int dayaniklik, int vurus,String sinif,String isim) {
        super(dayaniklik, vurus,"Deniz",isim);
    }
    public abstract int getHavaVurusAvantaji();
}