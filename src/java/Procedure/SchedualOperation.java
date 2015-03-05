/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.Schedule;
import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jyotil
 */
public class SchedualOperation {

    public boolean insSchedule(Schedule schedule) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            s.save(schedule);
            tx.commit();
            s.clear();
            s.flush();
            return true;
        } catch (HibernateException e) {
            tx.rollback();
            return false;
        } finally {
            s.close();
        }
    }

}
