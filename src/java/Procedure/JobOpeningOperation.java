/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.Jobopeningdetails;
import Prototypical.Person;
import Prototypical.Requiedqualification;
import Prototypical.RequiedqualificationId;
import Prototypical.Requireddocuments;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jyotil
 */
public class JobOpeningOperation {

    public boolean insData(Jobopeningdetails jobopeningdetails) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            s.save(jobopeningdetails);
            tx.commit();
            s.clear();
            s.flush();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            tx.rollback();
            return false;
        } finally {
            s.close();
        }
    }
    
    public boolean deleteMultipleCourse(int selectedDataId[]) {
        Session session = MyFilterHib.getsessionfactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            for (int i = 0; i < selectedDataId.length; i++) {
                Jobopeningdetails jodp = (Jobopeningdetails)session.get(Jobopeningdetails.class, selectedDataId[i]);
                session.delete(jodp);
                 transaction.commit();
            }
           
            return true;
        } catch (HibernateException e) {                                                                
            return false;
        }
    }

    public List<Jobopeningdetails> dataretrival() {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q = s.createQuery("from Jobopeningdetails ");
        Set<Requiedqualification> rq;
        List<Jobopeningdetails> listjod = q.list();
       
         s.clear();
         s.flush();
         s.close();
        return listjod;

    }
    
}
