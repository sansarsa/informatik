import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Rekursion2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfStufe;
	private Turtle t = new Turtle(350, 300);

	public Rekursion2() {
		super("Rekursion 2");
		createGUI();
	}

	// Aufgabe 1:

	private void baum(double laenge, int stufen) {

	}

	// Aufgabe 2:

	public void farnwedel(double laenge, int stufen) {

	}

	private void createGUI() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAufgabe1 = new JButton("Aufgabe 1");
		btnAufgabe1.addActionListener(e -> {
			t.neuStart(350, 600);
			baum(200, getStufen());
		});
		btnAufgabe1.setBounds(12, 12, 98, 25);
		contentPane.add(btnAufgabe1);

		JButton btnAufgabe2 = new JButton("Aufgabe 2");
		btnAufgabe2.addActionListener(e -> {
			t.neuStart(350, 600);
			farnwedel(150, getStufen());
		});
		btnAufgabe2.setBounds(122, 12, 98, 25);
		contentPane.add(btnAufgabe2);

		JLabel lblStufeDesBaumes = new JLabel("Stufe des Baumes:");
		lblStufeDesBaumes.setBounds(278, 17, 110, 15);
		contentPane.add(lblStufeDesBaumes);

		tfStufe = new JTextField();
		tfStufe.setBounds(406, 15, 50, 19);
		contentPane.add(tfStufe);
		tfStufe.setColumns(10);

		JButton btnLoeschen = new JButton("löschen");
		btnLoeschen.addActionListener(e -> {
			t.loeschen();
			t.neuStart(350, 300);
		});
		btnLoeschen.setBounds(679, 12, 98, 25);
		contentPane.add(btnLoeschen);

		t.setBackground(Color.WHITE);
		t.setBounds(12, 49, 769, 609);
		contentPane.add(t);
	}

	public int getStufen() {
		int stufen;
		try {
			stufen = Integer.parseInt(tfStufe.getText());
		} catch (Exception e) {
			stufen = 1;
		}
		if (stufen <= 0) {
			stufen = 1;
		}
		return stufen;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Rekursion2 frame = new Rekursion2();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
