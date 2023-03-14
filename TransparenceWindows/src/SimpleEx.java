import javax.swing.*;
import java.awt.*;

public class SimpleEx extends JFrame {
    public SimpleEx() {
        initUI();
    }

    private void initUI() {
        Container container = getContentPane();
        setTitle("Simple example");
        setSize(300, 200);
        JButton jButton = new JButton("qq");
        jButton.setBounds(10, 10, 10, 10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        container.add(jButton);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleEx simpleEx = new SimpleEx();
            simpleEx.setVisible(true);
        });
    }

}
