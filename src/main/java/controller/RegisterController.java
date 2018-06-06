/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import model.FormulariValidate;
import static model.HibernateManagerDB.registerAccess;
import static model.HibernateManagerDB.registerUser;
import model.LoginValidate;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author J Michael
 */
@Controller
@RequestMapping("form.htm")
public class RegisterController {
    
    private FormulariValidate validate;

    public RegisterController() {
        validate = new FormulariValidate();
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
       return new ModelAndView("form","user",new User());
    }
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("user") User user, BindingResult result, SessionStatus session){
        ModelAndView mv = new ModelAndView();
        validate.validate(user, result);
        if (result.hasErrors()) {
            mv.setViewName("form");
            mv.addObject("user", new User());
        } else {
             registerUser(user);
             registerAccess(user);
             mv.setViewName("success");
             mv.addObject("nom", user.getName());
             mv.addObject("email", user.getEmail());
        }
        return mv;
    }
    
    @ModelAttribute("dateValue")
    public String regDateVal(){
        return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }
    
}
