package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;




    @WebServlet(name="CreatingStudentController", urlPatterns = "/creatingStudents")
    public class CreatingStudentController extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            req.getRequestDispatcher("WEB-INF/jsp/creatingStudents.jsp").forward(req, resp);

        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String surname = req.getParameter("surname");
            String name = req.getParameter("name");
            String group = req.getParameter("group");
            String date = req.getParameter("date");

            if(surname.equals("") || name.equals("") || group.equals("") || date.equals("")){
                req.setAttribute("error", "1");
                req.getRequestDispatcher("WEB-INF/jsp/creatingStudents.jsp").forward(req, resp);
                return;
            }

        }
    }
