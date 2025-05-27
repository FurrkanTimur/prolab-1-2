
package mycompany.oyun;

import java.util.Random;

public class OyuncuSinifi{
	public static int oyuncuID;
	protected String oyuncuAdi;
	protected int skor =0;
	public OyuncuSinifi(int oyuncuID , int skor , String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
		this.oyuncuID = oyuncuID ;
		this.skor = skor ;
	}
	public String kartListesi(int puan) {
		Random rand = new Random();
		
		if(puan >= 20) {
			int a = rand.nextInt(6);
			a++;
			if(a == 1) {
				return "Obus";
			}else if(a == 2) {
				return "Firkateyn";
			}else if(a == 3) {
				return "Ucak";
			}else if(a == 4) {
				return "Siha";
			}else if(a == 5) {
				return "Sida";
			}else if(a == 6) {
				return "Kfs";
			}
		}else if(puan < 20 ) {
			int b = rand.nextInt(3);
			b++;
			if(b == 1) {
				return "Obus";
			}else if(b == 2) {
				return "Firkateyn";
			}else if(b == 3) {
				return "Ucak";
			}
		}
		
		return "Kart gönderilemedi.";	

	}
  
	public void SkorGoster() {
		System.out.println(" skor : " + this.skor);	
	}
	public int kartSec(String bilgisayarKartlar[] , int i , int k) {
		
		Random rand = new Random();
		
		if(i == 1) {
			if(k == 0 ) {
				return 0;
			}else if(k == 1) {
				return 1;
			}else if(k == 2) {
				return 2;
			}
			
		}else if(i == 2) {
			k = k + 3;
			if(k == 3) {
				return 3;
			}else if(k == 4) {
				return 4;
			}else if(k == 5) {
				return 5;
			}
		}else if(i == 3) {
			 k = k+6;
			 if(k==6) {
				 return 6;
			 }else if(k == 7) {
				 return 7;
			 }else {
				 while(true) {
					 int f = rand.nextInt(6);
					 if(userID.bilgisayarKartDizisi.get(f).isim != null) {
						 return f;
					 }
				 }
			 }
		}else if(i == 4) {
                
			k = k + 9;
			if(k == 9) {
				return 8;
			}else if(k == 10) {
                             while(true) {
					 int f = rand.nextInt(7);
					 if(userID.bilgisayarKartDizisi.get(f).isim != null) {
                                            
						 return f;
					 }
				 }
				
			 }else if (k==11) {
				while(true) {
					 int f = rand.nextInt(7);
                                         
                                          if(userID.bilgisayarKartDizisi.get(f).isim != null) {
                                              
                                            
						 return f;
					 }
				 }
				
			}
		}
		else if(i == 5) {
                
			k = k + 12;
			if(k == 12) {
				return 9;
			}else if(k == 13) {
                             while(true) {
					 int f = rand.nextInt(8);
					 if(userID.bilgisayarKartDizisi.get(f).isim != null) {
                                            
						 return f;
					 }
				 }
				
			 }else if (k==14) {
				while(true) {
					 int f = rand.nextInt(8);
                                         
                                          if(userID.bilgisayarKartDizisi.get(f).isim != null) {
                                              
                                           
						 return f;
					 }
				 }
				
			}
		}
		
		
		
		
		return 1234;
			
		
	}
	public static String kartEkle(int seviyePuani)
	{
		Random rand = new Random();
		
		if(seviyePuani < 20) {
			int a = rand.nextInt(3);
			a++;
			if(a == 1) {
				return "Ucak";
			}else if (a ==2) {
				return "Obus";
			}else if(a ==3) {
				return "Firkateyn";
			}
		}else if(seviyePuani >= 20) {
			int a = rand.nextInt(6);
			a++;
			if(a == 1) {
				return "Ucak";
			}else if(a == 2) {
				return "Siha";
			}else if(a == 3) {
				return "Obus";
			}else if(a == 4) {
				return "Kfs";
			}else if(a == 5) {
				return "Firkateyn";
			}else if(a == 6) {
				return "Sida";
			}
		}
		
		
		
		
		
		
		
		return "AAAAA";
	}
	public static void yeniKartlaNesneOlustur(String yeniKart , int i , String tip) {

		   i = i+6;
		   if(tip.equals("Oyuncu")) {
			   if(yeniKart.equals("Ucak")) {
				userID.oyuncuKartDizisi.set(i, new Ucak());
			}else if(yeniKart.equals("Siha")) {
				userID.oyuncuKartDizisi.set(i, new Siha());
			}else if (yeniKart.equals("Obus")) {
				userID.oyuncuKartDizisi.set(i, new Obus());
			}else if(yeniKart.equals("Kfs")) {
				userID.oyuncuKartDizisi.set(i, new Kfs());
			}else if(yeniKart.equals("Firkateyn")) {
				userID.oyuncuKartDizisi.set(i, new Firkateyn());
			}else if(yeniKart.equals("Sida")) {
				userID.oyuncuKartDizisi.set(i, new Sida());
			}
		   }else if(tip.equals("Bilgisayar")) {
			   if(yeniKart.equals("Ucak")) {
				   userID.bilgisayarKartDizisi.set(i, new Ucak());
			   }else if(yeniKart.equals("Siha")) {
				   userID.bilgisayarKartDizisi.set(i, new Siha());
			   }else if(yeniKart.equals("Obus")) {
				   userID.bilgisayarKartDizisi.set(i, new Obus());
			   }else if(yeniKart.equals("Kfs")) {
				   userID.bilgisayarKartDizisi.set(i, new Kfs());
			   }else if(yeniKart.equals("Firkateyn")) {
				   userID.bilgisayarKartDizisi.set(i, new Firkateyn());
			   }else if(yeniKart.equals("Sida")) {
				   userID.bilgisayarKartDizisi.set(i, new Sida());
			   }
		   }
			
		
	}
	
	
}



