/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Databaseutil.MyFilterHib;
import Prototypical.ContactPerson;
import Prototypical.Head;
import Prototypical.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Devank
 */
public class HeadOperation {

    public boolean insertDetails(Head head) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            
            Person person = head;

            s.save(person);
            s.save(head);
            
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

