
package mycompany.oyun;


class Sida extends Deniz {
    public Sida() {
        super(15, 10,"Deniz","Sida");
    }
    @Override
    public int getHavaVurusAvantaji() {
        return 10;
    }
    public int getKaraVurusAvantaji() {
        return 10;
    }
}