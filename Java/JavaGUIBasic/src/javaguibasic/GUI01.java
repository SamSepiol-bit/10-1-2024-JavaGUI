

package javaguibasic;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author hnd
 */
public class GUI01 {
    
    public static void main(String[] main{
        
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel L = new JLabel();
        
        
        p.setBounds(50, 100, 300, 200);
        p.setBackground(Color.green);
        
        L.setBounds(60, 100, 100, 100);
        
        
        f.setSize(600, 400);
        f.setTitle("LogIn");
        f.setLayout(null);
        f.setVisible(true);
        
        f.add(p);
        f.add(L);
    }
    
}
