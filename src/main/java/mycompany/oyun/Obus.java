
package mycompany.oyun;

class Obus extends Kara {
    public Obus() {
        super(20, 10,"Kara","Obus");
    }
    @Override
    public int getDenizVurusAvantaji() {
        return 5;
    }
}