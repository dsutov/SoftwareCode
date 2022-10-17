package SoftDevLab4;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutExample extends JFrame {
    private JButton theBTN1 = new JButton("Button 1");
    private JButton theBTN2 = new JButton("Button 2");
    private JButton theBTN3 = new JButton("Button 3");
    private JButton theBTN4 = new JButton("Button 4");
    private JButton theBTN5 = new JButton("Long-named Button 5");

    public GridBagLayoutExample() {
        super();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridbag);

        //natural height, maximum width
        c.fill = GridBagConstraints.HORIZONTAL;

        c.gridx = 0;
        c.gridy = 0;
        gridbag.setConstraints(theBTN1, c);
        getContentPane().add(theBTN1);

        c.gridx = 1;
        c.gridy = 0;
        gridbag.setConstraints(theBTN2, c);
        getContentPane().add(theBTN2);

        c.gridx = 2;
        c.gridy = 0;
        gridbag.setConstraints(theBTN3, c);
        getContentPane().add(theBTN3);

        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 1;
        gridbag.setConstraints(theBTN4, c);
        getContentPane().add(theBTN4);

        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 3;
        gridbag.setConstraints(theBTN5, c);
        getContentPane().add(theBTN5);

        setVisible(true);
        pack();

    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
