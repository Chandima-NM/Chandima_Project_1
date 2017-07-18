import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FoodPayment implements ActionListener
{
JLabel jl1;
JLabel jl2;
JLabel jl3;
JLabel jl4;
JLabel jl5;

JTextField jt1;
JTextField jt2;
JTextField jt3;
JTextField jt4;

JComboBox jcb;

JButton jb;

void getGui()
{
	JFrame jf=new JFrame("EAGLE HEAD HOTEL");
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.setSize(800,800);
	jf.setVisible(true);
	
	Container cn=jf.getContentPane();
	cn.setLayout(null);
	
	jl1=new JLabel("Package Name");
	jl1.setSize(100,30);
	jl1.setLocation(10,10);
	cn.add(jl1);
	
	String[] s=new String[4];
	s[0]="FingerBuffets";
	s[1]="DelegateSitDownBuffet";
	s[2]="Banqueting";
	s[3]="Romance";
	
	jcb=new JComboBox(s);
	jcb.setSize(100,30);
	jcb.setLocation(120,10);
	cn.add(jcb);
	
	jl2=new JLabel("Package Price");
	jl2.setSize(100,30);
	jl2.setLocation(10,50);
	cn.add(jl2);
	
	jt1=new JTextField();
	jt1.setSize(100,30);
	jt1.setLocation(120,50);
	cn.add(jt1);
	
	jl3=new JLabel("No Of Days");
	jl3.setSize(100,30);
	jl3.setLocation(10,90);
	cn.add(jl3);
	
	jt2=new JTextField();
	jt2.setSize(100,30);
	jt2.setLocation(120,90);
	cn.add(jt2);
	
	jl4=new JLabel("No Of Mem");
	jl4.setSize(100,30);
	jl4.setLocation(10,130);
	cn.add(jl4);
	
	jt3=new JTextField();
	jt3.setSize(100,30);
	jt3.setLocation(120,130);
	cn.add(jt3);
	
	jl5=new JLabel("Cost");
	jl5.setSize(100,30);
	jl5.setLocation(10,170);
	cn.add(jl5);
	
	jt4=new JTextField();
	jt4.setSize(100,30);
	jt4.setLocation(120,170);
	cn.add(jt4);
	
	jb=new JButton("Find");
	jb.setSize(100,30);
	jb.setLocation(10,190);
	cn.add(jb);
	
	jb.addActionListener(this);
	
}

public void actionPerformed(ActionEvent e)
{
	int a,b,c;
	int h;
	
	String y;
	
	a=Integer.parseInt(jt1.getText());
	b=Integer.parseInt(jt2.getText());
	c=Integer.parseInt(jt3.getText());
	
	if(e.getSource()==jb){
		 h=a*b*c;
	}
	else{
	System.out.println("Error");
	}
	
	y=String.valueOf(h);
	jt4.setText(y);
	
	
}


}
class Ma1
{
	public static void main(String[] ar)
	{
	 FoodPayment f=new FoodPayment();
	 f.getGui();
	}
}