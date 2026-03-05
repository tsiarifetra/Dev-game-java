import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.image.BufferedImage;

public class MapViews extends JPanel {
    public void paint(Graphics g ){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Random rand = new Random(42);
        
        BufferedImage motifTerre = new BufferedImage(6, 6, BufferedImage.TYPE_INT_RGB);
        Graphics2D mt = motifTerre.createGraphics();
        mt.setColor(new Color(101, 67, 33));
        mt.fillRect(0, 0, 6, 6);

        // Coin haut-gauche : Noir mat (Ombre/Roche)
        mt.setColor(new Color(25, 25, 25)); 
        mt.fillRect(0, 0, 3, 3);

        // Coin bas-droit : Marron clair (Relief/Lumière)
        mt.setColor(new Color(120, 80, 40));
        mt.fillRect(3, 3, 3, 3);
        mt.dispose();

        TexturePaint textureTerre = new TexturePaint(motifTerre, new Rectangle(0, 0, 6, 6));
        g2.setPaint(textureTerre);
        g2.fillRect(0, 400, 800, 100);

        g2.fillRect(200, 320, 200 ,100);

        BufferedImage imageGrass = new BufferedImage(6, 6, BufferedImage.TYPE_INT_RGB);
        Graphics2D gGrass = imageGrass.createGraphics();
        gGrass.setColor(new Color(34, 139, 34)); // Forest Green
        gGrass.fillRect(0, 0, 6, 6);

        // Détail 1 : Vert sombre (Ombre/Profondeur)
        gGrass.setColor(new Color(20, 60, 20)); 
        gGrass.fillRect(0, 0, 3, 3);

        // Détail 2 : Vert olive/jaune (Reflet/Lumière)
        gGrass.setColor(new Color(107, 142, 35)); // Olive Drab
        gGrass.fillRect(3, 3, 3, 3);
        gGrass.dispose();

        TexturePaint grassTexture = new TexturePaint(imageGrass, new Rectangle(1,1,8,6));
        g2.setPaint(grassTexture);
        g2.fillRect(0, 400, 200, 5);
        }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zone 1");
        frame.add(new MapViews());
        frame.setSize(800, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}