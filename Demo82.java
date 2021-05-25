package com.demo8;

import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo82 extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res){
         try{
             res.setContentType("text/html");
             PrintWriter out=res.getWriter();
             
             ServletContext context=getServletContext();
             String n=(String)context.getAttribute("company");
             
             out.println("Welcome to"+n);
             out.close();
             
         }   catch(Exception e){
             out.println(e);
         }   
    }
}
