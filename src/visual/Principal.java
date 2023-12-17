package visual;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
<<<<<<< HEAD
=======
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.net.URL;
import java.time.LocalDate;

import java.awt.image.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
<<<<<<< HEAD
import javax.swing.border.EmptyBorder;

import com.lowagie.text.Image;

import auxiliar.RoundJButton;
import auxiliar.RoundJTextField;
import auxiliar.RoundedBorder;
import auxiliar.TransparentPanel;
=======
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import visual.auxiliar.RoundJButton;
import visual.auxiliar.RoundJTextField;
import visual.auxiliar.RoundedBorder;
import visual.auxiliar.TransparentPanel;
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e


public class Principal extends JFrame {

	 public static void main(String[] args) {
		    load_screen();


		    }

			private static void load_screen() {
					EventQueue.invokeLater(new Runnable() {
						@Override
						public void run() {
							try {
								Principal frame = new Principal();
								frame.setVisible(true);
<<<<<<< HEAD
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
=======
								frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e
								frame.setExtendedState(Frame.MAXIMIZED_BOTH);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});

			}

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private ImageIcon icon;
	 private JPanel panel;
	 private RoundJButton btnNewButton;
	 private TransparentPanel panel_2;
	 private TransparentPanel panelLoan;
	 private TransparentPanel panel_2_1_1;
	 private RoundJButton btnNewButton_2;
	 private RoundJButton btnNewButton_3;
	 private RoundJButton btnNewButton_1_1;
	 private RoundJButton btnNewButton_1_1_1;
	 private JLabel lblNewLabel_2;
	 private RoundJButton btnNewButton_3_1_1_1_1_1;
	 private RoundJButton btnNewButton_3_1_1_1_1_2;
	 private JLabel lblNewLabel_3;
	 private RoundJTextField textField;
	 private TransparentPanel panel_2_1_2_1;
	 private JLabel lblControlDeRecursos;
	 private TransparentPanel panel_2_1_2;
	 private JLabel lblNewLabel;
	 private TransparentPanel panel_2_1_2_2;
	 private JLabel lblNewLabel_1;
	 private JLabel lblNewLabel_4;
	 private JLabel lblNewLabel_4_1_1;
	 private JLabel lblNewLabel_4_1_1_1;
	 private JLabel lblNewLabel_4_1_1_2_1;
	 private JLabel lblNewLabel_5;
	 private JLabel lblNewLabel_5_1;
	 private JLabel lblNewLabel_5_1_1;
	 private JLabel lblNewLabel_5_1_1_1_1_1;
	 private JLabel lblNewLabel_5_1_1_1_1_2;
	 private JLabel lblNewLabel_4_1_1_2;
	 private JLabel lblNewLabel_4_1;
	 private JLabel lblNewLabel_4_1_1_3;
	 private TransparentPanel panel_2_1_1_1;
	 private JLabel lblNewLabel_4_1_1_1_1;
	 private RoundJButton btnNewButton_2_1;
	 private TransparentPanel panel_2_1_2_2_1;
	 private JLabel lblNewLabel_1_1;
	 private JLabel lblNewLabel_5_1_1_1_1_2_1;


	 public Principal() {
		    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		    setBounds(100, 100, 1400, 768);
<<<<<<< HEAD
		    final ImageIcon icon = new ImageIcon("D:\\Informatica\\Proyectos IDE Eclipse 2023\\BD_Biblioteca\\src\\auxiliar\\book1.png");
=======
		    //icon = new ImageIcon(Login.class.getResource("/img/book1.png"));
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e
		    JPanel contentPane = new JPanel() {
		        @Override
		        protected void paintComponent(Graphics g) {
		            super.paintComponent(g);
		            if (icon != null) {
		                g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		            }
		        }
		    };
		    contentPane.setBackground(Color.LIGHT_GRAY);
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    setContentPane(contentPane);
		    contentPane.setLayout(null);
		    contentPane.add(getLblNewLabel_4_1_1());
		    contentPane.add(getPanel());
		    contentPane.add(getPanel_2());
		    contentPane.add(getPanelLoan());
		    contentPane.add(getPanel_2_1_1());
		    contentPane.add(getLblNewLabel_4_1_1_3());
		    contentPane.add(getPanel_2_1_1_1());
		}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setBorder(new RoundedBorder(5));
			panel.setBounds(0, 0, 1370, 80);
			panel.setLayout(null);
			panel.add(getLblNewLabel_2());
			panel.add(getBtnNewButton_3_1_1_1_1_1());
			panel.add(getBtnNewButton_3_1_1_1_1_2());
			panel.add(getLblNewLabel_3());
			panel.add(getTextField_1());
		}
		return panel;
	}
	private RoundJButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new RoundJButton("");
			btnNewButton.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/prestamo.png", btnNewButton);
	            }
	        });
			btnNewButton.setBounds(147, 100, 118, 90);
		}
		return btnNewButton;
	}
	private TransparentPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new TransparentPanel();
			panel_2.setOpaque(false);
			panel_2.setBackground(new Color(105, 105, 105));
