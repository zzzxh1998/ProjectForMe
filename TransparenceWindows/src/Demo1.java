import javax.swing.*;

public class TransparentExample {
    public TransparentExample() {

        super("TransparentExample");

        JPanel panel = new JPanel();
        panel.add(new JButton("Button"));

        setContentPane(panel);
        setBackground(new Color(0, 0, 0, 0));
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);

        TransparentExample frame = new TransparentExample();
        frame.setVisible(true);

    }

}
