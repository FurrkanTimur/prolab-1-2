package mycompany.oyun;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import mycompany.oyun.Oyun;
import javax.swing.ImageIcon;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class userID extends javax.swing.JFrame {
    
    public static ArrayList<SavasAraclari> oyuncuKartDizisi = new ArrayList<>();
    public static ArrayList<SavasAraclari> bilgisayarKartDizisi = new ArrayList<>();
   public static  ArrayList<String> isimler;
    public static int puanlar = 0;
    public static int alindi = 0;
		ImageIcon ucak = new ImageIcon("Ucak.png");
    ImageIcon kfs = new ImageIcon("Kfs.png");
    ImageIcon obus = new ImageIcon("Obus.png");
    ImageIcon firka = new ImageIcon("Firkateyn.png");
    ImageIcon sida = new ImageIcon("Sida.png");
    ImageIcon siha = new ImageIcon("Siha.png");
    ImageIcon bos = new ImageIcon("bos.png");
    ImageIcon kapa = new ImageIcon("kapali.png");
    public static ArrayList<SavasAraclari> oyuncuSavasacakKartDizisi = new ArrayList<>();
    public static ArrayList<SavasAraclari> bilgisayarSavasacakKartDizisi = new ArrayList<>();
    
    public static int eklemeDeneme = 1;
    
      static String player1name;
   static int bilgisayarPuan ;
   static int oyuncuPuan;
    Oyun o1 = new Oyun();
    
    public userID() {
        initComponents();
        isimler = new ArrayList<>();
         this.puanlar = puanlar;
    }
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 26, 29));

        jButton1.setBackground(new java.awt.Color(61, 61, 63));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 48)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DEVAM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Oyuncu İsmi Girin:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Başlangıç Seviye Puanı Girin");

        jTextField1.setBackground(new java.awt.Color(60, 60, 60));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jTextField2.setBackground(new java.awt.Color(60, 60, 60));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jTextField1.getText().isEmpty())
      {
          JLabel message = new JLabel("Lutfen Isim girin");
          message.setFont(new Font("Arial",Font.BOLD,48));
          JOptionPane.showMessageDialog(null,message);
      }
      else
      {   
    	  KartSec kart = new KartSec();
         
      
          String name = jTextField1.getText().trim();
          isimler.add(name);
          
          String puanstring = jTextField2.getText().trim();
          
          puanlar = Integer.parseInt(puanstring);
          
          
          
             JLabel message = new JLabel("Oyuncu İsmi  " + isimler.get(0));     
            message.setFont(new Font("Arial", Font.BOLD, 48));            
            JOptionPane.showMessageDialog(null, message);
            
             System.out.println("OYUNCU ADI   " + isimler.get(0));
             System.out.println("OYUNCU PUANI   " + puanlar);
             
             
            String dosyaAdi = "C:\\Users\\minth\\Desktop\\SavasAdimlari.txt";
             
             try (BufferedWriter bw = new BufferedWriter(new FileWriter(dosyaAdi,true))) {
            	 bw.write("Oyuncunun Adi : " + isimler.get(0));
            	 bw.newLine();
            	 bw.write("Oyuncu ve bilgisayarin baslangic puani : " + puanlar);
            	 bw.newLine();
             }catch (IOException e) {
 			    System.out.println("Bir hata olustu: " + e.getMessage());
}
             
             
                  alindi = 1;
                  
                  
                  
           player1name = userID.isimler.get(0);
           bilgisayarPuan = userID.puanlar;
           oyuncuPuan = userID.puanlar;
        
           OyuncuSinifi bilgisayar = new OyuncuSinifi(1234,0,"bilgisayar");
           OyuncuSinifi oyuncu = new OyuncuSinifi(2468,0,player1name);


           Ucak Ucak = new Ucak();
           Siha Siha = new Siha();
           Obus Obus = new Obus();
           Kfs Kfs = new Kfs();
           Firkateyn Firkateyn = new Firkateyn();
           Sida Sida = new Sida();
           
          
      
          //baslangicta kart atama ve instancelerini olusturma
          String[] oyuncuKartlar = new String[15];
         System.out.println("Oyuncu icin kartlar : \n");
          for(int i = 0 ; i < 6 ; i++) {
          	oyuncuKartlar[i] = oyuncu.kartListesi(oyuncuPuan);       	
          	System.out.println((i+1)+ ". kart :" + oyuncuKartlar[i]);      
              if(oyuncuKartlar[i].equals("Ucak"))
              {
                  oyuncuKartDizisi.add(new Ucak());
              }
              if(oyuncuKartlar[i].equals("Obus"))
              { 
                  oyuncuKartDizisi.add(new Obus());
              }
              if(oyuncuKartlar[i].equals("Firkateyn"))
              {
                  oyuncuKartDizisi.add(new Firkateyn());
              }
              if(oyuncuKartlar[i].equals("Siha")) {
              	oyuncuKartDizisi.add(new Siha());
              }
              if(oyuncuKartlar[i].equals("Sida")) {
              	oyuncuKartDizisi.add(new Sida());
              }
              if(oyuncuKartlar[i].equals("Kfs")) {
              	oyuncuKartDizisi.add(new Kfs());
              }
              
          }
      
          String[] bilgisayarKartlar = new String[15];
          System.out.println("\nBilgisayar icin kartlar : \n");
          
          for(int i = 0 ; i < 6 ; i++) {
          	bilgisayarKartlar[i] = bilgisayar.kartListesi(bilgisayarPuan);
          	System.out.println((i+1) + ". kart : " + bilgisayarKartlar[i]);
              if(bilgisayarKartlar[i].equals("Ucak"))
              {
                  bilgisayarKartDizisi.add(new Ucak());
              }
              if(bilgisayarKartlar[i].equals("Obus"))
              {
                  bilgisayarKartDizisi.add(new Obus());
              }
              if(bilgisayarKartlar[i].equals("Firkateyn"))
              {
                  bilgisayarKartDizisi.add(new Firkateyn());
              }
              if(bilgisayarKartlar[i].equals("Siha")) {
              	bilgisayarKartDizisi.add(new Siha());
              }
              if(bilgisayarKartlar[i].equals("Sida")) {
              	bilgisayarKartDizisi.add(new Sida());
              }
              if(bilgisayarKartlar[i].equals("Kfs")) {
              	bilgisayarKartDizisi.add(new Kfs());
              }    
          }
          
          
          
          System.out.print("\nOyuncu");
          oyuncu.SkorGoster();
          
          System.out.print("Bilgisayar");
          bilgisayar.SkorGoster();
//////////////////////////////////////////////////////////////////
          if(eklemeDeneme == 1) {
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(6).isim=null;
oyuncuKartDizisi.get(6).dayaniklik=0;
oyuncuKartDizisi.get(6).vurus=0;
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(7).isim=null;
oyuncuKartDizisi.get(7).dayaniklik=0;
oyuncuKartDizisi.get(7).vurus=0;
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(8).isim=null;
oyuncuKartDizisi.get(8).dayaniklik=0;
oyuncuKartDizisi.get(8).vurus=0;
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(9).isim=null;
oyuncuKartDizisi.get(9).dayaniklik=0;
oyuncuKartDizisi.get(9).vurus=0;
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(10).isim=null;
oyuncuKartDizisi.get(10).dayaniklik=0;
oyuncuKartDizisi.get(10).vurus=0;
oyuncuKartDizisi.add(new Ucak());
oyuncuKartDizisi.get(11).isim=null;
oyuncuKartDizisi.get(11).dayaniklik=0;
oyuncuKartDizisi.get(11).vurus=0;


bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(6).isim = null;
bilgisayarKartDizisi.get(6).dayaniklik = 0 ;
bilgisayarKartDizisi.get(6).vurus = 0;
bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(7).isim = null;
bilgisayarKartDizisi.get(7).dayaniklik = 0 ;
bilgisayarKartDizisi.get(7).vurus = 0 ;
bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(8).isim = null;
bilgisayarKartDizisi.get(8).dayaniklik = 0;
bilgisayarKartDizisi.get(8).vurus = 0;
bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(9).isim = null;
bilgisayarKartDizisi.get(9).dayaniklik = 0 ;
bilgisayarKartDizisi.get(9).vurus = 0;
bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(10).isim = null;
bilgisayarKartDizisi.get(10).dayaniklik = 0 ;
bilgisayarKartDizisi.get(10).vurus = 0;
bilgisayarKartDizisi.add(new Ucak());
bilgisayarKartDizisi.get(11).isim = null;
bilgisayarKartDizisi.get(11).dayaniklik = 0 ;
bilgisayarKartDizisi.get(11).vurus = 0;

eklemeDeneme++;
          }


new KartSec().setVisible(true);

//1.kart
if(oyuncuKartDizisi.get(0).isim == "Ucak")
{    KartSec.jLabel1.setIcon(ucak);
}else if (oyuncuKartDizisi.get(0).isim == "Siha")
{    KartSec.jLabel1.setIcon(siha);
} else if (oyuncuKartDizisi.get(0).isim == "Sida")
{    KartSec.jLabel1.setIcon(sida);
} else if (oyuncuKartDizisi.get(0).isim == "Firkateyn")
{    KartSec.jLabel1.setIcon(firka);
} else if (oyuncuKartDizisi.get(0).isim == "Obus")
{    KartSec.jLabel1.setIcon(obus);
} else if (oyuncuKartDizisi.get(0).isim == "Kfs")
{    KartSec.jLabel1.setIcon(kfs);
}else if (oyuncuKartDizisi.get(0).isim == null)
{    KartSec.jLabel1.setIcon(bos);
}
//2.kart
if(oyuncuKartDizisi.get(1).isim == "Ucak")
{    KartSec.jLabel2.setIcon(ucak);
}else if (oyuncuKartDizisi.get(1).isim == "Siha")
{    KartSec.jLabel2.setIcon(siha);
} else if (oyuncuKartDizisi.get(1).isim == "Sida")
{    KartSec.jLabel2.setIcon(sida);
} else if (oyuncuKartDizisi.get(1).isim == "Firkateyn")
{    KartSec.jLabel2.setIcon(firka);
} else if (oyuncuKartDizisi.get(1).isim == "Obus")
{    KartSec.jLabel2.setIcon(obus);
} else if (oyuncuKartDizisi.get(1).isim == "Kfs")
{    KartSec.jLabel2.setIcon(kfs);
}else if (oyuncuKartDizisi.get(1).isim == null)
{    KartSec.jLabel2.setIcon(bos);
}
//3.kart
if(oyuncuKartDizisi.get(2).isim == "Ucak")
{    KartSec.jLabel3.setIcon(ucak);
}else if (oyuncuKartDizisi.get(2).isim == "Siha")
{    KartSec.jLabel3.setIcon(siha);
} else if (oyuncuKartDizisi.get(2).isim == "Sida")
{    KartSec.jLabel3.setIcon(sida);
} else if (oyuncuKartDizisi.get(2).isim == "Firkateyn")
{    KartSec.jLabel3.setIcon(firka);
} else if (oyuncuKartDizisi.get(2).isim == "Obus")
{    KartSec.jLabel3.setIcon(obus);
} else if (oyuncuKartDizisi.get(2).isim == "Kfs")
{    KartSec.jLabel3.setIcon(kfs);
}else if (oyuncuKartDizisi.get(2).isim == null)
{    KartSec.jLabel3.setIcon(bos);
}
//4.kart
if(oyuncuKartDizisi.get(3).isim == "Ucak")
{    KartSec.jLabel4.setIcon(ucak);
}else if (oyuncuKartDizisi.get(3).isim == "Siha")
{    KartSec.jLabel4.setIcon(siha);
} else if (oyuncuKartDizisi.get(3).isim == "Sida")
{    KartSec.jLabel4.setIcon(sida);
} else if (oyuncuKartDizisi.get(3).isim == "Firkateyn")
{    KartSec.jLabel4.setIcon(firka);
} else if (oyuncuKartDizisi.get(3).isim == "Obus")
{    KartSec.jLabel4.setIcon(obus);
} else if (oyuncuKartDizisi.get(3).isim == "Kfs")
{    KartSec.jLabel4.setIcon(kfs);
}else if (oyuncuKartDizisi.get(3).isim == null)
{    KartSec.jLabel4.setIcon(bos);
}
//5.kart
if(oyuncuKartDizisi.get(4).isim == "Ucak")
{    KartSec.jLabel5.setIcon(ucak);
}else if (oyuncuKartDizisi.get(4).isim == "Siha")
{    KartSec.jLabel5.setIcon(siha);
} else if (oyuncuKartDizisi.get(4).isim == "Sida")
{    KartSec.jLabel5.setIcon(sida);
} else if (oyuncuKartDizisi.get(4).isim == "Firkateyn")
{    KartSec.jLabel5.setIcon(firka);
} else if (oyuncuKartDizisi.get(4).isim == "Obus")
{    KartSec.jLabel5.setIcon(obus);
} else if (oyuncuKartDizisi.get(4).isim == "Kfs")
{    KartSec.jLabel5.setIcon(kfs);
}else if (oyuncuKartDizisi.get(4).isim == null)
{    KartSec.jLabel5.setIcon(bos);
}
//6.kart
if(oyuncuKartDizisi.get(5).isim == "Ucak")
{    KartSec.jLabel6.setIcon(ucak);
}else if (oyuncuKartDizisi.get(5).isim == "Siha")
{    KartSec.jLabel6.setIcon(siha);
} else if (oyuncuKartDizisi.get(5).isim == "Sida")
{    KartSec.jLabel6.setIcon(sida);
} else if (oyuncuKartDizisi.get(5).isim == "Firkateyn")
{    KartSec.jLabel6.setIcon(firka);
} else if (oyuncuKartDizisi.get(5).isim == "Obus")
{    KartSec.jLabel6.setIcon(obus);
} else if (oyuncuKartDizisi.get(5).isim == "Kfs")
{    KartSec.jLabel6.setIcon(kfs);
}else if (oyuncuKartDizisi.get(5).isim == null)
{    KartSec.jLabel6.setIcon(bos);
}

if(oyuncuKartDizisi.get(6).isim == "Ucak")
{    KartSec.jLabel30.setIcon(ucak);
}else if (oyuncuKartDizisi.get(6).isim == "Siha")
{    KartSec.jLabel30.setIcon(siha);
} else if (oyuncuKartDizisi.get(6).isim == "Sida")
{    KartSec.jLabel30.setIcon(sida);
} else if (oyuncuKartDizisi.get(6).isim == "Firkateyn")
{    KartSec.jLabel30.setIcon(firka);
} else if (oyuncuKartDizisi.get(6).isim == "Obus")
{    KartSec.jLabel30.setIcon(obus);
} else if (oyuncuKartDizisi.get(6).isim == "Kfs")
{    KartSec.jLabel30.setIcon(kfs);
}else if (oyuncuKartDizisi.get(6).isim == null)
{    KartSec.jLabel30.setIcon(bos);
}

if(oyuncuKartDizisi.get(7).isim == "Ucak")
{    KartSec.jLabel29.setIcon(ucak);
}else if (oyuncuKartDizisi.get(7).isim == "Siha")
{    KartSec.jLabel29.setIcon(siha);
} else if (oyuncuKartDizisi.get(7).isim == "Sida")
{    KartSec.jLabel29.setIcon(sida);
} else if (oyuncuKartDizisi.get(7).isim == "Firkateyn")
{    KartSec.jLabel29.setIcon(firka);
} else if (oyuncuKartDizisi.get(7).isim == "Obus")
{    KartSec.jLabel29.setIcon(obus);
} else if (oyuncuKartDizisi.get(7).isim == "Kfs")
{    KartSec.jLabel29.setIcon(kfs);
}else if (oyuncuKartDizisi.get(7).isim == null)
{    KartSec.jLabel29.setIcon(bos);
}

if(oyuncuKartDizisi.get(8).isim == "Ucak")
{    KartSec.jLabel7.setIcon(ucak);
}else if (oyuncuKartDizisi.get(8).isim == "Siha")
{    KartSec.jLabel7.setIcon(siha);
} else if (oyuncuKartDizisi.get(8).isim == "Sida")
{    KartSec.jLabel7.setIcon(sida);
} else if (oyuncuKartDizisi.get(8).isim == "Firkateyn")
{    KartSec.jLabel7.setIcon(firka);
} else if (oyuncuKartDizisi.get(8).isim == "Obus")
{    KartSec.jLabel7.setIcon(obus);
} else if (oyuncuKartDizisi.get(8).isim == "Kfs")
{    KartSec.jLabel7.setIcon(kfs);
}else if (oyuncuKartDizisi.get(8).isim == null)
{    KartSec.jLabel7.setIcon(bos);
}

if(oyuncuKartDizisi.get(9).isim == "Ucak")
{    KartSec.jLabel8.setIcon(ucak);
}else if (oyuncuKartDizisi.get(9).isim == "Siha")
{    KartSec.jLabel8.setIcon(siha);
} else if (oyuncuKartDizisi.get(9).isim == "Sida")
{    KartSec.jLabel8.setIcon(sida);
} else if (oyuncuKartDizisi.get(9).isim == "Firkateyn")
{    KartSec.jLabel8.setIcon(firka);
} else if (oyuncuKartDizisi.get(9).isim == "Obus")
{    KartSec.jLabel8.setIcon(obus);
} else if (oyuncuKartDizisi.get(9).isim == "Kfs")
{    KartSec.jLabel8.setIcon(kfs);
}else if (oyuncuKartDizisi.get(9).isim == null)
{    KartSec.jLabel8.setIcon(bos);
}

if(oyuncuKartDizisi.get(10).isim == "Ucak")
{    KartSec.jLabel39.setIcon(ucak);
}else if (oyuncuKartDizisi.get(10).isim == "Siha")
{    KartSec.jLabel39.setIcon(siha);
} else if (oyuncuKartDizisi.get(10).isim == "Sida")
{    KartSec.jLabel39.setIcon(sida);
} else if (oyuncuKartDizisi.get(10).isim == "Firkateyn")
{    KartSec.jLabel39.setIcon(firka);
} else if (oyuncuKartDizisi.get(10).isim == "Obus")
{    KartSec.jLabel39.setIcon(obus);
} else if (oyuncuKartDizisi.get(10).isim == "Kfs")
{    KartSec.jLabel39.setIcon(kfs);
}else if (oyuncuKartDizisi.get(10).isim == null)
{    KartSec.jLabel39.setIcon(bos);
}

if(oyuncuKartDizisi.get(11).isim == "Ucak")
{    KartSec.jLabel40.setIcon(ucak);
}else if (oyuncuKartDizisi.get(11).isim == "Siha")
{    KartSec.jLabel40.setIcon(siha);
} else if (oyuncuKartDizisi.get(11).isim == "Sida")
{    KartSec.jLabel40.setIcon(sida);
} else if (oyuncuKartDizisi.get(11).isim == "Firkateyn")
{    KartSec.jLabel40.setIcon(firka);
} else if (oyuncuKartDizisi.get(11).isim == "Obus")
{    KartSec.jLabel40.setIcon(obus);
} else if (oyuncuKartDizisi.get(11).isim == "Kfs")
{    KartSec.jLabel40.setIcon(kfs);
}else if (oyuncuKartDizisi.get(11).isim == null)
{    KartSec.jLabel39.setIcon(bos);
}

KartSec.jLabel42.setIcon(kapa);
KartSec.jLabel43.setIcon(kapa);
KartSec.jLabel44.setIcon(kapa);

if(userID.oyuncuKartDizisi.get(10).dayaniklik>0) {
KartSec. jLabel32.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(0).dayaniklik);
KartSec. jLabel33.setText("Vurus "+ userID.oyuncuKartDizisi.get(0).vurus);}
else
{ KartSec. jLabel32.setText("");
KartSec. jLabel33.setText("");}

