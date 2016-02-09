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

import com.jgoodies.forms.factories.DefaultComponentFactory;

public class FuelWindows {

	private JFrame frame;
	private JTextField distanceTF;
	private JTextField fuelTF;
	private JLabel fuelCostLabel;
	private JTextField userDistance;
	private JTextField userFuelPrice;
	private JTextField userAvrageFuel;
	private JLabel tripCostLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuelWindows window = new FuelWindows();
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
	public FuelWindows() {
		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(
				Toolkit.getDefaultToolkit().getImage("D:\\Bobby's Projects\\Eclipse\\Fuel Calculator\\bin\\icon.png"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = DefaultComponentFactory.getInstance().createTitle(
				"\u0413\u043E\u0440\u0438\u0432\u0435\u043D \u041A\u0430\u043B\u043A\u0443\u043B\u0430\u0442\u043E\u0440");
		label.setBounds(10, 11, 414, 30);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		frame.getContentPane().add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(176, 52, 248, 199);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel label_4 = new JLabel(
				"\u0420\u0430\u0437\u0445\u043E\u0434 \u041F\u044A\u0442\u0443\u0432\u0430\u043D\u0435");
		label_4.setBounds(10, 7, 228, 16);
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

		JLabel label_9 = new JLabel("\u0421\u0440\u0435\u0434\u0435\u043D \u0440\u0430\u0437\u0445\u043E\u0434");
		label_9.setBounds(10, 96, 107, 20);
		panel_1.add(label_9);

		userAvrageFuel = new JTextField();
		userAvrageFuel.setColumns(10);
		userAvrageFuel.setBounds(142, 96, 47, 20);
		panel_1.add(userAvrageFuel);

		JLabel label_10 = new JLabel("\u043B./100 \u043A\u043C.");
		label_10.setBounds(191, 99, 89, 14);
		panel_1.add(label_10);

		JButton tripB = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		tripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float distance, price, avrage;
				try {
					distance = Float.parseFloat(userDistance.getText());
					price = Float.parseFloat(userFuelPrice.getText());
					avrage = Float.parseFloat(userAvrageFuel.getText());

					tripCostLabel.setText("<html>Трябват Ви "
							+ String.format("%.2f", ((distance / (float) 100) * avrage))
							+ " литра гориво.<br> Цената на пътуването Ви е "
							+ String.format("%.2f", (((distance / (float) 100) * avrage) * price)) + " лева.</html>");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Моля въведете валидно число!");
				}
			}
		});
		tripB.setBounds(74, 127, 89, 23);
		panel_1.add(tripB);

		tripCostLabel = new JLabel("");
		tripCostLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		tripCostLabel.setBounds(10, 153, 228, 35);
		panel_1.add(tripCostLabel);

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel.setBounds(10, 52, 156, 199);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u0421\u0440\u0435\u0434\u0435\u043D \u0420\u0430\u0437\u0445\u043E\u0434");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 136, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(
				"\u0418\u0437\u043C\u0438\u043D\u0430\u0442\u043E \u0440\u0430\u0437\u0441\u0442\u043E\u044F\u043D\u0438\u0435");
		lblNewLabel_1.setBounds(10, 38, 159, 20);
		panel.add(lblNewLabel_1);

		JLabel label_1 = new JLabel(
				"\u0418\u0437\u0440\u0430\u0437\u0445\u043E\u0434\u0435\u043D\u043E \u0433\u043E\u0440\u0438\u0432\u043E");
		label_1.setBounds(10, 83, 159, 14);
		panel.add(label_1);

		distanceTF = new JTextField();
		distanceTF.setBounds(10, 57, 46, 20);
		panel.add(distanceTF);
		distanceTF.setColumns(10);

		fuelTF = new JTextField();
		fuelTF.setColumns(10);
		fuelTF.setBounds(10, 99, 46, 20);
		panel.add(fuelTF);

		JButton avrageFuelB = new JButton("\u0418\u0437\u0447\u0438\u0441\u043B\u0438");
		avrageFuelB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				float distance, fuel;
				try {
					distance = Float.parseFloat(distanceTF.getText());
					fuel = Float.parseFloat(fuelTF.getText());

					fuelCostLabel.setText("<html>Разход гориво:<br>"
							+ String.format("%.2f", (fuel / (distance / (float) 100))) + " л./100 км.</html>");
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Моля въведете валидно число!");
				}
			}

		});
		avrageFuelB.setBounds(34, 127, 89, 23);
		panel.add(avrageFuelB);

		fuelCostLabel = new JLabel("");
		fuelCostLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		fuelCostLabel.setBounds(10, 161, 136, 27);
		panel.add(fuelCostLabel);

		JLabel label_2 = new JLabel("\u043A\u043C.");
		label_2.setBounds(58, 60, 54, 14);
		panel.add(label_2);

		JLabel label_3 = new JLabel("\u043B.");
		label_3.setBounds(58, 102, 54, 14);
		panel.add(label_3);
	}
}
