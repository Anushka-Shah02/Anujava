package com.demo2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
         @Override
         public void doPost(HttpServletRequest req ,HttpServletResponse res)
                 throws ServletException,IOException{
             res.setContentType("text/html");
             PrintWriter out=res.getWriter();
             
             String n=req.getParameter("userName");
             String p=req.getParameter("userPass");
             
             if(p.equals("servlet")){
                 RequestDispatcher rd=req.getRequestDispatcher("servlet2");
                 rd.forward(req,res);
             }
             else{
                 out.print("Sorry UserName or Password Error!");
                 RequestDispatcher rd=req.getRequestDispatcher("/index.html");
                 rd.include(req,res);
             }
         }
}
