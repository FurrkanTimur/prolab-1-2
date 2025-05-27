
package mycompany.oyun;


class Ucak extends Hava {
    public Ucak() {
        super(20, 10,"Hava","Ucak");
    }
    @Override
    public int getKaraVurusAvantaji() {
        return 10;
    }
}