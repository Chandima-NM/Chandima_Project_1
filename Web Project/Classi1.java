import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Classi1 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	String btn=req.getParameter("b1");
	
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	String db="jdbc:mysql://localhost/Classic";
	Connection cn;
	Statement st;
	ResultSet rs;
	
	cn=DriverManager.getConnection(db,"root","");
	st=cn.createStatement();
	
	if(btn.equals("Submit"))
	{
	int con=Integer.parseInt(req.getParameter("t1"));
	String pn=req.getParameter("t2");
	int pp=Integer.parseInt(req.getParameter("t3"));
	int nd=Integer.parseInt(req.getParameter("t4"));
	int nm=Integer.parseInt(req.getParameter("t5"));
	
	
	st.executeUpdate("insert into FoodPackage_Platinum(ContactNo,PackageName,PackagePrice,NoOfDays,NoOfMembers) values('"+con+"','"+pn+"','"+pp+"','"+nd+"','"+nm+"')");
	}
	
	}
	catch(ClassNotFoundException e)
	{}
	catch(SQLException e)
	{}
	}
}