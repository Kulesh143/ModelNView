package com.intellij.project.firstproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@Controller
public class HomeController {
    @RequestMapping("home")
    public ModelAndView home(Avatar avatar){
        ModelAndView mv=new ModelAndView();
        mv.addObject("object",avatar);
        mv.setViewName("home");
        return mv;
    }

}
