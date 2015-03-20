/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Prototypical.Round;
import Databaseutil.MyFilterHib;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jyotil
 */
public class RoundOperation {

    public boolean insRound(Round round) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            s.save(round);
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
                Round ro = (Round)session.get(Round.class, selectedDataId[i]);
                session.delete(ro);
                 transaction.commit();
            }
           
            return true;
        } catch (HibernateException e) {                                                                
            return false;
        }
    }
    
    public List<Round> asdewes(){
        System.out.println("<--44--<");
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("from Round");
        List<Round> listround=q.list();
        return listround;
    }
}
