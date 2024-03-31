/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Nour
 */
// Source code is decompiled from a .class file using FernFlower decompiler.


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class myFrame3 extends JFrame implements ActionListener {
   JButton button;
   JButton bb;
   JTextField textf;
   JTextField textf2;

   myFrame3() {
      this.setLayout(new FlowLayout());
      this.setTitle("Log in");
      this.setDefaultCloseOperation(3);
      this.setSize(850, 650);
      this.setLocationRelativeTo((Component)null);
      this.setVisible(true);
      ImageIcon image2 = new ImageIcon("C:\\Users\\Nour\\Downloads\\undraw_Bibliophile_re_xarc.png");
      Image imm = image2.getImage();
      Image rimm = imm.getScaledInstance(400, 490, 4);
      ImageIcon rimage3 = new ImageIcon(rimm);
      JLabel label = new JLabel();
      label.setText("      Log In");
      label.setIcon(rimage3);
      label.setHorizontalTextPosition(2);
      label.setVerticalTextPosition(1);
      label.setForeground(new Color(1844797));
      label.setFont(new Font("Times New Roman", 2, 50));
      label.setIconTextGap(110);
      label.setBackground(Color.WHITE);
      label.setOpaque(true);
      label.setVerticalAlignment(1);
      label.setHorizontalAlignment(0);
      label.setBounds(0, 50, 835, 657);
      JLabel l3 = new JLabel();
      l3.setText("CIN");
      l3.setFont(new Font("Times New Roman", 2, 20));
      l3.setBounds(30, 180, 100, 40);
      JLabel l4 = new JLabel();
      l4.setText("Password");
      l4.setFont(new Font("Times New Roman", 2, 20));
      l4.setBounds(30, 280, 100, 40);
      Border border = BorderFactory.createLineBorder(new Color(1844797), 3);
      this.textf = new JTextField();
      this.textf.setPreferredSize(new Dimension(300, 40));
      this.textf.setBounds(30, 220, 300, 40);
      this.textf.setBorder(border);
      this.textf2 = new JPasswordField();
      this.textf2.setPreferredSize(new Dimension(300, 40));
      this.textf2.setBounds(30, 320, 300, 40);
      this.textf2.setBorder(border);
      ImageIcon icon2 = new ImageIcon("C:\\Users\\Nour\\Downloads\\login (1).png");
      Image imagee2 = icon2.getImage();
      Image rimage2 = imagee2.getScaledInstance(80, 80, 4);
      new ImageIcon(rimage2);
      JLabel ll = new JLabel();
      ll.setText("Don't have an account?");
      ll.setFont(new Font("Times New Roman", 2, 15));
      ll.setBounds(30, 520, 200, 30);
      ll.setBackground(Color.white);
      this.bb = new JButton();
      this.bb.setText("Sign up!");
      this.bb.setBackground(new Color(8163501));
      this.bb.setFont(new Font("Times New Roman", 2, 15));
      this.bb.setBounds(210, 525, 90, 20);
      this.bb.addActionListener(this);
      this.bb.setFocusable(false);
      this.button = new JButton(icon2);
      this.button.setBounds(280, 380, 80, 70);
      this.button.setBackground(Color.white);
      this.button.setBorderPainted(false);
      this.button.addActionListener(this);
      this.button.setFocusable(false);
      this.add(this.textf);
      this.add(this.textf2);
      this.add(l4);
      this.add(l3);
      this.add(this.button);
      this.add(this.bb);
      this.add(ll);
      this.add(label);
      this.setLayout((LayoutManager)null);
      ImageIcon image = new ImageIcon("C:\\Users\\Nour\\Downloads\\user-profile.png");
      this.setIconImage(image.getImage());
      this.getContentPane().setBackground(new Color(255, 255, 255));
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == this.button) {
         if (!this.textf.getText().isEmpty() && !this.textf2.getText().isEmpty() && this.textf.getText().matches("\\d+(\\.\\d+)?")) {
            try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib?useSSL=false", "root", "Nm1324354657-");
               String cin = this.textf.getText();
               String password = this.textf2.getText();
               Statement stm = con.createStatement();
               String sql = "select name from librarian where cin='" + cin + "' and password='" + password + "'";
               ResultSet rs = stm.executeQuery(sql);
               JOptionPane optionPane;
               JDialog dialog;
               if (rs.next()) {
                  optionPane = new JOptionPane("Welcome," + rs.getString(1), 1);
                  dialog = optionPane.createDialog("Log In");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
               } else {
                  optionPane = new JOptionPane("Log In unsuccessful!", 2);
                  dialog = optionPane.createDialog("Log In");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
                  this.textf.setText("");
                  this.textf2.setText("");
               }
            } catch (Exception var10) {
               System.out.println(var10.getMessage());
               JOptionPane optionPane = new JOptionPane("Connexion unsuccessful!", 2);
               JDialog dialog = optionPane.createDialog("Log In");
               dialog.setAlwaysOnTop(true);
               dialog.setVisible(true);
            }
         } else {
            JOptionPane optionPane = new JOptionPane("Log In unsuccessful!", 2);
            JDialog dialog = optionPane.createDialog("Log In");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         }
      }

      if (e.getSource() == this.bb) {
         new myFrame();
         this.dispose();
      }

   }
}

