package com.demo8;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo81 extends HttpServlet {
          public void doGet(HttpServletRequest req,HttpServletResponse res){
               try{
                   res.setContentType("text/html");
                   PrintWriter out=res.getWriter();
                   
                   ServletContext context=getServletContext();
                   context.setAttribute("company","IBM");
                   
                   out.println("Welcome to first servlet");
                   out.println("<a href='servlet2'>visit</a>");
                   out.close();
                 
               } 
               catch(Exception e){
                   out.println(e);
               }
          }
         
}
