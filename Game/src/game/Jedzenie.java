
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
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Klasa Jedzenie dziedzicząca po JPanel implementująca ActionListener. 
 * Panel, w którym dzieje się cała rozgrywka w kategorii "JEDZENIE" 
 * @author Olga Krezymon
 */

public class Jedzenie extends JPanel implements ActionListener{
    
    /** Przycisk przejścia do menu */
    JButton menub;
    /** Timer odpowiedzialny za animację literek */
    Timer tm;
    /** Timer odpowiedzialny za wyświetlanie JDialog przez określony czas*/
    Timer t;
    /** Współrzędne spadających literek */
    static int x=60,  y=0, velY1=2, velY2=3, velY3=4, y2=-250, y3=-500, y4=-750, y5=-1000, y6=-1250, y7=-1500, y8=-1750, y9=-2000, y10=-2250, y11=-2500, y12=-2750;
    
    /** Zmienna boolowska, która informuje o upłynięciu czasu timera odpowiedzialnego za wyświetlanie JDialoga */
    public static boolean czywyswietlonoj = false;
    /** Zmienne boolowskie sprawdzające, czy użytkownik wybrał prawidłową literkę */
    boolean czym, czye, czya, czyt, czym1, czyi, czyl, czyk, czyf, czyr, czyu, czyi1, czyt1, czyb, czya1, czyn, czya2, czyn2, czya3, czya4, czyp, czyp1, czyl1, czye1, czyc, czyo1, czyf1, czyf2, czye3, czye4, czyc1, czyh, czye5, czye6, czys, czye7, czyc2,czyh1,czyi2, czyc3, czyk1,czye8,czyn1,czyy, czyo2,czyg,czyh2,czyu1,czyr3,czyt2;
    /** Zmienne boolowskie sprawdzające, czy użytkownik prawidłowo odgadł całe słowo */
    public static boolean czy1poziomj=true, czy2poziomj, czy3poziomj, czy4poziomj;
    /** Współrzędne kliknięcia */
    static int xc, yc;
    /** Zmienna przechowująca wynik funkcji losuj() */
    static int wyl;
    /** Utworzenie obiektu typu Przegrana */
    Przegrana koniec = new Przegrana();
    /** Utworzenie obiektu typu Wygrana */
    Wygrana wygr = new Wygrana();
    
    /**
     * Konstruktor klasy Jedzenie
     * Wywołuje timer, definiuje przycisk i wywołuje funkcję przyciski() oraz 
     * funkcję rysującą tło. Obsługuje zdarzenie kliknięcia myszy
     */
    
