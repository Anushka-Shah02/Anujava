package com.dem1;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Demo2 extends HttpServlet{
   public void doGet(HttpServletRequest req,HttpServletResponse res){ 
           try{
             res.setContentType("text/html");
             PrintWriter out=res.getWriter();
             
             String n=req.getParameter("uname");
             out.print("Hello "+n);
             
             out.close();
   }
   catch(Exception e){
    System.out.println(e);
}
}
}
