package thousand.GUI;

import javax.swing.*;

public class WindowFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 1600;
    private static final int DEFAULT_HEIGHT = 1200;

    public WindowFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("1000");
        setResizable(false);
        setLocationRelativeTo(null);
        add(new BackgroundPanel());
        setVisible(true);
    }
}
