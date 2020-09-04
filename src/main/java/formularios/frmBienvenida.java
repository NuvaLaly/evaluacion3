package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import entidad.persona;
import entidad.usuario;
import mantenimiento.GestionUsuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.List;
import javax.swing.JTextField;
import javax.swing.JTable;

public class frmBienvenida extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmBienvenida frame = new frmBienvenida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmBienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hola");
		lblNewLabel.setBounds(188, 0, 56, 16);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(77, 29, 287, 153);
		contentPane.add(table);
	}
	
protected void ingresar() {
		

		GestionUsuario gestionUsuario = new GestionUsuario();
		
		usuario usuario2 = new usuario();
		String nombre = null;
		usuario2.setNombre(nombre);
		String apellido = null;
		usuario2.setApellido(apellido);
		
		usuario per = gestionUsuario.obtenerUsuario(usuario2);
		
		if(per!=null) {
			JOptionPane.showMessageDialog(contentPane,"Bienvenido usuario de prueba");
			
			this.dispose();
			
			frmBienvenida bienvenida = new frmBienvenida();
			bienvenida.setVisible(true);
		}else {
			
			JOptionPane.showMessageDialog(contentPane,"Datos invalidos","Error",JOptionPane.ERROR_MESSAGE);
			

		
	}
}
}
