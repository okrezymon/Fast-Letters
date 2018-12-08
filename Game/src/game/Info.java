
package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Info extends JPanel {
    
    JButton powrotmenu;
    
    public Info(){
        
        powrotmenu = new JButton(new ImageIcon("replay2.png"));
        JLabel instrukcja = new JLabel("Cos");
        instrukcja.setText("<html> Przez 5 sekund wyświetli ci się na planszy słówko. Następnie zniknie i zaczną pojawiać się różne literki. Twoim zadaniem jest kliknięcie w nie w odpowiedniej kolejności.<br> Jeżeli Ci się to uda, przechodzisz do następnego poziomu. Jeżeli nie, musisz niestety spróbować jeszcze raz. <br> Powodzenia! </html>");
        
        instrukcja.setForeground(Color.cyan);
        
        setLayout(null);
        
        powrotmenu.setBackground(Color.blue);
        powrotmenu.setBounds(950,800,250,120);
        
        instrukcja.setBounds(200,100,1000,600);
        instrukcja.setFont(new Font("Courier New",Font.PLAIN, 40));
        
        
        add(powrotmenu);
        add(instrukcja);
        
        Obrazy.loadInitialImages();
    }
    
    protected void paintComponent(Graphics gs){
        Graphics2D g=(Graphics2D)gs;
        //Ustaw tryb lepszej jakoĹ›ci grafiki (wygĹ‚adzanie/antyaliasing)
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // Narysuj tĹ‚o
        g.drawImage(Obrazy.bgImage, 0, 0, null);
    }
}
