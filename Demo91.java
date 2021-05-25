package com.demo9;

import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo91 extends HttpServlet {
    public void doPost(HttpServletRequest req,HttpServletResponse res){
       try{
           res.setContentType("text/html");
           PrintWriter out=res.getWriter();
           
           String n=req.getParameter("userName");
           out.print("Welcome"+n);
           
           Cookie ck=new Cookie("uname",n);
           res.addCookie(ck);
           
           out.print("<form action='servlet2'>");
           out.print("<input type='submit' value='go'>");
           out.print("</form>");
           
           out.close();
       } catch(Exception e){
           System.out.println(e);
       }
    }
}
