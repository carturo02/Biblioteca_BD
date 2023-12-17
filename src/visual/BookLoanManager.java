package visual;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
import auxiliar.RoundJButton;
import auxiliar.RoundJTextField;
import auxiliar.RoundedBorder;
=======
import visual.auxiliar.RoundJButton;
import visual.auxiliar.RoundJTextField;
import visual.auxiliar.RoundedBorder;
>>>>>>> e03c49e1dfbcbb3b3729fde2ea02018bc629f84e


public class BookLoanManager extends JDialog {

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
	private RoundJTextField textField_1;
	private JLabel lblNewLabel_1;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_1_1;
	private JRadioButton rdbtnNewRadioButton;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					BookLoanManager dialog = new BookLoanManager();
					dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* CENTRAR TODOS LOS TEXTOS DE LOS TEXT FIELD Y JUSTIFICAR EL TEXT AREA*/


	public BookLoanManager() {
		getContentPane().setBackground(Color.DARK_GRAY);
		setForeground(Color.BLACK);
		setTitle("LOAN MANAGER");
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
			textField.setEditable(false);
			textField.setFont(new Font("Tahoma", Font.BOLD,14));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setDisabledTextColor(new Color(255, 250, 250));
			textField.setBackground(new Color(255, 255, 255));
			textField.setArcWidth(33);
			textField.setArcHeight(33);
			textField.setBounds(117, 7, 950, 26);
			textField.setColumns(10);
			DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd 'de' MMMM 'del' yyyy", new Locale("es", "ES"));
			LocalDate x = LocalDate.now();
			String fechaFormateada = x.format(formateador);
			textField.setText(fechaFormateada);
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


    private JPanel getCentral() {
		if (panelCentral == null) {
			panelCentral = new JPanel();
			panelCentral.setBackground(Color.LIGHT_GRAY);
			panelCentral.setBounds(0, 40, 935, 513);
			//panelCentral.setPreferredSize(new Dimension(935 - 300, 513));
			panelCentral.setLayout(null);
			panelCentral.setBorder(new RoundedBorder(5));
			panelCentral.add(getTextField_1());
			panelCentral.add(getLblNewLabel_1());
			panelCentral.add(getScrollPane());
			panelCentral.add(getLblNewLabel_1_1());
			panelCentral.add(getRdbtnNewRadioButton());
		}
		return panelCentral;
	}

	private JPanel getIzquierdo() {
		if (panelIzquierdo == null) {
			panelIzquierdo = new JPanel();
			panelIzquierdo.setBackground(Color.GRAY);
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
			rndjbtnInsertBook.setText("DELETE LOAN");
			rndjbtnInsertBook.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnInsertBook.setBounds(39, 434, 220, 40);
		}
		return rndjbtnInsertBook;
	}
	private RoundJButton getRndjbtnUpdateBook() {
		if (rndjbtnUpdateBook == null) {
			rndjbtnUpdateBook = new RoundJButton("New button");
			rndjbtnUpdateBook.setText("UPDATE LOAN");
			rndjbtnUpdateBook.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnUpdateBook.setBounds(39, 372, 220, 40);
		}
		return rndjbtnUpdateBook;
	}
	private RoundJButton getRndjbtnInsertBook_1() {
		if (rndjbtnInsertBook_1 == null) {
			rndjbtnInsertBook_1 = new RoundJButton("New button");
			rndjbtnInsertBook_1.setText("INSERT LOAN");
			rndjbtnInsertBook_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			rndjbtnInsertBook_1.setBounds(39, 309, 220, 40);
		}
		return rndjbtnInsertBook_1;
	}
	private RoundJTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new RoundJTextField(25);
			textField_1.setText("");
			textField_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			textField_1.setEditable(false);
			textField_1.setDisabledTextColor(new Color(255, 250, 250));
			textField_1.setColumns(10);
			textField_1.setBackground(Color.WHITE);
			textField_1.setArcWidth(33);
			textField_1.setArcHeight(33);
			textField_1.setBounds(310, 53, 500, 30);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("SEARCH USER");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(310, 25, 500, 30);
		}
		return lblNewLabel_1;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new RoundedBorder(10));
			scrollPane.setBounds(110, 141, 900, 300);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setBorder(new RoundedBorder(10));
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"DNI User", "Name User", "Title Book", "Date Loan", "Date Return", "Expired?", "Return"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(100);
			table.getColumnModel().getColumn(0).setMinWidth(100);
			table.getColumnModel().getColumn(1).setPreferredWidth(200);
			table.getColumnModel().getColumn(1).setMinWidth(200);
			table.getColumnModel().getColumn(2).setPreferredWidth(200);
			table.getColumnModel().getColumn(2).setMinWidth(200);
			table.getColumnModel().getColumn(3).setMinWidth(75);
			table.getColumnModel().getColumn(4).setMinWidth(75);
			table.getColumnModel().getColumn(5).setMinWidth(50);
			table.getColumnModel().getColumn(6).setMinWidth(50);
		}
		return table;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("LOAN LIST");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(310, 105, 485, 30);
		}
		return lblNewLabel_1_1;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Only Active");
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setOpaque(false);
			rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			rdbtnNewRadioButton.setBounds(110, 446, 200, 30);
		}
		return rdbtnNewRadioButton;
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
