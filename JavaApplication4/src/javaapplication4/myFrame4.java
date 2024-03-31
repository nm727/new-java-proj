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
import javax.swing.JTextField;
import javax.swing.border.Border;

public class myFrame4 extends JFrame implements ActionListener {
   JButton b1;
   JButton b2;
   JButton b3;
   JTextField textf;
   JTextField textf2;

   myFrame4() {
      this.setLayout(new FlowLayout());
      this.setTitle("Return Book");
      this.setDefaultCloseOperation(3);
      this.setSize(850, 690);
      this.setLayout((LayoutManager)null);
      ImageIcon icon2 = new ImageIcon("C:\\Users\\Nour\\OneDrive\\Bureau\\frreepik\\pint_lib.jpg");
      Image imm = icon2.getImage();
      Image rimm = imm.getScaledInstance(500, 700, 4);
      ImageIcon rimage = new ImageIcon(rimm);
      JLabel label = new JLabel();
      label.setText("    Book Info   ");
      label.setIcon(rimage);
      label.setHorizontalTextPosition(4);
      label.setVerticalTextPosition(1);
      label.setForeground(new Color(1844797));
      label.setFont(new Font("Times New Roman", 2, 50));
      label.setIconTextGap(40);
      label.setBackground(Color.WHITE);
      label.setOpaque(true);
      label.setVerticalAlignment(1);
      label.setHorizontalAlignment(0);
      label.setBounds(-60, 0, 900, 657);
      JLabel l1 = new JLabel();
      l1.setText("Book ID");
      l1.setFont(new Font("Times New Roman", 2, 20));
      l1.setBounds(515, 130, 100, 40);
      JLabel l2 = new JLabel();
      l2.setText("Client ID");
      l2.setFont(new Font("Times New Roman", 2, 20));
      l2.setBounds(515, 250, 100, 40);
      Border border = BorderFactory.createLineBorder(new Color(1844797), 3);
      this.textf = new JTextField();
      this.textf.setPreferredSize(new Dimension(300, 40));
      this.textf.setBounds(515, 180, 300, 40);
      this.textf.setBorder(border);
      this.textf2 = new JTextField();
      this.textf2.setPreferredSize(new Dimension(300, 40));
      this.textf2.setBounds(515, 300, 300, 40);
      this.textf2.setBorder(border);
      Border border2 = BorderFactory.createLineBorder(new Color(8163501), 3);
      this.b1 = new JButton();
      this.b1.setFocusable(false);
      this.b1.setBackground(new Color(15132644));
      this.b1.setBorder(border2);
      this.b1.setBounds(565, 390, 200, 40);
      this.b1.setText("Find Details");
      this.b1.setFont(new Font("Times New Roman", 2, 20));
      this.b1.addActionListener(this);
      this.b2 = new JButton();
      this.b2.setFocusable(false);
      this.b2.setBackground(new Color(15132644));
      this.b2.setBorder(border2);
      this.b2.setBounds(565, 460, 200, 40);
      this.b2.setText("Return Book");
      this.b2.setFont(new Font("Times New Roman", 2, 20));
      this.b2.addActionListener(this);
      this.b3 = new JButton();
      this.b3.setFocusable(false);
      this.b3.setBackground(new Color(15132644));
      this.b3.setBorder(border2);
      this.b3.setBounds(565, 530, 200, 40);
      this.b3.setText("Back to Home Page");
      this.b3.setFont(new Font("Times New Roman", 2, 20));
      this.b3.addActionListener(this);
      this.getContentPane().setBackground(Color.white);
      this.add(l1);
      this.add(l2);
      this.add(this.textf);
      this.add(this.textf2);
      this.add(this.b1);
      this.add(this.b2);
      this.add(this.b3);
      this.add(label);
      ImageIcon icon = new ImageIcon("C:\\Users\\Nour\\Downloads\\books.png");
      this.setIconImage(icon.getImage());
      this.setLocationRelativeTo((Component)null);
      this.setVisible(true);
   }

   public boolean check_str(String s) {
      return !s.contains("'") && !s.equals("");
   }

   public void actionPerformed(ActionEvent e) {
      
      if (e.getSource() == this.b2) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib?useSSL=false", "root", "Nm1324354657-");
            String cinb = this.textf.getText();
            Statement stm = con.createStatement();
            String sql2 = this.textf2.getText();
            if (this.check_str(cinb) && this.check_str(sql2) && cinb.matches("\\d+(\\.\\d+)?") && sql2.matches("\\d+(\\.\\d+)?")) {
               String sql = "select * from emprunt where isbn=" + cinb + " and cin='" + sql2 + "' and status=0";
               ResultSet rs = stm.executeQuery(sql);
               if (rs.next()) {
                  String n = "update emprunt set status=1 where cin='" + sql2 + "' and isbn=" + cinb;
                  boolean r2 = stm.execute(n);
                   
                  if (!r2) {
                     JOptionPane optionPane = new JOptionPane("Book returned successfully!", 1);
                     JDialog dialog = optionPane.createDialog("Book return");
                     dialog.setAlwaysOnTop(true);
                     dialog.setVisible(true);
                  } else {
                     JOptionPane optionPane = new JOptionPane("Error. Please try again later!", 1);
                     JDialog dialog = optionPane.createDialog("Book return");
                     dialog.setAlwaysOnTop(true);
                     dialog.setVisible(true);
                  }
               } else {
                  JOptionPane optionPane = new JOptionPane("This book was not taken by this person!", 2);
                  JDialog dialog = optionPane.createDialog("Book return");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
               }
            } else {
               JOptionPane optionPane = new JOptionPane("Values need to be numeric!", 2);
               JDialog dialog = optionPane.createDialog("Book return");
               dialog.setAlwaysOnTop(true);
               dialog.setVisible(true);
            }

            con.close();
         } catch (Exception var14) {
            System.out.println(var14.getMessage());
            JOptionPane optionPane = new JOptionPane("Connexion unsuccessful!", 2);
            JDialog dialog = optionPane.createDialog("Book return");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         }
      }

      if (e.getSource() == this.b1) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib?useSSL=false", "root", "Nm1324354657-");
            String cinb = this.textf.getText();
            Statement stm = con.createStatement();
            if (cinb.matches("\\d+(\\.\\d+)?")) {
               String sql2 = "select ISBN,titre,auteur,url,quantity from books where ISBN=" + cinb;
               ResultSet r2 = stm.executeQuery(sql2);
               if (r2.next()) {
                  int isbn = r2.getInt(1);
                  String n = r2.getString(2);
                  String aut = r2.getString(3);
                  String u = r2.getString(4);
                  int q = r2.getInt(5);
                  new myFrame5(isbn, n, aut, u, q);
               } else {
                  JOptionPane optionPane = new JOptionPane("Invalid Book!", 2);
                  JDialog dialog = optionPane.createDialog("Book return");
                  dialog.setAlwaysOnTop(true);
                  dialog.setVisible(true);
               }
            } else {
               JOptionPane optionPane = new JOptionPane("Book id needs to be numeric!", 2);
               JDialog dialog = optionPane.createDialog("Book return");
               dialog.setAlwaysOnTop(true);
               dialog.setVisible(true);
            }

            con.close();
         } catch (Exception var13) {
            System.out.println(var13.getMessage());
            JOptionPane optionPane = new JOptionPane("Connexion unsuccessful!", 2);
            JDialog dialog = optionPane.createDialog("Book return");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
         }
      }

      if (e.getSource() == this.b3) {
      }

   }
}

