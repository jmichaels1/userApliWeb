/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import model.AccessListRow;
import static model.HibernateManagerDB.getAllAccessRow;
import static model.HibernateManagerDB.registerAccess;
import model.LoginValidate;
import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
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
@RequestMapping("login.htm")
public class LoginController {
    
    private LoginValidate validarLogin;

    public LoginController() {
        validarLogin = new LoginValidate();
    }
    
    /**
     * 
     * @return 
     */
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
       return new ModelAndView("login","user",new User());
    }
    
    /**
     * 
     * @param user
     * @param result
     * @param session
     * @return 
     */
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(User user, BindingResult result, SessionStatus session){
        ModelAndView mv = new ModelAndView();
        validarLogin.validate(user, result);
        if (result.hasErrors()) {
            mv = new ModelAndView("login","command",new User());
        } else {
            registerAccess(user);
            ArrayList<AccessListRow> datos = getAllAccessRow();
            mv.addObject("datos", datos);
            mv.setViewName("lista");
        }
        return mv;   
    }
}