if(userID.oyuncuKartDizisi.get(11).dayaniklik>0) {
KartSec. jLabel31.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(0).dayaniklik);
KartSec. jLabel34.setText("Vurus "+ userID.oyuncuKartDizisi.get(0).vurus);}
else
{ KartSec. jLabel31.setText("");
KartSec. jLabel34.setText("");}


if(userID.oyuncuKartDizisi.get(0).dayaniklik>0) {
KartSec. jLabel9.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(0).dayaniklik);
KartSec. jLabel18.setText("Vurus "+ userID.oyuncuKartDizisi.get(0).vurus);}
else
{ KartSec. jLabel9.setText("");
KartSec. jLabel18.setText("");}




if(userID.oyuncuKartDizisi.get(1).dayaniklik>0) { 
KartSec. jLabel10.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(1).dayaniklik);
KartSec.jLabel17.setText("Vurus "+ userID.oyuncuKartDizisi.get(1).vurus);
}
else
{ KartSec. jLabel10.setText("");
KartSec. jLabel17.setText("");}


if(userID.oyuncuKartDizisi.get(2).dayaniklik>0) { 
KartSec. jLabel19.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(2).dayaniklik);
KartSec. jLabel12.setText("Vurus "+ userID.oyuncuKartDizisi.get(2).vurus); }
else
{ KartSec. jLabel9.setText("");
KartSec. jLabel12.setText("");}


