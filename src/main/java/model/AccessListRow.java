/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author J Michael
 */
public class AccessListRow implements Comparable<AccessListRow>{
   
    private String name;
    private String lastName;
    private String email;
    private String enterprise;
    private String registerDate;
    private String accessDate;
    private String accessTime;
    private LocalDateTime ldt;
         
    
    /**
     * Método Constructor
     * @param name
     * @param lastName
     * @param email
     * @param enterprise
     * @param registerDate
     * @param accessDate
     * @param accessTime 
     */
    public AccessListRow(String name, String lastName, String email, String enterprise, 
            String registerDate, String accessDate, String accessTime) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.enterprise = enterprise;
        this.registerDate = registerDate;
        this.accessDate = accessDate;
        this.accessTime = accessTime;
        ldt = LocalDateTime.parse(accessDate + "T" + accessTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(String accessDate) {
        this.accessDate = accessDate;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    @Override
    public int compareTo(AccessListRow o) {
      if (ldt == null || o.ldt == null)
        return 0;
       return o.ldt.compareTo(ldt);
    }
     
}
