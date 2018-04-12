package test.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class MyWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField2;
	private JTextField txtaabbccdd;
	private JLabel lblArgb;
	private JButton btnArgbSenden;
	private JButton btnSendImage;
	private JLabel lblImage;
	private JLabel label;
	private JButton btnChooseFile;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow window = new MyWindow();
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
	public MyWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel lblIp = new JLabel("IP:");
		frame.getContentPane().add(lblIp);
		
		label_1 = new JLabel("");
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		label_2 = new JLabel("");
		frame.getContentPane().add(label_2);
		
		JLabel lblPort = new JLabel("Port:");
		frame.getContentPane().add(lblPort);
		
		label_3 = new JLabel("");
		frame.getContentPane().add(label_3);
		
		textField2 = new JTextField();
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		label_4 = new JLabel("");
		frame.getContentPane().add(label_4);
		
		lblArgb = new JLabel("ARGB:");
		frame.getContentPane().add(lblArgb);
		
		label_5 = new JLabel("");
		frame.getContentPane().add(label_5);
		
		txtaabbccdd = new JTextField();
		txtaabbccdd.setText("#AABBCCDD");
		frame.getContentPane().add(txtaabbccdd);
		txtaabbccdd.setColumns(10);
		
		label_6 = new JLabel("");
		frame.getContentPane().add(label_6);
		
		lblImage = new JLabel("Image:");
		frame.getContentPane().add(lblImage);
		
		label_7 = new JLabel("");
		frame.getContentPane().add(label_7);
		
		label_10 = new JLabel("");
		frame.getContentPane().add(label_10);
		
		btnChooseFile = new JButton("Choose file...");
		frame.getContentPane().add(btnChooseFile);
		
		btnSendImage = new JButton("send image");
		frame.getContentPane().add(btnSendImage);
		
		btnArgbSenden = new JButton("send ARGB");
		frame.getContentPane().add(btnArgbSenden);
		
		label_8 = new JLabel("");
		frame.getContentPane().add(label_8);
		
		label_9 = new JLabel("");
		frame.getContentPane().add(label_9);
		
		label = new JLabel("");
		frame.getContentPane().add(label);

	}

}
