package main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Info;
import util.UtilDB;

@WebServlet("/SimpleInsertHB")
public class SimpleInsertHB extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public SimpleInsertHB() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String title = request.getParameter("title").trim();
      String author = request.getParameter("author").trim();
      String genre = request.getParameter("genre").trim();
      String volumes = request.getParameter("volumes").trim();
      String year = request.getParameter("year").trim();
      UtilDB.createEmployees(title, author, genre, volumes, year);

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String header = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + header + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + header + "</h1>\n");
      out.println("<ul>");
      out.println("<li> Name: " + title);
      out.println("<li> Author: " + author);
      out.println("<li> Genre: " + genre);
      out.println("<li> Volumes: " + volumes);
      out.println("<li> Year: " + year);
      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
