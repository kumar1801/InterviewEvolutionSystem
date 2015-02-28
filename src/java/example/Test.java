/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example;

import Databaseutil.MyFilterHib;
import Prototypical.Round;
import com.opensymphony.xwork2.ActionSupport;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Devank
 */
public class Test extends ActionSupport{
    @Override
    public String execute()
    {
        /*
       SessionFactory sf = MyFilterHib.getsessionfactory();
       Set jrclist=new HashSet();
        Transaction tx = null;
        Session s = sf.openSession();
        tx = s.beginTransaction();
        Query q=s.createQuery("JobReferenceCode from jobopeningdetails");
         jrclist=q.list();*/
        return SUCCESS;
    } 
    
}
