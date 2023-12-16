package auxiliar;

import java.awt.Graphics;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JTextField;

public class RoundJTextField extends JTextField {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Shape shape;
    private int arcWidth;
    private int arcHeight;

    public RoundJTextField(int size) {
        super(size);
        setOpaque(false);
        this.arcWidth = 15;
        this.arcHeight = 15;
    }

    protected void paintComponent(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        super.paintComponent(g);
    }

    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
    }

    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, arcWidth, arcHeight);
        }
        return shape.contains(x, y);
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }
}

