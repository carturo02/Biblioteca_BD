package auxiliar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/*
 * @combo de busqueda //FUNCION DESACTIVADA QUITAR COMENTARIOS DE UPDATELIST
 */
public class SearchableComboBox extends JComboBox<String> {
    private static final long serialVersionUID = 1L;
    private RoundJTextField textField = new RoundJTextField(5);
    private List<String> items;
    private boolean isUserEditing = false;

    public SearchableComboBox(String[] items) {
        super(items);
        this.items = Arrays.asList(items);
        setEditable(true);
        textField = (RoundJTextField) getEditor().getEditorComponent();
        textField.setBorder(new RoundedBorder(20));
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                isEditing = true;
                isUserEditing = true;
            }
        });

        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                isEditing = false;
            }
        });
        textField.getDocument().addDocumentListener(new DocumentListener() {
           
            public void insertUpdate(DocumentEvent e) {
               // updateList();
            }

           
            public void removeUpdate(DocumentEvent e) {
                //updateList();
            }

            
            public void changedUpdate(DocumentEvent e) {
                updateList();
            }
        });
    }

    private ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture<?> scheduledUpdate;

    private void updateList() {
        if (isEditing && isUserEditing) {
            // Cancelar la actualización programada anterior (si existe)
            if (scheduledUpdate != null) {
                scheduledUpdate.cancel(false);
            }

            // Programar una nueva actualización con una demora de 400 milisegundos
            scheduledUpdate = executor.schedule(new Runnable() {
               
                public void run() {
                    String text = textField.getText();
                    setPopupVisible(false);
                    // Eliminar solo los elementos que ya no coinciden con el texto ingresado
                    for (int i = getItemCount() - 1; i >= 0; i--) {
                        String item = getItemAt(i);
                        if (!item.toLowerCase().contains(text.toLowerCase())) {
                            removeItemAt(i);
                        }
                    }

                    // Agregar solo los elementos nuevos que coinciden con el texto ingresado
                    for (String item : items) {
                        if (item.toLowerCase().contains(text.toLowerCase()) && !containsItem(item)) {
                            addItem(item);
                        }
                    }
                    setPopupVisible(getItemCount() > 0);
                    isUserEditing = false;
                }
            }, 400, TimeUnit.MILLISECONDS);
        }
    }

    // Usar un HashSet para almacenar los elementos del JComboBox
    private Set<String> itemSet = new HashSet<String>();

    @Override
    public void addItem(String item) {
        super.addItem(item);
        itemSet.add(item);
    }

    @Override
    public void removeItemAt(int index) {
        String item = getItemAt(index);
        super.removeItemAt(index);
        itemSet.remove(item);
        setSelectedIndex(-1);
    }

    // Método auxiliar para verificar si el JComboBox ya contiene un elemento
    private boolean containsItem(String item) {
        return itemSet.contains(item);
    }

    private boolean isEditing = false;
}

/*//llamar la clase
 * SearchableComboBox comboBox = new SearchableComboBox(items);
 *JTextField textField = (JTextField) comboBox.getEditor().getEditorComponent();
 *textField.setBorder(new RoundBorder(20, 20));
 *
 *
 * // Convertir el ArrayList en un String[]
 *String[] array = list.toArray(new String[0]);
 */

