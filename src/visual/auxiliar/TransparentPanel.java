package visual.auxiliar;

import javax.swing.*;
import java.awt.*;

public class TransparentPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float opacity;

    public TransparentPanel() {
        this.opacity = 1;
    }

    public void setOpacity(float opacity) {
        this.opacity = opacity;
        this.repaint();
    }
    
    public float getOpacity() {
    	return opacity;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 50, 50);
    }
    
    // Aquí puedes agregar los métodos que necesites, por ejemplo:
    public void setColor(Color color) {
        this.setBackground(color);
    }
    
    public void setBonds(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
    }
}
