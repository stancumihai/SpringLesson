package ro.stancumihai;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/multiply")
public class MultiplyServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int square = 1;
        int j = 0;
        Cookie[] cookies = req.getCookies();
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("square")) {
                square = Integer.parseInt(cookie.getValue());
            }
            if (cookie.getName().equals("j")) {
                j = Integer.parseInt(cookie.getValue());
            }
        }

        int multiplication = square * j;
        res.getWriter().println(multiplication);
    }
}
