

package javaguibasic;

import javax.swing.JButton;
import javax.swing.JFrame;


public class JavaGUIBasic {

    
    public static void main(String[] args) {
        
        
        JFrame f = new JFrame();
        
        JButton btn = new JButton("Click1");
        btn.setBounds(130, 100, 100, 100); //x axis, y axis, width, height
        JButton btn1 = new JButton("Click2");
        btn1.setBounds(130, 300, 150, 100);
        f.add(btn);
        
        f.setSize(400, 600);//width and height
        f.setLayout(null);
        f.setVisible(true);
        
        f.add(btn1);
        f.setSize(400, 600);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
