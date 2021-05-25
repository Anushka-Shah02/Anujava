package com.demoserv;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServ extends HttpServlet {

    /**
     *
     * @param req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req,HttpServletResponse res)
            throws ServletException,IOException{
            res.setContentType("text/html");
        try (PrintWriter pw = res.getWriter()) {
            String name=req.getParameter("name");
            pw.println("Welcome"+name);
        }
    }
}
