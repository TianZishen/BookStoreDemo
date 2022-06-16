package im.zishen.study.bookstore_servlet.servlet;

import im.zishen.study.bookstore_servlet.model.User;
import im.zishen.study.bookstore_servlet.service.LoginService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("No GET method");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        if(LoginService.getInstance().login(user)){
            request.getSession().setAttribute("user", user);
            response.sendRedirect(getServletContext().getContextPath() + "/main.jsp");
        }
    }
}
