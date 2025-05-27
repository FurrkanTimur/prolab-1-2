
package mycompany.oyun;


class Siha extends Hava {
    public Siha() {
        super(15, 10,"Hava","Siha");
    }
    @Override
    public int getKaraVurusAvantaji() {
        return 10;
    }
    public int getDenizVurusAvantaji()
    {
        return 10;
    }
}