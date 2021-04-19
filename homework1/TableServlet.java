package ua.kiev.prog;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "tableServlet", value = "/table")
public class TableServlet extends HttpServlet {

    static final Map<String,Integer> tb=new HashMap<>();

     static{
        tb.put("q1_yes", 0);
        tb.put("q1_no", 0);
        tb.put("q2_yes", 0);
        tb.put("q2_no", 0);
        tb.put("q3_yes", 0);
        tb.put("q3_no", 0);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String question1 = request.getParameter("question1");
        String question2 = request.getParameter("question2");
        String question3 = request.getParameter("question3");
        tb.put(question1, tb.get(question1) + 1);
        tb.put(question2, tb.get(question2) + 1);
        tb.put(question3, tb.get(question3) + 1);

       request.setAttribute("q1_yes", tb.get("q1_yes"));
       request.setAttribute("q1_no", tb.get("q1_no"));
       request.setAttribute("q2_yes", tb.get("q2_yes"));
       request.setAttribute("q2_no", tb.get("q2_no"));
       request.setAttribute("q3_yes", tb.get("q3_yes"));
       request.setAttribute("q3_no", tb.get("q3_no"));

//      getServletContext().getRequestDispatcher("/anketa.jsp").forward(request, response);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/anketa.jsp");
        requestDispatcher.forward(request,response);
    }
}
