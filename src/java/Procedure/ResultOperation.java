/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.*;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Jyotil
 */
public class ResultOperation {

    public boolean saveR(Result result) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            s.save(result);
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

    public ArrayList<Interviewee> Dispi() {
        ArrayList<Interviewee> alinter = null;
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            String hql = "From Interviewee";
            Query query = s.createQuery(hql);
            alinter = (ArrayList<Interviewee>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return alinter;
    }

    public ArrayList<Round> Disprnd() {
        ArrayList<Round> alinter = null;
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            String hql = "From Round";
            Query query = s.createQuery(hql);
            alinter = (ArrayList<Round>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return alinter;
    }
}
