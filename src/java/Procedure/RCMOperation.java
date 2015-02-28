/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.RCM;
import Prototypical.Person;
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
public class RCMOperation {
     public List<RCM> dataretrival(){
        System.out.println("<--44--<");
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("from RCM");
        List<RCM> listjod=q.list();
        return listjod;
    }
    
     public boolean insertDetails(RCM rcm) {
         
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
             
            Person person = rcm;

            s.save(person);
            s.save(rcm);

            tx.commit();
            s.clear();
            s.flush();

            return true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            tx.rollback();
            return false;
        } finally {
            s.close();
        }
    }
}
