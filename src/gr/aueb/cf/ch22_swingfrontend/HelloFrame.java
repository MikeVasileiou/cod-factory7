package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class HelloFrame extends JFrame {

    public HelloFrame() {
        setTitle("Hello Coding Frame");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.add(new JLabel("Coding Factory"));

        JButton btn = new JButton("Click me");
        contentPane.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello Coding Factory","Hello", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
