package homework12.two;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	ButtonGroup buttonGroup1;
	JTextField jTextField1, jTextField2, jTextField3;
	JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;
	JButton button;

	public MyFrame() {
		super("Caculator");
		buttonGroup1 = new ButtonGroup();
		jTextField1 = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);
		jRadioButton1 = new JRadioButton("+");
		jRadioButton2 = new JRadioButton("-");
		jRadioButton3 = new JRadioButton("*");
		jRadioButton4 = new JRadioButton("/");
		button = new JButton("=");

		buttonGroup1.add(jRadioButton1);
		buttonGroup1.add(jRadioButton2);
		buttonGroup1.add(jRadioButton3);
		buttonGroup1.add(jRadioButton4);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(jTextField1.getText());
				double num2 = Double.valueOf(jTextField2.getText());
				double ans = 0;
				boolean mark=true;
				if (jRadioButton1.isSelected()) {
					ans = num1 + num2;
				} else if (jRadioButton2.isSelected()) {
					ans = num1 - num2;
				} else if (jRadioButton3.isSelected()) {
					ans = num1 * num2;
				} else if (jRadioButton4.isSelected()) {
					if (num2 == 0) {
						jTextField3.setText("Divied By Zero!");
						mark=false;
					} else {
						ans = num1 / num2;
					}
				}else {
					jTextField3.setText("No Choose Symbol!");
					mark=false;
				}
				if(mark==true) {
				jTextField3.setText(Double.toString(ans));
			}}
		});

		add(jTextField1);
		add(jRadioButton1);
		add(jRadioButton2);
		add(jRadioButton3);
		add(jRadioButton4);
		add(jTextField2);
		add(button);
		add(jTextField3);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();

	}
}
