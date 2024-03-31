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
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class myFrame5 extends JFrame {
   myFrame5(int isbn, String n, String aut, String u, int q) {
      this.setSize(600, 600);
      this.setTitle("Book Info");
      ImageIcon image = new ImageIcon("C:\\Users\\Nour\\Downloads\\book.png");
      this.setIconImage(image.getImage());
      this.setLayout((LayoutManager)null);
      JLabel l1 = new JLabel();
      l1.setBounds(40, 150, 200, 250);
      ImageIcon im = new ImageIcon(u);
      System.out.println(im.getIconHeight());
      if (im.getIconHeight() == -1) {
         im = new ImageIcon("C:\\Users\\Nour\\Downloads\\book_def.png");
      }

      Image imm = im.getImage();
      Image rimm = imm.getScaledInstance(200, 250, 4);
      ImageIcon rimage = new ImageIcon(rimm);
      l1.setIcon(rimage);
      Border border = BorderFactory.createLineBorder(new Color(1844797), 3);
      l1.setBorder(border);
      JLabel l2 = new JLabel();
      l2.setBounds(180, 10, 400, 500);
      l2.setText("   Book Info");
      l2.setVerticalTextPosition(1);
      l2.setVerticalAlignment(1);
      l2.setFont(new Font("Times new Roman", 2, 45));
      l2.setForeground(new Color(1844797));
      JLabel l9 = new JLabel();
      l9.setBounds(300, 70, 250, 100);
      l9.setText("ISBN:");
      l9.setFont(new Font("Times new Roman", 2, 20));
      l9.setForeground(new Color(4414331));
      JLabel l3 = new JLabel();
      l3.setBounds(300, 150, 250, 100);
      l3.setText("Book name:");
      l3.setFont(new Font("Times new Roman", 2, 20));
      l3.setForeground(new Color(4414331));
      JLabel l10 = new JLabel();
      l10.setBounds(300, 230, 250, 100);
      l10.setText("Author:");
      l10.setFont(new Font("Times new Roman", 2, 20));
      l10.setForeground(new Color(4414331));
      JLabel l4 = new JLabel();
      l4.setBounds(300, 310, 250, 100);
      l4.setText("Book Url:");
      l4.setFont(new Font("Times new Roman", 2, 20));
      l4.setForeground(new Color(4414331));
      JLabel l5 = new JLabel();
      l5.setBounds(300, 390, 250, 100);
      l5.setText("Book quantity:");
      l5.setFont(new Font("Times new Roman", 2, 20));
      l5.setForeground(new Color(4414331));
      JLabel l11 = new JLabel();
      l11.setBounds(300, 110, 250, 100);
      l11.setText(String.valueOf(isbn));
      l11.setFont(new Font("Times new Roman", 2, 20));
      JLabel l6 = new JLabel();
      l6.setBounds(300, 190, 250, 100);
      l6.setText(n);
      l6.setFont(new Font("Times new Roman", 2, 20));
      JLabel l12 = new JLabel();
      l12.setBounds(300, 270, 250, 100);
      l12.setText(aut);
      l12.setFont(new Font("Times new Roman", 2, 20));
      JLabel l7 = new JLabel();
      l7.setBounds(300, 350, 250, 100);
      l7.setText(u);
      l7.setFont(new Font("Times new Roman", 2, 20));
      JLabel l8 = new JLabel();
      l8.setBounds(300, 430, 250, 100);
      l8.setText(String.valueOf(q));
      l8.setFont(new Font("Times new Roman", 2, 20));
      this.setLocationRelativeTo((Component)null);
      this.add(l1);
      this.add(l3);
      this.add(l4);
      this.add(l5);
      this.add(l6);
      this.add(l7);
      this.add(l8);
      this.add(l9);
      this.add(l10);
      this.add(l11);
      this.add(l12);
      this.add(l2);
      this.getContentPane().setBackground(Color.white);
      this.setVisible(true);
   }
}

