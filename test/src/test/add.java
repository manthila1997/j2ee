package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class add extends HttpServlet   {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i = Integer.parseInt(req.getParameter("fname"));
		int j = Integer.parseInt(req.getParameter("fname2"));
		
		int t = i + j;
		
		PrintWriter out = res.getWriter();
		out.println(t);
	}
}
