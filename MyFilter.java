package com.filter2;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
          public void init(FilterConfig arg0)
                  throws ServletException{}
          public void doFilter(ServletRequest req,
                  ServletResponse res,FiterChain chain)
                  throws IOException,ServletException{
              PrintWriter out=res.getWriter();
              
              String password=req.getParameter("password");
              if(password.equals("admin")){
                  chain.doFilter(req,res);
              }
              else{
                  out.print("username or password error!");
                  RequestDispatcher rd=req.getRequestDispatcher("index.html");  
                  rd.include(req, res);  
              }
              
          }
          
          public void destroy(){}

    @Override
    public boolean isLoggable(LogRecord record) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

                  
}
