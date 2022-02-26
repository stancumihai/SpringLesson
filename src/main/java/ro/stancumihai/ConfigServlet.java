package ro.stancumihai;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/config")
public class ConfigServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        PrintWriter out = res.getWriter();
        ServletConfig servletConfig = getServletConfig();
        out.println("Hi " + servletConfig.getInitParameter("name"));
//        gets name value from this servlet
        ServletContext context = getServletContext();
        out.println("Hi " + context.getInitParameter("name"));
//        gets global name from context
    }
}
