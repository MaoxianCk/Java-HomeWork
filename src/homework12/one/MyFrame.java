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
		super("用户登录");
		loginedNumber = 0;
		jLabel1 = new JLabel("账户:");
		jLabel2 = new JLabel("密码:");
		jTextField1 = new JTextField(10);
		jPasswordField = new JPasswordField(10);
		jTextArea = new JTextArea(20, 50);
		button = new JButton("登录");

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextArea.append("第" + (++loginedNumber) + "个登录的用户 账号:" + jTextField1.getText() + " 密码:"
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
