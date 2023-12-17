package visual.auxiliar;


import javax.swing.*;
import java.awt.*;


public class TransparentDialog extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private float opacity;

    public TransparentDialog() {
       // this.opacity = 1;
        this.setUndecorated(true);
    }

    public void setOpacity(float opacity) {
      //  this.opacity = opacity;
        this.repaint();
    }

    /*
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setComposite(AlphaComposite.SrcOver.derive(opacity));
        super.paintComponent(g2d);
        g2d.dispose();
    }
    */
    
    // Aquí puedes agregar los métodos que necesites, por ejemplo:
    public void setColor(Color color) {
        this.setBackground(color);
    }
    
    public void setBonds(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
    }
    
    public void setModal(boolean modal) {
        this.setModal(modal);
    }
}
