package homework12.one;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	JLabel jLabel1, jLabel2;
	JTextField jTextField1;
	JPasswordField jPasswordField;
	JTextArea jTextArea;
	JButton button;

	private int loginedNumber;

	public MyFrame() {
		super("�û���¼");
		loginedNumber = 0;
		jLabel1 = new JLabel("�˻�:");
		jLabel2 = new JLabel("����:");
		jTextField1 = new JTextField(10);
		jPasswordField = new JPasswordField(10);
		jTextArea = new JTextArea(20, 50);
		button = new JButton("��¼");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextArea.append("��" + (++loginedNumber) + "����¼���û� �˺�:" + jTextField1.getText() + " ����:"
						+ new String(jPasswordField.getPassword()) + "\n");
			}
		});

		add(jLabel1);
		add(jTextField1);
		add(jLabel2);
		add(jPasswordField);

		add(jTextArea);

		add(button);

		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(620, 500);
		setVisible(true);
	}
}
