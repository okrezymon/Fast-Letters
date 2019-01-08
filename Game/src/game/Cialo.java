
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
 * Klasa cialo dziedzicząca po JPanel implementująca ActionListener. 
 * Panel, w którym dzieje się cała rozgrywka w kategorii "CIALO" 
 * @author Olga Krezymon
 */

public class Cialo extends JPanel implements ActionListener{
    
    /** Przycisk przejścia do menu */
    JButton menub;
    /** Timer odpowiedzialny za animację literek */
    Timer tm;
    /** Timer odpowiedzialny za wyświetlanie JDialog przez określony czas*/
    Timer t;
    /** Współrzędne spadających literek */
    static int x=60,  y=0, velY1=2, velY2=3, velY3=4, y2=-250, y3=-500, y4=-750, y5=-1000, y6=-1250, y7=-1500, y8=-1750, y9=-2000, y10=-2250, y11=-2500;
    
    /** Zmienna boolowska, która informuje o upłynięciu czasu timera odpowiedzialnego za wyświetlanie JDialoga */
    boolean czyl, czye, czyg, czya, czyr, czym, czye1, czyy, czye2, czyh, czye3, czya1, czyd, czyh1, czya2, czyi, czyr1, czyn, czyo, czys, czye4, czys1, czyt, czyo1, czym1, czya3, czyc, czyh2, czym2, czyo2, czyu, czyt2, czyh3, czyc1, czyh4, czye5, czye6, czyk2, czys2;
    /** Zmienne boolowskie sprawdzające, czy użytkownik wybrał prawidłową literkę */
    public static boolean czywyswietlonoc = false;
    /** Zmienne boolowskie sprawdzające, czy użytkownik prawidłowo odgadł całe słowo */
    public static boolean czy1poziomc=true, czy2poziomc, czy3poziomc, czy4poziomc;
    /** Współrzędne kliknięcia */
    static int xc, yc;
    /** Zmienna przechowująca wynik funkcji losuj() */
    static int wyl;
    /** Utworzenie obiektu typu Przegrana */
    Przegrana koniec = new Przegrana();
    /** Utworzenie obiektu typu Wygrana */
    Wygrana wygr = new Wygrana();
    
    /**
     * Konstruktor klasy Cialo
     * Wywołuje timer, definiuje przycisk i wywołuje funkcję przyciski() oraz 
     * funkcję rysującą tło. Obsługuje zdarzenie kliknięcia myszy
     */
    
    public Cialo(){
        
        // Timer relizujący "animację", która odświeża obraz co 20 milisekund wskazujący
        // na użycie ActionListener po którym implementuje klasa Cialo
        
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
        czywyswietlonoc=false;
        czy1poziomc=false;
        czy2poziomc=false;
        xc=0;
        yc=0;
    };
        
    /**
    * Metoda restartująca wszystkie współrzędne i zmienne po zrestartowaniu gry
    */

    public static void restartc(){
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
        czywyswietlonoc=false;
        czy1poziomc=true;
        czy2poziomc=false;
        czy3poziomc=false;
        xc=0;
        yc=0;
    }
    
    /**
     * Metoda rysująca tło oraz obrazy literek 
     * @param gs
     */
        
    protected void paintComponent(Graphics gs){
        
        /** Zmienne potrzebne w pętlach, które zapewniają przerwę między literami w rzędzie */
        int a=1, b=1, c=1, d=1, e=1, f=1, h=1, j=1, k=1, l=1, m=1, n=1, o=1, p=1, r=1, s=1, t=1, u=1, w=1, a1=1, b1=1, b2=1, c1=1, d1=1;
        super.paintComponent(gs);
        
        Graphics2D g=(Graphics2D)gs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(Obrazy.bgzwImage, 0, 0, null);
        
        // sprawdzenie czy okno dialogowe zniknęło
        if (Cialo.czywyswietlonoc){
            // sprawdzenie czy jest to 1 poziom
            if (czy1poziomc){
                //pętle rysujące rzędy 4 literek w różnych kombinacjach 
                for(int i=9;i<16;i+=2){ 
                    g.drawImage(Obrazy.letters[i], x*a*4, y, null);
                    a++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*b*4, y2, null); 
                    b++;
                };

                for (int i=21;i>14;i-=2){
                    g.drawImage(Obrazy.letters[i], x*b2*4, y3, null); 
                    b2++;
                };

                for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*c*4, y4, null); 
                    c++;
                };

