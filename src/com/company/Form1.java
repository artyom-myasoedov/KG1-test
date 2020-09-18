package com.company;

import javax.swing.*;
import java.awt.*;


public class Form1 extends JDialog {
    private JPanel contentPane;
    private  MyPanel myPanel;

    public Form1() {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        myPanel = new MyPanel();
        c.add(myPanel, BorderLayout.CENTER);
        setTitle("");
        setPreferredSize(new Dimension(1200, 830));
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }



    public static void main(String[] args) {
        Form1 dialog = new Form1();
        dialog.pack();
        dialog.setVisible(true);
    }
}
