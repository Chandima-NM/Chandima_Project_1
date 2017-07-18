import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TotalPayment implements ActionListener
{
JLabel jl1;
JLabel jl2;
JLabel jl3;

JTextField jt1;
JTextField jt2;
JTextField jt3;

JButton jb;

void getGui()
{
	JFrame jf=new JFrame("EAGLE HEAD HOTEL");
	jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	jf.setSize(800,800);
	jf.setVisible(true);
	
	Container cn=jf.getContentPane();
	cn.setLayout(null);
	
	jl1=new JLabel("Booking Cost");
	jl1.setSize(100,30);
	jl1.setLocation(10,10);
	cn.add(jl1);
	
	jt1=new JTextField();
	jt1.setSize(100,30);
	jt1.setLocation(120,10);
	cn.add(jt1);
	
	
	jl2=new JLabel("Food Cost");
	jl2.setSize(100,30);
	jl2.setLocation(10,50);
	cn.add(jl2);
	
	jt2=new JTextField();
	jt2.setSize(100,30);
	jt2.setLocation(120,50);
	cn.add(jt2);
	
	jl3=new JLabel("Total Cost");
	jl3.setSize(100,30);
	jl3.setLocation(10,90);
	cn.add(jl3);
	
	jt3=new JTextField();
	jt3.setSize(100,30);
	jt3.setLocation(120,90);
	cn.add(jt3);
	
	
	
	jb=new JButton("Find");
	jb.setSize(100,30);
	jb.setLocation(10,130);
	cn.add(jb);
	
	jb.addActionListener(this);
	
}

public void actionPerformed(ActionEvent e)
{
	int a,b,c;
	
	
	String y;
	
	a=Integer.parseInt(jt1.getText());
	b=Integer.parseInt(jt2.getText());
	
	
	if(e.getSource()==jb){
		 c=a+b;
	}
	else{
	c=a*b;
	}
	
	y=String.valueOf(c);
	jt3.setText(y);
	
	
}


}
class MaTP
{
	public static void main(String[] ar)
	{
	 TotalPayment f=new TotalPayment();
	 f.getGui();
	}
}