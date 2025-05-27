  package mycompany.oyun;

import java.util.ArrayList;
import java.util.Random;
import mycompany.oyun.userID;
import mycompany.oyun.KartSec;

public class Oyun  extends javax.swing.JFrame {
    
                         


    public static ArrayList<SavasAraclari> oyuncuKartDizisi = new ArrayList<>();
    public static ArrayList<SavasAraclari> bilgisayarKartDizisi = new ArrayList<>();
    public static ArrayList<SavasAraclari> oyuncuSavasacakKartDizisi = new ArrayList<>();
    public static ArrayList<SavasAraclari> bilgisayarSavasacakKartDizisi = new ArrayList<>();
  
   static String player1name;
   static int player1puan ;
   
   
    
    public static void main(String[] args) {
    	
    	userID user = new userID();

    	
    	
        new Menu().setVisible(true);
       
        
        
      

        
  			
         }
    
    
    
    public int saldiri_hesaplama(int x ,int j, int a) {
    	KartSec kart = new KartSec();
    	userID user = new userID();
    	
    	Ucak Ucak = new Ucak();
    	Siha Siha = new Siha();
    	Obus Obus = new Obus();
    	Kfs Kfs = new Kfs();
    	Firkateyn Firkateyn = new Firkateyn();
    	Sida Sida = new Sida();
    	
    	
    	
    	// insan saldirisini hesaplama;
    	if(x == 1) {
    		if(kart.SeciliKartlar.get(j).isim.equals("Ucak")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Kara")) {
    				int f = Ucak.getKaraVurusAvantaji();
    				return a + Siha.vurus;
    			}else {
    				return Siha.vurus;
    			}
    		}else if(kart.SeciliKartlar.get(j).isim.equals("Siha")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Kara")) {
    				int f = Siha.getKaraVurusAvantaji();
    				return f + Siha.vurus;
    			}else if(user.bilgisayarKartDizisi.get(a).sinif.equals("Deniz")) {
    				int f = Siha.getDenizVurusAvantaji();
    				return f + Siha.vurus;
    			}else {
    				return Siha.vurus;
    			}
    		}else if(kart.SeciliKartlar.get(j).isim.equals("Obus")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Deniz")) {
    				int f = Obus.getDenizVurusAvantaji();
    				return f + Obus.vurus;
    			}else {
    				return Obus.vurus;
    			}
    		}else if(kart.SeciliKartlar.get(j).isim.equals("Kfs")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Deniz")) {
    				int f = Kfs.getDenizVurusAvantaji();
    				return f + Kfs.vurus;
    			}else if(user.bilgisayarKartDizisi.get(a).sinif.equals("Hava")) {
    				int f = Kfs.getHavaVurusAvantaji();
    				return f + Kfs.vurus;
    			}else {
    				return Kfs.vurus;
    			}
    		}else if(kart.SeciliKartlar.get(j).isim.equals("Firkateyn")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Hava")) {
    				int f = Firkateyn.getHavaVurusAvantaji();
    				return f + Firkateyn.vurus;
    			}else {
    				return Firkateyn.vurus;
    			}
    		}else if(kart.SeciliKartlar.get(j).isim.equals("Sida")) {
    			if(user.bilgisayarKartDizisi.get(a).sinif.equals("Kara")) { 
    				return Siha.getKaraVurusAvantaji() + Sida.vurus;
    			}else if(user.bilgisayarKartDizisi.get(a).sinif.equals("Hava")) {;
    				return Siha.getDenizVurusAvantaji() + Sida.vurus;
    			}else {
    				return Sida.vurus;
    			}
    		}
    	}else if(x == 2) {
    		if(user.bilgisayarKartDizisi.get(a).isim.equals("Ucak")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Kara")) {
    				return Ucak.vurus + Ucak.getKaraVurusAvantaji();
    			}else {
    				return Ucak.vurus;
    			}
    		}else if(user.bilgisayarKartDizisi.get(a).isim.equals("Siha")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Kara")) {
    				return Siha.vurus + Siha.getKaraVurusAvantaji();
    			}else if(kart.SeciliKartlar.get(j).sinif.equals("Deniz")) {
    				return Siha.vurus + Siha.getDenizVurusAvantaji();
    			}else {
    				return Siha.vurus;
    			}
    		}else if(user.bilgisayarKartDizisi.get(a).isim.equals("Obus")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Deniz")) {
    				return Obus.vurus + Obus.getDenizVurusAvantaji();
    			}else {
    				return Obus.vurus;
    			}
    		}else if(user.bilgisayarKartDizisi.get(a).isim.equals("Kfs")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Deniz")) {
    				return Kfs.vurus + Kfs.getDenizVurusAvantaji();
    			}else if(kart.SeciliKartlar.get(j).sinif.equals("Hava")) {
    				return Kfs.vurus + Kfs.getHavaVurusAvantaji();
    			}else {
    				return Kfs.vurus;
    			}
    		}else if(user.bilgisayarKartDizisi.get(a).isim.equals("Firkateyn")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Hava")) {
    				return Firkateyn.getHavaVurusAvantaji() + Firkateyn.vurus;
    			}else {
    				return Firkateyn.vurus;
    			}
    		}else if(user.bilgisayarKartDizisi.get(a).isim.equals("Sida")) {
    			if(kart.SeciliKartlar.get(j).sinif.equals("Kara")) {
    				return 20;
    			}else if(kart.SeciliKartlar.get(j).sinif.equals("Hava")){
    				return 20 ;
    			}else {
    				return 10 ;
    			}
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	return 1;
    }
    
    
}  
                   
         
      

