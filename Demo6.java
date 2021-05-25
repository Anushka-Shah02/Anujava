package com.demo6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo6 extends HttpServlet{
        public void doGet(HttpServletRequest req, HttpServletResponse res)
                throws ServletException,IOException{
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            ServletContext context=getServletContext();
            
            String driverName=context.getInitParameter("dname");
            pw.println("driver name is=" +driverName);
            
            pw.close();
        }
}
