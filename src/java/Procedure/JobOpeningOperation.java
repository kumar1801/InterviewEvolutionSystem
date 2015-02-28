/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.Jobopeningdetails;
import java.util.List;
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
    
    
     public List<Jobopeningdetails> dataretrival(){
        System.out.println("<--44--<");
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("from Jobopeningdetails ");
        List<Jobopeningdetails> listjod=q.list();
        return listjod;
    }
    
    
}
