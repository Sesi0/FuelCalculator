import java.awt.BorderLayout;
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
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class CalculateAvrageFuelDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField distanceTF;
	private JTextField litersLostTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CalculateAvrageFuelDialog dialog = new CalculateAvrageFuelDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CalculateAvrageFuelDialog() {
		setTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		setBounds(100, 100, 258, 187);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel distanceLabel = new JLabel(
					"\u0418\u0437\u043C\u0438\u043D\u0430\u0442\u0438 \u043A\u0438\u043B\u043E\u043C\u0435\u0442\u0440\u0438");
			distanceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			distanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
			distanceLabel.setBounds(0, 11, 242, 14);
			contentPanel.add(distanceLabel);
		}

		distanceTF = new JTextField();
		distanceTF.setColumns(10);
		distanceTF.setBounds(101, 36, 34, 20);
		contentPanel.add(distanceTF);

		JLabel kilometersLabel = new JLabel("\u043A\u043C.");
		kilometersLabel.setBounds(137, 39, 95, 14);
		contentPanel.add(kilometersLabel);

		JLabel distanceLabel = new JLabel(
				"\u0418\u0437\u0440\u0430\u0437\u0445\u043E\u0434\u0435\u043D\u0438 \u043B\u0438\u0442\u0440\u0438 \u0433\u043E\u0440\u0438\u0432\u043E");
		distanceLabel.setHorizontalAlignment(SwingConstants.CENTER);
		distanceLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		distanceLabel.setBounds(0, 67, 242, 14);
		contentPanel.add(distanceLabel);

		litersLostTF = new JTextField();
		litersLostTF.setColumns(10);
		litersLostTF.setBounds(101, 92, 34, 20);
		contentPanel.add(litersLostTF);

		JLabel litersLabel = new JLabel("\u043B.");
		litersLabel.setBounds(137, 95, 95, 14);
		contentPanel.add(litersLabel);

		JButton insertButton = new JButton("\u0412\u044A\u0432\u0435\u0434\u0438");
		insertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					MainFuelCalculator.main(null, (Float.parseFloat(litersLostTF.getText())
							/ (Float.parseFloat(distanceTF.getText()) / (float) 100)));
					// System.out.println((Float.parseFloat(litersLostTF.getText())
					// / (Float.parseFloat(distanceTF.getText()) / (float)
					// 100)));
					dispose();

				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Моля въведете валидно число!");

				}
			}
		});
		insertButton.setBounds(75, 120, 89, 23);
		contentPanel.add(insertButton);
	}
}
