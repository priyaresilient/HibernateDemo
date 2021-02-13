package com.naksha.HibernateDemo;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentName sname = new StudentName("Naksha","Priya");
        Student s1 = new Student(102,sname,"CSE");
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        //ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(s1);
        tx.commit();
    }
}
