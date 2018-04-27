import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class TPV1 {

	private JFrame frmTpvAsociaciones;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
					TPV1 window = new TPV1();
					window.frmTpvAsociaciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TPV1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTpvAsociaciones = new JFrame();
		frmTpvAsociaciones.setTitle("TPV Asociaciones 1 a Varios");
		frmTpvAsociaciones.setBounds(100, 100, 419, 206);
		frmTpvAsociaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpvAsociaciones.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Art\u00EDculo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		panel.setBounds(15, 48, 225, 71);
		frmTpvAsociaciones.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n:");
		lblDescripcin.setBounds(5, 20, 83, 16);
		panel.add(lblDescripcin);
		
		textField = new JTextField();
		textField.setBounds(106, 18, 114, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecioUnidad = new JLabel("Precio unidad:");
		lblPrecioUnidad.setBounds(5, 48, 83, 16);
		panel.add(lblPrecioUnidad);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 46, 114, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAadirArtculo = new JButton("A\u00F1adir art\u00EDculo");
		btnAadirArtculo.setBounds(22, 125, 147, 26);
		frmTpvAsociaciones.getContentPane().add(btnAadirArtculo);
		
		JLabel lblNumVenta = new JLabel("Selec. Venta:");
		lblNumVenta.setBounds(22, 20, 83, 16);
		frmTpvAsociaciones.getContentPane().add(lblNumVenta);
		
		textField_2 = new JTextField();
		textField_2.setText("1");
		textField_2.setBounds(106, 18, 32, 20);
		frmTpvAsociaciones.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnVerImporte = new JButton("Ver importe");
		btnVerImporte.setBounds(258, 15, 131, 26);
		frmTpvAsociaciones.getContentPane().add(btnVerImporte);
		
		JButton btnImprimirTicket = new JButton("Imprimir Ticket");
		btnImprimirTicket.setBounds(258, 125, 131, 26);
		frmTpvAsociaciones.getContentPane().add(btnImprimirTicket);
	}
}
