import javax.swing.*;
import java.awt.*;

public class MyFrame {
    private final int BACKGROUND_WIDTH = 500;
    private final int BACKGROUND_HEIGHT = 500;
    private final int TOP_PANEL_WIDTH = 300;
    private final int TOP_PANEL_HEIGTH = 300;
    private final int TOP_PANEL_LOCATION_X = 10;
    private final int TOP_PANEL_LOCATION_Y = 10;

    private JPanel topPanel;

    public MyFrame(String title) {
        JFrame backroundFrame = new JFrame(title);
        topPanel = new JPanel();
        Donut donut = new Donut(TOP_PANEL_LOCATION_X,TOP_PANEL_LOCATION_Y);

        backroundFrame.setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        backroundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backroundFrame.setLayout(null);
        backroundFrame.setBackground(Color.GRAY);
        backroundFrame.setVisible(true);
        topPanel.setBounds(TOP_PANEL_LOCATION_X, TOP_PANEL_LOCATION_Y, TOP_PANEL_WIDTH, TOP_PANEL_HEIGTH);
        topPanel.setBackground(Color.WHITE);
        backroundFrame.add(topPanel);
        donut.setBounds(TOP_PANEL_LOCATION_X,TOP_PANEL_LOCATION_Y,50,50);
        topPanel.add(donut);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame("Lab6");
            }
        });
    }

}
