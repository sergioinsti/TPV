import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TPV1 {

	private JFrame frmTpvAsociaciones;
	private JTextField descripcionT;
	private JTextField precioUniT;
	private JTextField selecVentaT;
	private Venta venta1=null;
	private Venta venta2=null;
	private JTextField estadoT;

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
		frmTpvAsociaciones.setBounds(100, 100, 419, 240);
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
		
		descripcionT = new JTextField();
		descripcionT.setBounds(106, 18, 114, 20);
		panel.add(descripcionT);
		descripcionT.setColumns(10);
		
		JLabel lblPrecioUnidad = new JLabel("Precio unidad:");
		lblPrecioUnidad.setBounds(5, 48, 83, 16);
		panel.add(lblPrecioUnidad);
		
		precioUniT = new JTextField();
		precioUniT.setBounds(106, 46, 114, 20);
		panel.add(precioUniT);
		precioUniT.setColumns(10);
		
		JButton btnAadirArtculo = new JButton("A\u00F1adir art\u00EDculo");
		btnAadirArtculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Control de los campos de creación de artículos
				String descripcion = descripcionT.getText().trim();
				if (descripcion.equals("")) {
					JOptionPane.showMessageDialog(frmTpvAsociaciones, "La descripción del artículo no puede estar vacía.", "Error de entrada de datos", JOptionPane.WARNING_MESSAGE);
					return;
				}
				double precioU;
				try {
					precioU = Double.parseDouble(precioUniT.getText().trim());
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frmTpvAsociaciones, "El precio del artículo debe ser real o entero.", "Error de entrada de datos", JOptionPane.WARNING_MESSAGE);
					return;
				}
				// --> YA se puede crear un artículo con datos válidos
				
				// Control del campo de selección de venta
				String idVentaS = selecVentaT.getText().trim();
				if(idVentaS.equals("1")) {
					// Trabajo con la primera Venta
					if (venta1==null) {
						// Nueva venta
						Articulo art1 = new Articulo(descripcion, precioU);
						venta1 = new Venta(art1);
						estadoT.setText("Creada una nueva venta.");
					} else {
						Articulo art1 = new Articulo(descripcion, precioU);
						venta1.anyadir(art1);
						estadoT.setText("Artículo añadido.");
					}
				} else if (idVentaS.equals("2")) {
					// Trabajo con la segunda Venta
					
				} else {
					try {
						Integer.parseInt(idVentaS);
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "Sólo se permiten como id. de venta los números 1 y 2", "Error de selección", JOptionPane.ERROR_MESSAGE);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "El id. de venta debe ser numérico", "Error de selección", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnAadirArtculo.setBounds(22, 125, 147, 26);
		frmTpvAsociaciones.getContentPane().add(btnAadirArtculo);
		
		JLabel lblNumVenta = new JLabel("Selec. Venta:");
		lblNumVenta.setBounds(22, 20, 83, 16);
		frmTpvAsociaciones.getContentPane().add(lblNumVenta);
		
		selecVentaT = new JTextField();
		selecVentaT.setText("1");
		selecVentaT.setBounds(106, 18, 32, 20);
		frmTpvAsociaciones.getContentPane().add(selecVentaT);
		selecVentaT.setColumns(10);
		
		JButton btnVerImporte = new JButton("Ver importe");
		btnVerImporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Control del campo de selección de venta
				String idVentaS = selecVentaT.getText().trim();
				if(idVentaS.equals("1")) {
					// Trabajo con la primera Venta
					if (venta1==null) {
						// Nueva venta
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "No hay venta asociada a Selec. Venta.", "Error de selección", JOptionPane.ERROR_MESSAGE);
						estadoT.setText("No había venta.");
					} else {
						double importe = venta1.getImporte();
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "El importe actual es "+importe+" euros.", "Importe de venta", JOptionPane.INFORMATION_MESSAGE);
						estadoT.setText("Importe: "+importe+ " euros");
					}
				} else if (idVentaS.equals("2")) {
					// Trabajo con la segunda Venta
					
				} else {
					try {
						Integer.parseInt(idVentaS);
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "Sólo se permiten como id. de venta los números 1 y 2", "Error de selección", JOptionPane.ERROR_MESSAGE);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(frmTpvAsociaciones, "El id. de venta debe ser numérico", "Error de selección", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnVerImporte.setBounds(258, 15, 131, 26);
		frmTpvAsociaciones.getContentPane().add(btnVerImporte);
		
		JButton btnImprimirTicket = new JButton("Imprimir Ticket");
		btnImprimirTicket.setBounds(258, 125, 131, 26);
		frmTpvAsociaciones.getContentPane().add(btnImprimirTicket);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(32, 163, 55, 16);
		frmTpvAsociaciones.getContentPane().add(lblEstado);
		
		estadoT = new JTextField();
		estadoT.setEditable(false);
		estadoT.setBounds(92, 161, 272, 20);
		frmTpvAsociaciones.getContentPane().add(estadoT);
		estadoT.setColumns(10);
	}
}