<<<<<<< HEAD
			panel_2.setBounds(150, 128, 1068, 230);
=======
			panel_2.setBounds(163, 128, 1044, 230);
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e

			panel_2.setLayout(null);
			panel_2.add(getPanel_2_1_2_1_1());
			panel_2.add(getLblNewLabel_4());
			panel_2.add(getBtnNewButton_3());
			panel_2.add(getBtnNewButton_1_1());
			panel_2.add(getBtnNewButton_1_1_1());
			panel_2.add(getLblNewLabel_5());
			panel_2.add(getLblNewLabel_5_1());
			panel_2.add(getLblNewLabel_5_1_1());
			panel_2.add(getLblNewLabel_4_1());
		}
		return panel_2;
	}
	private TransparentPanel getPanelLoan() {
		if (panelLoan == null) {
			panelLoan = new TransparentPanel();
			panelLoan.setOpaque(false);
			panelLoan.setBackground(new Color(105, 105, 105));
			panelLoan.setBounds(163, 390, 413, 225);
			panelLoan.setLayout(null);
			panelLoan.add(getBtnNewButton());
			panelLoan.add(getPanel_2_1_2_1());
			panelLoan.add(getLblNewLabel_4_1_1_2_1());
			panelLoan.add(getLblNewLabel_5_1_1_1_1_1());
			panelLoan.add(getLblNewLabel_4_1_1_2_2());
		}
		return panelLoan;
	}
	private TransparentPanel getPanel_2_1_1() {
		if (panel_2_1_1 == null) {
			panel_2_1_1 = new TransparentPanel();
			panel_2_1_1.setOpaque(false);
			panel_2_1_1.setBackground(new Color(105, 105, 105));
			panel_2_1_1.setLayout(null);
			panel_2_1_1.setBorder(null);
			panel_2_1_1.setBounds(907, 390, 300, 225);
			panel_2_1_1.add(getLblNewLabel_4_1_1_1());
			panel_2_1_1.add(getBtnNewButton_2());
			panel_2_1_1.add(getPanel_2_1_2_2_1());
			panel_2_1_1.add(getLblNewLabel_5_1_1_1_1_2());
		}
		return panel_2_1_1;
	}
	private RoundJButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new RoundJButton("");
			btnNewButton_2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_2.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/salida.png", btnNewButton_2);
	            }
	        });
			btnNewButton_2.setBounds(88, 100, 118, 90);
		}
		return btnNewButton_2;
	}
	private RoundJButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new RoundJButton("");
			btnNewButton_3.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/libro.png", btnNewButton_3);
	            }
	        });
			btnNewButton_3.setBounds(180, 100, 118, 90);
		}
		return btnNewButton_3;
	}
	private RoundJButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new RoundJButton("");
			btnNewButton_1_1.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/materia.png", btnNewButton_1_1);
	            }
	        });
			btnNewButton_1_1.setBounds(463, 100, 118, 90);
		}
		return btnNewButton_1_1;
	}
	private RoundJButton getBtnNewButton_1_1_1() {
		if (btnNewButton_1_1_1 == null) {
			btnNewButton_1_1_1 = new RoundJButton("");
			btnNewButton_1_1_1.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/autor.png", btnNewButton_1_1_1);
	            }
	        });

