/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author J Michael
 */
public class HibernateManagerDB {

    private static Session session;
    private static ArrayList<Access> aListAccess;
    private static ArrayList<AccessListRow> aListAccessRow;
    private static Transaction tx;
    private static User user;

    private static String FORMATTER_TIME = "HH:mm:ss";

    /**
     * getAllAccessRow
     *
     * @return
     */
    public static ArrayList<AccessListRow> getAllAccessRow() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        aListAccess = (ArrayList<Access>) session.createQuery("from Access").list();
        updateAccessRowList();
        tx.commit();
        session.close();
        Collections.sort(aListAccessRow);
        return aListAccessRow;
    }

    /**
     * Insert User
     *
     * @param user
     */
    public static void registerUser(User user) {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    /**
     * getUser
     *
     * @param email
     * @return
     */
    public static User getUser(String email) {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        user = (User) session.get(User.class, email);
        return user;
    }

    /**
     * updateAccessRowList
     */
    public static void updateAccessRowList() {
        aListAccessRow = new ArrayList<>();
        User usr_aux;
        for (Access access : aListAccess) {
            usr_aux = getUser(access.getId().getEmail());
            aListAccessRow.add(new AccessListRow(usr_aux.getName(), usr_aux.getLastname(), usr_aux.getEmail(),
                    usr_aux.getEnterprise(), usr_aux.getRegisterdate(), access.getId().getDate(), access.getId().getTime()));
        }
    }

    /**
     * user exists
     *
     * @param email
     * @return
     */
    public static boolean userExists(String email) {
        boolean ret = false;
        if ((User) session.get(User.class, email) != null) {
            ret = true;
        }
        return ret;
    }

    /**
     * register access
     *
     * @param user
     */
    public static void registerAccess(User user) {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        session.save(new Access(new AccessId(user.getEmail(), LocalDate.now().format(DateTimeFormatter.ISO_DATE),
                LocalDateTime.now().format(DateTimeFormatter.ofPattern(FORMATTER_TIME))), user));
        tx.commit();
        session.close();
    }
    
    /**
     * open session from clas ext
     */
    public static void openExtSession() {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
    }
    
    /**
     * close session from clas ext
     */
    public static void closeExtSession() {
        tx.commit();
        session.close();
    }
}
