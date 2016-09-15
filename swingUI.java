package WOTS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;


public class swingUI {
	
	CreateOrder ord = new CreateOrder();
	
	private JFrame frame;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swingUI window = new swingUI();
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
	public swingUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 121, 315, 130);
		textArea.setEditable(false);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Order 1");
		btnNewButton.setBounds(335, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Order 2");
		btnNewButton_1.setBounds(335, 195, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Order 3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String orderText = null;
				for(int i=0;i<5;i++){
				//textArea.setText(ord.orderArray().toString());
			}
			}
		});
		btnNewButton_2.setBounds(335, 161, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 97, 21);
		frame.getContentPane().add(menuBar);
		
		
	}
	
	
}