    public Jedzenie(){
        
        //Timer relizujący "animację", która odświeża obraz co 20 milisekund wskazujący
        //na użycie ActionListener po którym implementuje klasa Jedzenie
        
        
        tm = new Timer(20, this);
        menub = new JButton("MENU");
        
        setLayout(null);

        add(menub);
        przyciski();
        
        Obrazy.loadInitialImages();
         
        // obsługa zdarzenia kliknięcia myszy, która zbiera jego współrzędne
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e) {
            xc=e.getX();
            yc=e.getY();
            }
        }); 
        
      
    }
    
    /**
     * Metoda restartująca wszystkie współrzędne i zmienne po odgadnięciu całego wyrazu
     */
    
    public void restart(){
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
            y11=-2500;
            y12=-2750;
            czywyswietlonoj=false;
            czy1poziomj=false;
            czy2poziomj=false;
            xc=0;
            yc=0;
    };
    
    /**
     * Metoda restartująca wszystkie współrzędne i zmienne po zrestartowaniu gry
     */
    
    public static void restartj(){
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
        czywyswietlonoj=false;
        czy1poziomj=true;
        czy2poziomj=false;
        czy3poziomj=false;
        xc=0;
        yc=0;
    }
    
    /**
     * Metoda rysująca tło oraz obrazy literek 
     * @param gs
     */
    
    protected void paintComponent(Graphics gs){
        
        /** Zmienne potrzebne w pętlach, które zapewniają przerwę między literami w rzędzie */
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1, c1=1, d1=1, e1=1, f1=1, g1=1, h1=1, i1=1, j1=1, k1=1;
        super.paintComponent(gs);
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
        
        // sprawdzenie czy okno dialogowe zniknęło
        if (Jedzenie.czywyswietlonoj){

        // sprawdzenie czy jest to 1 poziom
            if (czy1poziomj){
                //pętle rysujące rzędy 4 literek w różnych kombinacjach 
                for(int i=0;i<13;i+=4){ 
                    g.drawImage(Obrazy.letters[i], x*a*4, y, null);
                    a++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*b*4, y2, null); 
                    b++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*d*4, y3, null); 
                    d++;
                };

                for (int i=9;i<16;i+=2){
                    g.drawImage(Obrazy.letters[i], x*e*4, y4, null); 
                    e++;
                };

                 for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*f*4, y5, null); 
                    f++;
                };

                for (int i=4;i<17;i+=4){
                    g.drawImage(Obrazy.letters[i], x*h*4, y6, null); 
                    h++;
                };

                 for (int i=21;i>14;i-=2){
                    g.drawImage(Obrazy.letters[i], x*c*4, y7, null); 
                    c++;
                };

                for (int i=25;i>9;i-=5){
                    g.drawImage(Obrazy.letters[i], x*j*4, y8, null); 
                    j++;
                };
            }
            
            // sprawdzenie czy 1 poziom został ukończony i czy JDialog zniknął
            if (czy2poziomj && czywyswietlonoj){
            
                for(int i=1;i<11;i+=3){ 
                    g.drawImage(Obrazy.letters[i], x*k*4, y, null);
                    k++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*l*4, y2, null); 
                    l++;
                };

                for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*m*4, y3, null); 
                    m++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*n*4, y4, null); 
                    n++;
                };

                 for (int i=25;i>12;i-=4){
                    g.drawImage(Obrazy.letters[i], x*o*4, y5, null); 
                    o++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*p*4, y6, null); 
                    p++;
                };

                 for (int i=9;i>2;i-=2){
                    g.drawImage(Obrazy.letters[i], x*r*4, y7, null); 
                    r++;
                };

                for (int i=9;i<16;i+=2){
                    g.drawImage(Obrazy.letters[i], x*s*4, y8, null); 
                    s++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*t*4, y9, null); 
                    t++;
                };
                
                for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*j1*4, y10, null); 
                    j1++;
                };
            
            }
            
            // sprawdzenie czy 2 poziom został ukończony i czy JDialog zniknął
            if (czy3poziomj && czywyswietlonoj){
                for(int i=2;i<18;i+=5){ 
                    g.drawImage(Obrazy.letters[i], x*u*4, y, null);
                    u++;
                };

                for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*w*4, y2, null); 
                    w++;
                };

                for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*a1*4, y3, null); 
                    a1++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*b1*4, y4, null); 
                    b1++;
                };

                 for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*c1*4, y5, null); 
                    c1++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*d1*4, y6, null); 
                    d1++;
                };

                 for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*e1*4, y7, null); 
                    e1++;
                };

                for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*f1*4, y8, null); 
                    f1++;
                };

                for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*g1*4, y9, null); 
                    g1++;
                };

                for (int i=9;i<16;i+=2){
                    g.drawImage(Obrazy.letters[i], x*h1*4, y10, null); 
                    h1++;
                };

                for (int i=21;i>14;i-=2){
                    g.drawImage(Obrazy.letters[i], x*i1*4, y11, null); 
                    i1++;
                };
                
                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*k1*4, y12, null); 
                    k1++;
                };

            }
        }
        // włączenie timera odpowiedzialnego za animację 
        tm.start();
    };
    
    /**
     * Metoda ustawiająca właściwości przycisków
     */
    
    protected void przyciski(){
        
        menub.setBackground(Color.pink);
        menub.setBounds(1000,850,200,80);
        menub.setFont(new Font("Comic Sans",Font.BOLD, 30));
        menub.setForeground(Color.YELLOW);
    }
    
    /**
     * Obsługa zdarzenia
     */
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (Jedzenie.czywyswietlonoj){
            // w zależności od rożnych poziomów szybkość "animacji" jest różna, 
            //więc velY jest różne dla każdego poziomu
            if(czy1poziomj){
                //zmiana współrzędnych wraz z każdym odrysowaniem panelu
                y = y + velY1;
                y2= y2 + velY1; 
                y3= y3 + velY1; 
                y4= y4 + velY1; 
                y5= y5 + velY1; 
                y6= y6 + velY1; 
                y7= y7 + velY1; 
                y8= y8 + velY1;
                y9= y9 + velY1;
                y10=y10+ velY1;
                y11=y11+velY1;
                y12=y12+velY1;
            }
            if(czy2poziomj){
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
                y11=y11+velY2;
                y12=y12+velY2;
            }
            if(czy3poziomj){
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
                y11=y11+velY3;
                y12=y12+velY3;
            }
            // odrysowanie panelu
            repaint();
            
            if(czy1poziomj){
                //warunki sprawdzające, czy kliknięcie pokrywa się z odpowiednią literką w zależności
                //od jej narysowania oraz czy poprzednie literki zostały wybrane 
                if(wyl==0){ 
                    if(960<xc && xc<1060 && y<yc && yc<y+94){
                        System.out.println("m");
                        czym=true;
                    }
                    else if(480<xc && xc<580 && y<yc && yc<y+94 && czym==true){

                        System.out.println("e");
                        czye=true;
                    }
                    else if(240<xc && xc<340 && y2<yc && yc<y2+94 && czym==true && czye==true || 240<xc && xc<340 && y<yc && yc<y+94 && czym==true && czye==true){

                        System.out.println("a");
                        czya=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czym==true && czye==true && czya==true){

                        System.out.println("t");
                        czyt=true;
                    }
                    else if(czym==true && czye==true && czya==true && czyt==true){
                        System.out.println("OK");
                        // wywołanie funkcji restartującej wszystkie zmienne
                        restart();
                        Jedzenie.czy2poziomj=true;
                        // wywołanie okna dialogowego z wylosowanym słowem
                        Slowoj z8 = new Slowoj();
                        
                    }

                }   

                else if(wyl==1){
                    if(960<xc && xc<1060 && y<yc && yc<y+94){
                        System.out.println("m");
                        czym1=true;
                    }
                    else if(720<xc && xc<820 && y<yc && yc<y+94 && czym1==true ){

                        System.out.println("i");
                        czyi=true;
                    }
                    else if(480<xc && xc<580 && y4<yc && yc<y4+94 && czym1==true && czyi==true){

                        System.out.println("l");
                        czyl=true;
                    }
                    else if(960<xc && xc<1060 && y8<yc && yc<y8+94 && czym1==true && czyi==true && czyl==true){

                        System.out.println("k");
                        czyk=true;
                    }
                    else if(czym1==true && czyi==true && czyl==true && czyk==true){
                        System.out.println("OK");
                        restart();
                        Jedzenie.czy2poziomj=true;
                        Slowoj z8 = new Slowoj();
                    }
                }

                else if(wyl==2){
                    if(480<xc && xc<580 && y2<yc && yc<y2+94){
                        System.out.println("f");
                        czyf=true;
                    }
                    else if(960<xc && xc<1060 && y3<yc && yc<y3+94 && czyf==true){

                        System.out.println("r");
                        czyr=true;
                    }
                    else if(720<xc && xc<820 && y5<yc && yc<y5+94 && czyf==true && czyr==true){

                        System.out.println("u");
                        czyu=true;
                    }
                    else if(480<xc && xc<580 && y6<yc && yc<y6+94 && czyf==true && czyr==true && czyu==true){

                        System.out.println("i");
                        czyi1=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyf==true && czyr==true && czyu==true && czyi1==true){

                        System.out.println("t");
                        czyt1=true;
                    }
                    else if(czyf==true && czyr==true && czyu==true && czyi1==true && czyt1==true){
                        System.out.println("OK");
                        restart();
                        Jedzenie.czy2poziomj=true;
                        Slowoj z8 = new Slowoj();
                    }
                }
                // warunek sprawdzający czy ostatni rząd zniknął i nie zostały spełnione poprzednie warunki
                if (y8==1000)
                    // uwidocznienie okna dialogowego z informacją o końcu gry 
                    koniec.setVisible(true);
            }
            
            if(czy2poziomj){
                if(wyl==0){ 
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("b");
                        czyb=true;
                    }
                    else if(240<xc && xc<340 && y4<yc && yc<y4+94 && czyb==true ){

                        System.out.println("a");
                        czya1=true;
                    }
                    else if(960<xc && xc<1060 && y5<yc && yc<y5+94 && czyb==true && czya1==true){

                        System.out.println("n");
                        czyn=true;
                    }
                    else if(240<xc && xc<340 && y6<yc && yc<y6+94 && czyb==true && czya1==true && czyn==true){

                        System.out.println("a");
                        czya2=true;
                    }
                    else if(720<xc && xc<820 && y8<yc && yc<y8+94 && czyb==true && czya1==true && czyn==true && czya2==true){

                        System.out.println("n");
                        czyn2=true;
                    }
                    else if(240<xc && xc<340 && y9<yc && yc<y9+94 && czyb==true && czya1==true && czyn==true && czya2==true && czyn2==true){

                        System.out.println("a");
                        czya3=true;
                    }
                    else if(czyb==true && czya1==true && czyn==true && czya2==true && czyn2==true && czya3==true){
                        System.out.println("OK");
                        restart();
                        Jedzenie.czy3poziomj=true;
                        Slowoj z9 = new Slowoj();
                    }

                }   

                else if(wyl==1){
                    if(240<xc && xc<340 && y4<yc && yc<y4+94 || 240<xc && xc<340 && y6<yc && yc<y6+94  ){
                        System.out.println("a");
                        czya4=true;
                    }
                    else if(960<xc && xc<1060 && y6<yc && yc<y6+94 && czya4==true ){

                        System.out.println("p1");
                        czyp=true;
                    }
                    else if(960<xc && xc<1060 && y9<yc && yc<y9+94 && czya4==true && czyp==true){

                        System.out.println("p2");
                        czyp1=true;
                    }
                    else if(480<xc && xc<580 && y8<yc && yc<y8+94 && czya4==true && czyp==true && czyp1==true){

                        System.out.println("l");
                        czyl1=true;
                    }
                    else if(480<xc && xc<580 && y9<yc && yc<y9+94 && czya4==true && czyp==true && czyp1==true && czyl1==true){

                        System.out.println("e");
                        czye1=true;
                    }
                    else if(czym1==true && czya4==true && czyp==true && czyp1==true && czyl1==true && czye1==true){
                        System.out.println("OK");
                        restart();
                        Jedzenie.czy3poziomj=true;
                        Slowoj z9 = new Slowoj();
                    }
                }

                else if(wyl==2){
                    if(240<xc && xc<340 && y2<yc && yc<y2+94){
                        System.out.println("c");
                        czyc=true;
                    }
                    else if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyc==true ){

                        System.out.println("o");
                        czyo1=true;
                    }
                    else if(480<xc && xc<580 && y6<yc && yc<y6+94 && czyc==true && czyo1==true){

                        System.out.println("f1");
                        czyf1=true;
                    }
                    else if(720<xc && xc<8200 && y7<yc && yc<y7+94 && czyc==true && czyo1==true && czyf1==true /*|| 480<xc && xc<580 && y6<yc && yc<y6+94 && czyc==true && czyo1==true && czyf1==true*/ ){

                        System.out.println("f2");
                        czyf2=true;
                    }
                    else if(480<xc && xc<580 && y9<yc && yc<y9+94 && czyc==true && czyo1==true && czyf1==true && czyf2==true){

                        System.out.println("e1");
                        czye3=true;
                    }
                    else if(480<xc && xc<580 && y10<yc && yc<y10+94 && czyc==true && czyo1==true && czyf1==true && czyf2==true && czye3==true){

                        System.out.println("e2");
                        czye4=true;
                    }
                    else if(czyc==true && czyo1==true && czyf1==true && czyf2==true && czye3==true && czye4==true){
                        System.out.println("OK");
                        restart();
                        Jedzenie.czy3poziomj=true;
                        Slowoj z9 = new Slowoj();
                    }
                }
                if (y10==1000)
                    koniec.setVisible(true);
            }
            
            if (czy3poziomj){
                if(wyl==0){  //POZIOM 3 SPRAWDZONE WSZYSTKO DZIALA 
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("c");
                        czyc1=true;
                    }
                    if(480<xc && xc<580 && y<yc && yc<y+94 && czyc1==true ){

                        System.out.println("h");
                        czyh=true;
                    }
                    if(480<xc && xc<580 && y4<yc && yc<y4+94 && czyc1==true && czyh==true){

                        System.out.println("e");
                        czye5=true;
                    }
                    if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyc1==true && czyh==true && czye5==true){

                        System.out.println("e2");
                        czye6=true;
                    }
                    if(240<xc && xc<340 && y5<yc && yc<y5+94 && czyc1==true && czyh==true && czye5==true && czye6==true){

                        System.out.println("s");
                        czys=true;
                    }
                    if(480<xc && xc<580 && y12<yc && yc<y12+94 && czyc1==true && czyh==true && czye5==true && czye6==true && czys==true){

                        System.out.println("e");
                        czye7=true;
                    }
                    if(czyc1==true && czyh==true && czye5==true && czye6==true && czys==true && czye7==true){
                        System.out.println("OK");
                        wygr.setVisible(true);
                    }

                }   

                if(wyl==1){
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("c");
                        czyc2=true;
                    }
                    if(480<xc && xc<580 && y<yc && yc<y+94 && czyc2==true ){

                        System.out.println("h");
                        czyh1=true;
                    }
                    if(720<xc && xc<820 && y4<yc && yc<y4+94 && czyc2==true && czyh1==true){

                        System.out.println("i");
                        czyi2=true;
                    }
                    if(240<xc && xc<340 && y6<yc && yc<y6+94 && czyc2==true && czyh1==true && czyi2==true){

                        System.out.println("c");
                        czyc3=true;
                    }
                    if(960<xc && xc<1060 && y7<yc && yc<y7+94 && czyc2==true && czyh1==true && czyi2==true && czyc3==true){

                        System.out.println("k");
                        czyk1=true;
                    }
                    if(480<xc && xc<580 && y7<yc && yc<y7+94 && czyc2==true && czyh1==true && czyi2==true && czyc3==true && czyk1==true){

                        System.out.println("e");
                        czye8=true;
                    }
                    if(720<xc && xc<820 && y10<yc && yc<y10+94 && czyc2==true && czyh1==true && czyi2==true && czyc3==true && czyk1==true && czye8==true){

                        System.out.println("n");
                        czyn1=true;
                    }
                    if(czyc2==true && czyh1==true && czyi2==true && czyc3==true && czyk1==true && czye8==true && czyn1==true){
                        System.out.println("OK");
                        wygr.setVisible(true);
                    }
                }

                if(wyl==2){
                    if(240<xc && xc<340 && y2<yc && yc<y2+94){
                        System.out.println("y");
                        czyy=true;
                    }
                    if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyy==true ){

                        System.out.println("o");
                        czyo2=true;
                    }
                    if(960<xc && xc<1060 && y5<yc && yc<y5+94 && czyy==true && czyo2==true || 960<xc && xc<1060 && y3<yc && yc<y3+94 && czyy==true && czyo2==true){

                        System.out.println("g");
                        czyg=true;
                    }
                    if(480<xc && xc<580 && y6<yc && yc<y6+94 && czyy==true && czyo2==true && czyg==true){

                        System.out.println("h");
                        czyh2=true;
                    }
                    if(720<xc && xc<820 && y8<yc && yc<y8+94 && czyy==true && czyo2==true && czyg==true && czyh2==true){

                        System.out.println("u");
                        czyu1=true;
                    }
                    if(480<xc && xc<580 && y9<yc && yc<y9+94 && czyy==true && czyo2==true && czyg==true && czyh2==true && czyu1==true){

                        System.out.println("r");
                        czyr3=true;
                    }
                    if(480<xc && xc<580 && y11<yc && yc<y11+94 && czyy==true && czyo2==true && czyg==true && czyh2==true && czyu1==true && czyr3==true){

                        System.out.println("t");
                        czyt2=true;
                    }

                    if(czyy==true && czyo2==true && czyg==true && czyh2==true && czyu1==true && czyr3==true && czyt==true){
                        System.out.println("OK");
                        wygr.setVisible(true);
                    }
                }
                if (y12==1000)
                    koniec.setVisible(true);
            }
        }
    }
    
    
}

