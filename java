import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InicioServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();

    out.println("<html><head><title>EcoRecompensas</title></head><body>");
    out.println("<h1>Bem-vindo ao EcoRecompensas</h1>");
    out.println("<p><a href='cadastro.html'>Clique aqui para se cadastrar</a></p>");
    out.println("</body></html>");
  }
}
