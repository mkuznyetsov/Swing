import javax.swing.*;
import java.awt.*;

public class MyFrame {
    private final int BACKGROUND_WIDTH = 500;
    private final int BACKGROUND_HEIGHT = 500;
    private final int TOP_PANEL_WIDTH = 300;
    private final int TOP_PANEL_HEIGTH = 300;

    private JPanel topPanel;

    public MyFrame(String title) {
        JFrame backroundFrame = new JFrame(title);
        topPanel = new JPanel();

        backroundFrame.setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        backroundFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backroundFrame.getContentPane().setBackground(Color.GRAY);
        backroundFrame.setVisible(true);
        //topPanel.setBounds(0,0,TOP_PANEL_WIDTH, TOP_PANEL_HEIGTH);
        topPanel.setLocation(0,0);
        topPanel.setPreferredSize(new Dimension(TOP_PANEL_WIDTH, TOP_PANEL_HEIGTH));
        topPanel.setBackground(Color.WHITE);
        topPanel.setLayout(new BorderLayout(10, 10));
        backroundFrame.add(topPanel,BorderLayout.CENTER);

    }

    /*public void run() {
        Donut donut = new Donut(topPanel.);
        topPanel.add(donut);
    }*/

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MyFrame("Lab6");
            }
        });
    }

}
