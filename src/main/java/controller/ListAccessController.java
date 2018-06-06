/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import model.AccessListRow;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import static model.HibernateManagerDB.getAllAccessRow;

/**
 *
 * @author J Michael
 */
@Controller
public class ListAccessController {
    
   
    /**
     * 
     * @param request
     * @return
     * @throws ServletException
     * @throws IOException 
     */
    @RequestMapping("lista.htm")
    public ModelAndView lista() throws ServletException, IOException{
        ModelAndView mv = new ModelAndView();
        ArrayList<AccessListRow> datos = getAllAccessRow();
        mv.addObject("datos", datos);
        mv.setViewName("lista");
        return mv;
    }
    
}
