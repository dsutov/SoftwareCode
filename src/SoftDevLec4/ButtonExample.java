package SoftDevLec4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonExample implements ActionListener{

    JLabel label = new JLabel("This is a label");
    JButton left = new JButton("Left");
    JButton middle = new JButton("Middle");
    JButton right = new JButton("Right");
    JCheckBox checkBox = new JCheckBox();

    public ButtonExample(){
        JFrame w = new JFrame("Button Example");
        JPanel panel = new JPanel();
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        left.addActionListener(this);
        middle.addActionListener(this);
        right.addActionListener(this);


        panel.add(left);
        panel.add(middle);
        panel.add(right);
        panel.add(label);


        w.getContentPane().add(panel);
        w.pack();
        w.setVisible(true);
    }


    public static void main(String[] args) {
        new ButtonExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(left)){
            label.setText("left button was clicked");
        }

        if(e.getSource().equals(middle)){
            label.setText("middle button was clicked");
            middle.setBackground(Color.BLUE);
        }

        if(e.getSource().equals(right)){
            label.setText("right button was clicked");
        }
    }
}

