/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static model.HibernateManagerDB.closeExtSession;
import static model.HibernateManagerDB.openExtSession;
import static model.HibernateManagerDB.userExists;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author J Michael
 */
public class FormulariValidate implements Validator{
    
     private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + 
             "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
   
     private Pattern pattern;
     private Matcher matcher;


    @Override
    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name",
        "required.name", "El campo Nombre es Obligatorio.");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname",
        "required.lastname", "El campo Apellido es Obligatorio.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email",
        "required.email", "El campo Email es Obligatorio.");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "enterprise",
        "required.enterprise", "El campo Enterprise es Obligatorio.");

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "registerdate",
        "required.registerdate", "El campo registerdate es Obligatorio. refrescar la página");
        
        if (!(user.getEmail()!= null && user.getEmail().isEmpty())){
            this.pattern = Pattern.compile(EMAIL_PATTERN);
            this.matcher = pattern.matcher(user.getEmail());
             if (!matcher.matches()) {
                errors.rejectValue("email", "email.incorrect",
                  "El email " + user.getEmail() + " no es válido");
               }
             openExtSession();
            if (userExists(user.getEmail())) 
                errors.rejectValue("email", "email.incorrect", "Email ya se encuentra registrado");
            closeExtSession();
        }

    }
    
}
