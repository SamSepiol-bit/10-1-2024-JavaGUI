
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hnd
 */
public class Exercise1 {
    
    public static void main(String[] args){
        
        JFrame f = new JFrame();
        
        JButton b = new JButton("Click");
        JTextField tf = new JTextField();
        
        b.setBounds(130, 100, 100, 50);
        b.setBackground(Color.green);
        
        tf.setBounds(50, 100, 200, 100);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf.setText("Hello World!");
            });
        
        
        f.add(b);
        f.setSize(400, 600);
        
        
        f.add(f);
        
        f.setLayout(null);
        
        f.setVisible(true);
    }
    
}
