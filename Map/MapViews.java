import javax.swing.*;
import java.awt.*;

public class MapViews extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2.setColor(new Color(139, 69, 19));
        g2.fillRect(0, getHeight() - 100, getWidth(), 100);

        g2.setColor(new Color(0,   255, 0));
        g2.fillRect(155,200, 200, 15);

        g2.setColor(new Color(12, 200, 0));
        g2.fillRect(580, 175, 200, 15); 
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("World Game");
        frame.add(new MapViews());
        frame.setSize(800, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}