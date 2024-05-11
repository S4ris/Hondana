package Hondana.Hondana.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainPageController {

    @RequestMapping("/")
    public ModelAndView mainPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("MainPage/index.html");
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView loginPage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("MainPage/LoginPage/index.html");
        return mav;
    }
}
