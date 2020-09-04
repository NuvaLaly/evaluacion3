package formularios;


	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;

	import entidad.usuario;
	
	import mantenimiento.GestionUsuario;

	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	import javax.swing.JPasswordField;
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;

	public class frmLogin extends JFrame {

		private JPanel contentPane;
		private JTextField txtUsuario;
		private JPasswordField txtClave;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						frmLogin frame = new frmLogin();
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
		public frmLogin() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Usuario:");
			lblNewLabel.setBounds(38, 78, 56, 16);
			contentPane.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a:");
			lblNewLabel_1.setBounds(38, 125, 85, 16);
			contentPane.add(lblNewLabel_1);
			
			txtUsuario = new JTextField();
			txtUsuario.setBounds(135, 75, 116, 22);
			contentPane.add(txtUsuario);
			txtUsuario.setColumns(10);
			
			txtClave = new JPasswordField();
			txtClave.setBounds(135, 122, 116, 22);
			contentPane.add(txtClave);
			
			JButton btnNewButton = new JButton("Salir");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					salir();
				}
			});
			btnNewButton.setBounds(62, 188, 97, 25);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Ingresar");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ingresar();
				}
			});
			btnNewButton_1.setBounds(206, 188, 97, 25);
			contentPane.add(btnNewButton_1);
		}

		protected void ingresar() {
			
			String usuario = txtUsuario.getText();
			String clave = String.valueOf(txtClave.getPassword());
			
			GestionUsuario gestionUsuario = new GestionUsuario();
			
			usuario usuario2 = new usuario();
			usuario2.setUsuario(usuario);
			usuario2.setClave(clave);
			
			usuario usu = gestionUsuario.obtenerUsuario(usuario2);
			
			if(usu!=null) {
				JOptionPane.showMessageDialog(contentPane,"Bienvenido");
				
				this.dispose();
				
				frmBienvenida bienvenida = new frmBienvenida();
				bienvenida.setVisible(true);
			}else {
				
				JOptionPane.showMessageDialog(contentPane,"Datos invalidos","Error",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}

		protected void salir() {
		System.exit(0);
			
		}
	}