if(userID.oyuncuKartDizisi.get(3).dayaniklik>0) { 
KartSec. jLabel13.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(3).dayaniklik);
KartSec. jLabel20.setText("Vurus "+ userID.oyuncuKartDizisi.get(3).vurus);}
else
{ KartSec. jLabel13.setText("");
KartSec. jLabel20.setText("");}


if(userID.oyuncuKartDizisi.get(4).dayaniklik>0) { 
KartSec. jLabel14.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(4).dayaniklik);
KartSec. jLabel21.setText("Vurus "+ userID.oyuncuKartDizisi.get(4).vurus);}
else
{ KartSec. jLabel14.setText("");
KartSec. jLabel21.setText("");}


if(userID.oyuncuKartDizisi.get(5).dayaniklik>0) { 
KartSec.jLabel15.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(5).dayaniklik);
KartSec.jLabel22.setText("Vurus "+ userID.oyuncuKartDizisi.get(5).vurus);}
else
{ KartSec. jLabel15.setText("");
KartSec. jLabel22.setText("");}

if(userID.oyuncuKartDizisi.get(6).dayaniklik>0) { 
KartSec.jLabel16.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(6).dayaniklik);
KartSec.jLabel23.setText("Vurus "+ userID.oyuncuKartDizisi.get(5).vurus);}
else
{ KartSec. jLabel16.setText("");
KartSec. jLabel23.setText("");}

if(userID.oyuncuKartDizisi.get(7).dayaniklik>0) { 
KartSec.jLabel11.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(7).dayaniklik);
KartSec.jLabel24.setText("Vurus "+ userID.oyuncuKartDizisi.get(5).vurus);}
else
{ KartSec. jLabel11.setText("");
KartSec. jLabel24.setText("");}

if(userID.oyuncuKartDizisi.get(8).dayaniklik>0) { 
KartSec.jLabel25.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(8).dayaniklik);
KartSec.jLabel26.setText("Vurus "+ userID.oyuncuKartDizisi.get(5).vurus);}
else
{ KartSec. jLabel25.setText("");
KartSec. jLabel26.setText("");}

if(userID.oyuncuKartDizisi.get(9).dayaniklik>0) { 
KartSec.jLabel27.setText("Dayaniklilik "+ userID.oyuncuKartDizisi.get(9).dayaniklik);
KartSec.jLabel28.setText("Vurus "+ userID.oyuncuKartDizisi.get(9).vurus);}
else
{ KartSec. jLabel27.setText("");
KartSec. jLabel28.setText("");}




//////////////////////////////////////////////////////////////////
          
          
  
          this.dispose();
          
          
        
      } 
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userID().setVisible(true);
                new Oyun().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