/**
 * Klasa Slowoj dziedzicząca po JDialog, która realizuje wyświetlanie się okna 
 * dialogowego z wylosowanym słowem przez określony czas 
 * @author Olga Krezymon
 */

class Slowoj extends JDialog{
    
    /** Zmienne tablicowe przechowujące słowa w zależności od poziomu trudności */
    public static String[] slowaj1, slowaj2, slowaj3;
    
    /**
    * Konstruktor klasy Slowoz, w którym ustawiane są właściwości okna i uruchamiany timer
    * realizujący wyświetlanie okna przez 5 sekund.
    * @author Olga Krezymon
    */
    
    public Slowoj(){
        
        setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        setSize(400, 200); 
        setLocation(750,450);
        setUndecorated(true);
        setResizable(false); 
        
        //stworzenie i dodanie panelu do okna dialogowego
        Panel slowko = new Panel(); 
        add(slowko);
     
        timer();
        setVisible(true);
       
    }
    
    /**
    * Metoda czasowa, która pozwala na wyświetlenie okna dialogowego przez czas 5 sekund
    * a następnie jego zniknięcie
    * @author Olga Krezymon
    */
    
    public void timer(){
        Timer timer = new Timer(5000, (ActionEvent e) -> {
            setVisible(false);
            dispose();
            Jedzenie.czywyswietlonoj = true;
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    /**
    * Klasa Panel, która realizuje wyświetlenie słówka w formie okna dialogowego
    * @author Olga Krezymon
    */
    
    public class Panel extends JPanel{
        
        /**
        * Konstruktor klasy Panel, przypisuje tablicom wartości a następnie
        * w zależnośći od poziomu wyświetla odpowiednio wylosowane słowo
        * @author Olga Krezymon
        */
        
        public Panel(){
            slowaj1 = new String[3];
            slowaj2 = new String[3];
            slowaj3 = new String[3];
            
            slowaj1[0] = "MEAT";
            slowaj1[1] = "MILK";
            slowaj1[2] = "FRUIT";
            
            slowaj2[0] = "BANANA";
            slowaj2[1] = "APPLE";
            slowaj2[2] = "COFFEE";
            
            slowaj3[0] = "CHEESE";
            slowaj3[1] = "CHICKEN";
            slowaj3[2] = "YOGHURT";
            
            //wywołanie funkcji losuj1()
            if(Jedzenie.czy1poziomj){
                //zdefiniowanie napisu zawierającego jedną z wylosowanych komórek tablicy
                Jedzenie.wyl=losuj();
                JLabel sl = new JLabel(slowaj1[Jedzenie.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(140,50,200,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 45));
                sl.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl);
            }
            if(Jedzenie.czy2poziomj){
                Jedzenie.wyl=losuj();
                JLabel sl = new JLabel(slowaj2[Jedzenie.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(120,50,200,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 50));
                sl.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl);
            }
            if(Jedzenie.czy3poziomj){
                Jedzenie.wyl=losuj();
                JLabel sl = new JLabel(slowaj3[Jedzenie.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(100,50,200,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 45));
                sl.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl);
            }
        }
        
        /**
        * Metoda losująca cyfrę z zakresu od 0 do 2
        * @author Olga Krezymon
        */
        
        public int losuj(){
 
            // określony zakres cyfr do losowania
            int zakres=slowaj1.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}
