/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaguibasic;

import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author hnd
 */
public class Ex2 {
    private static PopupMenu passwordField;
    public static void main(String[] args){
    
    final JFrame frame = new JFrame("Login form");
    JTextField userField = new JTextField(15);
    
    
        JLabel labelUsername = new JLabel("Username");
        labelUsername.setBounds(50,100,100,30);
        
    
        JLabel labelPassword = new JLabel("Password");
        labelPassword.setBounds(50,150,100,30);
        
        
        
        frame.add(labelUsername);
        frame.add(labelPassword);
        
        final JTextField txtUsername = new JTextField();
        txtUsername.setBounds(150,100,150,30);
        
     
        
        final JPasswordField psw = new JPasswordField();
        psw.setBounds(150,150,150,30);
        
        
        JButton btn = new JButton();
        btn.setBounds(150,200,80,30);
        
         btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String username = txtUsername.getText();
                String password = new String(psw.getPassword());
                
                if (username.equals("admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(frame, "Login Successfull");
                    
                }else{
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
        
        
    
    frame.add(labelUsername);
    frame.add(labelPassword);
    frame.add(txtUsername);
    frame.add(psw);
    frame.add(btn);
    
    
                
    frame.setSize(400, 350);
    frame.setTitle("LogIn");
    frame.setLayout(null);
    frame.setVisible(true);
    }
}
