package com.demo9;
import java.io.IOException;
import javax.servlet.*;  
import javax.servlet.http.*;  
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo92 extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        try{
            res.setContentType("text/html");
            try (PrintWriter out = res.getWriter()) {
                Cookie ck[]=req.getCookies();
                out.print("Hello" +ck[0].getValue());
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
