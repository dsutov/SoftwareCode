package SoftDevLab4;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    JButton btnNorth = new JButton("North");
    JButton btnSouth = new JButton("South");
    JButton btnEast = new JButton("East");
    JButton btnWest = new JButton("West");
    JButton btnCenter = new JButton("Center");

    public BorderLayoutExample() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Not needed as JFrame has BorderLayout by default
        // getContentPane().setLayout(new BorderLayout());
        getContentPane().add(btnNorth, BorderLayout.NORTH);
        getContentPane().add(btnSouth, BorderLayout.SOUTH);
        getContentPane().add(btnEast, BorderLayout.EAST);
        getContentPane().add(btnWest, BorderLayout.WEST);
        getContentPane().add(btnCenter, BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }



}
