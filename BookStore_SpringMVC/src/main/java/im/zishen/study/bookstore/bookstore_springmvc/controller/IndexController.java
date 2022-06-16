package im.zishen.study.bookstore.bookstore_springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView goToIndex(){
        return new ModelAndView("index");
    }
}
