package Data_InputSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Data_TaskInput.Data_TInput;
import Data_TaskThreeEmision.Data_ThreeEmision;
import Data_TaskTwoEmision.Data_TwoEmision;


import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Data_Input {

	private JFrame frame;
	private JTextField txtEmision;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_Input window = new Data_Input();
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
	public Data_Input() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 435, 251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label = new JLabel("\u0412\u044A\u0432\u0435\u0434\u0438 \u0431\u0440\u043E\u0439 \u0435\u043C\u0438\u0441\u0438\u0438 :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Arial", Font.BOLD, 14));
		label.setBounds(131, 52, 173, 14);
		frame.getContentPane().add(label);
		
		txtEmision = new JTextField();
		txtEmision.setBounds(167, 96, 96, 20);
		frame.getContentPane().add(txtEmision);
		txtEmision.setColumns(10); 
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			//submit and open the new window
			public void actionPerformed(ActionEvent e) {
				//string to integer
			  int numberEmision = Integer.parseInt(txtEmision.getText());
			  
					if(numberEmision < 1 && numberEmision > 3 ){
						JOptionPane.showMessageDialog(null, "Obligation system","ERROR", JOptionPane.ERROR_MESSAGE);	
					}
					else if(numberEmision == 1) {
						//open window for One Emision
						/*Data_TInput nw = new Data_TInput();
						nw.DataTIpnut();*/
						Data_TInput nextW = new Data_TInput();
						nextW.DataTIpnut();
					}
					else if(numberEmision == 2) {
						Data_TwoEmision s = new Data_TwoEmision();
						s.showTwoEmision();
					}
					else if(numberEmision ==3) {
						Data_ThreeEmision b = new Data_ThreeEmision();
						b.showThreeEmision();
					}
					
					else {
						JOptionPane.showMessageDialog(null, "No emission add","ERROR", JOptionPane.ERROR_MESSAGE);	
						System.exit(0);
					}
					
			}
		});
		btnSubmit.setBounds(27, 148, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//reset the text field
				txtEmision.setText("");
			}
			
		});
		btnReset.setBounds(172, 148, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//close the window
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnCancel.setBounds(311, 148, 89, 23);
		frame.getContentPane().add(btnCancel);
	}
}
