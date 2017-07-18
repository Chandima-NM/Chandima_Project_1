import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;

public class Classi3Search extends HttpServlet{
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
	rs=st.executeQuery("select *from FoodPackage_Classic where ContactNo="+con+"");
	while(rs.next()){
	out.println("Contact No:"+rs.getInt(1));
	out.println(",Package Name:"+rs.getString(2));
	out.println(",Package Price"+rs.getInt(3));
	out.println(",No of Days:"+rs.getInt(4));
	out.println(",No of Members:"+rs.getInt(5));
	}
	cn.close();
	}
	
	}
	catch(ClassNotFoundException e)
	{}
	catch(SQLException e)
	{}
	}
}