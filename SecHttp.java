package com.dem3;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SecHttp extends HttpServlet {
    public void doGet(HttpServletRequest req,HttpServletResponse res){
        try{
            res.setContentType("text/html");
            PrintWriter out=res.getWriter();
            
            HttpSession s=req.getSession(false);
            String n=(String)s.getAttribute("uname");
            
            out.print("Hello "+n);
            
            out.close();   
        }
        catch(Exception e)
    {
    System.out.println(e);
    }
    }
}
