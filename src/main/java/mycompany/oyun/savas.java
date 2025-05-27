package mycompany.oyun;

import javax.swing.ImageIcon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static mycompany.oyun.savasAni.i;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class savas {
	
	ImageIcon ucak = new ImageIcon("Ucak.png");
    ImageIcon kfs = new ImageIcon("Kfs.png");
    ImageIcon obus = new ImageIcon("Obus.png");
    ImageIcon firka = new ImageIcon("Firkateyn.png");
    ImageIcon sida = new ImageIcon("Sida.png");
    ImageIcon siha = new ImageIcon("Siha.png");
    ImageIcon bos = new ImageIcon("bos.png");
    ImageIcon kapa = new ImageIcon("kapali.png");
   
	
	
	public static int i = 0 ;
	public static int bilgisayarKalanKartDayaniklilik = 0 ;
	public static int oyuncuKalanKartDayaniklilik = 0 ;
	public static void main(String[] args) {
		
		

	}
	
	
	public void savas() {
        String[] bilgisayarSavasacakKart = new String[3];
		Oyun Oyun = new Oyun() ;
		OyuncuSinifi bilgisayar = new OyuncuSinifi(1234,0,"bilgisayar");
		userID user = new userID();
		KartSec kart = new KartSec();
		 
                    
	savasAni ekran=new savasAni();
        ekran.setVisible(true);
        
        
        if(kart.SeciliKartlar.get(i*3 + 0).isim == "Ucak")
      {   savasAni.jLabel8.setIcon(ucak);
      }else if (kart.SeciliKartlar.get(i*3 + 0).isim == "Siha")
            {     savasAni.jLabel8.setIcon(siha);
      } else if (kart.SeciliKartlar.get(i*3 + 0).isim == "Sida")
            {     savasAni.jLabel8.setIcon(sida);
      } else if (kart.SeciliKartlar.get(i*3 + 0).isim == "Firkateyn")
            {     savasAni.jLabel8.setIcon(firka);
      } else if (kart.SeciliKartlar.get(i*3 + 0).isim == "Obus")
            {     savasAni.jLabel8.setIcon(obus);
      } else if (kart.SeciliKartlar.get(i*3 + 0).isim == "Kfs")
            {     savasAni.jLabel8.setIcon(kfs);
      }else if (kart.SeciliKartlar.get(i*3 + 0).isim == null)
            {     savasAni.jLabel8.setIcon(bos);
      }
      //2.kart
      if(kart.SeciliKartlar.get(i*3 + 1).isim == "Ucak")
      {     savasAni.jLabel9.setIcon(ucak);
      }else if (kart.SeciliKartlar.get(i*3 + 1).isim == "Siha")
            {    savasAni.jLabel9.setIcon(siha);
      } else if (kart.SeciliKartlar.get(i*3 + 1).isim == "Sida")
            {   savasAni.jLabel9.setIcon(sida);
      } else if (kart.SeciliKartlar.get(i*3 + 1).isim == "Firkateyn")
            {    savasAni.jLabel9.setIcon(firka);
      } else if (kart.SeciliKartlar.get(i*3 + 1).isim == "Obus")
            {    savasAni.jLabel9.setIcon(obus);
      } else if (kart.SeciliKartlar.get(i*3 + 1).isim == "Kfs")
            {    savasAni.jLabel9.setIcon(kfs);
      }else if (kart.SeciliKartlar.get(i*3 + 1).isim == null)
            {    savasAni.jLabel9.setIcon(bos);
      }
      //3.kart
      if(kart.SeciliKartlar.get(i*3 + 2).isim == "Ucak")
      {    savasAni.jLabel10.setIcon(ucak);
      }else if (kart.SeciliKartlar.get(i*3 + 2).isim == "Siha")
            {    savasAni.jLabel10.setIcon(siha);
      } else if (kart.SeciliKartlar.get(i*3 + 2).isim == "Sida")
            {    savasAni.jLabel10.setIcon(sida);
      } else if (kart.SeciliKartlar.get(i*3 + 2).isim == "Firkateyn")
            {    savasAni.jLabel10.setIcon(firka);
      } else if (kart.SeciliKartlar.get(i*3 + 2).isim == "Obus")
            {    savasAni.jLabel10.setIcon(obus);
      } else if (kart.SeciliKartlar.get(i*3 + 2).isim == "Kfs")
            {   savasAni.jLabel10.setIcon(kfs);
      }else if (kart.SeciliKartlar.get(i*3 + 2).isim == null)
            {    savasAni.jLabel10.setIcon(bos);}
		
      
      		

   for(int y = 0; y <12 ; y++)
   {
       System.out.println(y+". indisdeki kart: " + userID.oyuncuKartDizisi.get(y).isim);
   }      
    
		

		

		
			System.out.println();
			System.out.println(i+1 + ". Tur : ");
                        
                        
			 String dosyaAdi = "C:\\Users\\minth\\Desktop\\SavasAdimlari.txt";
                         
                         try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
			    if (i == 0) {
			        System.out.println("Dosyaya yazma işlemi başladı.");
			        bw.newLine();
			        bw.write("OYUNA HOŞGELDİNİZ !! \n");
			        bw.newLine();
			        bw.write("Bilgisayarin elinde bulunan kartlar : ");
			        for (int k = 0; k < 6; k++) {
			            bw.write(user.bilgisayarKartDizisi.get(k).isim + " , ");
			        }
			        bw.newLine();
			        bw.write("Oyuncunun elinde bulunan kartlar : ");
			        for (int k = 0; k < 6; k++) {
			            bw.write(user.oyuncuKartDizisi.get(k).isim + " , ");
			        }
			        bw.newLine();
			        bw.newLine();
			       
			        System.out.println("Dosyaya yazma işlemi tamamlandı.");
			    }
			     int c = i + 1;
			     bw.newLine();
			     bw.newLine();
			        bw.write(c + ". Tur ");
			        bw.newLine();
			        bw.newLine();
			    
			} catch (IOException e) {
			    System.out.println("Bir hata oluştu: " + e.getMessage());
			}
			
			for(int j = 0 ; j < 3 ; j++) {
                            
				int a = bilgisayar.kartSec(bilgisayarSavasacakKart, i+1, j);
				bilgisayarSavasacakKart[j] = user.bilgisayarKartDizisi.get(a).isim;
				int x = i*j + j;
				userID.bilgisayarSavasacakKartDizisi.add(user.bilgisayarKartDizisi.get(a));
				
                      //         user.bilgisayarKartDizisi.set(i*3 + j,user.bilgisayarKartDizisi.get(a));
                                 
				int c = j+1;
				System.out.println(c + ". Bilgisayar savasacak kart: " + bilgisayarSavasacakKart[j]);
				System.out.println(c + ". Oyuncu savasacak kart : " + kart.SeciliKartlar.get(i*3 + j).isim );
				
				int insan_saldiri = Oyun.saldiri_hesaplama(1,i*3 + j,a);			
				System.out.println("insan saldiri : " + insan_saldiri);
				int bilgisayar_saldiri = Oyun.saldiri_hesaplama(2,i*3 + j,a);
				System.out.println("Bilgisayar Saldiri : " + bilgisayar_saldiri );
				
				user.bilgisayarKartDizisi.get(a).dayaniklik = user.bilgisayarKartDizisi.get(a).dayaniklik - insan_saldiri;
				kart.SeciliKartlar.get(i*3 + j).dayaniklik = kart.SeciliKartlar.get(i*3 + j).dayaniklik - bilgisayar_saldiri;
                              
                                
                                try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
					bw.write(c + ". Bilgisayar Savasacak Kart : " + bilgisayarSavasacakKart[j]);
					bw.newLine();
					bw.write(c+ ". Oyuncu Savasacak Kart : " + kart.SeciliKartlar.get(i*3+j).isim);
					bw.newLine();
					bw.write("Bilgisayar Kartinin Avantajlarla Birlikte Saldiri Degeri : " + bilgisayar_saldiri);
					bw.newLine();
					bw.write("Oyuncu Kartinin Avantajlarla Birlikte Saldiri Degeri :" + insan_saldiri);
					bw.newLine();
					
				}catch (IOException e) {
				    System.out.println("Bir hata oluştu: " + e.getMessage());
				}
                                
                                
                                  if(j==0)
                                {
                                
              if(user.bilgisayarKartDizisi.get(a).isim == "Ucak")
      {   savasAni.jLabel5.setIcon(ucak);
      }else if (user.bilgisayarKartDizisi.get(a).isim == "Siha")
            {     savasAni.jLabel5.setIcon(siha);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Sida")
            {     savasAni.jLabel5.setIcon(sida);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Firkateyn")
            {     savasAni.jLabel5.setIcon(firka);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Obus")
            {     savasAni.jLabel5.setIcon(obus);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Kfs")
            {     savasAni.jLabel5.setIcon(kfs);
      }else if (user.bilgisayarKartDizisi.get(a).isim == null)
            {     savasAni.jLabel5.setIcon(bos);
      }
                                
                                }
                                   
                              else  if(j==1)
                                {
                                       //2.kart
      
      if(user.bilgisayarKartDizisi.get(a).isim == "Ucak")
      {     savasAni.jLabel6.setIcon(ucak);
      }else if (user.bilgisayarKartDizisi.get(a).isim == "Siha")
            {    savasAni.jLabel6.setIcon(siha);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Sida")
            {   savasAni.jLabel6.setIcon(sida);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Firkateyn")
            {    savasAni.jLabel6.setIcon(firka);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Obus")
            {    savasAni.jLabel6.setIcon(obus);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Kfs")
            {    savasAni.jLabel6.setIcon(kfs);
      }else if (user.bilgisayarKartDizisi.get(a).isim == null)
            {    savasAni.jLabel6.setIcon(bos);
      }
                                    
                                } 
                                
                               
                                
                                
                              else  if(j==2)
                                {
                                  //3.kart
      if(user.bilgisayarKartDizisi.get(a).isim == "Ucak")
      {    savasAni.jLabel7.setIcon(ucak);
      }else if (user.bilgisayarKartDizisi.get(a).isim == "Siha")
            {    savasAni.jLabel7.setIcon(siha);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Sida")
            {    savasAni.jLabel7.setIcon(sida);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Firkateyn")
            {    savasAni.jLabel7.setIcon(firka);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Obus")
            {    savasAni.jLabel7.setIcon(obus);
      } else if (user.bilgisayarKartDizisi.get(a).isim == "Kfs")
            {   savasAni.jLabel7.setIcon(kfs);
      }else if (user.bilgisayarKartDizisi.get(a).isim == null)
            {    savasAni.jLabel7.setIcon(bos);}
                                
                                }
                                
                                
                                
                                
                                
                                
                                
          
				
			 
                               
				
				if(kart.SeciliKartlar.get(i*3 + j).dayaniklik <= 0) {
					kart.SeciliKartlar.get(i*3 + j).dayaniklik = 0;
					kart.SeciliKartlar.get(i*3 + j).isim = null;
					if(kart.SeciliKartlar.get(i*3 +j).seviyePuani > 10) {
						user.bilgisayarKartDizisi.get(a).seviyePuani += kart.SeciliKartlar.get(i*3 +j).seviyePuani;
					    user.bilgisayarPuan += kart.SeciliKartlar.get(i*3 +j).seviyePuani;
					}else {
						user.bilgisayarKartDizisi.get(a).seviyePuani += 10;
						user.bilgisayarPuan += 10;
					}
					
				}
				if(user.bilgisayarKartDizisi.get(a).dayaniklik <= 0) {
					user.bilgisayarKartDizisi.get(a).dayaniklik = 0;
					user.bilgisayarKartDizisi.get(a).isim = null;
					if(user.bilgisayarKartDizisi.get(a).seviyePuani > 10) {
						kart.SeciliKartlar.get(i*3 +j).seviyePuani += user.bilgisayarKartDizisi.get(a).seviyePuani;
					    user.oyuncuPuan += user.bilgisayarKartDizisi.get(a).seviyePuani;
					}else {
						kart.SeciliKartlar.get(i*3 +j).seviyePuani += 10;
						user.oyuncuPuan += 10;
					}
					
				}
				
			
                               
				
				
				

				
				
				System.out.println("Oyuncu kalan dayanıklılık : " + kart.SeciliKartlar.get(i*3 + j).dayaniklik);
				System.out.println("Bilgisayar kalan dayanıklılık : " + user.bilgisayarKartDizisi.get(a).dayaniklik + "\n");
				
                                        
				
				System.out.println(c + ". tur sonucu bilgisayar seviye puani : " + user.bilgisayarPuan);
				System.out.println(c + ". tur sonucu oyuncu seviyr puani : " + user.oyuncuPuan);
                                
                                try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
					bw.write("Bilgisayar Kartinin Saldiri Sonucu Kalan Dayaniklilik : " + user.bilgisayarKartDizisi.get(a).dayaniklik);
					bw.newLine();
					bw.write("Oyuncu Kartinin Saldiri Sonucu Kalan Dayanıklılık : " + kart.SeciliKartlar.get(i*3+j).dayaniklik);
					bw.newLine();
					
					bw.write((i+1) + ". Tur ve " + (j+1) +". Savaş Sonucunda Bilgisayar Seviye Puanı : " + user.bilgisayarPuan);
					bw.newLine();
					bw.write((i+1) + ". Tur ve  " +(j+1) +". Savaş Sonucunda Oyuncu Seviye Puanı : " + user.oyuncuPuan);
					bw.newLine();
					bw.newLine();
					
					
				}catch (IOException e) {
				    System.out.println("Bir hata oluştu: " + e.getMessage());
				}
				
				

				
				
			}
                        
                        int bilgisayarKalanKart = 0 ;
				        int oyuncuKalanKart = 0 ;
                                
                                
                                	for(int i = 0 ; i < 12 ; i++) {
					if(user.oyuncuKartDizisi.get(i).dayaniklik > 0) {
						oyuncuKalanKart++;
						if(i == 4) {
							oyuncuKalanKartDayaniklilik += user.oyuncuKartDizisi.get(i).dayaniklik;
						}
					}
					if(user.bilgisayarKartDizisi.get(i).dayaniklik > 0 ) {
						bilgisayarKalanKart++;
						if(i == 4) {
							bilgisayarKalanKartDayaniklilik += user.bilgisayarKartDizisi.get(i).dayaniklik;
						}
					}
				}
				
                                
                                System.out.println(" canli kart "+ oyuncuKalanKart);
                                
                                
                        if(i<4) {
                        	
                        	
                        	if(bilgisayarKalanKart == 0) {
                        		try(BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))){
                        			bw.newLine();
                        			bw.write("OYUNCU SAVAŞI KAZANDI !!");
                        			bw.newLine();
                                                
                                                 JLabel message = new JLabel("SAVASI OYUNCU KAZANDI");
                                                 message.setFont(new Font("Arial",Font.BOLD,48));
                                                 JOptionPane.showMessageDialog(null,message);
                        		}catch(IOException e) {
                        			System.out.println("Bir hata oluştu : " + e.getMessage());
                        		}
                        	}else if(bilgisayarKalanKart == 1) {
                        		System.out.println("2kart biglisayara vercem");
                        		try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
                     			    bw.newLine();
                     			    bw.write("Bilgisayarın 1 Kartı Kaldı ve Bilgisayara 2 Kart Verildi . Verilen Kartlar :");
                     			}catch(IOException e) {
                     				System.out.println("Bir hata oluştu : " + e.getMessage());
                     			}
                        		for(int t = i ; t < (i+2) ; t++) {
       							 String BilgisayarYeniKart = OyuncuSinifi.kartEkle(user.bilgisayarPuan);
       					         OyuncuSinifi.yeniKartlaNesneOlustur(BilgisayarYeniKart , t, "Bilgisayar");
       					      try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
      	        			    bw.write(BilgisayarYeniKart + " , ");
      	        			}catch(IOException e) {
      	        				System.out.println("Bir hata oluştu : " + e.getMessage());
      	        			}
       					         

                        	}
                        		try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
        	        			    bw.newLine();
        	        			}catch(IOException e) {
        	        				System.out.println("Bir hata oluştu : " + e.getMessage());
        	        			}	
                        	}else {
                        		System.out.println("1 KART VERDİM BILGISAYARA");
                        		String BilgisayarYeniKart = OyuncuSinifi.kartEkle(user.bilgisayarPuan);
       				            OyuncuSinifi.yeniKartlaNesneOlustur(BilgisayarYeniKart , i, "Bilgisayar");
       				         try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
 		        			    bw.newLine();
 		        			    bw.write("Bilgisayara 1 Yeni Kart Verildi . Yeni Kart : " + BilgisayarYeniKart);
 		        			}catch(IOException e) {
 		        				System.out.println("Bir hata oluştu : " + e.getMessage());
 		        			}

                        	}
                        	
                        	
                        	
                        	
                                        if(oyuncuKalanKart == 0)
                                        {
                                        	try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
                                        		bw.newLine();
                                        		bw.write("BİLGİSAYAR SAVAŞI KAZANDI !!");
                                        		bw.newLine();
                                                        
                                                          JLabel message = new JLabel("SAVASI BILGISAYAR KAZANDI");
                                                 message.setFont(new Font("Arial",Font.BOLD,48));
                                                 JOptionPane.showMessageDialog(null,message);
                                        	}catch (IOException e) {
                                			    System.out.println("Bir hata oluştu: " + e.getMessage());
                                			}
                                        	
                                            System.out.println("Kapat");
                                         
                                            new Kapanis().setVisible(true);
                                           ekran.dispose();
                                           
                                        }
                                    else if(oyuncuKalanKart == 1) {
                                        
                         System.out.println("2 KART VERCEM");
                         try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
             			    bw.newLine();
             			    bw.write("Oyuncunun 1 Kartı Kaldı ve Oyuncuya 2 Kart Verildi . Verilen Kartlar :");
             			}catch(IOException e) {
             				System.out.println("Bir hata oluştu : " + e.getMessage());
             			}
						for(int t = i ; t < (i+2) ; t++) {
						String yeniKart = OyuncuSinifi.kartEkle(user.oyuncuPuan);
					    OyuncuSinifi.yeniKartlaNesneOlustur(yeniKart,t,"Oyuncu"); 
					    try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
	        			    bw.write(yeniKart + " , ");
	        			}catch(IOException e) {
	        				System.out.println("Bir hata oluştu : " + e.getMessage());
	        			}
                                            
						}		
						try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
	        			    bw.newLine();
	        			}catch(IOException e) {
	        				System.out.println("Bir hata oluştu : " + e.getMessage());
	        			}
					    
					}else {
                             System.out.println("1 KART VERDIM");
							String yeniKart = OyuncuSinifi.kartEkle(user.oyuncuPuan);
						    OyuncuSinifi.yeniKartlaNesneOlustur(yeniKart,i,"Oyuncu");
						    try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
		        			    bw.newLine();
		        			    bw.write("Oyuncuya 1 Yeni Kart Verildi . Yeni Kart : " + yeniKart);
		        			}catch(IOException e) {
		        				System.out.println("Bir hata oluştu : " + e.getMessage());
		        			}
						}
					
					/*if(bilgisayarKalanKart == 9) {
						for(int t = i ; t < (i+2) ; t++) {
							 String BilgisayarYeniKart = OyuncuSinifi.kartEkle(user.bilgisayarPuan);
					         OyuncuSinifi.yeniKartlaNesneOlustur(BilgisayarYeniKart , t, "Bilgisayar");
						}
					}else {
						String BilgisayarYeniKart = OyuncuSinifi.kartEkle(user.bilgisayarPuan);
				         OyuncuSinifi.yeniKartlaNesneOlustur(BilgisayarYeniKart , i, "Bilgisayar");
					}*/
					
					
				}
			
			
			
			
			
			
			
			
			
			
			i++;
			
	
             
              
              
   
           

}}