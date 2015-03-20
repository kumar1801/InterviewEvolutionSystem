/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.ChangePassword;
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
 * @author Nagdaman
 */
public class ChangePasswordOperation {
    
    public boolean changePassword(ChangePassword cp) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        String msg = null;
        tx = s.beginTransaction();
        try {
            
            
            String SQL_QUERY="Update Person set password='"+cp.getNewpassword()+"' where password='"+cp.getPassword()+"'";
            
            
            Query query = s.createQuery(SQL_QUERY);
            int r=query.executeUpdate();
            
            tx.commit();
            
            return true;
        }
         catch (HibernateException e) {
            System.out.println(e.getMessage());

            return false;
        } finally {
            s.close();
        }
    }
    
}
