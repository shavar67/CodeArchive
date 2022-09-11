package Random;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Options extends JFrame {

    public Options(String title){
        setSize(500,500);
        setTitle(title);
        JPanel pane = new JPanel();
        pane.setSize(350,350);
        BorderLayout layout = new BorderLayout();
        pane.setLayout(layout);
        JButton btn = new JButton("CLICK ME");
        btn.setPreferredSize(new Dimension(100,100));
        btn.addActionListener(e -> {
            String s;
            s=JOptionPane.showInputDialog("Enter Pessenger's Name");
            System.out.println(s);
        });

        pane.add(btn,BorderLayout.CENTER);
        setContentPane(pane);
        setVisible(true);

    }

    public static void main(String[] args) {
        Options win = new Options("Hello");
    }
}
