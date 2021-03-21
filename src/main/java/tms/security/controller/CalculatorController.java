package tms.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tms.security.entity.Operation;
import tms.security.service.CalculatorService;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public ModelAndView getCalculatePage(Operation operation, ModelAndView modelAndView) {
        modelAndView.setViewName("calc");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView postCalculatePage(@Valid Operation operation, Errors errors, ModelAndView modelAndView) {
        if (errors.hasErrors()) {
            modelAndView.setViewName("calc");
            return modelAndView;
        } else {
            calculatorService.getResult(operation);
            modelAndView.addObject("operation", operation);
            modelAndView.setViewName("calc");
            return modelAndView;
        }
    }
}
