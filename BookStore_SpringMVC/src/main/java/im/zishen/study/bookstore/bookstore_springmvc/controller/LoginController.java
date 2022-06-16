package im.zishen.study.bookstore.bookstore_springmvc.controller;

import im.zishen.study.bookstore.bookstore_springmvc.model.User;
import im.zishen.study.bookstore.bookstore_springmvc.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @RequestMapping("/loginAction")
    public ModelAndView handleRequest(Model model,HttpServletRequest request, User user) throws Exception {
        ModelAndView mav = new ModelAndView();
        if(LoginService.getInstance().login(user)){

            request.getSession().setAttribute("user", user);
            mav.setViewName("main");

            //response.sendRedirect(request.getContextPath() + "/main");
        }
        return mav;
    }
    @RequestMapping("/login")
    public ModelAndView goToLoginPage(){
        return new ModelAndView("login");
    }
}
