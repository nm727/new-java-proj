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
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class myFrame extends JFrame implements ActionListener {
   JButton button;
   JButton button2;
   JButton bb;
   JTextField textf;
   JTextField textf2;
   JTextField textf3;
   JTextField textf4;

   myFrame() {
      ImageIcon icon = new ImageIcon("C:\\Users\\Nour\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\src\\javaapplication1\\switch-off.png");
      Image imagee = icon.getImage();
      Image rimage = imagee.getScaledInstance(75, 65, 4);
      ImageIcon ricon = new ImageIcon(rimage);
      ImageIcon icon2 = new ImageIcon("C:\\Users\\Nour\\Downloads\\sign-up (3).png");
      Image imagee2 = icon2.getImage();
      Image rimage2 = imagee2.getScaledInstance(82, 80, 4);
      new ImageIcon(rimage2);
      this.button2 = new JButton(icon2);
      this.button2.setBounds(300, 490, 80, 50);
      this.button2.setBackground(Color.white);
      this.button2.setBorderPainted(false);
      this.button2.addActionListener(this);
      this.button2.setFocusable(false);
      this.button = new JButton(ricon);
      this.button.setBounds(745, 0, 90, 40);
      this.button.addActionListener(this);
      this.button.setFocusable(false);
      this.button.setHorizontalTextPosition(0);
      this.button.setVerticalTextPosition(3);
      this.button.setFont(new Font("Comic Sans", 1, 25));
      this.button.setForeground(Color.red);
      this.button.setBackground(Color.white);
      this.button.setBorderPainted(false);
      Border border = BorderFactory.createLineBorder(new Color(1844797), 3);
      this.textf = new JTextField();
      this.textf.setPreferredSize(new Dimension(300, 40));
      this.textf.setBounds(30, 190, 300, 40);
      this.textf.setBorder(border);
      this.textf4 = new JTextField();
      this.textf4.setPreferredSize(new Dimension(300, 40));
      this.textf4.setBounds(30, 270, 300, 40);
      this.textf4.setBorder(border);
      this.textf2 = new JTextField();
      this.textf2.setPreferredSize(new Dimension(300, 40));
      this.textf2.setBounds(30, 350, 300, 40);
      this.textf2.setBorder(border);
      this.textf3 = new JTextField();
      this.textf3.setPreferredSize(new Dimension(300, 40));
      this.textf3.setBounds(30, 430, 300, 40);
      this.textf3.setBorder(border);
      JLabel l2 = new JLabel();
      l2.setText("Full name");
      l2.setFont(new Font("Times New Roman", 2, 20));
      l2.setBounds(30, 150, 100, 40);
      JLabel l6 = new JLabel();
      l6.setText("CIN");
      l6.setFont(new Font("Times New Roman", 2, 20));
      l6.setBounds(30, 230, 100, 40);
      JLabel l3 = new JLabel();
      l3.setText("E-Mail");
      l3.setFont(new Font("Times New Roman", 2, 20));
      l3.setBounds(30, 310, 100, 40);
      JLabel l4 = new JLabel();
      l4.setText("Password");
      l4.setFont(new Font("Times New Roman", 2, 20));
      l4.setBounds(30, 390, 100, 40);
      ImageIcon image2 = new ImageIcon("C:\\Users\\Nour\\Downloads\\undraw_Reading_time_re_phf7.png");
      Image imm = image2.getImage();
      Image rimm = imm.getScaledInstance(630, 650, 4);
      ImageIcon rimage3 = new ImageIcon(rimm);
      JLabel label = new JLabel();
      label.setText("      Sign up");
      label.setIcon(rimage3);
      label.setHorizontalTextPosition(2);
      label.setVerticalTextPosition(1);
      label.setForeground(new Color(1844797));
      label.setFont(new Font("Times New Roman", 2, 50));
      label.setIconTextGap(10);
      label.setBackground(Color.WHITE);
      label.setOpaque(true);
      label.setVerticalAlignment(1);
      label.setHorizontalAlignment(0);
      label.setBounds(0, 50, 900, 657);
      JLabel ll = new JLabel();
      ll.setText("Do you have an account?");
      ll.setFont(new Font("Times New Roman", 2, 15));
      ll.setBounds(30, 600, 200, 30);
      ll.setBackground(Color.white);
      this.bb = new JButton();
      this.bb.setText("Log in!");
      this.bb.setBackground(new Color(8163501));
      this.bb.setFont(new Font("Times New Roman", 2, 15));
      this.bb.setBounds(210, 607, 80, 20);
      this.bb.addActionListener(this);
      this.bb.setFocusable(false);
      JPanel panel = new JPanel();
      panel.setBackground(Color.pink);
      panel.setBounds(400, 400, 300, 300);
      this.setLayout(new FlowLayout());
      this.setTitle("Sign up");
      this.setDefaultCloseOperation(3);
      this.setSize(850, 750);
      this.setLocationRelativeTo((Component)null);
      this.setVisible(true);
      this.add(this.textf);
      this.add(this.textf2);
      this.add(this.textf3);
      this.add(this.textf4);
      this.add(l2);
      this.add(l6);
      this.add(l3);
      this.add(l4);
      this.add(this.button2);
      this.add(this.bb);
      this.add(ll);
      this.add(label);
      this.setLayout((LayoutManager)null);
      ImageIcon image = new ImageIcon("C:\\Users\\Nour\\Downloads\\add.png");
      this.setIconImage(image.getImage());
      this.getContentPane().setBackground(new Color(255, 255, 255));
   }

   public boolean check_str(String s) {
      return !s.contains("'") && !s.equals("");
   }

   public boolean email_struct(String s) {
      return s.contains("@") && s.indexOf(".") > s.indexOf("@") + 1;
   }

   public boolean Unique_email_cin() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib?useSSL=false", "root", "Nm1324354657-");
         String email = this.textf2.getText();
         String cin = this.textf4.getText();
         Statement stm = con.createStatement();
         String sql = "select * from librarian where email='" + email + "' or cin='" + cin + "'";
         ResultSet rs = stm.executeQuery(sql);
         return !rs.next();
      } catch (Exception var7) {
         System.out.println(var7.getMessage());
         return false;
      }
   }

   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == this.button) {
         new myFrame2();
         this.dispose();
      }

      if (e.getSource() == this.button2) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib?useSSL=false", "root", "Nm1324354657-");
            String name = this.textf.getText();
            Statement stm = con.createStatement();
            String email = this.textf2.getText();
            String password = this.textf3.getText();
            if (this.check_str(name) && !this.textf4.getText().equals("") && this.textf4.getText().matches("\\d+(\\.\\d+)?") && this.email_struct(email) && this.check_str(password) && this.Unique_email_cin()) {
               String cin = this.textf4.getText();
               String sql2 = "insert into librarian(cin,name,email,password) values ('" + cin + "','" + name + "','" + email + "','" + password + "')";
               boolean rs2 = stm.execute(sql2);
               JOptionPane optionPane;
               JDialog dialog;
               if (!rs2) {
                  optionPane = new JOptionPane("Sign up complete!", 1);
                  dialog = optionPane.createDialog("Sign up");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
               } else {
                  System.out.println("error");
                  this.textf.setText("");
                  this.textf2.setText("");
                  this.textf3.setText("");
                  this.textf4.setText("");
                  optionPane = new JOptionPane("Sign up error!", 2);
                  dialog = optionPane.createDialog("Sign up");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
               }
            } else {
               JOptionPane optionPane = new JOptionPane("Sign up unsuccessful!", 2);
               JDialog dialog = optionPane.createDialog("Sign up");
               dialog.setAlwaysOnTop(true);
               dialog.setVisible(true);
               this.textf.setText("");
               this.textf2.setText("");
               this.textf3.setText("");
               this.textf4.setText("");
            }

            con.close();
         } catch (Exception var12) {
            System.out.println(var12.getMessage());
            JOptionPane optionPane = new JOptionPane("Connexion unsuccessful!", 2);
            JDialog dialog = optionPane.createDialog("Sign up");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         }
      }

      if (e.getSource() == this.bb) {
         new myFrame3();
         this.dispose();
      }

   }
}

