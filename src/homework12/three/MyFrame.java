package homework12.three;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JTextField jTextField1, jTextField2, jTextField3;
	JComboBox<String> jComboBox;
	JButton button;

	public MyFrame() {
		super("Caculator");
		jTextField1 = new JTextField(10);
		jTextField2 = new JTextField(10);
		jTextField3 = new JTextField(10);

		button = new JButton("=");
		
		String[] str= {"+","-","*","/"};
		jComboBox=new JComboBox<String>(str);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.valueOf(jTextField1.getText());
				double num2 = Double.valueOf(jTextField2.getText());
				double ans = 0;
				boolean mark=true;
				if ("+".equals(jComboBox.getSelectedItem())) {
					ans = num1 + num2;
				} else if ("-".equals(jComboBox.getSelectedItem())) {
					ans = num1 - num2;
				} else if ("*".equals(jComboBox.getSelectedItem())) {
					ans = num1 * num2;
				} else if ("/".equals(jComboBox.getSelectedItem())) {
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
		add(jComboBox);
		add(jTextField2);
		add(button);
		add(jTextField3);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		pack();

	}
}
