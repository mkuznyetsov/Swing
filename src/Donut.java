import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Donut extends JPanel{
    private BufferedImage image;
    private int x;
    private int y;

    public Donut(int x, int y) {
        this.x = x;
        this.y = y;

        try {
            image = ImageIO.read(new File("res/donut.bmp"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, x, y, null);
    }
}
