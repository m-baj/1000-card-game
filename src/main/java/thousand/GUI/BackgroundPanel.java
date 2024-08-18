package thousand.GUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class BackgroundPanel extends JPanel {
    private final Image backgroundImage;

    public BackgroundPanel() {
        String backgroundPath = "/home/mbaj/IdeaProjects/1000-card-game/src/main/resources/backgrounds/9999520.jpg";
        this.backgroundImage = new ImageIcon(backgroundPath).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, this);
    }
}
