package app.servlets;

import app.entities.User;
import app.enumerations.UserRoleEnum;
import app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Autowired
    UserService user;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        HttpSession session = req.getSession();
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String name = req.getParameter("name");
        String roleString = req.getParameter("role");
        UserRoleEnum role = UserRoleEnum.valueOf(roleString);
        try {
            if (login != null || user.getUserByLogin(login).getPassword() != null) {
                session.setAttribute("login", login);
                session.setAttribute("password", password);
                session.setAttribute("role", role);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
