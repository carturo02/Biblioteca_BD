package visual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;

import javax.swing.border.EmptyBorder;

import auxiliar.RoundedBorder;
import auxiliar.TransparentPanel;
import auxiliar.RoundJTextField;
import auxiliar.RoundJPasswordField;
import auxiliar.RoundJButton;
import java.awt.event.ComponentEvent;


    public class Login extends JFrame {

        private static final long serialVersionUID = 1L;
        private JPanel panel_1;
        private ImageIcon icon;
        private TransparentPanel transparentPanel;
        private RoundJTextField textField;
        private RoundJPasswordField passwordField;
        private RoundJButton btnNewButton;
        private JLabel lblNewLabel_2;
        private JLabel lblNewLabel_3;
        private RoundJButton usersbut;
        private RoundJButton passbut;
        private JRadioButton rdbtnNewRadioButton;
        private JLabel lblNewLabel;
        private JLabel lblUser;
        private JPanel contentPane;
        
        
    	public static void main(String[] args) {
    		EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {
    					Login frame = new Login();
    					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 	
    					frame.setVisible(true);
    				} catch (Exception e) {
    					e.printStackTrace();
    				}
    			}
    		});
    	}
    	

        public Login() {
        	setTitle("LOGIN");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 1300, 730);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setLocationRelativeTo(null);
            setContentPane(contentPane);    
            contentPane.setLayout(new BorderLayout(0, 0));
            contentPane.add(getPanel_1(), BorderLayout.CENTER);
            
        }

        private JPanel getPanel_1() {
            if (panel_1 == null) {
            	icon = new ImageIcon("D:\\Informatica\\Proyectos IDE Eclipse 2023\\BD_Biblioteca\\src\\auxiliar\\book2.png");
                panel_1 = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        if (icon != null) {
                            g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
                        }
                    }
                };    
                panel_1.setLayout(null);
                panel_1.add(getTransparentPanel());
            }
            return panel_1;
        }
    	private TransparentPanel getTransparentPanel() {
    		if (transparentPanel == null) {
    			transparentPanel = new TransparentPanel();
    			transparentPanel.setOpaque(false);
    			transparentPanel.setOpacity(0.1f);
    			transparentPanel.setMinimumSize(new Dimension(350, 600));
    			transparentPanel.setBackground(Color.DARK_GRAY);
    			transparentPanel.setBounds(538, 140, 350, 400);
    			transparentPanel.setLayout(null);
    			transparentPanel.add(getLblNewLabel_1_2());
    			transparentPanel.add(getLblNewLabel());
    			transparentPanel.add(getTextField());
    			transparentPanel.add(getPasswordField());
    			transparentPanel.add(getBtnNewButton());
    			transparentPanel.add(getLblNewLabel_2());
    			transparentPanel.add(getLblNewLabel_3());
    			transparentPanel.add(getUsersbut());
    			transparentPanel.add(getPassbut());
    			transparentPanel.add(getRdbtnNewRadioButton());
    		}
    		return transparentPanel;
    	}
    	private RoundJTextField getTextField() {
    		if (textField == null) {
    			textField = new RoundJTextField(5);
    			textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
    			textField.setForeground(Color.GRAY);
    			//textField.setBorder(new RoundedBorder(10));
    			textField.setBounds(80, 175, 240, 35);
    			textField.setColumns(10);
    			textField.setOpaque(false);
    		}
    		return textField;
    	}
    	private RoundJPasswordField getPasswordField() {
    		if (passwordField == null) {
    			passwordField = new RoundJPasswordField(5);
    			passwordField.setBorder(new RoundedBorder(10));   			
    			passwordField.setBounds(80, 227, 240, 35);
    		}
    		return passwordField;
    	}
    	private RoundJButton getBtnNewButton() {
    		if (btnNewButton == null) {
    			btnNewButton = new RoundJButton("LOGIN");
    			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
    			btnNewButton.setBorder(new RoundedBorder(10));
    			btnNewButton.setBounds(95, 300, 160, 35);
    		}
    		return btnNewButton;
    	}
    	private JLabel getLblNewLabel_2() {
    		if (lblNewLabel_2 == null) {
    			lblNewLabel_2 = new JLabel("");
    			lblNewLabel_2.setIcon(new ImageIcon("D:\\Informatica\\Proyectos IDE Eclipse 2023\\Proyecto_BD_Biblioteca\\src\\img\\icono.png"));
    			lblNewLabel_2.setBounds(125, 11, 100, 100);
    		}
    		return lblNewLabel_2;
    	}
    	private JLabel getLblNewLabel_3() {
    		if (lblNewLabel_3 == null) {
    			lblNewLabel_3 = new JLabel("SIGN  IN");
    			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
    			lblNewLabel_3.setForeground(Color.WHITE);
    			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
    			lblNewLabel_3.setBounds(40, 122, 280, 42);
    		}
    		return lblNewLabel_3;
    	}
    	
    	private void actualizarImagen(String dir, JLabel et) {
            ImageIcon imagenOriginal = new ImageIcon(dir);
            Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(et.getWidth(), et.getHeight(), Image.SCALE_DEFAULT); ///
            ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
            et.setIcon(imagenFinal);
        }
    	private RoundJButton getUsersbut() {
    		if (usersbut == null) {
    			usersbut = new RoundJButton("");  	
    			usersbut.addComponentListener(new ComponentAdapter() {
    	            @Override
    	            public void componentResized(ComponentEvent e) {
    	                updateImagen("D:\\Informatica\\Proyectos IDE Eclipse 2023\\Proyecto_BD_Biblioteca\\src\\img\\usuario.png", usersbut);
    	            }
    	        });
    			usersbut.setBounds(27, 175, 50, 35);
    		}
    		return usersbut;
    	}
    	private RoundJButton getPassbut() {
    		if (passbut == null) {
    			passbut = new RoundJButton("");  			
    			passbut.setBorder(new RoundedBorder(10));
    			passbut.addComponentListener(new ComponentAdapter() {
    	            @Override
    	            public void componentResized(ComponentEvent e) {
    	                updateImagen("D:\\Informatica\\Proyectos IDE Eclipse 2023\\Proyecto_BD_Biblioteca\\src\\img\\pass.png", passbut);
    	            }
    	        });
    			passbut.setBounds(27, 227, 50, 35);
    		}
    		return passbut;
    	}
    		
    		private void updateImagen(String dir, RoundJButton et) {
    	        ImageIcon imagenOriginal = new ImageIcon(dir);
    	        Image imagenEsc = imagenOriginal.getImage().getScaledInstance(et.getWidth()-8, et.getHeight()-8, Image.SCALE_DEFAULT); ///
    	        ImageIcon imagenEnd = new ImageIcon(imagenEsc);
    	        et.setIcon(imagenEnd);
    	    }
    		
    	
    	private JRadioButton getRdbtnNewRadioButton() {
    		if (rdbtnNewRadioButton == null) {
    			rdbtnNewRadioButton = new JRadioButton("view password");
    			rdbtnNewRadioButton.setOpaque(false);
    			rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
    			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
    			rdbtnNewRadioButton.setForeground(Color.WHITE);
    			rdbtnNewRadioButton.setBounds(27, 270, 293, 23);
    		}
    		return rdbtnNewRadioButton;
    	}
    	private JLabel getLblNewLabel() {
    		if (lblNewLabel == null) {
    			lblNewLabel = new JLabel("password");
    			lblNewLabel.setForeground(Color.GRAY);
    			lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 11));
    			lblNewLabel.setOpaque(false);
    			lblNewLabel.setBounds(89, 237, 231, 14);
    		}
    		return lblNewLabel;
    	}
    	private JLabel getLblNewLabel_1_2() {
    		if (lblUser == null) {
    			lblUser = new JLabel("user");
    			lblUser.setOpaque(false);
    			lblUser.setForeground(Color.GRAY);
    			lblUser.setFont(new Font("Dialog", Font.PLAIN, 11));
    			lblUser.setBounds(89, 186, 231, 14);
    		}
    		return lblUser;
    	}
    }
