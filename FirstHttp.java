package com.dem3;

import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class FirstHttp extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res){
        try{
            res.setContentType("text/html");
            PrintWriter out=res.getWriter();
            
            String n=req.getParameter("userName");
            out.print("Welcome "+n);
            
            HttpSession s=req.getSession();
            s.setAttribute("uname",n);
            
            out.print("<a href='servlet2'>visit</a>");
            out.close();
        }  catch(Exception e){
            System.out.println(e);
        }
    }
}
