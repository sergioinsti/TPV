import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Principal {

	private JFrame frmEstructuraDeProgramas;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmEstructuraDeProgramas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEstructuraDeProgramas = new JFrame();
		frmEstructuraDeProgramas.setTitle("Estructura de programas");
		frmEstructuraDeProgramas.setBounds(100, 100, 477, 446);
		frmEstructuraDeProgramas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEstructuraDeProgramas.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(232, 13, 219, 93);
		frmEstructuraDeProgramas.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(6, 44, 79, 14);
		panel_1.add(lblNombre);
		
		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(6, 19, 46, 14);
		panel_1.add(lblNif);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(6, 69, 79, 14);
		panel_1.add(lblEdad);
		
		textField = new JTextField();
		textField.setBounds(95, 16, 119, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 41, 119, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(15);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 66, 119, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAgregarCliente = new JButton("Crear cliente 1");
		btnAgregarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAgregarCliente.setBounds(10, 10, 160, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnAgregarCliente);
		
		JButton btnCrearCliente = new JButton("Crear cliente 2");
		btnCrearCliente.setBounds(10, 37, 160, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnCrearCliente);
		
		JButton btnNewButton = new JButton("Mostrar datos cliente 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 71, 185, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnNewButton);
		
		JButton btnMostrarDatosDe = new JButton("Mostrar datos cliente 2");
		btnMostrarDatosDe.setBounds(10, 99, 185, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnMostrarDatosDe);
		
		JButton btnMostrarSaldoDe = new JButton("Agregar cuenta a 1");
		btnMostrarSaldoDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrarSaldoDe.setBounds(10, 133, 160, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnMostrarSaldoDe);
		
		JButton button = new JButton("Agregar cuenta a 2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(10, 160, 160, 23);
		frmEstructuraDeProgramas.getContentPane().add(button);
		
		JButton btnMostrar = new JButton("Calcular saldo cliente 1");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMostrar.setBounds(10, 194, 185, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnMostrar);
		
		JButton btnCalcularSaldoCliente = new JButton("Calcular saldo cliente 2");
		btnCalcularSaldoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCalcularSaldoCliente.setBounds(10, 220, 185, 23);
		frmEstructuraDeProgramas.getContentPane().add(btnCalcularSaldoCliente);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de cuenta", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(232, 113, 183, 70);
		frmEstructuraDeProgramas.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCcc = new JLabel("c.c.c:");
		lblCcc.setBounds(6, 19, 46, 14);
		panel.add(lblCcc);
		
		textField_3 = new JTextField();
		textField_3.setBounds(62, 16, 115, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblSaldo = new JLabel("Saldo:");
		lblSaldo.setBounds(6, 46, 46, 14);
		panel.add(lblSaldo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(62, 43, 115, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos de salida", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(14, 255, 404, 149);
		frmEstructuraDeProgramas.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 392, 126);
		panel_2.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
