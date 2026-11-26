package dialoge;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Dialoge extends JFrame {

	private JPanel contentPane;

	public Dialoge() {
		super("Dialoge");
		createGUI();
	}

	public boolean bis100(int zahl) {
		if(zahl > 0 && zahl < 101) {
			return true;
		} else {
			return false;
		}
	}
	
	private void aufg1() {
		// Aufgabe 1
		String text = JOptionPane.showInputDialog("Gib eine Zahl ein:");
		int zahl = Integer.parseInt(text);
		
		if(bis100(zahl)) {
			JOptionPane.showMessageDialog(this,
					"die Zahl liegt zwischen 1 bis 100!"
					);
			} else {
				JOptionPane.showMessageDialog(this,
						"die Zahl liegt NICHT zwischen 1 bis 100!"
						);
			}
	}
	
	public boolean zwischen10bis20(double zahl) {
		if(zahl < 10 || zahl > 20) {
			return false;
		} else {
			return true;
		}
	}
	
	private void aufg2() {
		// Aufgabe 2
		String text = JOptionPane.showInputDialog("Gib eine Zahl ein:");
		double zahl = Double.parseDouble(text);
		
		if(zwischen10bis20(zahl)) {
			JOptionPane.showMessageDialog(this,
					"die Zahl liegt zwischen 10 bis 20!"
					);
			} else {
				JOptionPane.showMessageDialog(this,
						"die Zahl liegt NICHT zwischen 10 bis 20!"
						);
			}
	}
	
	private boolean istGerade(int zahl) {
		if (zahl % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	private void aufg3() {
		// Aufgabe 3
		String text = JOptionPane.showInputDialog("Gib eine ganze Zahl ein");
		int zahl = Integer.parseInt(text);
		if (istGerade(zahl)) {
			JOptionPane.showMessageDialog(this, zahl + " ist gerade");
		} else {
			JOptionPane.showMessageDialog(this, zahl + " ist ungerade");
		}
	}

	private int punkte2note(int punkte) {
		int note = switch (punkte) {
			case 0 -> 6;
			case 1, 2, 3 -> 5;
			case 4, 5, 6 -> 4;
			case 7, 8, 9 -> 3;
			case 10, 11, 12 -> 2;
			case 13, 14, 15 -> 1;
			default -> -1;
		};
		return note;
	}

	private void aufg4() {
		// Aufgabe 4
		String text;
		int punkte;

		while ((text = JOptionPane.showInputDialog("Notenpunkte?")) != null) {
			punkte = Integer.parseInt(text);
			JOptionPane.showMessageDialog(this, text + " Notenpunkte entsprechen der Note " + punkte2note(punkte));
		}
	}

	private void aufg5() {
		// Aufgabe 5
		for (int z1 = 5; z1 < 8; z1++) {
			for (int z2 = 7; z2 < 10; z2++) {
				String text = JOptionPane.showInputDialog("Löse die Aufgabe: " + z1 + " * " + z2);
				int zahl = Integer.parseInt(text);
				while(zahl != z1 * z2) {
					JOptionPane.showMessageDialog(this, "Falsche Eingabe!");
					text = JOptionPane.showInputDialog("Löse die Aufgabe: " + z1 + " * " + z2);
					zahl = Integer.parseInt(text);
				}
				JOptionPane.showMessageDialog(this, "Korrekte Eingabe!");
			}
		}
	}

	private void aufg6() {
		// Aufgabe 6
		String wertp = JOptionPane.showInputDialog("Wert von p:");
		String wertq = JOptionPane.showInputDialog("Wert von q:");
		if (wertp == null || wertq == null) {
			return;
		}
		double wertumwp = Double.parseDouble(wertp);
		double wertumwq = Double.parseDouble(wertq);
		double teilohnewurzel = -1 * wertumwp / 2;
		double radikand = Math.pow(wertumwp / 2, 2) - wertumwq;

		if (radikand < 0) {
			JOptionPane.showMessageDialog(this, "Keine Lösung");
			return;
		}

		double wertwurzel = Math.sqrt(radikand);
		double wertx1 = teilohnewurzel + wertwurzel;
		double wertx2 = teilohnewurzel - wertwurzel;
		if(wertwurzel == 0) {
			JOptionPane.showMessageDialog(this, teilohnewurzel);
		} else {
			JOptionPane.showMessageDialog(this, "x¹: " + wertx1);
			JOptionPane.showMessageDialog(this, "x²: " + wertx2);
		}
	}
	
	private void aufg7() {
		// Aufgabe 7
		String gewichtinstring = JOptionPane.showInputDialog("Gewicht in kg: ");
		String größeinstring = JOptionPane.showInputDialog("Größe in m: ");
		double gewicht = Double.parseDouble(gewichtinstring);
		double größe = Double.parseDouble(größeinstring);
		double bmiwert = gewicht / (Math.pow(größe, 2));
		JOptionPane.showMessageDialog(this, "BMI: " + bmiwert);
		if(bmiwert < 18.5) {
			JOptionPane.showMessageDialog(this, "Untergewicht");
		} else if(bmiwert >= 25) {
			JOptionPane.showMessageDialog(this, "Übergewicht");
		} else {
			JOptionPane.showMessageDialog(this, "Normalgewicht");
		}
	}

	public double Ostharz(int personen) {
		if(personen <= 0) {
			return 0;
		}
		
		int gesamtpersonen = personen;
		int count = 0;
		
		while(personen > 5) {
			personen = personen - 5;
			count++;
		}
		
		double rest = switch (personen) {
			case 1 -> 41;
			case 2 -> 53;
			case 3 -> 66;
			case 4 -> 77;
			case 5 -> 89;
			default -> 0;
		};
		
		return (count * 89 + rest) / gesamtpersonen;
	}
	
	public double Groningen(int personen) {
		if(personen <= 0) {
			return 0;
		}
		
		int gesamtpersonen = personen;
		int count = 0;
		
		while(personen > 5) {
			personen = personen - 5;
			count++;
		}
		
		double rest = switch (personen) {
			case 1 -> 36;
			case 2 -> 46.5;
			case 3 -> 57;
			case 4 -> 67.5;
			case 5 -> 78;
			default -> 0;
		};
		
		return (count * 78 + rest) / gesamtpersonen;
	}
	
	public double Standard(int personen) {
		if(personen <= 0) {
			return 0;
		}
		
		int gesamtpersonen = personen;
		int count = 0;
		
		while(personen > 5) {
			personen = personen - 5;
			count++;
		}
		
		double rest = switch (personen) {
			case 1 -> 29;
			case 2 -> 37;
			case 3 -> 45;
			case 4 -> 53;
			case 5 -> 61;
			default -> 0;
		};
		
		return (count * 61 + rest) / gesamtpersonen;
	}
	
	private void aufg8() {
		// Aufgabe 8		
		String[] options = {
				"Standard",
				"Groningen",
				"Ostharz",
				"Abbrechen"
				};
		
		while(true) {
			int auswahl = JOptionPane.showOptionDialog(
		            null,
		            "which version do you want to get?",
		            " Niedersachsen-Ticket ",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.QUESTION_MESSAGE,
		            new ImageIcon("images/db.png"),
		            options,
		            options[0]
				);
			
			if(auswahl == 3 || auswahl == -1) {
				break;
			}
			
			String eingabe = (String) JOptionPane.showInputDialog(
					null,
					"Anzahl der Personen: ",
					" Niedersachsen-Ticket",
					JOptionPane.QUESTION_MESSAGE,
					new ImageIcon("images/people.png"),
					null,
					""
					);
			int anzahl = Integer.parseInt(eingabe);
			
			double preisProPerson = switch (auswahl) {
				case 1 -> Groningen(anzahl);
				case 2 -> Ostharz(anzahl);
				default -> Standard(anzahl);
			};
			
			String ticket = 
				    "╔══════════════════════════╗\n" +
				    "       DEIN TICKET         \n" +
				    "╠══════════════════════════╣\n" +
				    " Version: " + options[auswahl] + "\n" +
				    " Passagiere: " + anzahl + "\n" +
				    " Preis pro Person: " + preisProPerson + " €\n" +
				    "╚══════════════════════════╝";
			
			if(auswahl == 0) {
				JOptionPane.showMessageDialog(
						this,
						ticket,
						"Dein Niedersachsen-Ticket",
						JOptionPane.INFORMATION_MESSAGE,
						null
						);
			} else if(auswahl == 1) {
				JOptionPane.showMessageDialog(
						this,
						ticket,
						"Dein Niedersachsen-Ticket",
						JOptionPane.INFORMATION_MESSAGE,
						null
						);
			} else if(auswahl == 2) {
				JOptionPane.showMessageDialog(
						this,
						ticket,
						"Dein Niedersachsen-Ticket",
						JOptionPane.INFORMATION_MESSAGE,
						null
						);
			}
		}
	}


	private void createGUI() {
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAufg1 = new JButton("Aufgabe 1: Zahl zwischen 1 und 100?");
		btnAufg1.addActionListener(e -> aufg1());
		btnAufg1.setBounds(12, 12, 320, 25);
		contentPane.add(btnAufg1);

		JButton btnAufg2 = new JButton("Aufgabe 2: Zahl kleiner als 10 oder größer als 20?");
		btnAufg2.addActionListener(e -> aufg2());
		btnAufg2.setBounds(12, 49, 320, 25);
		contentPane.add(btnAufg2);

		JButton btnAufg3 = new JButton("Aufgabe 3: Gerade Zahl?");
		btnAufg3.addActionListener(e -> aufg3());
		btnAufg3.setBounds(12, 86, 320, 25);
		contentPane.add(btnAufg3);

		JButton btnAufg4 = new JButton("Aufgabe 4: Punkte --> Note");
		btnAufg4.addActionListener(e -> aufg4());
		btnAufg4.setBounds(12, 123, 320, 25);
		contentPane.add(btnAufg4);

		JButton btnAufgabeMathetrainer = new JButton("Aufgabe 5: Mathe-Trainer");
		btnAufgabeMathetrainer.addActionListener(e -> aufg5());
		btnAufgabeMathetrainer.setBounds(12, 160, 320, 25);
		contentPane.add(btnAufgabeMathetrainer);

		JButton btnAufg6 = new JButton("Aufgabe 6: x² + p·x + q = 0 lösen");
		btnAufg6.addActionListener(e -> aufg6());
		btnAufg6.setBounds(12, 197, 320, 25);
		contentPane.add(btnAufg6);

		JButton btnAufg7 = new JButton("Aufgabe 7: Body Maß Index");
		btnAufg7.addActionListener(e -> aufg7());
		btnAufg7.setBounds(12, 234, 320, 25);
		contentPane.add(btnAufg7);

		JButton btnAufg8 = new JButton("Aufgabe 8: Niedersachsenticket");
		btnAufg8.addActionListener(e -> aufg8());
		btnAufg8.setBounds(12, 271, 320, 25);
		contentPane.add(btnAufg8);
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Dialoge frame = new Dialoge();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}