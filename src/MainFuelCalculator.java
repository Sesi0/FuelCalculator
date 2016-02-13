import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class MainFuelCalculator {

	private JFrame frame;
	private JTextField userDistance;
	private JTextField userFuelPrice;
	private JLabel tripCostLabel;
	public static float avrage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, float a) {
		avrage = a;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFuelCalculator window = new MainFuelCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFuelCalculator() {

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		frame.setForeground(Color.LIGHT_GRAY);
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\Bobby's Projects\\Eclipse\\Fuel Calculator\\bin\\icon.png"));
		frame.setBounds(100, 100, 319, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(10, 11, 283, 191);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel label_4 = new JLabel(
				"\u0420\u0430\u0437\u0445\u043E\u0434 \u041F\u044A\u0442\u0443\u0432\u0430\u043D\u0435");
		label_4.setBounds(0, 7, 280, 16);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(label_4);

		JLabel label_5 = new JLabel(
				"\u041E\u0447\u0430\u043A\u0432\u0430\u043D\u043E \u0440\u0430\u0437\u0441\u0442\u043E\u044F\u043D\u0438\u0435");
		label_5.setBounds(10, 34, 153, 20);
		panel_1.add(label_5);

		userDistance = new JTextField();
		userDistance.setColumns(10);
		userDistance.setBounds(142, 34, 47, 20);
		panel_1.add(userDistance);

		JLabel label_6 = new JLabel("\u043A\u043C.");
		label_6.setBounds(191, 37, 34, 14);
		panel_1.add(label_6);

		JLabel label_7 = new JLabel(
				"\u0426\u0435\u043D\u0430 \u043D\u0430 \u0433\u043E\u0440\u0438\u0432\u043E\u0442\u043E");
		label_7.setBounds(10, 65, 153, 20);
		panel_1.add(label_7);

		userFuelPrice = new JTextField();
		userFuelPrice.setColumns(10);
		userFuelPrice.setBounds(142, 65, 47, 20);
		panel_1.add(userFuelPrice);

		JLabel label_8 = new JLabel("\u043B\u0432.");
		label_8.setBounds(191, 65, 34, 14);
		panel_1.add(label_8);

		JButton tripB = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		tripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float distance, price;
				try {
					distance = Float.parseFloat(userDistance.getText());
					price = Float.parseFloat(userFuelPrice.getText());

					tripCostLabel.setText("<html>Трябват Ви "
							+ String.format("%.2f", ((distance / (float) 100) * avrage))
							+ " литра гориво.<br> Цената на пътуването Ви е "
							+ String.format("%.2f", (((distance / (float) 100) * avrage) * price)) + " лева.</html>");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Моля въведете валидно число!");

				}
			}
		});
		tripB.setBounds(100, 96, 89, 23);
		panel_1.add(tripB);

		tripCostLabel = new JLabel("");
		tripCostLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		tripCostLabel.setBounds(10, 130, 270, 58);
		panel_1.add(tripCostLabel);
	}
}
