package ro.stancumihai;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int k = 0;
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("k")) {
                k = Integer.parseInt(cookie.getValue());
            }
        }
        int square = k * k;
        Cookie cookie = new Cookie("square", String.valueOf(square));
        res.addCookie(cookie);
        res.sendRedirect("multiply");
    }
}
