package tms.security.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import tms.security.exception.DivByNullException;
import tms.security.exception.NotFoundOperationException;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(DivByNullException.class)
    public String divByNullEx(DivByNullException divByNullException, Model model) {
        model.addAttribute("message", divByNullException.getMessage());
        return "errorPage";
    }

    @ExceptionHandler(NotFoundOperationException.class)
    public String notFoundOperationEx(NotFoundOperationException notFoundOperationException, Model model) {
        model.addAttribute("message", notFoundOperationException.getMessage());
        return "errorPage";
    }
}
