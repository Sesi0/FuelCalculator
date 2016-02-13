import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class AskForAvrageFuel extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForAvrageFuel dialog = new AskForAvrageFuel();
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
	public AskForAvrageFuel() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(AskForAvrageFuel.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		setResizable(false);
		setBounds(100, 100, 407, 121);
		getContentPane().setLayout(null);

		JLabel questionLabel = new JLabel(
				"\u0417\u043D\u0430\u0435\u0442\u0435 \u043B\u0438 \u043A\u043E\u043B\u043A\u043E \u0435 \u0441\u0440\u0435\u0434\u043D\u0438\u044F\u0442 \u0412\u0438 \u0440\u0430\u0437\u0445\u043E\u0434 \u043D\u0430 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u0430?");
		questionLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		questionLabel.setBounds(0, 0, 401, 40);
		getContentPane().add(questionLabel);

		JButton yesButton = new JButton("\u0414\u0430");
		yesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AvrageFuelDialog.main(null);
				dispose();
			}
		});
		yesButton.setBounds(99, 49, 89, 23);
		getContentPane().add(yesButton);

		JButton noButton = new JButton("\u041D\u0435");
		noButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CalculateAvrageFuelDialog.main(null);
				dispose();
			}
		});
		noButton.setBounds(198, 49, 89, 23);
		getContentPane().add(noButton);

	}
}
