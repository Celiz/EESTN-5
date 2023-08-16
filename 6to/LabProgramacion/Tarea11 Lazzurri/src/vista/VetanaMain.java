package vista;
import modelo.Personaje;
import modelo.Juego;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class VetanaMain extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JPanel textInfoGame;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JPanel juegoMain;
	private JScrollPane scrollPane_1;
	private JPanel juego1;
	private JScrollPane scrollPane_2;
	private JList<Personaje> list;
	private JList<Personaje> list_1;
	private JPanel fightPanel;
	private JPanel crearChamp;
	private JLabel labelNombre;
	private JTextField textNombre;
	private JLabel labelFuerza;
	private JTextField textFuerza;
	private JLabel labelVelocidad;
	private JTextField textVelocidad;
	private JLabel labelMR;
	private JTextField textMR;
	private JLabel labelArmor;
	private JTextField textArmadura;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JButton buttonAdd;
	private JButton buttonDelete;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel enfrentamiento;
	private JRadioButton rdbtnArmor;
	private JRadioButton rdbtnMR;
	private JRadioButton rdbtnFuerza;
	private JRadioButton rdbtnVelocidad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton buttonEnfrentar;
	private DefaultListModel<Personaje> modeloLista = new DefaultListModel<Personaje>();	
	private Juego juego = new Juego();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VetanaMain frame = new VetanaMain();
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
	public VetanaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 578);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(this.contentPane);
		this.contentPane.setLayout(new BorderLayout(0, 0));
		
		this.textInfoGame = new JPanel();
		this.contentPane.add(this.textInfoGame, BorderLayout.SOUTH);
		this.textInfoGame.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		this.textInfoGame.add(scrollPane, BorderLayout.CENTER);
		
		this.textArea = new JTextArea();
		this.scrollPane.setViewportView(this.textArea);
		
		this.juegoMain = new JPanel();
		this.contentPane.add(this.juegoMain, BorderLayout.CENTER);
		this.juegoMain.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.scrollPane_1 = new JScrollPane();
		this.juegoMain.add(this.scrollPane_1);
		
		this.list = new JList<Personaje>();
		this.scrollPane_1.setViewportView(this.list);
		
		this.juego1 = new JPanel();
		this.juegoMain.add(this.juego1);
		this.juego1.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.crearChamp = new JPanel();
		this.juego1.add(this.crearChamp);
		this.crearChamp.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel = new JPanel();
		this.crearChamp.add(this.panel);
		
		this.labelNombre = new JLabel("Nombre");
		this.panel.add(this.labelNombre);
		
		this.panel_1 = new JPanel();
		this.crearChamp.add(this.panel_1);
		
		this.textNombre = new JTextField();
		this.panel_1.add(this.textNombre);
		this.textNombre.setColumns(10);
		
		this.panel_2 = new JPanel();
		this.crearChamp.add(this.panel_2);
		
		this.labelFuerza = new JLabel("Fuerza");
		this.panel_2.add(this.labelFuerza);
		
		this.panel_3 = new JPanel();
		this.crearChamp.add(this.panel_3);
		
		this.textFuerza = new JTextField();
		this.panel_3.add(this.textFuerza);
		this.textFuerza.setColumns(10);
		
		this.panel_4 = new JPanel();
		this.crearChamp.add(this.panel_4);
		
		this.labelVelocidad = new JLabel("Velocidad");
		this.panel_4.add(this.labelVelocidad);
		
		this.panel_5 = new JPanel();
		this.crearChamp.add(this.panel_5);
		
		this.textVelocidad = new JTextField();
		this.panel_5.add(this.textVelocidad);
		this.textVelocidad.setColumns(10);
		
		this.panel_7 = new JPanel();
		this.crearChamp.add(this.panel_7);
		
		this.labelMR = new JLabel("Resistencia Magica");
		this.panel_7.add(this.labelMR);
		
		this.panel_6 = new JPanel();
		this.crearChamp.add(this.panel_6);
		
		this.textMR = new JTextField();
		this.panel_6.add(this.textMR);
		this.textMR.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.crearChamp.add(this.panel_8);
		
		this.labelArmor = new JLabel("Armadura");
		this.panel_8.add(this.labelArmor);
		
		this.panel_9 = new JPanel();
		this.crearChamp.add(this.panel_9);
		
		this.textArmadura = new JTextField();
		this.panel_9.add(this.textArmadura);
		this.textArmadura.setColumns(10);
		
		this.panel_10 = new JPanel();
		this.crearChamp.add(this.panel_10);
		
		this.buttonAdd = new JButton("Agregar");
		this.buttonAdd.addActionListener(this);
		this.panel_10.add(this.buttonAdd);
		
		this.panel_11 = new JPanel();
		this.crearChamp.add(this.panel_11);
		
		this.buttonDelete = new JButton("Eliminar");
		this.buttonDelete.addActionListener(this);
		this.panel_11.add(this.buttonDelete);
		
		this.enfrentamiento = new JPanel();
		this.juego1.add(this.enfrentamiento);
		this.enfrentamiento.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.rdbtnFuerza = new JRadioButton("Fuerza");
		buttonGroup.add(this.rdbtnFuerza);
		this.enfrentamiento.add(this.rdbtnFuerza);
		
		this.rdbtnVelocidad = new JRadioButton("Velocidad");
		buttonGroup.add(this.rdbtnVelocidad);
		this.enfrentamiento.add(this.rdbtnVelocidad);
		
		this.rdbtnMR = new JRadioButton("Resistencia Magica");
		buttonGroup.add(this.rdbtnMR);
		this.enfrentamiento.add(this.rdbtnMR);
		
		this.rdbtnArmor = new JRadioButton("Armadura");
		buttonGroup.add(this.rdbtnArmor);
		this.enfrentamiento.add(this.rdbtnArmor);
		
		this.fightPanel = new JPanel();
		this.fightPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.juego1.add(this.fightPanel);
		this.fightPanel.setLayout(new BorderLayout(0, 0));
		
		this.buttonEnfrentar = new JButton("Enfrentar");
		this.buttonEnfrentar.addActionListener(this);
		this.fightPanel.add(this.buttonEnfrentar);
		
		this.scrollPane_2 = new JScrollPane();
		this.juegoMain.add(this.scrollPane_2);
		
		this.list_1 = new JList<Personaje>();
		this.scrollPane_2.setViewportView(this.list_1);
		
		this.list.setModel(modeloLista);
		this.list_1.setModel(modeloLista);
		
		this.inicializar();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.buttonDelete) {
			do_buttonDelete_actionPerformed(e);
		}
		if (e.getSource() == this.buttonAdd) {
			do_buttonAdd_actionPerformed(e);
		}
		if (e.getSource() == this.buttonEnfrentar) {
			do_buttonEnfrentar_actionPerformed(e);
		}
	}
	
	
	protected void do_buttonEnfrentar_actionPerformed(ActionEvent e) {
		Personaje p1 = this.list.getSelectedValue();
		Personaje p2 = this.list_1.getSelectedValue();
		String mensaje;

		String atributo = "";
		
		if(this.rdbtnFuerza.isSelected())
			atributo = "Fuerza";
		else if(this.rdbtnVelocidad.isSelected())
			atributo = "Velocidad";
		else if (this.rdbtnMR.isSelected())
			atributo = "Resistencia Magica";
		else if (this.rdbtnArmor.isSelected())
			atributo = "Armadura";	

	Personaje ganador = this.juego.enfrentar(p1,p2,atributo);

	if (ganador != null)
	    mensaje = "\nEl ganador es: " + ganador.getNombre() + " con " + atributo;
	else 
	    mensaje = "Empate o no hay ganador\n";	
	
	this.textArea.append(mensaje);
	}
	
	protected void do_buttonAdd_actionPerformed(ActionEvent e) {
		String nombre = this.textNombre.getText();
		int fuerza = Integer.parseInt(this.textFuerza.getText());
		int resistenciaMagica = Integer.parseInt(this.textMR.getText());
		int armadura = Integer.parseInt(this.textArmadura.getText());
		int velocidad = Integer.parseInt(this.textVelocidad.getText());

		Personaje p = new Personaje(nombre, fuerza, resistenciaMagica, armadura, velocidad);
		this.juego.agregarPersonaje(p);
		this.actualizaLista();

		this.textArea.append("Se agrego el personaje\n");
	}
	
	protected void do_buttonDelete_actionPerformed(ActionEvent e) {
		Personaje p = this.list.getSelectedValue();
		if(p != null) {
			this.juego.eliminarPersonaje(p);
			this.actualizaLista();
			this.textArea.append("Se elimino el personaje\n");
		}
	}
	
	private void actualizaLista() {
		this.modeloLista.clear();
		
		Iterator<Personaje> iterator = this.juego.getPersonajes();
		
		while(iterator.hasNext()) {
			this.modeloLista.addElement(iterator.next());
		}
		
	}
	
	private void inicializar() {
		this.juego.agregarPersonaje(new Personaje("Veigar", 2, 5, 1, 3));
		this.juego.agregarPersonaje(new Personaje("Fizz", 3, 4, 2, 5));
		this.juego.agregarPersonaje(new Personaje("Tristana", 4, 3, 3, 4));
		this.juego.agregarPersonaje(new Personaje("Zac", 5, 2, 4, 3));
		this.juego.agregarPersonaje(new Personaje("Nafiri", 1, 1, 5, 2));
		this.juego.agregarPersonaje(new Personaje("Rengar", 2, 2, 1, 1));
		this.juego.agregarPersonaje(new Personaje("Pyke", 3, 3, 2, 2));

		this.actualizaLista();	
	}
}