package tms.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/")
public class HelloController {

    @GetMapping
    public ModelAndView getPage(ModelAndView modelAndView){
        modelAndView.setViewName("hello");
        return modelAndView;
    }
}
