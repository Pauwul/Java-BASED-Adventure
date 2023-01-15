package tema;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Test {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Test() {
		initialize();
	}
	
	public static Erou heroFactory(String erou) {
		Erou er = null;
		if(erou.equals("Cavalerul Cosmin")) {
			er = new Cavaler("Cosmin");
		}
		else if(erou.equals("Vrajitorul Vlad")) {
			er = new Vrajitor("Vlad");
		}
		else if(erou.equals("Arcasul Andrei")) {
			er = new Arcas("Andrei");
		}
		
		return er;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 800, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(44, 36, 681, 159);
		frame.getContentPane().add(textPane);
		
		JButton option1 = new JButton("Cavalerul Cosmin");
		option1.setBounds(44, 254, 186, 77);
		frame.getContentPane().add(option1);
		
		JButton option2 = new JButton("Vrajitorul Vlad");
		option2.setBounds(288, 254, 186, 77);
		frame.getContentPane().add(option2);
		
		JButton option3 = new JButton("Arcasul Andrei");
		option3.setBounds(539, 254, 186, 77);
		frame.getContentPane().add(option3);
		
		
		class Observer implements ActionListener{
			static int i=1;
			static Erou erou = null;
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				
				String text = ((JButton)obj).getText();
				if(i==1) {
					Erou erou = heroFactory(text);
					erou.updateHeader();
					
					option1.setText("Printesa");
					option2.setText("Comoara");
					option3.setText("Dragon");
				}
				if(i==2) {
					//erou.updateScop(text);
					System.out.println(text);
				}
				i++;
				
			}
		}
		Observer obs = new Observer();
		option1.addActionListener(obs);
		option2.addActionListener(obs);
		option3.addActionListener(obs);
		
	}
	public static void updatePrompt(int param) {
		
	}
}
