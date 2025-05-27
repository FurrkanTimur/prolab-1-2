
package mycompany.oyun;

abstract class Kara extends SavasAraclari {
    public Kara(int dayaniklik, int vurus,String sinif,String isim) {
        super(dayaniklik, vurus, "Kara",isim);
    }
    public abstract int getDenizVurusAvantaji();
}
