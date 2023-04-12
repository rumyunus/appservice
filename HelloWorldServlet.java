import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloWorldServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                    response.setContentType("text/html");
                            PrintWriter out = response.getWriter();
                                    out.println("<html>");
                                            out.println("<head>");
                                                    out.println("<title>Hello World Servlet</title>");
                                                            out.println("</head>");
                                                                    out.println("<body>");
                                                                            out.println("<h1>Hello World from a Java Servlet!</h1>");
                                                                                    out.println("</body>");
                                                                                            out.println("</html>");
                                                                                                }
                                                                                                }

