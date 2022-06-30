import java.awt.*;

import javax.swing.*;



import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class payingScreen extends JFrame {

	private JFrame frame;
	private JButton btnReturn;
	private JButton btnCashback;
	private int total = 0;
	

	public static void payscr() {
		BinaryTree tree = new BinaryTree(); 

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payingScreen window = new payingScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public payingScreen() {
		initialize();
		initialize();

	}
	
	public void initialize() {
		Node cola = new Node("Coca - Cola 1L", 314, 5);
		Node cheese = new Node("Cheese 250gr ", 218, 12);
		Node bread = new Node("Turkish Bread", 597, 2);
		Node empty = new Node("", 0, 0);

		
		frame = new JFrame();
		frame.setBounds(100, 100, 970, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		
		JLabel lblNewLabel = new JLabel("  WELCOME TO THE SUPERMARKET CASHIER SYSTEM");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblNewLabel.setBounds(210, 75, 500, 64);
		frame.getContentPane().add(lblNewLabel);
		Image image1 = new ImageIcon(this.getClass().getResource("/arabakucuk.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image1));

		JButton btnNewButton_1 = new JButton("Cash");
		btnNewButton_1.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnNewButton_1.setBounds(210, 503, 182, 109);
		frame.getContentPane().add(btnNewButton_1);

		JButton btnCreditCard = new JButton("Credit / Debit Card");
		btnCreditCard.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnCreditCard.setBounds(402, 503, 182, 109);
		frame.getContentPane().add(btnCreditCard);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		btnNewButton.setBounds(594, 503, 182, 109);
		frame.getContentPane().add(btnNewButton);
		


		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		comboBox.setBounds(46, 260, 222, 70);
		frame.getContentPane().add(comboBox);




		JLabel lblChooseItemsFrom = new JLabel("Choose items from the menu that you wish to buy");
		lblChooseItemsFrom.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblChooseItemsFrom.setBounds(48, 210, 386, 39);
		frame.getContentPane().add(lblChooseItemsFrom);
		Image image2 = new ImageIcon(this.getClass().getResource("/listkucuk.png")).getImage();

		comboBox.addItem(empty.name);
		comboBox.addItem(cola.name);
		comboBox.addItem(cheese.name);
		comboBox.addItem(bread.name);
		
				JLabel label = new JLabel("");
				label.setBounds(20, 217, 16, 22);
				frame.getContentPane().add(label);
				label.setIcon(new ImageIcon(image2));
		
		JLabel background = new JLabel("New label");
		background.setBounds(-29, 75, 897, 623);
		frame.getContentPane().add(background);
	
		
		Image image3 = new ImageIcon(this.getClass().getResource("/background2.png")).getImage();
		
		background.setBounds(0,0,960,690);
		background.setIcon(new ImageIcon(image3));
		
		comboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {

				
				if(comboBox.getSelectedItem() == cheese.name) {
					total = total + cheese.price;
				System.out.println("You choose " + comboBox.getSelectedItem() + "\nTotal is: " + total + "TL");
				
				}
				
				else if(comboBox.getSelectedItem() == cola.name) {
					total = total + cola.price;
				System.out.println("You choose " + comboBox.getSelectedItem() + "\nTotal is: " + total + "TL");
				
				}
				else if (comboBox.getSelectedItem() == bread.name){
					total = total + bread.price;
					System.out.println("You choose " + comboBox.getSelectedItem() + "\nTotal is: " + total + "TL");
				}
			}
		});
		
		


		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String cashPane;
				int change = 0;
				System.out.println("Cash panel is loading...");
				System.out.println("Cash panel is ready.");
				
				cashPane = JOptionPane.showInputDialog("Your total is: " + total + "\nInsert your cash");
				String response = cashPane;

				change = Integer.parseInt(cashPane) - total;
				String message = "Your change is: " + change + "\nHave a nice day.";
				System.out.println("Your change is: " + change + "TL");
				System.out.println("Change is coming...");
				System.out.println("Dont forgot to take your change.");
				JOptionPane.showMessageDialog(null, message);
				
				new payingScreen().setVisible(false);

			}
		});
		btnCreditCard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if(e.getSource() == btnCreditCard) {
					System.out.println("Credit-Card panel is loading...");
					System.out.println("Credit-Card panel is ready.");
					
					JOptionPane.showMessageDialog(null,"Your total is: " + total + "\nInsert your credit card to the machine.");
					
				}

			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog("Your total is: " + total + "\nEnter the exact amount of the total.");

				JOptionPane.showInputDialog("Enter you driver license number.");
				
				JOptionPane.showMessageDialog(null, "Thank you your receipt is ready don't forget to take it.");
				
				
			}
		});
	}
}
