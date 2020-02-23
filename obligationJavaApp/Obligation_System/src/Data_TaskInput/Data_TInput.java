package Data_TaskInput;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSeparator;

import javax.swing.JTextField;




import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;


public class Data_TInput {
protected static final AbstractButton ResultTable = null;
protected static final String String = null;
//Obligation with ONE EMISION
	private JFrame frame;
	public JTextField txtK;
	public JTextField txtO;
	public JTextField txtN;
	public JTextField txt_i;
	public JTextField txt_n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_TInput window = new Data_TInput();
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
	public Data_TInput() {
		DataTIpnut();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void DataTIpnut() {
		frame = new JFrame("Задача с една емисия");
		frame.setBounds(100, 100, 1069, 648);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//show window
				frame.setVisible(true);
				
		
		JLabel label = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0430\u043D\u043D\u0438\u0442\u0435 :");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(125, 11, 185, 29);
		frame.getContentPane().add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 51, 414, 14);
		frame.getContentPane().add(separator);
		
		JLabel lblK = new JLabel("\u041E\u0431\u043B. \u0437\u0430\u0435\u043C / K =");
		lblK.setFont(new Font("Arial", Font.BOLD, 13));
		lblK.setBounds(64, 62, 154, 14);
		frame.getContentPane().add(lblK);
		
		txtK = new JTextField();
		txtK.addKeyListener(new KeyAdapter() {
			/*@Override
			public void keyPressed(KeyEvent e) {
				
				//if(e.KeyCode == Keys.Enter){
				//	SentKeys.Send("{TAB}");
				}	
			}*/
		});
		txtK.setBounds(301, 59, 96, 20);
		frame.getContentPane().add(txtK);
		txtK.setColumns(10);
		
		JLabel label_2 = new JLabel("\u041E\u0431\u043B\u0438\u0433\u0430\u0446\u0438\u0438 \u0432 \u043E\u0431\u0440. / O = ");
		label_2.setFont(new Font("Arial", Font.BOLD, 13));
		label_2.setBounds(64, 93, 154, 14);
		frame.getContentPane().add(label_2);
		
		txtO = new JTextField();
		txtO.addKeyListener(new KeyAdapter() {
			/*@Override
			public void keyPressed(KeyEvent e) {
				//int key = e.getKeyCode();
				//if(key==10) {
					txtO.requestFocus();
				}
			}*/
		});
		txtO.setBounds(301, 90, 96, 20);
		frame.getContentPane().add(txtO);
		txtO.setColumns(10);
		
		JLabel lblN = new JLabel("\u041D\u043E\u043C\u0438\u043D\u0430\u043B  / N =");
		lblN.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblN.setBounds(64, 124, 116, 14);
		frame.getContentPane().add(lblN);
		
		txtN = new JTextField();
		txtN.setBounds(301, 122, 96, 20);
		frame.getContentPane().add(txtN);
		txtN.setColumns(10);
		
		JLabel lbli = new JLabel("\u0413\u043E\u0434\u0438\u0448\u0435\u043D \u043B\u0438\u0445.% / i =");
		lbli.setFont(new Font("Arial", Font.BOLD, 13));
		lbli.setBounds(64, 156, 154, 14);
		frame.getContentPane().add(lbli);
		
		txt_i = new JTextField();
		txt_i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*show percent
				int percent = Integer.parseInt(txt_i.getText());
				double sum = (percent / 100d);
				String showPercent = String.valueOf(sum);
				txt_i.setText(showPercent);
				*/
				
			}
		});
		txt_i.setBounds(301, 153, 96, 20);
		frame.getContentPane().add(txt_i);
		txt_i.setColumns(10);
		
		JLabel lblN_1 = new JLabel("\u0421\u0440\u043E\u043A \u0432 \u0433\u043E\u0434\u0438\u043D\u0438 / n = ");
		lblN_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblN_1.setBounds(64, 187, 129, 14);
		frame.getContentPane().add(lblN_1);
		
		txt_n = new JTextField();
		txt_n.setBounds(301, 184, 96, 20);
		frame.getContentPane().add(txt_n);
		txt_n.setColumns(10);
		
		JButton btnTable = new JButton("Show Table");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("0.00");
				
				String n_godini = txt_n.getText();
				String K =txtK.getText();
				String O =txtO.getText();
				String N = txtN.getText();
				String i = txt_i.getText();
			
				Integer n = Integer.parseInt(n_godini);
				Integer k = Integer.parseInt(K);
				Integer o = Integer.parseInt(O);
				Integer nominal = Integer.parseInt(N);
				Integer percent = Integer.parseInt(i);
				
				//Mathematical function
				double sum = (percent / 100d); //0,11
				//formula for A*
				double q = 1+sum;
				double first_formula =(float) Math.pow(q, n); // qN
				double second_formula =(float) (q-1);
				double thirt_formula =(float) (first_formula*second_formula);
				double four_formula = (float)(first_formula-1);
				double five_formula = (float)(thirt_formula/four_formula);
				double A_zvezda= (float)(k*five_formula);
				//end of formulas
				//start of row one
				double Li = (int)(sum*k);
				String lihva = String.valueOf(Li);
				double Ti = (float) (A_zvezda-Li);
				String glavnica = String.valueOf(df.format(Ti));
			    double  ai= (int) (Ti/nominal);
				String tiraj = String.valueOf(ai);
				double Pi =(int) (ai*nominal);
				String pogashenie = String.valueOf(Pi);
				double Ai =(int)(Pi + Li);
				String vnoska = String.valueOf(Ai);
				double Ri = (Ti - Pi);
				String ostatuk = String.valueOf(df.format(Ri));
				
				    label_K.setText(K);
					label_o.setText(O);
					lbl_years.setText(n_godini);
					lbl_ai.setText(tiraj);
					lbl_Pi.setText(pogashenie);
					lbl_Lihva.setText(lihva);
					lbl_Ai.setText(vnoska);
					lbl_Ri.setText(ostatuk);
					lbl_Ti.setText(glavnica);
				
			    //end of row one
				
				//start of row two
			     double K2 =(int) (k-Pi);
			     String k2 = String.valueOf(K2);
			     double O2 = (int) (o-ai);
			     String o2 = String.valueOf(O2);
			     double L2 = (int)(sum*K2);
			     String l2 =  String.valueOf(L2);
			     double T2 = (A_zvezda-L2);
			     String t2 =  String.valueOf(df.format(T2));
			     double ai2= (int) (T2/nominal); 
			     String ai_2=  String.valueOf(ai2);
			     double P2 = (int) (ai2*nominal);
			     String p2 =  String.valueOf(P2);
			     double A2 =(int) (P2+L2);
			     String a2 =  String.valueOf(A2);
			     double R2 = (T2-P2);
			     String r2= String.valueOf(df.format(R2));
			     
			     label_R2.setText(r2);
			     label_A2.setText(a2);
			     lbl_P2.setText(p2);
			     label_ai2.setText(ai_2);
			     label_T2.setText(t2);
			     label_Li2.setText(l2);
			     label_O2.setText(o2);
			     label_K2.setText(k2);
			     
				//end of row two
				
			   //start of row three
			     double K3 =(int) (K2-P2);
			     String k3 = String.valueOf(K3);
			     double O3 = (int) (O2-ai2);
			     String o3 = String.valueOf(O3);
			     double L3 = (int)(sum*K3);
			     String l3 =  String.valueOf(L3);
			     double T3 = (A_zvezda-L3);
			     String t3 =  String.valueOf(df.format(T3));
			     double ai3= (int) ((T3/nominal)+1); 
			     String ai_3=  String.valueOf(ai3);
			     double P3 = (int) (ai3*nominal);
			     String p3 =  String.valueOf(P3);
			     double A3 =(int) (P3+L3);
			     String a3 =  String.valueOf(A3);
			     double R3 = (T3-P3);
			     String r3= String.valueOf(df.format(R3));
			     
			     label_R3.setText(r3);
			     label_A3.setText(a3);
			     label_P3.setText(p3);
			     label_ai3.setText(ai_3);
			     label_T3.setText(t3);
			     label_Li3.setText(l3);
			     label_O3.setText(o3);
			     label_K3.setText(k3);
			     //end of row three
				
			   //start of row four
			     double K4 =(int) (K3-P3);
			     String k4 = String.valueOf(K4);
			     double O4 = (int) (O3-ai3);
			     String o4 = String.valueOf(O4);
			     double L4 = (int)(sum*K4);
			     String l4 =  String.valueOf(L4);
			     double T4 = (A_zvezda-L4);
			     String t4 =  String.valueOf(df.format(T4));
			     double ai4= (int) ((T4/nominal)+1); 
			     String ai_4=  String.valueOf(ai4);
			     double P4 = (int) (ai4*nominal);
			     String p4 =  String.valueOf(P4);
			     double A4 =(int) (P4+L4);
			     String a4 =  String.valueOf(A4);
			     double R4 = (T4-P4);
			     String r4= String.valueOf(df.format(R4));
			     
			     label_R4.setText(r4);
			     label_A4.setText(a4);
			     label_P4.setText(p4);
			     label_ai4.setText(ai_4);
			     label_T4.setText(t4);
			     label_L4.setText(l4);
			     label_O4.setText(o4);
			     label_K4.setText(k4);
			     //end of four row
			     //start of row five
			     double K5 =(int) (K4-P4);
			     String k5 = String.valueOf(K5);
			     double O5 = (int) (O4-ai4);
			     String o5 = String.valueOf(O5);
			     double L5 = (int)(sum*K5);
			     String l5 =  String.valueOf(L5);
			     double T5 = (A_zvezda-L5);
			     String t5 =  String.valueOf(df.format(T5));
			     double ai5= (int) (T5/nominal); 
			     String ai_5=  String.valueOf(ai5);
			     double P5 = (int) (ai5*nominal);
			     String p5 =  String.valueOf(P5);
			     double A5 =(int) (P5+L5);
			     String a5 =  String.valueOf(A5);
			     double R5 = (T5-P5);
			     String r5= String.valueOf(df.format(R5));
			     
			     label_R5.setText(r5);
			     label_A5.setText(a5);
			     label_P5.setText(p5);
			     label_ai5.setText(ai_5);
			     label_T5.setText(t5);
			     label_L5.setText(l5);
			     label_O5.setText(o5);
			     label_K5.setText(k5);
				//end of row five 
			     //start of row six
			     double K6 =(int) (K5-P5);
			     String k6 = String.valueOf(K6);
			     double O6 = (int) (O5-ai5);
			     String o6 = String.valueOf(O6);
			     double L6 = (int)(sum*K6);
			     String l6 =  String.valueOf(L6);
			     double T6 = (A_zvezda-L6);
			     String t6 =  String.valueOf(df.format(T6));
			     double ai6= (int) ((T6/nominal)+1); 
			     String ai_6=  String.valueOf(ai6);
			     double P6 = (int) (ai6*nominal);
			     String p6 =  String.valueOf(P6);
			     double A6 =(int) (P6+L6);
			     String a6 =  String.valueOf(A6);
			     double R6 = (T6-P6);
			     String r6= String.valueOf(df.format(R6));
			     
			     label_R6.setText(r6);
			     label_A6.setText(a6);
			     label_P6.setText(p6);
			     label_ai6.setText(ai_6);
			     label_T6.setText(t6);
			     label_L6.setText(l6);
			     label_O6.setText(o6);
			     label_K6.setText(k6);
				
			
			
				
				
				
			}
		});
		btnTable.setBounds(659, 108, 148, 49);
		frame.getContentPane().add(btnTable);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reset 
				txtN.setText("");
				txt_i.setText("");
				txt_n.setText("");
				txtO.setText("");
				txtK.setText("");
			}
		});
		btnReset.setBounds(419, 569, 89, 23);
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
		btnCancel.setBounds(767, 569, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 212, 414, 2);
		frame.getContentPane().add(separator_1);
		
		lbl_Lihva = new JLabel("=");
		lbl_Lihva.setBounds(506, 259, 100, 14);
		frame.getContentPane().add(lbl_Lihva); 
		
		lbl_ai = new JLabel("=");
		lbl_ai.setBounds(249, 259, 70, 14);
		frame.getContentPane().add(lbl_ai);
		
		lbl_Pi = new JLabel("=");
		lbl_Pi.setBounds(329, 259, 116, 14);
		frame.getContentPane().add(lbl_Pi);
		
		lbl_years = new JLabel("=");
		lbl_years.setBounds(10, 259, 48, 14);
		frame.getContentPane().add(lbl_years);
		
		lbl_Ai = new JLabel("=");
		lbl_Ai.setBounds(629, 259, 96, 14);
		frame.getContentPane().add(lbl_Ai);
		
		lbl_Ri = new JLabel("=");
		lbl_Ri.setBounds(789, 259, 73, 14);
		frame.getContentPane().add(lbl_Ri);
		
		lbl_Ti = new JLabel("=");
		lbl_Ti.setBounds(903, 259, 89, 14);
		frame.getContentPane().add(lbl_Ti);
		frame.setVisible(true);
		
		JLabel lblNewLabel_1 = new JLabel("\u0413\u043E\u0434\u0438\u043D\u0438");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 237, 78, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u041E\u0431\u043B\u0438\u0433\u0430\u0446\u0438\u0438");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(156, 212, 111, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("\u0420\u0435\u0430\u043B\u043D\u043E \u043F\u043E\u0433\u0430\u0441\u0435\u043D\u0438\u0435");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(336, 237, 148, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("\u041B\u0438\u0445\u0432\u0430");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(535, 237, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u0420\u0435\u043B\u043D\u0438 \u0432\u043D\u043E\u0441\u043A\u0438");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setBounds(640, 237, 129, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u041E\u0441\u0442\u0430\u0442\u044A\u043A");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_5.setBounds(803, 237, 73, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0422\u0435\u043E\u0440.\u0433\u043B\u0430\u0432\u043D\u0438\u0446\u0430");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_6.setBounds(917, 237, 126, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(74, 237, 2, 332);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(322, 237, 14, 332);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBounds(494, 237, 14, 321);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setBounds(616, 237, 14, 321);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setBounds(779, 237, 14, 321);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setOrientation(SwingConstants.VERTICAL);
		separator_7.setBounds(892, 237, 14, 321);
		frame.getContentPane().add(separator_7);
		
		JLabel label_3 = new JLabel("\u0432 \u043E\u0431\u0440.");
		label_3.setBounds(186, 238, 48, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0432 \u0442\u0438\u0440\u0430\u0436");
		label_4.setBounds(262, 238, 48, 14);
		frame.getContentPane().add(label_4);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(156, 237, 14, 332);
		frame.getContentPane().add(separator_8);
		
		JLabel label_5 = new JLabel("\u041E\u0441\u0442. \u043D\u0430 \u0437\u0430\u0435\u043C");
		label_5.setBounds(86, 238, 70, 14);
		frame.getContentPane().add(label_5);
		
	    label_K = new JLabel("=");
		label_K.setBounds(86, 259, 70, 14);
		frame.getContentPane().add(label_K);
		
		 label_o = new JLabel("=");
		label_o.setBounds(167, 259, 60, 14);
		frame.getContentPane().add(label_o);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(0, 284, 1043, 14);
		frame.getContentPane().add(separator_9);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setOrientation(SwingConstants.VERTICAL);
		separator_10.setBounds(231, 236, 8, 333);
		frame.getContentPane().add(separator_10);
		
		JLabel label_1 = new JLabel("=");
		label_1.setBounds(10, 298, 48, 14);
		frame.getContentPane().add(label_1);
		//row two
		label_K2 = new JLabel("=");
		label_K2.setBounds(86, 298, 70, 14);
		frame.getContentPane().add(label_K2);
		
		label_O2 = new JLabel("=");
		label_O2.setBounds(167, 298, 60, 14);
		frame.getContentPane().add(label_O2);
		
		label_ai2 = new JLabel("=");
		label_ai2.setBounds(249, 298, 48, 14);
		frame.getContentPane().add(label_ai2);
		
		lbl_P2 = new JLabel("=");
		lbl_P2.setBounds(332, 298, 113, 14);
		frame.getContentPane().add(lbl_P2);
		
		label_Li2 = new JLabel("=");
		label_Li2.setBounds(506, 298, 100, 14);
		frame.getContentPane().add(label_Li2);
		
		label_A2 = new JLabel("=");
		label_A2.setBounds(629, 298, 96, 14);
		frame.getContentPane().add(label_A2);
		
		 label_R2 = new JLabel("=");
		label_R2.setBounds(789, 298, 73, 14);
		frame.getContentPane().add(label_R2);
		
		 label_T2 = new JLabel("=");
		label_T2.setBounds(903, 298, 89, 14);
		frame.getContentPane().add(label_T2);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setBounds(0, 323, 1043, 14);
		frame.getContentPane().add(separator_11);
		
		JLabel label_years = new JLabel("=");
		label_years.setBounds(10, 336, 48, 14);
		frame.getContentPane().add(label_years);
		//row three
	    label_K3 = new JLabel("=");
		label_K3.setBounds(86, 336, 60, 14);
		frame.getContentPane().add(label_K3);
		
		label_O3 = new JLabel("=");
		label_O3.setBounds(170, 336, 60, 14);
		frame.getContentPane().add(label_O3);
		
	    label_ai3 = new JLabel("=");
		label_ai3.setBounds(249, 336, 48, 14);
		frame.getContentPane().add(label_ai3);
		
		label_P3 = new JLabel("=");
		label_P3.setBounds(332, 336, 113, 14);
		frame.getContentPane().add(label_P3);
		
	    label_Li3 = new JLabel("=");
		label_Li3.setBounds(506, 336, 96, 14);
		frame.getContentPane().add(label_Li3);
		
		label_A3 = new JLabel("=");
		label_A3.setBounds(629, 336, 96, 14);
		frame.getContentPane().add(label_A3);
		
	    label_R3 = new JLabel("=");
		label_R3.setBounds(789, 336, 73, 14);
		frame.getContentPane().add(label_R3);
		
		label_T3 = new JLabel("=");
		label_T3.setBounds(903, 336, 89, 14);
		frame.getContentPane().add(label_T3);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(0, 361, 1053, 14);
		frame.getContentPane().add(separator_12);
		//row four
	    label_P4 = new JLabel("=");
		label_P4.setBounds(329, 372, 113, 14);
		frame.getContentPane().add(label_P4);
		
		label_L4 = new JLabel("=");
		label_L4.setBounds(506, 372, 100, 14);
		frame.getContentPane().add(label_L4);
		
		label_A4 = new JLabel("=");
		label_A4.setBounds(629, 372, 96, 14);
		frame.getContentPane().add(label_A4);
		
		label_R4 = new JLabel("=");
		label_R4.setBounds(789, 372, 73, 14);
		frame.getContentPane().add(label_R4);
		
		label_T4 = new JLabel("=");
		label_T4.setBounds(903, 372, 89, 14);
		frame.getContentPane().add(label_T4);
		
		label_ai4 = new JLabel("=");
		label_ai4.setBounds(249, 372, 48, 14);
		frame.getContentPane().add(label_ai4);
		
		JLabel label_6 = new JLabel("=");
		label_6.setBounds(10, 372, 48, 14);
		frame.getContentPane().add(label_6);
		
		label_K4 = new JLabel("=");
		label_K4.setBounds(86, 372, 70, 14);
		frame.getContentPane().add(label_K4);
		
		label_O4 = new JLabel("=");
		label_O4.setBounds(167, 372, 67, 14);
		frame.getContentPane().add(label_O4);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBounds(0, 259, 1053, 14);
		frame.getContentPane().add(separator_13);
		
		JSeparator separator_14 = new JSeparator();
		separator_14.setBounds(0, 397, 1053, 14);
		frame.getContentPane().add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBounds(0, 440, 1053, 14);
		frame.getContentPane().add(separator_15);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setBounds(0, 483, 1053, 14);
		frame.getContentPane().add(separator_16);
		
		label_O5 = new JLabel("=");
		label_O5.setBounds(167, 411, 60, 14);
		frame.getContentPane().add(label_O5);
		
		label_K5 = new JLabel("=");
		label_K5.setBounds(86, 411, 60, 14);
		frame.getContentPane().add(label_K5);
		//roe five
		label_ai5 = new JLabel("=");
		label_ai5.setBounds(249, 411, 70, 14);
		frame.getContentPane().add(label_ai5);
		
		label_P5 = new JLabel("=");
		label_P5.setBounds(331, 411, 153, 14);
		frame.getContentPane().add(label_P5);
		
		label_L5 = new JLabel("=");
		label_L5.setBounds(506, 415, 100, 14);
		frame.getContentPane().add(label_L5);
		
		label_A5 = new JLabel("=");
		label_A5.setBounds(629, 415, 141, 14);
		frame.getContentPane().add(label_A5);
		
		label_R5 = new JLabel("=");
		label_R5.setBounds(788, 415, 88, 14);
		frame.getContentPane().add(label_R5);
		
		label_T5 = new JLabel("=");
		label_T5.setBounds(903, 415, 141, 14);
		frame.getContentPane().add(label_T5);
		//row 6
		label_K6 = new JLabel("=");
		label_K6.setBounds(86, 458, 60, 14);
		frame.getContentPane().add(label_K6);
		
		label_O6 = new JLabel("=");
		label_O6.setBounds(170, 458, 60, 14);
		frame.getContentPane().add(label_O6);
		
		label_ai6 = new JLabel("=");
		label_ai6.setBounds(249, 458, 70, 14);
		frame.getContentPane().add(label_ai6);
		
		label_P6 = new JLabel("=");
		label_P6.setBounds(327, 458, 157, 14);
		frame.getContentPane().add(label_P6);
		
		label_L6 = new JLabel("=");
		label_L6.setBounds(506, 458, 100, 14);
		frame.getContentPane().add(label_L6);
		
		label_A6 = new JLabel("=");
		label_A6.setBounds(629, 458, 140, 14);
		frame.getContentPane().add(label_A6);
		
	    label_R6 = new JLabel("=");
		label_R6.setBounds(788, 458, 88, 14);
		frame.getContentPane().add(label_R6);
		
		label_T6 = new JLabel("=");
		label_T6.setBounds(903, 458, 129, 14);
		frame.getContentPane().add(label_T6);
		
		
		
		
	} 
	private JLabel label_O6;
	private JLabel label_K6;
	private JLabel label_ai6;
	private JLabel label_T6;
	private JLabel label_R6;
	private JLabel label_P6;
	private JLabel label_A6;
	private JLabel label_L6;
	
	private JLabel label_O5;
	private JLabel label_K5;
	private JLabel label_ai5;
	private JLabel label_T5;
	private JLabel label_R5;
	private JLabel label_P5;
	private JLabel label_A5;
	private JLabel label_L5;
	
	private JLabel label_O4;
	private JLabel label_K4;
	private JLabel label_ai4;
	private JLabel label_T4;
	private JLabel label_R4;
	private JLabel label_P4;
	private JLabel label_A4;
	private JLabel label_L4;
	
	private JLabel label_O3;
	private JLabel label_K3;
	private JLabel label_ai3;
	private JLabel label_P3;
	private JLabel label_Li3;
	private JLabel label_A3;
	private JLabel label_R3;
	private JLabel label_T3;
	
	
	private JLabel label_T2;
	private JLabel label_R2;
	private JLabel label_Li2;
	private JLabel lbl_P2;
	private JLabel label_A2;
	private JLabel label_ai2;
	private JLabel label_O2;
	private JLabel  label_K2;
	
	private JLabel label_o;
	private JLabel  label_K;
	private JLabel lbl_Lihva;
	private JLabel lbl_ai;
	private JLabel lbl_Ai;
	private JLabel lbl_Pi;
	private JLabel lbl_Ri;
	private JLabel lbl_Ti;
	private JLabel lbl_years;
}