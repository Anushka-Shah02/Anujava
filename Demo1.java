package com.dem1;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo1 extends HttpServlet{
        public void doGet(HttpServletRequest req,HttpServletResponse res){
             try{
                 res.setContentType("text/html");
                 PrintWriter out=res.getWriter();
                 
                 String n=req.getParameter("userName");
                 out.print("Welcome "+n);
                 
                 out.print("<form action='servlet2'>");
                 out.print("<input type='hidden' name='uname' value='"+n+"'>");
                 out.print("<input type='submit' value='go'>");  
                 out.print("</form>");
                 out.close();
             }            
             catch(Exception e){
                 System.out.println(e);
             }
        }
}
