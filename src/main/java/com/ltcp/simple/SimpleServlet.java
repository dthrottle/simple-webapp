package com.ltcp.simple;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SimpleServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
				throws ServletException, IOException {

				PrintWriter out = response.getWriter();
				out.println("<html><body><center><h1>SimpleServlet Hello World!</h1>" +
						"</center></body></html>");
				out.flush();
				out.close();
	}

}