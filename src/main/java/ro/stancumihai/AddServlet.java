package ro.stancumihai;

import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        Cookie cookie = new Cookie("k", String.valueOf(k));
        res.addCookie(cookie);
        Cookie cookie1 = new Cookie("j", String.valueOf(j));
        res.addCookie(cookie1);
        res.sendRedirect("square");  //URL Redirecting
    }
}
