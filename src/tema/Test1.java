package tema;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class Test1 {

	private JFrame frame;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 window = new Test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	public Test1() {
		initialize();
	}
	
	public static Erou heroFactory(String erou, String art, String scop) {
		Erou er = null;
		if(erou.equals("Cavalerul Cosmin")) {
			er = new Cavaler("Cosmin",art,scop);
		}
		else if(erou.equals("Vrajitorul Vlad")) {
			er = new Vrajitor("Vlad",art, scop);
		}
		else if(erou.equals("Arcasul Andrei")) {
			er = new Arcas("Andrei",art,scop);
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
			String text1,text2,text3;
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				
				if(i==1) {
					text1=((JButton)obj).getText();
					option1.setText("Printesa");
					option2.setText("Comoara");
					option3.setText("Dragon");
				}
				else if(i==2) {
					text2=((JButton)obj).getText();
					option1.setText("Mar");
					option2.setText("Inel");
					option3.setText("Colier");
				}
				else if(i==3) {
					text3=((JButton)obj).getText();
					System.out.println(text1+text2+text3);
					erou = heroFactory(text1, text2, text3);
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
