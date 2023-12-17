package visual.auxiliar;


import javax.swing.border.Border;
import java.awt.*;

public class RoundedBorder implements Border {

    private int radius;

    /**
     * This class is used to create the final border
     * @param radius
     */
    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawRoundRect(x, y, width-1, height-1, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius/2, this.radius, this.radius/2, this.radius);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
