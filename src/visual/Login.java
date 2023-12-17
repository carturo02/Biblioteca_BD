package visual;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import services.AccountServices;
import visual.auxiliar.RoundJButton;
import visual.auxiliar.RoundJPasswordField;
import visual.auxiliar.RoundJTextField;
import visual.auxiliar.RoundedBorder;
import visual.auxiliar.TransparentPanel;

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
        private JLabel lbPass;
        private JLabel lbUser;
        private JPanel contentPane;

        public Login() {
        	setTitle("LOGIN");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(100, 100, 1300, 730);
            icon = new ImageIcon(Login.class.getResource("/img/book2.png"));
            contentPane = new JPanel(){
				private static final long serialVersionUID = 1L;
				@Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    if (icon != null) {
                        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
                    }
                }
            };
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setLocationRelativeTo(null);
            setContentPane(contentPane);
            contentPane.setLayout(new BorderLayout(0, 0));
            contentPane.add(getPanel_1(), BorderLayout.CENTER);

        }

        public Login returnThis(){
    		return this;
    	}

        private JPanel getPanel_1() {
            if (panel_1 == null) {
                panel_1 = new JPanel();
                panel_1.setOpaque(false);
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
    			transparentPanel.add(getLbPass());
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
    			textField.addFocusListener(new FocusAdapter() {
    				@Override
    				public void focusGained(FocusEvent e) {
    					lbUser.setVisible(false);
    				}
    				@Override
    				public void focusLost(FocusEvent e) {
    					if(textField.getText().isEmpty())
    						lbUser.setVisible(true);
    				}
    			});
    			Insets margin = new Insets(0, 5, 0, 0); // Establece un margen izquierdo de 10
    			textField.setMargin(margin);
    			textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
    			textField.setForeground(Color.BLACK);
    			textField.setBounds(80, 175, 240, 35);
    			textField.setColumns(10);
    			textField.setOpaque(false);
    		}
    		return textField;
    	}
    	private RoundJPasswordField getPasswordField() {
    		if (passwordField == null) {
    			passwordField = new RoundJPasswordField(5);
    			passwordField.addFocusListener(new FocusAdapter() {
    				@Override
    				public void focusGained(FocusEvent e) {
    					lbPass.setVisible(false);
    				}
    				@Override
    				public void focusLost(FocusEvent e) {
    					if(passwordField.getPassword().length == 0)
    						lbPass.setVisible(true);
    				}
    			});
    			passwordField.setBorder(new RoundedBorder(10));
    			passwordField.setFont(new Font("Tahoma", Font.BOLD, 14));
    			passwordField.setBounds(80, 227, 240, 35);
    		}
    		return passwordField;
    	}
    	private RoundJButton getBtnNewButton() {
    		if (btnNewButton == null) {
    			btnNewButton = new RoundJButton("LOGIN");
    			btnNewButton.addActionListener(new java.awt.event.ActionListener() {
    				@Override
					public void actionPerformed(java.awt.event.ActionEvent e) {
    					AccountServices account = new AccountServices();

    					if(account.getLoginUser(textField.getText(), passwordField.getPassword())) {
    						Principal p = new Principal();
    						p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    						p.setExtendedState(Frame.MAXIMIZED_BOTH);
    						dispose();
    						p.setVisible(true);

    					}else
    						JOptionPane.showMessageDialog(null, "Invalid username or wrong password");
    					passwordField.setText("");



    				}
    			});
    			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
    			btnNewButton.setBorder(new RoundedBorder(10));
    			btnNewButton.setBounds(95, 300, 160, 35);
    		}
    		return btnNewButton;
    	}
    	private JLabel getLblNewLabel_2() {
    		if (lblNewLabel_2 == null) {
    			lblNewLabel_2 = new JLabel("");
    			 URL url = getClass().getResource("/img/icono.png");
    			  ImageIcon imagenOriginal = new ImageIcon(url);
    			  lblNewLabel_2 .setIcon(imagenOriginal);
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
    	private RoundJButton getUsersbut() {
    		if (usersbut == null) {
    			usersbut = new RoundJButton("");
    			usersbut.addComponentListener(new ComponentAdapter() {
    	            @Override
    	            public void componentResized(ComponentEvent e) {
                        updateImagen("/img/usuario.png", usersbut);
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
                     updateImagen("/img/pass.png", passbut);
    	            }
    	        });
    			passbut.setBounds(27, 227, 50, 35);
    		}
    		return passbut;
    	}

    	private void updateImagen(String dir, RoundJButton et) {
    	    URL url = getClass().getResource(dir);
    	    if (url == null) {
    	        System.out.println("No se pudo encontrar el recurso: " + dir);
    	        return;
    	    }
    	    ImageIcon imagenOriginal = new ImageIcon(url);
    	    Image imagenEsc = imagenOriginal.getImage().getScaledInstance(et.getWidth()-8, et.getHeight()-8, Image.SCALE_DEFAULT);
    	    ImageIcon imagenEnd = new ImageIcon(imagenEsc);
    	    et.setIcon(imagenEnd);
    	}


    	private JRadioButton getRdbtnNewRadioButton() {
    		if (rdbtnNewRadioButton == null) {
    			rdbtnNewRadioButton = new JRadioButton("view password");
    			rdbtnNewRadioButton.addItemListener(new ItemListener() {
    			    @Override
					public void itemStateChanged(ItemEvent e) {
    			        if (e.getStateChange() == ItemEvent.SELECTED) {
    			            passwordField.setEchoChar((char) 0);
    			        } else {
    			            passwordField.setEchoChar('•');
    			        }
    			    }
    			});
    			rdbtnNewRadioButton.setOpaque(false);
    			rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
    			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
    			rdbtnNewRadioButton.setForeground(Color.WHITE);
    			rdbtnNewRadioButton.setBounds(27, 270, 293, 23);
    		}
    		return rdbtnNewRadioButton;
    	}
    	private JLabel getLbPass() {
    		if (lbPass == null) {
    			lbPass = new JLabel("password");
    			lbPass.setForeground(Color.GRAY);
    			lbPass.setFont(new Font("Dialog", Font.PLAIN, 11));
    			lbPass.setOpaque(false);
    			lbPass.setBounds(89, 237, 231, 14);
    		}
    		return lbPass;
    	}
    	private JLabel getLblNewLabel_1_2() {
    		if (lbUser == null) {
    			lbUser = new JLabel("user");
    			lbUser.setOpaque(false);
    			lbUser.setForeground(Color.GRAY);
    			lbUser.setFont(new Font("Dialog", Font.PLAIN, 11));
    			lbUser.setBounds(89, 186, 231, 14);
    		}
    		return lbUser;
    	}
    }
