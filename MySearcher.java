package com.demo3; 

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MySearcher extends HttpServlet {
   protected void doGet(HttpServletRequest req,HttpServletResponse res)
           throws ServletException,IOException{
                  String name=req.getParameter("name");
                  res.sendRedirect("http://www.google.co.in/#q=" +name);
}
}      
