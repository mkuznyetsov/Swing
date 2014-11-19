import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Donut extends JPanel {
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
        g.drawImage(image, 0, 0, null);
    }

    public void moveRight(int step) {
        x += step;
    }

    public void moveLeft(int step) {
        x -= step;
    }

    public void moveUp(int step) {
        y += step;
    }

    public void moveDown(int step) {
        y -= step;
    }

    public boolean isRightSideEnd(int rightSideEnd) {
        return x >= rightSideEnd;
    }

    public boolean isLefttSideEnd(int leftSideEnd) {
        return x >= leftSideEnd;
    }

    public boolean isTop(int top) {
        return y <= top;
    }

    public boolean isBottom(int bottom) {
        return y >= bottom;
    }

}
