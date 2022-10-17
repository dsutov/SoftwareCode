package SoftDevLec4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample implements ActionListener {

    JFrame w = new JFrame("Button Example");
    JPanel panel = new JPanel();
    JCheckBox c = new JCheckBox("one", true);
    JCheckBox c1 = new JCheckBox("two", false);

    public CheckBoxExample(){
        c.addActionListener(this);
        c1.addActionListener(this);


        panel.add(c);
        panel.add(c1);

        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.getContentPane().add(panel);
        w.pack();
        w.setVisible(true);
    }


    public static void main(String[] args) {
        new CheckBoxExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(c)) {

            if(c1.isSelected()){
                c1.setSelected(false);
            } else {
                c1.setSelected(true);
            }
        }

    }
}
