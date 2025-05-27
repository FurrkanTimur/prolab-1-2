
package mycompany.oyun;


class Kfs extends Kara {
    public Kfs() {
        super(10, 10,"Kara","Kfs");
    }
    @Override
    public int getDenizVurusAvantaji() {
        return 10;
    }
    public int getHavaVurusAvantaji() {
        return 20;
    }
}