<<<<<<< HEAD
			btnNewButton_1_1_1.setBounds(409, 100, 118, 90);
=======
			btnNewButton_1_1_1.setBounds(740, 100, 118, 90);
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e
		}
		return btnNewButton_1_1_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Library Management System");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setBounds(498, 27, 374, 25);
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel_2;
	}
	private RoundJButton getBtnNewButton_3_1_1_1_1_1() {
		if (btnNewButton_3_1_1_1_1_1 == null) {
			btnNewButton_3_1_1_1_1_1 = new RoundJButton("");
			btnNewButton_3_1_1_1_1_1.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/usuario.png", btnNewButton_3_1_1_1_1_1);
	            }
	        });
			btnNewButton_3_1_1_1_1_1.setBounds(32, 7, 80, 62);
		}
		return btnNewButton_3_1_1_1_1_1;
	}
	private RoundJButton getBtnNewButton_3_1_1_1_1_2() {
		if (btnNewButton_3_1_1_1_1_2 == null) {
			btnNewButton_3_1_1_1_1_2 = new RoundJButton("");
			btnNewButton_3_1_1_1_1_2.addComponentListener(new ComponentAdapter() {
	            @Override
	            public void componentResized(ComponentEvent e) {
	            	updateImagen("/img/opciones.png", btnNewButton_3_1_1_1_1_2);
	            }
	        });
			btnNewButton_3_1_1_1_1_2.setBounds(138, 7, 80, 62);
		}
		return btnNewButton_3_1_1_1_1_2;
	}

<<<<<<< HEAD
	private void actualizarImagen(String dir, RoundJButton et) {
        ImageIcon imagenOriginal = new ImageIcon(dir);
        java.awt.Image imagenEscalada = imagenOriginal.getImage().getScaledInstance(et.getWidth()-5,et.getHeight()-5, java.awt.Image.SCALE_DEFAULT);
        ImageIcon imagenFinal = new ImageIcon(imagenEscalada);
        		//new ImageIcon(imagenEscalada);
        et.setIcon(imagenFinal);
    }
=======
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

