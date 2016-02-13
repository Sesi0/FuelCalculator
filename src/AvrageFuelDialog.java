import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AvrageFuelDialog extends JDialog {
	private JTextField avrageFuelTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvrageFuelDialog dialog = new AvrageFuelDialog();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public AvrageFuelDialog() {
		setTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		setBounds(100, 100, 316, 155);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 117);
		getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel(
				"\u041A\u043E\u043B\u043A\u043E \u0412\u0438 \u0435 \u0441\u0440\u0435\u0434\u043D\u0438\u044F\u0442 \u0440\u0430\u0437\u0445\u043E\u0434 \u043D\u0430 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u0430?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 11, 300, 14);
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel.add(label);

		avrageFuelTF = new JTextField();
		avrageFuelTF.setBounds(109, 36, 34, 20);
		panel.add(avrageFuelTF);
		avrageFuelTF.setColumns(10);

		JButton button = new JButton("\u0412\u044A\u0432\u0435\u0434\u0438");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					MainFuelCalculator.main(null, Float.parseFloat(avrageFuelTF.getText()));
					dispose();
					// System.out.println(Float.parseFloat(avrageFuelTF.getText()));
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Моля въведете валидно число!");

				}
			}
		});
		button.setBounds(109, 67, 86, 23);
		panel.add(button);

		JLabel label_1 = new JLabel("\u043B./100 \u043A\u043C.");
		label_1.setBounds(145, 39, 155, 14);
		panel.add(label_1);

	}

}
