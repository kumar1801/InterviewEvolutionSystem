/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Databaseutil;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;
/**
 *
 * @author Devank
 */
public class MyFilterHib extends StrutsPrepareAndExecuteFilter{
    private static final SessionFactory sessionfactory;
    static
    {
        sessionfactory=new Configuration().configure().buildSessionFactory();
    }
    public static SessionFactory getsessionfactory()
    {
        return sessionfactory;
    
    }
}
