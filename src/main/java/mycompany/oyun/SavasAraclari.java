
package mycompany.oyun;
abstract class SavasAraclari {
    protected int seviyePuani = userID.oyuncuPuan;
    protected int dayaniklik;
    protected int vurus;
    protected String sinif;
    String isim;
    public SavasAraclari(int dayaniklik, int vurus, String sinif,String isim) {
        this.dayaniklik = dayaniklik;
        this.vurus = vurus;
        this.sinif = sinif;
        this.isim = isim;
    }
}   