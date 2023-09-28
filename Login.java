import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame  implements ActionListener
{
	JLabel l1,l2;
	JTextField t1;
	JPasswordField p;
	JButton b1,b2;
	Container c;
	static int count=3;
	Login()
	{
		super(":: Login Form :: ");
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(new Color(50,178,60));

		l1=new JLabel("Enter username");	
		l2=new JLabel("Enter password");

		t1=new JTextField(10);
		p=new JPasswordField(10);		
		
		b1=new JButton("Login");
		b2=new JButton("Cancel");

		b1.addActionListener(this);
		b2.addActionListener(this);

		c.add(l1);
		c.add(t1);
		c.add(l2);
		c.add(p);
		
		c.add(b1);
		c.add(b2);

		setBounds(200,100,400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String uname=t1.getText();
		String pwd=p.getText();

		if(e.getSource()==b1)
		{
			
				if(uname.equalsIgnoreCase("yusuf") && pwd.equalsIgnoreCase("hasan"))
				{
					JOptionPane.showMessageDialog(null,"Login Successful","Login",1);
					count=3;
				}
				else
				{
					if(count==0)
					{					
						JOptionPane.showMessageDialog(null,"Login Denied","Login",0);
						System.exit(0);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Error in uname or pwd , timeleft = "+count,"Login",2);	
						count--;
					}
				}	
		}
		if(e.getSource()==b2)
		{
			System.exit(0);
		}

	}
	public static void main(String arg[])
	{
		new Login();
	}
		
}