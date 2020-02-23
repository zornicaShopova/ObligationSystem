package Data_TaskThreeEmision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Data_ThreeEmision {

	private JFrame frame;
	private JTextField txt_e3_K;
	private JTextField txt_e3_n;
	private JTextField txt_e3_i;
	private final JSeparator separator_1 = new JSeparator();
	private JTextField txt_e3_O1;
	private JTextField txt_e3_N1;
	private JTextField txt_e3_O2;
	private JTextField txt_e3_N2;
	private JTextField txt_e3_O3;
	private JTextField txt_e3_N3;
	private final JSeparator separator_4 = new JSeparator();
	private final JSeparator separator_6 = new JSeparator();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_ThreeEmision window = new Data_ThreeEmision();
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
	public Data_ThreeEmision() {
		showThreeEmision();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void showThreeEmision() {
		frame = new JFrame("Задача с три емисии");
		frame.setBounds(100, 100, 519, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0430\u043D\u043D\u0438\u0442\u0435 :");
		label.setFont(new Font("Arial", Font.BOLD, 17));
		label.setBounds(180, 11, 184, 30);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u041E\u0431\u043B. \u0437\u0430\u0435\u043C / K");
		label_1.setFont(new Font("Arial", Font.BOLD, 13));
		label_1.setBounds(32, 69, 107, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0421\u0440\u043E\u043A \u0432 \u0433\u043E\u0434\u0438\u043D\u0438 / n");
		label_2.setFont(new Font("Arial", Font.BOLD, 13));
		label_2.setBounds(195, 69, 126, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u0413\u043E\u0434\u0438\u0448\u0435\u043D \u043B\u0438\u0445.% / i");
		label_3.setFont(new Font("Arial", Font.BOLD, 13));
		label_3.setBounds(357, 69, 147, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel = new JLabel("\u041F\u044A\u0440\u0432\u0430 \u0435\u043C\u0438\u0441\u0438\u044F / \u041E1");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(87, 176, 139, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u0412\u0442\u043E\u0440\u0430 \u0435\u043C\u0438\u0441\u0438\u044F / \u041E2");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(87, 265, 139, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0422\u0440\u0435\u0442\u0430 \u0415\u043C\u0438\u0441\u0438\u044F / \u041E3");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(75, 348, 151, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B / N1");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_3.setBounds(313, 176, 107, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B / N2");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_4.setBounds(313, 265, 96, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblN = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B / N3");
		lblN.setFont(new Font("Arial", Font.BOLD, 13));
		lblN.setBounds(313, 348, 86, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblShow_i = new JLabel("");
		lblShow_i.setBounds(445, 139, 48, 14);
		frame.getContentPane().add(lblShow_i);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 49, 504, 14);
		frame.getContentPane().add(separator);
		
		txt_e3_K = new JTextField();
		txt_e3_K.setBounds(26, 108, 96, 20);
		frame.getContentPane().add(txt_e3_K);
		txt_e3_K.setColumns(10);
		
		txt_e3_n = new JTextField();
		txt_e3_n.setBounds(201, 108, 96, 20);
		frame.getContentPane().add(txt_e3_n);
		txt_e3_n.setColumns(10);
		
		txt_e3_i = new JTextField();
		txt_e3_i.setBounds(367, 108, 96, 20);
		frame.getContentPane().add(txt_e3_i);
		txt_e3_i.setColumns(10);
		separator_1.setBounds(0, 159, 504, 14);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(155, 49, 9, 110);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(333, 49, 14, 110);
		frame.getContentPane().add(separator_3);
		
		txt_e3_O1 = new JTextField();
		txt_e3_O1.setBounds(98, 212, 96, 20);
		frame.getContentPane().add(txt_e3_O1);
		txt_e3_O1.setColumns(10);
		
		txt_e3_N1 = new JTextField();
		txt_e3_N1.setBounds(313, 212, 96, 20);
		frame.getContentPane().add(txt_e3_N1);
		txt_e3_N1.setColumns(10);
		
		txt_e3_O2 = new JTextField();
		txt_e3_O2.setBounds(98, 294, 96, 20);
		frame.getContentPane().add(txt_e3_O2);
		txt_e3_O2.setColumns(10);
		
		txt_e3_N2 = new JTextField();
		txt_e3_N2.setBounds(313, 294, 96, 20);
		frame.getContentPane().add(txt_e3_N2);
		txt_e3_N2.setColumns(10);
		
		txt_e3_O3 = new JTextField();
		txt_e3_O3.setBounds(98, 374, 96, 20);
		frame.getContentPane().add(txt_e3_O3);
		txt_e3_O3.setColumns(10);
		
		txt_e3_N3 = new JTextField();
		txt_e3_N3.setBounds(313, 374, 96, 20);
		frame.getContentPane().add(txt_e3_N3);
		txt_e3_N3.setColumns(10);
		separator_4.setBounds(0, 240, 504, 14);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 328, 503, 22);
		frame.getContentPane().add(separator_5);
		separator_6.setBounds(0, 405, 504, 9);
		frame.getContentPane().add(separator_6);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_e3_n.setText("");
				txt_e3_i.setText("");
				txt_e3_K.setText("");
				txt_e3_O1.setText("");
				txt_e3_N1.setText("");
				txt_e3_O2.setText("");
				txt_e3_N2.setText("");
				txt_e3_N3.setText("");
				txt_e3_O3.setText("");
				lblShow_i.setText("");
			}
		});
		btnReset.setBounds(208, 422, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//cancel
				if(JOptionPane.showConfirmDialog(null,"Искате ли да излезнете ?","Exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnCancel.setBounds(358, 422, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JButton btnShowTable = new JButton("Show Table");
		btnShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnShowTable.setBounds(58, 422, 106, 23);
		frame.getContentPane().add(btnShowTable);
		
		JButton btnSumPercent = new JButton("Sum");
		btnSumPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//sum the percent
				int percent = Integer.parseInt(txt_e3_i.getText());
				double sum = (percent / 100d);
				String s = String.valueOf(sum);
				lblShow_i.setText(s);	
			}
		});
		btnSumPercent.setBounds(344, 139, 76, 14);
		frame.getContentPane().add(btnSumPercent);
		
		
		
		
		//show Window 
		frame.setVisible(true);
	}
}
