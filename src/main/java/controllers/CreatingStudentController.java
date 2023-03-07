package controllers;

import db.DBManager;
import services.DateService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "CreatingStudentController", urlPatterns = "/creatingStudents")
public class CreatingStudentController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException // метод - открывает страницу
    {

        req.getRequestDispatcher("WEB-INF/jsp/creatingStudents.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException // метод - создает нового студента
    {
        String surname = req.getParameter("surname");
        String name = req.getParameter("name");
        String groupName = req.getParameter("group");
        String date = DateService.convertDateForDB(req.getParameter("date"));

        if (surname.equals("") || name.equals("") || groupName.equals("") || date.equals("")) {
            req.setAttribute("error", "1");
            req.getRequestDispatcher("WEB-INF/jsp/creatingStudents.jsp").forward(req, resp);
            return;
        }


        int groupId = DBManager.getGroupId(groupName);

        DBManager.createStudent(surname, name, groupId, date);
        resp.sendRedirect("/students"); // sendRedirect - метод возвращает на другую страницу после создания(завершения метода)

    }

}

