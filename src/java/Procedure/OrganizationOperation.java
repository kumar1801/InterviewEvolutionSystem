/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procedure;

/**
 *
 * @author Devank
 */
import Databaseutil.MyFilterHib;
import Prototypical.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OrganizationOperation {

    /**
     *
     * @param org
     * @return
     */
    public boolean insertDetails(Organization org) {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            System.out.println("31-----------------------");
            s.save(org);

            tx.commit();
            s.clear();
            s.flush();

            return true;
        } catch (Exception e) {

            e.printStackTrace();
            tx.rollback();
            return false;
        } finally {
            s.close();
        }
    }

    public ArrayList<Organization> OrganizationDetails() {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();

        ArrayList<Organization> viewOrganization = null;

        try {
            viewOrganization = new ArrayList<Organization>();
            String hql = "from Organization";
            Query q = s.createQuery(hql);
            viewOrganization = (ArrayList<Organization>) q.list();
        } catch (HibernateException e) {

            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return viewOrganization;
    }

    public ArrayList<Branch> BranchDetails() {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        ArrayList<Branch> viewBranch = null;
        try {
            viewBranch = new ArrayList<Branch>();
            String hql = "from Branch";
            Query q = s.createQuery(hql);
            viewBranch = (ArrayList<Branch>) q.list();
            Iterator<Branch> bs = viewBranch.iterator();
            while (bs.hasNext()) {
                Branch b = bs.next();
            }
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return viewBranch;
    }

    public ArrayList<Contactbranch> BranchContactDetails() {
        SessionFactory sf = MyFilterHib.getsessionfactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        ArrayList<Contactbranch> viewBranchContact = null;
        try {
            viewBranchContact = new ArrayList<Contactbranch>();
            String hql = "from Contactbranch";
            Query q = s.createQuery(hql);
            viewBranchContact = (ArrayList<Contactbranch>) q.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return viewBranchContact;
    }

}
