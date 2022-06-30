import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.SecondaryLoop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Window;

public class welcomeScreen extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcomeScreen frame = new welcomeScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public welcomeScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 970, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("WELCOME TO THE SUPERMARKET CASHIER SYSTEM");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 17));
		lblNewLabel.setBounds(0, 49, 944, 512);
		contentPane.add(lblNewLabel);

		Image image1 = new ImageIcon(this.getClass().getResource("/araba.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image1));

		JButton btnNewButton = new JButton("START SHOPPING");
		btnNewButton.setBounds(686, 485, 153, 54);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					
					
				
					payingScreen nw = new payingScreen();	
					nw.payscr();
					 

			}
		});


	}
}
