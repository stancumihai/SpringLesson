package ro.stancumihai;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;

//        Session Management
//        PrintWriter out = res.getWriter();
//        out.println(k + "from AddServlet");
        req.setAttribute("k", k);
        RequestDispatcher rd = req.getRequestDispatcher("/square");
        rd.forward(req, res);
    }
}
