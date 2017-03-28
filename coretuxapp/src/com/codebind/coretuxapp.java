package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by wilsonskariah on 3/12/17.
 */
public class coretuxapp {
    private JButton Tux_launch;
    private JPanel Tuxpanel;

    public coretuxapp() {
        Tux_launch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Brandon is soo coool");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame ("coretuxapp");
        frame.setContentPane(new coretuxapp().Tuxpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
