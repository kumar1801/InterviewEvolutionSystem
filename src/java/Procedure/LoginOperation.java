/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.Login;
import Prototypical.Person;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Devank
 */
public class LoginOperation {

    public boolean getLoginDetails(Login login) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        String msg = null;

        try {

            String SQL_QUERY = " from Person where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
            System.out.println(SQL_QUERY);
            Query query = s.createQuery(SQL_QUERY);
            Iterator<Person> it = query.iterate();
            List<Person> list = query.list();
            System.out.println("---------------------------------");
            if (list.size() > 0) {
                System.out.println("-------------" + login.getPassword());

                s.clear();
                s.flush();

            }

            return true;

        } catch (HibernateException e) {
            System.out.println(e.getMessage());

            return false;
        } finally {
            s.close();
        }
    }

    public boolean getPasswordDetails(Login login) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        String msg = null;

        try {

            String SQL_QUERY = " from Person where password='" + login.getPassword() + "'";
            System.out.println(SQL_QUERY);
            Query query = s.createQuery(SQL_QUERY);
            Iterator<Person> it = query.iterate();
            List<Person> list = query.list();
            
            if (list.size() > 0) {

                s.clear();
                s.flush();

            }

            return true;

        } catch (HibernateException e) {
            System.out.println(e.getMessage());

            return false;
        } finally {
            s.close();
        }
    }
}
