import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;
 
public class CurrentDate extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      // Set response content type
      response.setContentType("cosas/pecina.html");
 
      PrintWriter out = response.getWriter();
      String title = "Display Current Date & Time";
      Date date = new Date();
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      
      out.println(docType +
         "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +// Extend HttpServlet class

            "<body bgcolor = \"#f0f0f0\">\n" +
               "<h1 align = \"center\">" + title + "</h1>\n" +
               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
            "</body>

          PrintWriter out = response.getWriter();
         response.setContentType("text/html");
 
            out.println("<html><head><title>Obtener IP del cliente</title></head><body>");
            out.println("<strong>Obtener la IP del cliente </strong>");
            out.println("La ip del cliente es " + ip + "<br>");
            out.println("El host del cliente es " + host);
            out.println("</body></html>");
         </html>";
   }
}