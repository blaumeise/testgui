package test.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class OtherWindow {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtffbbff;
	private JTextField textField_Filename;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtherWindow window = new OtherWindow();
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
	public OtherWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 220);
		frame.setResizable(false);
		frame.setTitle("Beamer Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		textField = new JTextField();
		textField.setText("10.150.29.99");
		springLayout.putConstraint(SpringLayout.NORTH, textField, 17, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField, 74, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("9875");
		springLayout.putConstraint(SpringLayout.NORTH, textField_1, 6, SpringLayout.SOUTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, textField_1, -136, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, textField_1);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIp = new JLabel("IP:");
		springLayout.putConstraint(SpringLayout.NORTH, lblIp, 19, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblIp, 53, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblIp, -6, SpringLayout.WEST, textField);
		frame.getContentPane().add(lblIp);
		
		JLabel lblPort = new JLabel("Port:");
		springLayout.putConstraint(SpringLayout.WEST, lblPort, 42, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblPort, -304, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, textField_1, 7, SpringLayout.EAST, lblPort);
		springLayout.putConstraint(SpringLayout.NORTH, lblPort, 10, SpringLayout.SOUTH, lblIp);
		frame.getContentPane().add(lblPort);
		
		JButton btnSendArgb = new JButton("Send ARGB");
		btnSendArgb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = textField.getText();
				System.out.println("Text: " + text);
			}
		});
		frame.getContentPane().add(btnSendArgb);
		
		JLabel lblArgb = new JLabel("ARGB:");
		springLayout.putConstraint(SpringLayout.NORTH, lblArgb, 10, SpringLayout.SOUTH, lblPort);
		springLayout.putConstraint(SpringLayout.WEST, lblArgb, 33, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, lblArgb, 0, SpringLayout.EAST, lblIp);
		frame.getContentPane().add(lblArgb);
		
		txtffbbff = new JTextField();
		txtffbbff.setText("#FFBB00FF");
		springLayout.putConstraint(SpringLayout.NORTH, txtffbbff, 6, SpringLayout.SOUTH, textField_1);
		springLayout.putConstraint(SpringLayout.WEST, txtffbbff, 74, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(txtffbbff);
		txtffbbff.setColumns(10);
		
		JButton btnNewButton = new JButton("choose file...");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
		 
		        //Add a custom file filter and disable the default
		        //(Accept All) file filter.
		            fc.addChoosableFileFilter(new ImageFilter());
		            fc.setAcceptAllFileFilterUsed(false);
		 
		        //Add custom icons for file types.
		            fc.setFileView(new ImageFileView());
		 
		        //Add the preview pane.
		            fc.setAccessory(new ImagePreview(fc));		        
		 
		        //Show it.
		        int returnVal = fc.showDialog(frame, "Attach");
		 
		        //Process the results.
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		            File file = fc.getSelectedFile();
		            textField_Filename.setText(file.getName());
		            System.out.println("Attaching file: " + file.getName());
		        } else {
		            System.out.println("Attachment cancelled by user.");
		        }
		 
		        //Reset the file chooser for the next time it's shown.
		        fc.setSelectedFile(null);
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -27, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnNewButton);
		
		textField_Filename = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, textField_Filename, -298, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, textField_Filename, -136, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 7, SpringLayout.EAST, textField_Filename);
		springLayout.putConstraint(SpringLayout.NORTH, textField_Filename, 6, SpringLayout.SOUTH, txtffbbff);
		springLayout.putConstraint(SpringLayout.EAST, txtffbbff, 0, SpringLayout.EAST, textField_Filename);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, -3, SpringLayout.NORTH, textField_Filename);
		textField_Filename.setColumns(10);
		frame.getContentPane().add(textField_Filename);
		
		JLabel lblImage = new JLabel("Image:");
		springLayout.putConstraint(SpringLayout.NORTH, lblImage, 10, SpringLayout.SOUTH, lblArgb);
		springLayout.putConstraint(SpringLayout.EAST, lblImage, 0, SpringLayout.EAST, lblIp);
		frame.getContentPane().add(lblImage);
		
		JButton btnSendImage = new JButton("Send Image");
		btnSendImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnSendArgb, 0, SpringLayout.SOUTH, btnSendImage);
		springLayout.putConstraint(SpringLayout.WEST, btnSendImage, 167, SpringLayout.WEST, lblIp);
		springLayout.putConstraint(SpringLayout.NORTH, btnSendArgb, 0, SpringLayout.NORTH, btnSendImage);
		springLayout.putConstraint(SpringLayout.WEST, btnSendArgb, -131, SpringLayout.WEST, btnSendImage);
		springLayout.putConstraint(SpringLayout.EAST, btnSendArgb, -6, SpringLayout.WEST, btnSendImage);
		springLayout.putConstraint(SpringLayout.NORTH, btnSendImage, 18, SpringLayout.SOUTH, btnNewButton);
		springLayout.putConstraint(SpringLayout.EAST, btnSendImage, 0, SpringLayout.EAST, btnNewButton);
		frame.getContentPane().add(btnSendImage);
		
	}
}