                for (int i=3;i<13;i+=3){
                    g.drawImage(Obrazy.letters[i], x*d*4, y5, null); 
                    d++;
                };

                 for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*e*4, y6, null); 
                    e++;
                };
            }
            
            
            // sprawdzenie czy 1 poziom został ukończony i czy JDialog zniknął
            if(czy2poziomc && czywyswietlonoc){
                for(int i=1;i<11;i+=3){ 
                    g.drawImage(Obrazy.letters[i], x*f*4, y, null);
                    f++;
                };

                for (int i=9;i<16;i+=2){
                    g.drawImage(Obrazy.letters[i], x*h*4, y2, null); 
                    h++;
                };

                for (int i=0;i<16;i+=5){
                    g.drawImage(Obrazy.letters[i], x*j*4, y3, null); 
                    j++;
                };

                for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*k*4, y4, null); 
                    k++;
                };

                 for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*l*4, y5, null); 
                    l++;
                };

                for (int i=3;i<13;i+=3){
                    g.drawImage(Obrazy.letters[i], x*m*4, y6, null); 
                    m++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*n*4, y7, null); 
                    n++;
                };
            }
            
            
            // sprawdzenie czy 2 poziom został ukończony i czy JDialog zniknął
            if (czy3poziomc && czywyswietlonoc){
                for(int i=2;i<18;i+=5){ 
                    g.drawImage(Obrazy.letters[i], x*o*4, y, null);
                    o++;
                };

                for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*p*4, y2, null); 
                    p++;
                };

                for (int i=1;i<11;i+=3){
                    g.drawImage(Obrazy.letters[i], x*r*4, y3, null); 
                    r++;
                };
                
                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*d1*4, y4, null); 
                    d1++;
                };

                for (int i=14;i<24;i+=3){
                    g.drawImage(Obrazy.letters[i], x*s*4, y5, null); 
                    s++;
                };

                 for (int i=25;i>9;i-=5){
                    g.drawImage(Obrazy.letters[i], x*t*4, y6, null); 
                    t++;
                };

                for (int i=21;i>14;i-=2){
                    g.drawImage(Obrazy.letters[i], x*c1*4, y7, null); 
                    c1++;
                };

                for (int i=24;i>17;i-=2){
                    g.drawImage(Obrazy.letters[i], x*u*4, y8, null); 
                    u++;
                };

                for (int i=18;i>5;i-=4){
                    g.drawImage(Obrazy.letters[i], x*w*4, y9, null); 
                    w++;
                };

                for (int i=0;i<13;i+=4){
                    g.drawImage(Obrazy.letters[i], x*a1*4, y10, null); 
                    a1++;
                };

                for (int i=2;i<18;i+=5){
                    g.drawImage(Obrazy.letters[i], x*b1*4, y11, null); 
                    b1++;
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
        if (Cialo.czywyswietlonoc){
            // w zależności od rożnych poziomów szybkość "animacji" jest różna, 
            //więc velY jest różne dla każdego poziomu
            if(czy1poziomc){
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
                y10=y10+velY1;
                y11=y11+velY1;
            }
            if(czy2poziomc){
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
                
                }
            if(czy3poziomc){
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
                
            }
            
        // odrysowanie panelu
        repaint();
            if (czy1poziomc){
                //warunki sprawdzające, czy kliknięcie pokrywa się z odpowiednią literką w zależności
                //od jej narysowania oraz czy poprzednie literki zostały wybrane 
                if(wyl==0){ 
                        if(480<xc && xc<580 && y<yc && yc<y+94){
                            System.out.println("l");
                            czyl=true;
                        }
                        else if(480<xc && xc<580 && y2<yc && yc<y2+94 && czyl==true){

                            System.out.println("e");
                            czye=true;
                        }
                        else if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyl==true && czye==true){

                            System.out.println("g");
                            czyg=true;
                        }

                        else if(czyl==true && czye==true && czyg==true){
                            System.out.println("OK");
                            // wywołanie funkcji restartującej wszystkie zmienne
                            restart();
                            Cialo.czy2poziomc=true;
                            // wywołanie okna dialogowego z wylosowanym słowem
                            Slowoc z5 = new Slowoc();
                        }

                    }   

                    else if(wyl==1){
                        if(240<xc && xc<340 && y2<yc && yc<y2+94){
                            System.out.println("a");
                            czya=true;
                        }
                        else if(720<xc && xc<820 && y3<yc && yc<y3+94 && czya==true ){

                            System.out.println("r");
                            czyr=true;
                        }
                        else if(960<xc && xc<1060 && y5<yc && yc<y5+94 && czya==true && czyr==true){

                            System.out.println("m");
                            czym=true;
                        }

                        else if(czya==true && czyr==true && czym==true ){
                            System.out.println("OK");
                            restart();
                            Cialo.czy2poziomc=true;
                            Slowoc z5 = new Slowoc();
                        }
                    }

                    else if(wyl==2){
                        if(480<xc && xc<580 && y2<yc && yc<y2+94){
                            System.out.println("e");
                            czye1=true;
                        }
                        else if(240<xc && xc<340 && y4<yc && yc<y4+94 && czye1==true){

                            System.out.println("y");
                            czyy=true;
                        }
                        else if(480<xc && xc<580 && y6<yc && yc<y6+94 && czye1==true && czyy==true){

                            System.out.println("e");
                            czye2=true;
                        }

                        else if(czye1==true && czyy==true && czye2==true ){
                            System.out.println("OK");
                            restart();
                            Cialo.czy2poziomc=true;
                            Slowoc z5 = new Slowoc();
                        }
                    }
                    // warunek sprawdzający czy ostatni rząd zniknął i nie zostały spełnione poprzednie warunki
                    if(y6==1000)
                        // uwidocznienie okna dialogowego z informacją o końcu gry 
                        koniec.setVisible(true);
            }
            else if (czy2poziomc){    

                if(wyl==0){ 
                    if(720<xc && xc<820 && y<yc && yc<y+94){
                        System.out.println("h");
                        czyh=true;
                    }
                    else if(480<xc && xc<580 && y<yc && yc<y+94 && czyh==true){

                        System.out.println("e");
                        czye3=true;
                    }
                    else if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyh==true && czye3==true || 240<xc && xc<340 && y5<yc && yc<y5+94 && czyh==true && czye3==true ){

                        System.out.println("a");
                        czya1=true;
                    }
                    else if(240<xc && xc<340 && y6<yc && yc<y6+94 && czyh==true && czye3==true && czya1==true){

                        System.out.println("d");
                        czyd=true;
                    }

                    else if(czyh==true && czye3==true && czya1==true && czyd==true){
                        System.out.println("OK");
                        restart();
                        Cialo.czy3poziomc=true;
                        Slowoc z6 = new Slowoc();
                    }

                }   

                else if(wyl==1){
                    if(720<xc && xc<820 && y<yc && yc<y+94){
                        System.out.println("h");
                        czyh1=true;
                    }
                    else if(240<xc && xc<340 && y3<yc && yc<y3+94 && czyh1==true || 240<xc && xc<340 && y5<yc && yc<y5+94 && czyh1==true ){

                        System.out.println("a");
                        czya2=true;
                    }
                    else if(720<xc && xc<820 && y5<yc && yc<y5+94 && czyh1==true && czya2==true){

                        System.out.println("i");
                        czyi=true;
                    }
                    else if(960<xc && xc<1060 && y7<yc && yc<y7+94 && czyh1==true && czya2==true && czyi==true){

                        System.out.println("r");
                        czyr1=true;
                    }

                    else if(czyh1==true && czya2==true && czyi==true && czyr1==true ){
                        System.out.println("OK");
                        restart();
                        Cialo.czy3poziomc=true;
                        Slowoc z6 = new Slowoc();
                    }
                }

                else if(wyl==2){
                    if(720<xc && xc<820 && y2<yc && yc<y2+94){
                        System.out.println("n");
                        czyn=true;
                    }
                    else if(480<xc && xc<580 && y4<yc && yc<y4+94 && czyn==true){

                        System.out.println("o");
                        czyo=true;
                    }
                    else if(240<xc && xc<340 && y4<yc && yc<y4+94 && czyn==true && czyo==true){

                        System.out.println("s");
                        czys=true;
                    }
                    else if(480<xc && xc<580 && y5<yc && yc<y5+94 && czyn==true && czyo==true && czys==true){

                        System.out.println("e");
                        czye4=true;
                    }

                    else if(czyn==true && czyo==true && czys==true && czye4==true){
                        System.out.println("OK");
                        restart();
                        Cialo.czy3poziomc=true;
                        Slowoc z6 = new Slowoc();
                    }
                }
                if(y7==1000)
                    koniec.setVisible(true);
            }
            if (czy3poziomc){   

                if(wyl==0){ 
                    if(240<xc && xc<340 && y2<yc && yc<y2+94){
                        System.out.println("s");
                        czys1=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czys1==true){

                        System.out.println("t");
                        czyt=true;
                    }
                    else if(480<xc && xc<580 && y9<yc && yc<y9+94 && czys1==true && czyt==true){

                        System.out.println("o");
                        czyo1=true;
                    }
                    else if(960<xc && xc<1060 && y10<yc && yc<y10+94 && czys1==true && czyt==true && czyo1==true){

                        System.out.println("m");
                        czym1=true;
                    }
                    else if(240<xc && xc<340 && y10<yc && yc<y10+94 && czys1==true && czyt==true && czyo1==true && czym1==true){

                        System.out.println("a");
                        czya3=true;
                    }
                    else if(240<xc && xc<340 && y11<yc && yc<y11+94 && czys1==true && czyt==true && czyo1==true && czym1==true && czya3==true){

                        System.out.println("c");
                        czyc=true;
                    }
                    else if(480<xc && xc<580 && y11<yc && yc<y11+94 && czys1==true && czyt==true && czyo1==true && czym1==true && czya3==true && czyc==true){

                        System.out.println("h");
                        czyh2=true;
                    }

                    else if(czyt==true && czyo1==true && czym1==true && czya3==true && czyc==true && czyh2==true){
                        System.out.println("OK");
                        czy4poziomc=true;
                        wygr.setVisible(true);
                       
                    }

                }   

                else if(wyl==1){
                    if(720<xc && xc<820 && y<yc && yc<y+94){
                        System.out.println("m");
                        czym2=true;
                    }
                    else if(240<xc && xc<340 && y5<yc && yc<y5+94 && czym2==true ){

                        System.out.println("o");
                        czyo2=true;
                    }
                    else if(480<xc && xc<580 && y6<yc && yc<y6+94 && czym2==true && czyo2==true){

                        System.out.println("u");
                        czyu=true;
                    }
                    else if(480<xc && xc<580 && y7<yc && yc<y7+94 && czym2==true && czyo2==true && czyu==true){

                        System.out.println("t");
                        czyt2=true;
                    }

                    else if(480<xc && xc<580 && y11<yc && yc<y11+94 && czym2==true && czyo2==true && czyu==true && czyt2==true){

                        System.out.println("h");
                        czyh3=true;
                    }

                    else if(czym2==true && czyo2==true && czyu==true && czyt2==true && czyh3==true){
                        System.out.println("OK ");
                        czy4poziomc=true;
                        wygr.setVisible(true);
                    }
                }

                else if(wyl==2){
                    if(240<xc && xc<340 && y<yc && yc<y+94){
                        System.out.println("c");
                        czyc1=true;
                    }
                    else if(480<xc && xc<580 && y<yc && yc<y+94 && czyc1==true){

                        System.out.println("h");
                        czyh4=true;
                    }
                    else if(480<xc && xc<580 && y3<yc && yc<y3+94 && czyc1==true && czyh4==true){

                        System.out.println("e");
                        czye5=true;
                    }
                    else if(480<xc && xc<580 && y4<yc && yc<y4+94 && czyc1==true && czyh4==true && czye5==true){

                        System.out.println("e");
                        czye6=true;
                    }
                    else if(960<xc && xc<1060 && y6<yc && yc<y6+94 && czyc1==true && czyh4==true && czye5==true && czye6==true || 720<xc && xc<820 && y9<yc && yc<y9+94 && czyc1==true && czyh4==true && czye5==true && czye6==true){

                        System.out.println("k");
                        czyk2=true;
                    }
                    else if(960<xc && xc<1060 && y8<yc && yc<y8+94 && czyc1==true && czyh4==true && czye5==true && czye6==true && czyk2==true || 240<xc && xc<340 && y9<yc && yc<y9+94 && czyc1==true && czyh4==true && czye5==true && czye6==true && czyk2==true){

                        System.out.println("s");
                        czys2=true;
                    }

                    else if(czyc1==true && czyh4==true && czye5==true && czye6==true && czyk2==true && czys2==true){
                        System.out.println("OK");
                        czy4poziomc=true;
                        wygr.setVisible(true);
                    }
                }
                if(y11==1000)
                    koniec.setVisible(true);
            }
        }
    }
}