>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setBounds(32, 7, 69, 62);
		}
		return lblNewLabel_3;
	}
	private RoundJTextField getTextField_1() {
		if (textField == null) {
			textField = new RoundJTextField(25);
			textField.setText(LocalDate.now() + "");
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setFont(new Font("Tahoma", Font.BOLD, 16));
			textField.setEditable(false);
			textField.setDisabledTextColor(new Color(255, 250, 250));
			textField.setColumns(10);
			textField.setBackground(Color.WHITE);
			textField.setArcWidth(33);
			textField.setArcHeight(33);
			textField.setBounds(912, 26, 425, 26);
		}
		return textField;
	}
	private TransparentPanel getPanel_2_1_2_1_1() {
		if (panel_2_1_2_1 == null) {
			panel_2_1_2_1 = new TransparentPanel();
			panel_2_1_2_1.setOpaque(false);
			///panel_2_1_2_1.setBorder(new RoundedBorder(10));
			panel_2_1_2_1.setBackground(Color.BLACK);
			panel_2_1_2_1.setBounds(0, -1, 1044, 50);
			panel_2_1_2_1.add(getLblControlDeRecursos_1());
		}
		return panel_2_1_2_1;
	}
	private JLabel getLblControlDeRecursos_1() {
		if (lblControlDeRecursos == null) {
			lblControlDeRecursos = new JLabel("Resource Control");
			lblControlDeRecursos.setForeground(Color.WHITE);
			lblControlDeRecursos.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblControlDeRecursos;
	}
	private TransparentPanel getPanel_2_1_2_1() {
		if (panel_2_1_2 == null) {
			panel_2_1_2 = new TransparentPanel();
			panel_2_1_2.setOpaque(false);
			panel_2_1_2.setBorder(null);
			panel_2_1_2.setBackground(Color.BLACK);
			panel_2_1_2.setBounds(0, 0, 413, 45);
			panel_2_1_2.add(getLblNewLabel());
		}
		return panel_2_1_2;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Loan Control");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel;
	}
	private TransparentPanel getPanel_2_1_2_2_1() {
		if (panel_2_1_2_2 == null) {
			panel_2_1_2_2 = new TransparentPanel();
			panel_2_1_2_2.setOpaque(false);
			panel_2_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			panel_2_1_2_2.setBorder(null);
			panel_2_1_2_2.setBackground(Color.BLACK);
			panel_2_1_2_2.setBounds(0, -1, 300, 45);
			panel_2_1_2_2.add(getLblNewLabel_1());
		}
		return panel_2_1_2_2;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Exit");
			lblNewLabel_1.setForeground(Color.WHITE);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setOpaque(true);
			lblNewLabel_4.setBackground(Color.BLACK);
			lblNewLabel_4.setBounds(0, 24, 46, 24);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_4_1_1() {
		if (lblNewLabel_4_1_1 == null) {
			lblNewLabel_4_1_1 = new JLabel("");
			lblNewLabel_4_1_1.setOpaque(true);
			lblNewLabel_4_1_1.setBackground(Color.BLACK);
			lblNewLabel_4_1_1.setBounds(1160, 409, 46, 24);
		}
		return lblNewLabel_4_1_1;
	}
	private JLabel getLblNewLabel_4_1_1_1() {
		if (lblNewLabel_4_1_1_1 == null) {
			lblNewLabel_4_1_1_1 = new JLabel("");
			lblNewLabel_4_1_1_1.setOpaque(true);
			lblNewLabel_4_1_1_1.setBackground(Color.BLACK);
			lblNewLabel_4_1_1_1.setBounds(0, 19, 46, 24);
		}
		return lblNewLabel_4_1_1_1;
	}
	private JLabel getLblNewLabel_4_1_1_2_1() {
		if (lblNewLabel_4_1_1_2_1 == null) {
			lblNewLabel_4_1_1_2_1 = new JLabel("");
			lblNewLabel_4_1_1_2_1.setOpaque(true);
			lblNewLabel_4_1_1_2_1.setBackground(Color.BLACK);
			lblNewLabel_4_1_1_2_1.setBounds(0, 20, 46, 24);
		}
		return lblNewLabel_4_1_1_2_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Bookcase");
			lblNewLabel_5.setForeground(new Color(75, 0, 130));
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5.setBounds(180, 72, 118, 25);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_5_1() {
		if (lblNewLabel_5_1 == null) {
			lblNewLabel_5_1 = new JLabel("Subjects");
			lblNewLabel_5_1.setForeground(new Color(75, 0, 130));
			lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5_1.setBounds(463, 72, 118, 25);
		}
		return lblNewLabel_5_1;
	}
	private JLabel getLblNewLabel_5_1_1() {
		if (lblNewLabel_5_1_1 == null) {
			lblNewLabel_5_1_1 = new JLabel("Authors");
			lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_1.setForeground(new Color(75, 0, 130));
			lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5_1_1.setBounds(743, 72, 118, 25);
		}
		return lblNewLabel_5_1_1;
	}
	private JLabel getLblNewLabel_5_1_1_1_1_1() {
		if (lblNewLabel_5_1_1_1_1_1 == null) {
			lblNewLabel_5_1_1_1_1_1 = new JLabel("Loans");
			lblNewLabel_5_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_1_1_1_1.setForeground(new Color(75, 0, 130));
			lblNewLabel_5_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5_1_1_1_1_1.setBounds(147, 73, 118, 25);
		}
		return lblNewLabel_5_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_5_1_1_1_1_2() {
		if (lblNewLabel_5_1_1_1_1_2 == null) {
			lblNewLabel_5_1_1_1_1_2 = new JLabel("Close");
			lblNewLabel_5_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_1_1_1_2.setForeground(new Color(75, 0, 130));
			lblNewLabel_5_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5_1_1_1_1_2.setBounds(88, 72, 118, 25);
		}
		return lblNewLabel_5_1_1_1_1_2;
	}
	private JLabel getLblNewLabel_4_1_1_2_2() {
		if (lblNewLabel_4_1_1_2 == null) {
			lblNewLabel_4_1_1_2 = new JLabel("");
			lblNewLabel_4_1_1_2.setOpaque(true);
			lblNewLabel_4_1_1_2.setBackground(Color.BLACK);
			lblNewLabel_4_1_1_2.setBounds(366, 20, 46, 24);
		}
		return lblNewLabel_4_1_1_2;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("");
			lblNewLabel_4_1.setOpaque(true);
			lblNewLabel_4_1.setBackground(Color.BLACK);
			lblNewLabel_4_1.setBounds(997, 24, 46, 24);
		}
		return lblNewLabel_4_1;
	}
	private JLabel getLblNewLabel_4_1_1_3() {
		if (lblNewLabel_4_1_1_3 == null) {
			lblNewLabel_4_1_1_3 = new JLabel("");
			lblNewLabel_4_1_1_3.setOpaque(true);
			lblNewLabel_4_1_1_3.setBackground(Color.BLACK);
			lblNewLabel_4_1_1_3.setBounds(839, 409, 46, 24);
		}
		return lblNewLabel_4_1_1_3;
	}
	private TransparentPanel getPanel_2_1_1_1() {
		if (panel_2_1_1_1 == null) {
			panel_2_1_1_1 = new TransparentPanel();
			panel_2_1_1_1.setLayout(null);
			panel_2_1_1_1.setOpaque(false);
			panel_2_1_1_1.setBorder(null);
			panel_2_1_1_1.setBackground(UIManager.getColor("Button.darkShadow"));
			panel_2_1_1_1.setBounds(586, 390, 300, 225);
			panel_2_1_1_1.add(getLblNewLabel_4_1_1_1_1());
			panel_2_1_1_1.add(getBtnNewButton_2_1());
			panel_2_1_1_1.add(getPanel_2_1_2_2_1_1());
			panel_2_1_1_1.add(getLblNewLabel_5_1_1_1_1_2_1());
		}
		return panel_2_1_1_1;
	}
	private JLabel getLblNewLabel_4_1_1_1_1() {
		if (lblNewLabel_4_1_1_1_1 == null) {
			lblNewLabel_4_1_1_1_1 = new JLabel("");
			lblNewLabel_4_1_1_1_1.setOpaque(true);
			lblNewLabel_4_1_1_1_1.setBackground(Color.BLACK);
			lblNewLabel_4_1_1_1_1.setBounds(0, 19, 46, 24);
		}
		return lblNewLabel_4_1_1_1_1;
	}
	private RoundJButton getBtnNewButton_2_1() {
		if (btnNewButton_2_1 == null) {
			btnNewButton_2_1 = new RoundJButton("");
			btnNewButton_2_1.setBounds(88, 100, 118, 90);
		}
		return btnNewButton_2_1;
	}
	private TransparentPanel getPanel_2_1_2_2_1_1() {
		if (panel_2_1_2_2_1 == null) {
			panel_2_1_2_2_1 = new TransparentPanel();
			panel_2_1_2_2_1.setOpaque(false);
			panel_2_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			panel_2_1_2_2_1.setBorder(null);
			panel_2_1_2_2_1.setBackground(Color.BLACK);
			panel_2_1_2_2_1.setBounds(0, -1, 300, 45);
			panel_2_1_2_2_1.add(getLblNewLabel_1_1());
		}
		return panel_2_1_2_2_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Reports");
			lblNewLabel_1_1.setForeground(Color.WHITE);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_5_1_1_1_1_2_1() {
		if (lblNewLabel_5_1_1_1_1_2_1 == null) {
			lblNewLabel_5_1_1_1_1_2_1 = new JLabel("Reports");
			lblNewLabel_5_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_1_1_1_2_1.setForeground(new Color(75, 0, 130));
			lblNewLabel_5_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_5_1_1_1_1_2_1.setBounds(88, 72, 118, 25);
		}
		return lblNewLabel_5_1_1_1_1_2_1;
	}
}
