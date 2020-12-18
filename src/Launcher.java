import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launcher implements ActionListener {
    /* TODO */
    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public Launcher() {

        frame = new JFrame();

        JButton button = new JButton("Start game");
        label = new JLabel("Chess");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button);
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Chess");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Launcher();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Empty
    }
}