package cn.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    public static SessionFactory sf;

    static {
        sf = new Configuration().buildSessionFactory();
    }

    public static Session getSession(){
       return sf.openSession();
    }
}
