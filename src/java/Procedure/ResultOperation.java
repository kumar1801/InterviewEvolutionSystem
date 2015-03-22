package Procedure;

import Databaseutil.MyFilterHib;
import Prototypical.*;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

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

    public ArrayList<Result> Dispresult() {
        ArrayList<Result> alinter = null;
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s;
        Transaction tx = null;
        s = sf.openSession();
        tx = s.beginTransaction();
        try {
            String hql = "From Result";
            Query query = s.createQuery(hql);
            alinter = (ArrayList<Result>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } finally {
            s.close();
        }
        return alinter;
    }

    public JFreeChart getResultChart() {
        ResultOperation ro = new ResultOperation();
        ArrayList<Result> dispresult = Dispresult();
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        for (Result r : dispresult) {
            ResultId rid = r.getId();
            dataSet.setValue(r.getObtainMark(), rid.getRoundId() + "", rid.getPersonid() + "");
        }
        JFreeChart chart = ChartFactory.createBarChart3D(
                "Recrument",
                "Cadidate",
                "Obtain Marks",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        chart.setBorderVisible(true);
        chart.setBorderVisible(false);
        return chart;
    }
}
