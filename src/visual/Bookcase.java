package visual;

import java.awt.EventQueue;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.LineBorder;

import auxiliar.RoundJButton;
import auxiliar.RoundJTextField;
import auxiliar.RoundedBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Bookcase extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private RoundJTextField textField;
	private JPanel panelInterno;
	private JSplitPane splitPane;
	private JPanel panelCentral;
	private JPanel panelIzquierdo;
	private JLabel lblNewLabel;
	private RoundJButton btnNewButton;
	private RoundJButton rndjbtnInsertBook;
	private RoundJButton rndjbtnUpdateBook;
	private RoundJButton rndjbtnInsertBook_1;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JTextArea textArea;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_1_2_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_2_2;
	private JLabel lblNewLabel_1_2_2_1;
	private JLabel lblNewLabel_1_2_2_1_1;
	private JLabel lblNewLabel_1_2_2_1_1_1;
	private JLabel lblNewLabel_1_2_2_1_1_1_1;
	private JLabel lblNewLabel_1_2_2_1_1_1_1_1;
	private RoundJTextField textField_2;
	private RoundJTextField textField_3;
	private RoundJTextField textField_4;
	private RoundJTextField textField_5;
	private RoundJTextField textField_6;
	private RoundJTextField textField_7;
	private RoundJButton btnNewButton_1;
	private RoundJButton btnNewButton_1_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookcase dialog = new Bookcase();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/* CENTRAR TODOS LOS TEXTOS DE LOS TEXT FIELD Y JUSTIFICAR EL TEXT AREA*/

	
	public Bookcase() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setForeground(Color.BLACK);
		setTitle("BOOKCASE");
		setBounds(100, 100, 1200, 600);
		getContentPane().setLayout(null);
		getContentPane().add(getPanel());
		getContentPane().add(getPanel_1());

	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.DARK_GRAY);
			panel.setBounds(0, 0, 1184, 40);
			panel.setLayout(null);
			panel.add(getTextField());
		}
		return panel;
	}
	private RoundJTextField getTextField() {
		if (textField == null) {
			textField = new RoundJTextField(25);
			textField.setDisabledTextColor(new Color(255, 250, 250));
			textField.setBackground(new Color(255, 255, 255));
			textField.setArcWidth(33);
			textField.setArcHeight(33);
			textField.setBounds(48, 7, 950, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JPanel getPanel_1() {
		if (panelInterno == null) {
			panelInterno = new JPanel();
			panelInterno.setOpaque(false);
			panelInterno.setBackground(Color.LIGHT_GRAY);
			//panelInterno = new JPanel(null);
			panelInterno.setBorder(new RoundedBorder(5));
			panelInterno.setBounds(0, 40, 1140, 513);					
            panelInterno.setLayout(null);
            panelInterno.add(getSplitPane()); 
			//panelInterno.add(getSplitPane()); 
    }
    return panelInterno;
   }


	private JSplitPane getSplitPane() {
	    if (splitPane == null) {
	    	JPanel centralPanel = getCentral();
	        centralPanel.setPreferredSize(new Dimension(935 - 300, 513)); // Establece el tamaño preferido del panel central
	        
	        centralPanel.setMinimumSize(new Dimension(0, 0)); // Establece el tamaño mínimo del panel central
	        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, getIzquierdo(), getCentral());
	        splitPane.setBorder(new RoundedBorder(5));
	        splitPane.setBounds(5, 2, 1135, 509);
	        splitPane.setDividerLocation(0);
	        splitPane.setEnabled(false);

	        splitPane.addMouseMotionListener(new MouseMotionAdapter() {
	            int lastDividerLocation = 0;
	            int maxDividerLocation = 300;  // Posición máxima del divisor

	            @Override
	            public void mouseMoved(MouseEvent e) {
	                int mouseX = e.getX();
	                int dividerLocation = splitPane.getDividerLocation();

	                // Si el ratón está a menos de 50 píxeles del divisor
	                if (Math.abs(mouseX - dividerLocation) < 50 && dividerLocation < maxDividerLocation) {
	                    // Mueve el divisor 300 píxeles a la derecha
	                    lastDividerLocation = dividerLocation + 300;
	                    splitPane.setDividerLocation(lastDividerLocation);
	                } else if (Math.abs(mouseX - lastDividerLocation) >= 300) {
	                    // Si el ratón se aleja, vuelve a la posición inicial
	                    lastDividerLocation = 0;
	                    splitPane.setDividerLocation(lastDividerLocation);
	                }
	            }
	        });
	    }
	    return splitPane;
	}

/*
	
	private JSplitPane getSplitPane() {
	    if (splitPane == null) {
	        JPanel centralPanel = getCentral();
	        centralPanel.setLayout(new GridBagLayout());

	        GridBagConstraints constraints = new GridBagConstraints();
	        constraints.fill = GridBagConstraints.BOTH;
	        constraints.weightx = 1.0;
	        constraints.weighty = 1.0;

	        for (Component component : centralPanel.getComponents()) {
	            centralPanel.add(component, constraints);
	        }

	        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, getIzquierdo(), centralPanel);
	        splitPane.setDividerLocation(0);
	        splitPane.setEnabled(false);

	        splitPane.addMouseMotionListener(new MouseMotionAdapter() {
	            int lastDividerLocation = 0;
	            int maxDividerLocation = 300;  // Posición máxima del divisor

	            @Override
	            public void mouseMoved(MouseEvent e) {
	                int mouseX = e.getX();
	                int dividerLocation = splitPane.getDividerLocation();

	                // Si el ratón está a menos de 50 píxeles del divisor
	                if (Math.abs(mouseX - dividerLocation) < 50 && dividerLocation < maxDividerLocation) {
	                    // Mueve el divisor 300 píxeles a la derecha
	                    lastDividerLocation = dividerLocation + 300;
	                    splitPane.setDividerLocation(lastDividerLocation);
	                } else if (Math.abs(mouseX - lastDividerLocation) >= 350) {
	                    // Si el ratón se aleja, vuelve a la posición inicial
	                    lastDividerLocation = 0;
	                    splitPane.setDividerLocation(lastDividerLocation);
	                }
	            }
	        });
	    }
	    return splitPane;
	}

*/
    
    private JPanel getCentral() {
		if (panelCentral == null) {
			panelCentral = new JPanel();
			panelCentral.setBackground(Color.LIGHT_GRAY);
			panelCentral.setBounds(0, 40, 935, 513);
			//panelCentral.setPreferredSize(new Dimension(935 - 300, 513));
			panelCentral.setLayout(null);
			panelCentral.setBorder(new RoundedBorder(5));
			panelCentral.add(getLblNewLabel_1());
			panelCentral.add(getComboBox());
			panelCentral.add(getTextArea());
			panelCentral.add(getLblNewLabel_1_1());
			panelCentral.add(getLblNewLabel_1_2());
			panelCentral.add(getComboBox_1());
			panelCentral.add(getLblNewLabel_1_2_1());
			panelCentral.add(getTextField_1());
			panelCentral.add(getLblNewLabel_1_2_2());
			panelCentral.add(getLblNewLabel_1_2_2_1());
			panelCentral.add(getLblNewLabel_1_2_2_1_1());
			panelCentral.add(getLblNewLabel_1_2_2_1_1_1());
			panelCentral.add(getLblNewLabel_1_2_2_1_1_1_1());
			panelCentral.add(getLblNewLabel_1_2_2_1_1_1_1_1());
			panelCentral.add(getTextField_2());
			panelCentral.add(getTextField_3());
			panelCentral.add(getTextField_4());
			panelCentral.add(getTextField_5());
			panelCentral.add(getTextField_6());
			panelCentral.add(getTextField_7());
			panelCentral.add(getBtnNewButton_1());
			panelCentral.add(getBtnNewButton_1_1());
		}
		return panelCentral;
	}
	
	private JPanel getIzquierdo() {
		if (panelIzquierdo == null) {
			panelIzquierdo = new JPanel();
			panelIzquierdo.setBackground(Color.GRAY);;
			panelIzquierdo.setBounds(0, 40, 935, 513);
			panelIzquierdo.setLayout(null);
			panelIzquierdo.add(getLblNewLabel());
			panelIzquierdo.add(getBtnNewButton());
			panelIzquierdo.add(getRndjbtnInsertBook());
			panelIzquierdo.add(getRndjbtnUpdateBook());
			panelIzquierdo.add(getRndjbtnInsertBook_1());
		}
		return panelIzquierdo;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("OPTIONS");
			lblNewLabel.setOpaque(true);
			lblNewLabel.setBackground(Color.BLACK);
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(0, 0, 299, 50);
		}
		return lblNewLabel;
	}
	private RoundJButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new RoundJButton("New button");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setText("BACK <--");
			btnNewButton.setBounds(39, 80, 220, 40);
		}
		return btnNewButton;
	}
	private RoundJButton getRndjbtnInsertBook() {
		if (rndjbtnInsertBook == null) {
			rndjbtnInsertBook = new RoundJButton("New button");
			rndjbtnInsertBook.setText("DELETE BOOK");
			rndjbtnInsertBook.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnInsertBook.setBounds(39, 434, 220, 40);
		}
		return rndjbtnInsertBook;
	}
	private RoundJButton getRndjbtnUpdateBook() {
		if (rndjbtnUpdateBook == null) {
			rndjbtnUpdateBook = new RoundJButton("New button");
			rndjbtnUpdateBook.setText("UPDATE BOOK");
			rndjbtnUpdateBook.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnUpdateBook.setBounds(39, 372, 220, 40);
		}
		return rndjbtnUpdateBook;
	}
	private RoundJButton getRndjbtnInsertBook_1() {
		if (rndjbtnInsertBook_1 == null) {
			rndjbtnInsertBook_1 = new RoundJButton("New button");
			rndjbtnInsertBook_1.setText("INSERT BOOK");
			rndjbtnInsertBook_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnInsertBook_1.setBounds(39, 309, 220, 40);
		}
		return rndjbtnInsertBook_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Books");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(35, 50, 300, 30);
		}
		return lblNewLabel_1;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setBorder(new RoundedBorder(5));
			comboBox.setBounds(35, 79, 300, 30);
		}
		return comboBox;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBorder(new RoundedBorder(5));
			textArea.setEditable(false);
			textArea.setBounds(35, 240, 634, 200);
		}
		return textArea;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("Summary");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(35, 209, 300, 30);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("Authors");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(369, 131, 300, 30);
		}
		return lblNewLabel_1_2;
	}
	private JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setBorder(new RoundedBorder(5));
			comboBox_1.setBounds(369, 162, 300, 30);
		}
		return comboBox_1;
	}
	private JLabel getLblNewLabel_1_2_1() {
		if (lblNewLabel_1_2_1 == null) {
			lblNewLabel_1_2_1 = new JLabel("Subject");
			lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(35, 131, 300, 30);
		}
		return lblNewLabel_1_2_1;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBorder(new RoundedBorder(5));
			textField_1.setBounds(35, 159, 300, 30);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1_2_2() {
		if (lblNewLabel_1_2_2 == null) {
			lblNewLabel_1_2_2 = new JLabel("Editorial:");
			lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2.setBounds(711, 50, 120, 30);
		}
		return lblNewLabel_1_2_2;
	}
	private JLabel getLblNewLabel_1_2_2_1() {
		if (lblNewLabel_1_2_2_1 == null) {
			lblNewLabel_1_2_2_1 = new JLabel("Yeared:");
			lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2_1.setBounds(710, 110, 120, 30);
		}
		return lblNewLabel_1_2_2_1;
	}
	private JLabel getLblNewLabel_1_2_2_1_1() {
		if (lblNewLabel_1_2_2_1_1 == null) {
			lblNewLabel_1_2_2_1_1 = new JLabel("Country:");
			lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2_1_1.setBounds(711, 170, 120, 30);
		}
		return lblNewLabel_1_2_2_1_1;
	}
	private JLabel getLblNewLabel_1_2_2_1_1_1() {
		if (lblNewLabel_1_2_2_1_1_1 == null) {
			lblNewLabel_1_2_2_1_1_1 = new JLabel("Amonth page:");
			lblNewLabel_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2_1_1_1.setBounds(711, 230, 120, 30);
		}
		return lblNewLabel_1_2_2_1_1_1;
	}
	private JLabel getLblNewLabel_1_2_2_1_1_1_1() {
		if (lblNewLabel_1_2_2_1_1_1_1 == null) {
			lblNewLabel_1_2_2_1_1_1_1 = new JLabel("Stock:");
			lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2_1_1_1_1.setBounds(711, 294, 120, 30);
		}
		return lblNewLabel_1_2_2_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_2_2_1_1_1_1_1() {
		if (lblNewLabel_1_2_2_1_1_1_1_1 == null) {
			lblNewLabel_1_2_2_1_1_1_1_1 = new JLabel("Availlable:");
			lblNewLabel_1_2_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_2_1_1_1_1_1.setBounds(710, 360, 120, 30);
		}
		return lblNewLabel_1_2_2_1_1_1_1_1;
	}
	private RoundJTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new RoundJTextField(5);
			textField_2.setEditable(false);
			textField_2.setBounds(841, 50, 240, 30);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private RoundJTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new RoundJTextField(5);
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(840, 110, 240, 30);
		}
		return textField_3;
	}
	private RoundJTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new RoundJTextField(5);
			textField_4.setEditable(false);
			textField_4.setColumns(10);
			textField_4.setBounds(841, 170, 240, 30);
		}
		return textField_4;
	}
	private RoundJTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new RoundJTextField(5);
			textField_5.setEditable(false);
			textField_5.setColumns(10);
			textField_5.setBounds(841, 230, 240, 30);
		}
		return textField_5;
	}
	private RoundJTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new RoundJTextField(5);
			textField_6.setEditable(false);
			textField_6.setColumns(10);
			textField_6.setBounds(841, 294, 50, 30);
		}
		return textField_6;
	}
	private RoundJTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new RoundJTextField(5);
			textField_7.setEditable(false);
			textField_7.setColumns(10);
			textField_7.setBounds(841, 360, 50, 30);
		}
		return textField_7;
	}
	private RoundJButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new RoundJButton("+");
			btnNewButton_1.setText("ADD");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1.setBounds(920, 294, 75, 30);
		}
		return btnNewButton_1;
	}
	private RoundJButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new RoundJButton("+");
			btnNewButton_1_1.setText("SUB");
			btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			btnNewButton_1_1.setBounds(1005, 294, 75, 30);
		}
		return btnNewButton_1_1;
	}
}
/*
import javax.swing.*;
import java.awt.*;

public class Bookcase extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel panel;
    private RoundJTextField textField;
    private JSplitPane splitPane;

    public Bookcase() {
        setForeground(Color.BLACK);
        setTitle("BOOKCASE");
        setBounds(100, 100, 1000, 600);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(getPanel(), BorderLayout.NORTH);
        getContentPane().add(getSplitPane(), BorderLayout.CENTER);
    }

    private JPanel getPanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(getTextField(), BorderLayout.CENTER);
        }
        return panel;
    }

    private RoundJTextField getTextField() {
        if (textField == null) {
            textField = new RoundJTextField(20);
            textField.setArcWidth(15);
            textField.setArcHeight(15);
        }
        return textField;
    }

    private JSplitPane getSplitPane() {
        if (splitPane == null) {
            splitPane = new JSplitPane();
            splitPane.setLeftComponent(new JScrollPane(new JTextArea("Panel Izquierdo")));
            splitPane.setRightComponent(new JScrollPane(new JTextArea("Panel Central")));
            splitPane.setDividerLocation(0.3);  // Posición inicial del divisor
        }
        return splitPane;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bookcase dialog = new Bookcase();
                    dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                    dialog.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

*/
