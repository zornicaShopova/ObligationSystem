package Data_TaskTwoEmision;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;



import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Data_TwoEmision {

	private JFrame frame;
	private JTextField txt_etK;
	private JTextField txt_etN;
	private JTextField txt_et_i;
	private JTextField txt_etO1;
	private JTextField txt_etN1;
	private JTextField txt_etO2;
	private JTextField txt_etN2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_TwoEmision window = new Data_TwoEmision();
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
	public Data_TwoEmision() {
		showTwoEmision();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void showTwoEmision() {
		frame = new JFrame("Задача с две емисии");
		frame.setBounds(100, 100, 1176, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0430\u043D\u043D\u0438\u0442\u0435 :");
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setBounds(169, 9, 180, 30);
		frame.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 49, 520, 12);
		frame.getContentPane().add(separator);
		
		JLabel label_1 = new JLabel("\u041E\u0431\u043B. \u0437\u0430\u0435\u043C / \u041A ");
		label_1.setFont(new Font("Arial", Font.BOLD, 13));
		label_1.setBounds(37, 72, 97, 14);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("\u041F\u044A\u0440\u0432\u0430 \u0435\u043C\u0438\u0441\u0438\u044F / \u041E1  ");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(80, 187, 139, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_2 = new JLabel("\u0412\u0442\u043E\u0440\u0430 \u0435\u043C\u0438\u0441\u0438 / O2 ");
		label_2.setFont(new Font("Arial", Font.BOLD, 13));
		label_2.setBounds(85, 311, 126, 14);
		frame.getContentPane().add(label_2);
		
		JLabel lblN = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B / N1 ");
		lblN.setFont(new Font("Arial", Font.BOLD, 13));
		lblN.setBounds(300, 187, 147, 14);
		frame.getContentPane().add(lblN);
		
		JLabel lblN_1 = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B / N2 ");
		lblN_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblN_1.setBounds(300, 311, 126, 14);
		frame.getContentPane().add(lblN_1);
		
		JLabel label_3 = new JLabel("\u0421\u0440\u043E\u043A \u0432 \u0433\u043E\u0434\u0438\u043D\u0438 / n ");
		label_3.setFont(new Font("Arial", Font.BOLD, 13));
		label_3.setBounds(201, 72, 121, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("\u0413\u043E\u0434\u0438\u0448\u0435\u043D \u043B\u0438\u0445.% / i ");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(377, 72, 135, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lbl_show_i = new JLabel("Click Enter");
		lbl_show_i.setBounds(407, 131, 76, 14);
		frame.getContentPane().add(lbl_show_i);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(155, 51, 16, 118);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(347, 49, 13, 120);
		frame.getContentPane().add(separator_2);
		
		txt_etK = new JTextField();
		txt_etK.setBounds(35, 100, 96, 20);
		frame.getContentPane().add(txt_etK);
		txt_etK.setColumns(10);
		
		txt_etN = new JTextField();
		txt_etN.setBounds(211, 100, 96, 20);
		frame.getContentPane().add(txt_etN);
		txt_etN.setColumns(10);
		
		txt_et_i = new JTextField();
		txt_et_i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//show percent sum
				int percent = Integer.parseInt(txt_et_i.getText());
				double sumpercent = (percent / 100d);
				String showSum =String.valueOf(sumpercent);
				lbl_show_i.setText(showSum);
			}
		});
		txt_et_i.setBounds(387, 100, 96, 20);
		frame.getContentPane().add(txt_et_i);
		txt_et_i.setColumns(10);
		
		txt_etO1 = new JTextField();
		txt_etO1.setBounds(100, 231, 96, 20);
		frame.getContentPane().add(txt_etO1);
		txt_etO1.setColumns(10);
		
		txt_etN1 = new JTextField();
		txt_etN1.setBounds(295, 231, 96, 20);
		frame.getContentPane().add(txt_etN1);
		txt_etN1.setColumns(10);
		
		txt_etO2 = new JTextField();
		txt_etO2.setBounds(100, 354, 96, 20);
		frame.getContentPane().add(txt_etO2);
		txt_etO2.setColumns(10);
		
		txt_etN2 = new JTextField();
		txt_etN2.setBounds(295, 354, 96, 20);
		frame.getContentPane().add(txt_etN2);
		txt_etN2.setColumns(10);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(-2, 168, 532, 5);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(3, 271, 528, 24);
		frame.getContentPane().add(separator_4);
		
		JButton btnShowTable = new JButton("Show Table");
		btnShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			  }
			});
		btnShowTable.setBounds(39, 410, 89, 23);
		frame.getContentPane().add(btnShowTable);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_etK.setText("");
				txt_etN.setText("");
				txt_et_i.setText("");
				txt_etO1.setText("");
				txt_etN1.setText("");
				txt_etO2.setText("");
				txt_etN2.setText("");
				
			}
		});
		btnReset.setBounds(190, 410, 89, 23);
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
		btnCancel.setBounds(358, 410, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(0, 398, 530, 12);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(532, 0, 16, 440);
		frame.getContentPane().add(separator_6);
		
		JLabel lblK = new JLabel("\u041E\u0441\u0442. \u043E\u0442 \u0437\u0430\u0435\u043C\u0430 K");
		lblK.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblK.setBounds(543, 19, 110, 20);
		frame.getContentPane().add(lblK);
		
		JLabel lblO = new JLabel("\u0432 \u043E\u0431\u0440\u044A\u0449\u0435\u043D\u0438\u0435 O");
		lblO.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblO.setBounds(679, 21, 126, 14);
		frame.getContentPane().add(lblO);
		
		JLabel lblAi = new JLabel("\u0432 \u0442\u0438\u0440\u0430\u0436 ai");
		lblAi.setFont(new Font("Sitka Text", Font.BOLD, 14));
		lblAi.setBounds(815, 19, 76, 14);
		frame.getContentPane().add(lblAi);
		
		JLabel label_4 = new JLabel("\u041E\u0431\u043B\u0438\u0433\u0430\u0446\u0438\u0438");
		label_4.setFont(new Font("Sitka Text", Font.BOLD, 14));
		label_4.setBounds(749, 9, 97, 14);
		frame.getContentPane().add(label_4);
		
		
		//show window
		frame.setVisible(true);
	}

}
