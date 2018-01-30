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
@WebServlet(urlPatterns = {"/Addition"})
public class Addition extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out=resp.getWriter();
        int n1= Integer.parseInt(req.getParameter("no1"));
        int n2= Integer.parseInt(req.getParameter("no2"));
        
        String btn= req.getParameter("btn");
        switch(btn)
        {
            case "+": out.println("Add= "+(n1+n2));
                break;
            case "-": out.println("Sub= "+(n1-n2));
                break; 
            case "*": out.println("Mul= "+(n1*n2));
                break;
            case "/": out.println("Add= "+(n1/n2));
                break;
        
        }
        
        
    }


}