/**
 * Klasa Slowoc dziedzicząca po JDialog, która realizuje wyświetlanie się okna 
 * dialogowego z wylosowanym słowem przez określony czas 
 * @author Olga Krezymon
 */

class Slowoc extends JDialog{
    
    /** Zmienne tablicowe przechowujące słowa w zależności od poziomu trudności */
    public static String[] slowac1, slowac2, slowac3;
    
    /**
    * Konstruktor klasy Slowoz, w którym ustawiane są właściwości okna i uruchamiany timer
    * realizujący wyświetlanie okna przez 5 sekund.
    * @author Olga Krezymon
    */
    
    public Slowoc(){
        
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
    
    public void timer(){
        Timer timer = new Timer(5000, (ActionEvent e) -> {
            setVisible(false);
            dispose();
            Cialo.czywyswietlonoc = true;
        });
        timer.setRepeats(false);
        timer.start();
    }
    
    /**
    * Metoda czasowa, która pozwala na wyświetlenie okna dialogowego przez czas 5 sekund
    * a następnie jego zniknięcie
    * @author Olga Krezymon
    */
    
    public class Panel extends JPanel{
        
        /**
        * Konstruktor klasy Panel, przypisuje tablicom wartości a następnie
        * w zależnośći od poziomu wyświetla odpowiednio wylosowane słowo
        * @author Olga Krezymon
        */
        
        public Panel(){
            slowac1 = new String[3];
            slowac2 = new String[3];
            slowac3 = new String[3];
            
            slowac1[0]="LEG";
            slowac1[1]="ARM";
            slowac1[2]="EYE";
            
            slowac2[0]="HEAD";
            slowac2[1]="HAIR";
            slowac2[2]="NOSE";
            
            slowac3[0]="STOMACH";
            slowac3[1]="MOUTH";
            slowac3[2]="CHEEKS";
            
            //wywołanie funkcji losuj1()
            Cialo.wyl=losuj();
            
            if(Cialo.czy1poziomc){
                JLabel sl = new JLabel(slowac1[Cialo.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(150,50,100,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 50));
                sl.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl);
            }
            
            if(Cialo.czy2poziomc){
                JLabel sl = new JLabel(slowac2[Cialo.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(135,50,200,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 50));
                sl.setForeground(Color.MAGENTA);
                setBackground(Color.pink);
                add(sl);
            }
            
            if(Cialo.czy3poziomc){
                JLabel sl = new JLabel(slowac3[Cialo.wyl]);
                setSize(400, 200); 
                setLayout(null);
                sl.setBounds(110,50,200,100);
                sl.setFont(new Font("Courier New",Font.BOLD, 40));
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
            int zakres=slowac1.length-1;
            int wylosowany=(int)Math.round(Math.random()*zakres);
            return wylosowany; 
        }
    }
}
