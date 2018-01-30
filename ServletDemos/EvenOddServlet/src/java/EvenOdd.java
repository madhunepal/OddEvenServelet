/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Payal Shah
 */
@WebServlet(urlPatterns = {"/EvenOdd"})
public class EvenOdd extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        PrintWriter out= resp.getWriter();
        
        int no= Integer.parseInt(req.getParameter("t1"));
        if(no%2==0)
            out.println("the no is even");
        else
            out.println("the no is odd");
               
    }

}