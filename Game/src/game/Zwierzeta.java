
package game;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JDialog;
//import java.util.TimerTask;

public class Zwierzeta extends JPanel implements ActionListener {
    
    JButton menub;
    Timer tm;
    Timer t;
    static int x=60,  y=0, velY1=2, velY2=3, velY3=4 ,y2=-250, y3=-500, y4=-750, y5=-1000, y6=-1250, y7=-1500, y8=-1750, y9=-2000, y10=-2250;
    //int c;
    public static boolean czywyswietlonoz;
    boolean czyc, czya, czyt, czyd, czyo, czyg, czyc1, czyo1, czyw, czyh, czyo2, czyr, czys, czye, czyf, czyr1, czyo3, czyg1, czyb, czyi, czyr2, czyd1, czyz, czye1, czyb1, czyr3, czya1, czys1, czyh1, czya2, czyr4, czyk, czyg2, czyi1, czyr5, czya3, czyf1, czyf2, czye2;
    public static boolean czy1poziomz=true, czy2poziomz, czy3poziomz, czy4poziomz;
    static int xc, yc;
    static int wyl;
    Przegrana koniec = new Przegrana();
    Wygrana wygr = new Wygrana();
    
    public Zwierzeta() {
        
        tm = new Timer(20, this);
        menub = new JButton("MENU");
        
        setLayout(null);
       
        add(menub);

        przyciski();
        Obrazy.loadInitialImages(); 
        
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
            xc=e.getX();
            yc=e.getY();
            }
        }); 
        
        
       
       
    }
    
    public static void restart(){
        y=0;
        y2=-250;
        y3=-500;
        y4=-750;
        y5=-1000;
        y6=-1250;
        y7=-1500; 
        y8=-1750;
        y9=-2000; 
        y10=-2250;
        czywyswietlonoz=false;
        czy1poziomz=false;
        czy2poziomz=false;
        xc=0;
        yc=0;
        
    }
    
    public static void restartz(){
        y=0;
        y2=-250;
        y3=-500;
        y4=-750;
        y5=-1000;
        y6=-1250;
        y7=-1500; 
        y8=-1750;
        y9=-2000; 
        y10=-2250;
        czywyswietlonoz=false;
        czy1poziomz=true;
        czy2poziomz=false;
        czy3poziomz=false;
        xc=0;
        yc=0;
    }
    
    /*public void graj(){
        if (czyc||czya||czyt||czyd||czyo||czyg||czyc1||czyo1||czyw)
            playSound(new File("images/click.wav"));
    }
    
    public static synchronized void playSound(final File f) {
        new Thread(new Runnable() {
          public void run() {
            try {
              Clip clip = AudioSystem.getClip();
              AudioInputStream inputStream = AudioSystem.getAudioInputStream(f);
              clip.open(inputStream);
              clip.start(); 
            } catch (Exception e) {
              System.err.println(e.getMessage());
            }
          }
        }).start();
    }*/
    
    protected void paintComponent(Graphics gs){
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, h1=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1, c1=1, d1=1, e1=1, f1=1, g1=1;
        
        super.paintComponent(gs);
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
        
        
        if (Zwierzeta.czywyswietlonoz){
        //g.setColor(Color.RED);
        //g.fillRect(30,y,50,30);
            if(czy1poziomz){
                for(int i=2;i<18;i+=5){ //SPRAWDZONE DZIALA WSZYSTKO
                    g.drawImage(Obrazy.letters[i], x*a*4, y, null);
                    a++;

                }

                for (int i=3;i<13;i+=3){
                    g.drawImage(Obrazy.letters[i], x*b*4, y2, null); 
                    b++;
                }

                for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*d*4, y3, null); 
                    d++;
                }

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*e*4, y4, null); 
                    e++;
                }

                 for (int i=3;i<13;i+=3){
                    g.drawImage(Obrazy.letters[i], x*f*4, y5, null); 
                    f++;
                }

                for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*h*4, y6, null); 
                    h++;
                }

                for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*c*4, y7, null); 
                    c++;
                }

                for (int i=21;i>14;i-=2){
                    g.drawImage(Obrazy.letters[i], x*h1*4, y8, null); 
                    h1++;
                }
            }
            
            
            
            
            
            if(czy2poziomz && czywyswietlonoz){
                for(int i=1;i<11;i+=3){ 
                    g.drawImage(Obrazy.letters[i], x*j*4, y, null);
                    j++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*k*4, y2, null); 
                    k++;
                };

                for (int i=4;i<17;i+=4){
                    g.drawImage(Obrazy.letters[i], x*l*4, y3, null); 
                    l++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*m*4, y4, null); 
                    m++;
                };

                 for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*n*4, y5, null); 
                    n++;
                };

                for (int i=25;i>12;i-=4){
                    g.drawImage(Obrazy.letters[i], x*o*4, y6, null); 
                    o++;
                };

                 for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*p*4, y7, null); 
                    p++;
                };

                 for (int i=3;i<13;i+=3){
                    g.drawImage(Obrazy.letters[i], x*r*4, y8, null); 
                    r++;
                };

                 for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*s*4, y9, null); 
                    s++;
                };
            }
            
            
            
            
            if (czy3poziomz && czywyswietlonoz){
                for(int i=25;i>12;i-=4){ 
                    g.drawImage(Obrazy.letters[i], x*t*4, y, null);
                    t++;
                };

                for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*u*4, y2, null); 
                    u++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*w*4, y3, null); 
                    w++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*g1*4, y4, null); 
                    g1++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*a1*4, y5, null); 
                    a1++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*d1*4, y6, null); 
                    d1++;
                };

                for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*b1*4, y7, null); 
                    b1++;
                };

                for (int i=25;i>12;i-=4){
                    g.drawImage(Obrazy.letters[i], x*c1*4, y8, null); 
                    c1++;
                };

                 for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*e1*4, y9, null); 
                    e1++;
                };

                 for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*f1*4, y10, null); 
                    f1++;
                };
            }
            
        }
        
        tm.start();
        
    };
    
    
    protected void przyciski(){
        
        menub.setBackground(Color.pink);
        menub.setBounds(1000,850,200,80);
        menub.setFont(new Font("Comic Sans",Font.BOLD, 30));
        menub.setForeground(Color.YELLOW);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (Zwierzeta.czywyswietlonoz){
            if(czy1poziomz){
                y = y + velY1;
                y2= y2 + velY1; 
                y3= y3 + velY1; 
                y4= y4 + velY1; 
                y5= y5 + velY1; 
                y6= y6 + velY1; 
                y7= y7 + velY1; 
                y8= y8 + velY1;
                y9= y9 + velY1;
                y10=y10+velY1;
            }
            
            if(czy2poziomz){
                y = y + velY2;
                y2= y2 + velY2; 
                y3= y3 + velY2; 
                y4= y4 + velY2; 
                y5= y5 + velY2; 
                y6= y6 + velY2; 
                y7= y7 + velY2; 
                y8= y8 + velY2;
                y9= y9 + velY2;
                y10=y10+ velY2;
            }
            
            if(czy3poziomz){
                y = y + velY3;
                y2= y2 + velY3; 
                y3= y3 + velY3; 
                y4= y4 + velY3; 
                y5= y5 + velY3; 
                y6= y6 + velY3; 
                y7= y7 + velY3; 
                y8= y8 + velY3;
                y9= y9 + velY3;
                y10=y10+ velY3;
            }       
            
            repaint();
            
            
            if(czy1poziomz){
                if(wyl==0){
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        
                        System.out.println("c");
                        czyc=true;
                    }
                    else if(240<xc && xc<340 && y4<yc && yc<y4+94 && czyc==true){
                        
                        System.out.println("a");
                        czya=true;
                    }
                    else if(480<xc && xc<580 && y8<yc && yc<y8+94 && czyc==true && czya==true){
                        
                        System.out.println("t");
                        czyt=true;
                    }
                    else if(czyc==true && czya==true && czyt==true){
                        System.out.println("OK cat");
                        restart();
                        Zwierzeta.czy2poziomz=true;
                        
                        Slowoz slowoz2 = new Slowoz();
                        
                        
                    }

                }   
                else if(wyl==1){
                    if(240<xc && xc<340 && y2<yc && yc<y2+94){
                        
                        System.out.println("d");
                        czyd=true;
                    }
                    else if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyd==true){
                        
                        System.out.println("o");
                        czyo=true;
                    }
                    else if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyd==true && czyo==true || 480<xc && xc<580 && y2<yc && yc<y2+94 && czyd==true && czyo==true  ){
                            
                        System.out.println("g");
                        czyg=true;
                    }
                    else if(czyd==true && czyo==true && czyg==true){
                        System.out.println("OK dog");
                        restart();
                        Zwierzeta.czy2poziomz=true;
                       
                        Slowoz slowoz2 = new Slowoz();
                    }
                }

                else if(wyl==2){
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        
                        System.out.println("c");
                        czyc1=true;
                    }
                    else if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyc1==true || 240<xc && xc<340 && y6<yc && yc<y6+94 && czyc1==true ){
                        
                        System.out.println("o");
                        czyo1=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyc1==true && czyo1==true){
                        
                        System.out.println("w");
                        czyw=true;
                    }
                    else if(czyc1==true && czyo1==true && czyw==true){
                        System.out.println("OK cow");
                        restart();
                        Zwierzeta.czy2poziomz=true;
                        
                        Slowoz slowoz2 = new Slowoz();
                    }
                }
                if(y8==1000){
                koniec.setVisible(true);
                
                }
            }
            else if (czy2poziomz){
                if(wyl==0){//SPRAWDZONE DZIALA WSZYSTKO
                    if(720<xc && xc<820 && y<yc && yc<y+94 || 720<xc && xc<820 && y2<yc && yc<y2+94){
                        System.out.println("h");
                        czyh=true;
                    }
                    else if(240<xc && xc<340 && y5<yc && yc<y5+94 && czyh==true){

                        System.out.println("o");
                        czyo2=true;
                    }
                    else if(720<xc && xc<820 && y6<yc && yc<y6+94 && czyh==true && czyo2==true || 480<xc && xc<580 && y5<yc && yc<y5+94 && czyh==true && czyo2==true){

                        System.out.println("r");
                        czyr=true;
                    }
                    else if(240<xc && xc<340 && y7<yc && yc<y7+94 && czyh==true && czyo2==true && czyr==true){

                        System.out.println("s");
                        czys=true;
                    }
                    else if(480<xc && xc<580 && y9<yc && yc<y9+94 && czyh==true && czyo2==true && czyr==true && czys==true){

                        System.out.println("e");
                        czye=true;
                    }
                    else if(czyh==true && czyo2==true && czyr==true && czys==true && czye==true){
                        System.out.println("OK horse");
                        restart();
                        Zwierzeta.czy3poziomz=true;
                        
                        Slowoz slowoz3 = new Slowoz();
                        
                        
                    }

                }   
                else if(wyl==1){
                    if(480<xc && xc<580 && y4<yc && y4<y2+94){
                        System.out.println("f");
                        czyf=true;
                    }
                    else if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyf==true || 720<xc && xc<820 && y6<yc && yc<y6+94 && czyf==true){

                        System.out.println("r");
                        czyr1=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyf==true && czyr1==true || 240<xc && xc<340 && y5<yc && yc<y5+94 && czyf==true && czyr1==true){

                        System.out.println("o");
                        czyo3=true;
                    }
                    else if(480<xc && xc<580 && y8<yc && yc<y8+94 && czyf==true && czyr1==true && czyo3==true || 960<xc && xc<1060 && y7<yc && yc<y7+94 && czyf==true && czyr1==true && czyo3==true){

                        System.out.println("g");
                        czyg1=true;
                    }
                    else if(czyf==true && czyr1==true && czyo3==true && czyg1==true){
                        System.out.println("OK frog");
                        restart();
                        Zwierzeta.czy3poziomz=true;
                        
                        Slowoz slowoz3 = new Slowoz();
                        
                    }
                }

                else if(wyl==2){
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("b");
                        czyb=true;
                    }
                    else if(480<xc && xc<580 && y3<yc && yc<y3+94 && czyb==true){

                        System.out.println("i");
                        czyi=true;
                    }
                    else if(720<xc && xc<820 && y6<yc && yc<y6+94 && czyb==true && czyi==true || 480<xc && xc<580 && y5<yc && yc<y5+94 && czyb==true && czyi==true){

                        System.out.println("r");
                        czyr2=true;
                    }
                    else if(240<xc && xc<340 && y8<yc && yc<y8+94 && czyb==true && czyi==true && czyr2==true){

                        System.out.println("d");
                        czyd1=true;
                    }
                    else if(czyb==true && czyi==true && czyr2==true && czyd1==true){
                        System.out.println("OK bird");
                         restart();
                        Zwierzeta.czy3poziomz=true;
                       
                        Slowoz slowoz3 = new Slowoz();
                       
                    }
                }
                if(y9==1000)
                koniec.setVisible(true);
                
            }
            
            else if(czy3poziomz){
                if(wyl==0){ 
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("z");
                        czyz=true;
                    }
                    else if(480<xc && xc<580 && y3<yc && yc<y3+94 && czyz==true || 480<xc && xc<580 && y7<yc && yc<y7+94 && czyz==true){

                        System.out.println("e");
                        czye1=true;
                    }
                    else if(240<xc && xc<340 && y7<yc && yc<y7+94 && czyz==true && czye1==true){

                        System.out.println("b");
                        czyb1=true;
                    }
                    else if(720<xc && xc<820 && y8<yc && yc<y8+94 && czyz==true && czye1==true && czyb1==true){

                        System.out.println("r");
                        czyr3=true;
                    }
                    else if(240<xc && xc<340 && y10<yc && yc<y10+94 && czyz==true && czye1==true && czyb1==true && czyr3==true){

                        System.out.println("a");
                        czya1=true;
                    }
                    else if(czyz==true && czye1==true && czyb1==true && czyr3==true && czya1==true){
                        System.out.println("OK zebra");
                        czy4poziomz=true;
                        wygr.setVisible(true);
                        
                    }

                }   

                else if(wyl==1){
                    if(240<xc && xc<340 && y2<yc && yc<y2+94){
                        System.out.println("s");
                        czys1=true;
                    }
                    else if(480<xc && xc<580 && y4<yc && yc<y4+94 && czys1==true){

                        System.out.println("h");
                        czyh1=true;
                    }
                    else if(240<xc && xc<340 && y5<yc && yc<y5+94 && czys1==true && czyh1==true || 240<xc && xc<340 && y6<yc && yc<y6+94 && czys1==true && czyh1==true){

                        System.out.println("a");
                        czya2=true;
                    }
                    else if(720<xc && xc<820 && y8<yc && yc<y8+94 && czys1==true && czyh1==true && czya2==true){

                        System.out.println("r");
                        czyr4=true;
                    }
                    else if(960<xc && xc<1060 && y9<yc && yc<y9+94 && czys1==true && czyh1==true && czya2==true && czyr4==true){

                        System.out.println("k");
                        czyk=true;
                    }
                    else if(czys1==true && czyh1==true && czya2==true && czyr4==true && czyk==true){
                        System.out.println("OK shark");
                        czy4poziomz=true;
                        wygr.setVisible(true);
                        
                    }
                }

                else if(wyl==2){
                    if(960<xc && xc<1060 && y2<yc && yc<y2+94){
                        System.out.println("g");
                        czyg2=true;
                    }
                    else if(720<xc && xc<820 && y3<yc && yc<y3+94 && czyg2==true){

                        System.out.println("i");
                        czyi1=true;
                    }
                    else if(960<xc && xc<1060 && y4<yc && yc<y4+94 && czyg2==true && czyi1==true){

                        System.out.println("r");
                        czyr5=true;
                    }
                    else if(240<xc && xc<340 && y5<yc && yc<y5+94 && czyg2==true && czyi1==true && czyr5==true || 240<xc && xc<340 && y6<yc && yc<y6+94 && czyg2==true && czyi1==true && czyr5==true ){

                        System.out.println("a");
                        czya3=true;
                    }
                    else if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyg2==true && czyi1==true && czyr5==true && czya3==true ){

                        System.out.println("f1");
                        czyf1=true;
                    }
                    else if(480<xc && xc<580 && y6<yc && yc<y6+94 && czyg2==true && czyi1==true && czyr5==true && czya3==true && czyf1==true ){

                        System.out.println("f2");
                        czyf2=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyg2==true && czyi1==true && czyr5==true && czya3==true && czyf1==true && czyf2==true || 480<xc && xc<580 && y9<yc && yc<y9+94 && czyg2==true && czyi1==true && czyr5==true && czya3==true && czyf1==true && czyf2==true || 480<xc && xc<580 && y10<yc && yc<y10+94 && czyg2==true && czyi1==true && czyr5==true && czya3==true && czyf1==true && czyf2==true){

                        System.out.println("e");
                        czye2=true;
                    }
                    else if(czyg2==true && czyi1==true && czyr5==true && czya3==true && czyf1==true && czyf2==true && czye2==true){
                        System.out.println("OK giraffe");
                        czy4poziomz=true;
                        wygr.setVisible(true);
                    }
                }
                if(y10==1000)
                koniec.setVisible(true);
                
            }
        
        }
    }
    
    
}

