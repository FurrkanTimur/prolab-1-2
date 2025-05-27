
package mycompany.oyun;

abstract class Hava extends SavasAraclari {
    public Hava(int dayaniklik, int vurus,String sinif, String isim) {
        super(dayaniklik, vurus, "Hava",isim);
    }
    public abstract int getKaraVurusAvantaji();
}