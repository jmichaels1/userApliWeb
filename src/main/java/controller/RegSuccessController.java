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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author J Michael
 */
@Controller
@RequestMapping("success.htm")
public class RegSuccessController {
    
    /**
     * 
     * @param request
     * @return 
     */
    @RequestMapping(params = "golist", method = RequestMethod.POST)
    public ModelAndView openLista(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        ArrayList<AccessListRow> datos = getAllAccessRow();
        mv.addObject("datos", datos);
        mv.setViewName("lista");
        return mv;
    }
}
