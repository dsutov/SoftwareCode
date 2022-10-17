package SoftDevLab4;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    private JButton theBTN1 = new JButton("Button 1");
    private JButton theBTN2 = new JButton("Button 2");
    private JButton theBTN3 = new JButton("Button 3");
    private JButton theBTN4 = new JButton("Button 4");
    private JButton theBTN5 = new JButton("Long-named Button 5");

    public BoxLayoutExample(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        theBTN1.setAlignmentY(Component.LEFT_ALIGNMENT);
        getContentPane().add(theBTN1);

        theBTN2.setAlignmentY(Component.CENTER_ALIGNMENT);
        getContentPane().add(theBTN2);

        theBTN3.setAlignmentY(Component.RIGHT_ALIGNMENT);
        getContentPane().add(theBTN3);

        theBTN4.setAlignmentY(Component.CENTER_ALIGNMENT);
        getContentPane().add(theBTN4);

        theBTN5.setAlignmentY(Component.CENTER_ALIGNMENT);
        getContentPane().add(theBTN5);

        setSize(250,175);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutExample();
    }

}