class Slowoz extends JDialog{
    
    public static String[] slowaz1, slowaz2, slowaz3;
    
    public Slowoz(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(400, 200); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        Panel slowko = new Panel(); 
        add(slowko);
     
        timer();
        
        setVisible(true);
       
    }
    
    public void timer(){
        javax.swing.Timer timer = new javax.swing.Timer(5000, (ActionEvent e) -> {
            
            setVisible(false);
            dispose();
            Zwierzeta.czywyswietlonoz = true;
            
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    
    
    public class Panel extends JPanel{
        
        int wylosowany;
        
        public Panel(){
            
            slowaz1= new String[3];
            slowaz2 = new String[3];
            slowaz3 = new String[3];
            
            slowaz1[0]="CAT";
            slowaz1[1]="DOG";
            slowaz1[2]="COW";
            
            slowaz2[0]="HORSE";
            slowaz2[1]="FROG";
            slowaz2[2]="BIRD";
            
            slowaz3[0]="ZEBRA";
            slowaz3[1]="SHARK";
            slowaz3[2]="GIRAFFE";
            
            Zwierzeta.wyl=losuj();
            if(Zwierzeta.czy1poziomz){
                JLabel sl1 = new JLabel(slowaz1[Zwierzeta.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl1.setBounds(150,50,100,100);
                sl1.setFont(new Font("Courier New",Font.BOLD, 50));
                sl1.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl1);
            }
            if(Zwierzeta.czy2poziomz){
                JLabel sl2 = new JLabel(slowaz2[Zwierzeta.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl2.setBounds(140,50,200,100);
                sl2.setFont(new Font("Courier New",Font.BOLD, 50));
                sl2.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl2);
            }
            
            if(Zwierzeta.czy3poziomz){
                JLabel sl3 = new JLabel(slowaz3[Zwierzeta.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl3.setBounds(120,50,200,100);
                sl3.setFont(new Font("Courier New",Font.BOLD, 45));
                sl3.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl3);
            }
            
        }
        
        
        
        public int losuj(){
            
            int zakres=slowaz1.length-1;
            wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany;
        }
        

        
    }
}



