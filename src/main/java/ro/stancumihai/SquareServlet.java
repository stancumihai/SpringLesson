package ro.stancumihai;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        int k = (int) req.getAttribute("k");

        PrintWriter out = res.getWriter();
        out.println(k + "from SquareServlet");
    }
}
