/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Databaseutil.MyFilterHib;

import Prototypical.Interviewee;
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
public class IntervieweeOperation {
    
     public List<Interviewee> dataretrival(){
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("from Interviewee");
        List<Interviewee> listinterviewee=q.list();
        return listinterviewee;
    }
     public boolean insertDetails(Interviewee interviewee) {
         
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
             
            Person person = interviewee;

            s.saveOrUpdate(person);
            s.saveOrUpdate(interviewee);

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
