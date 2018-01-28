package cn.itcast.a_hello;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import java.util.Date;

public class App {

    @Test
    public void testHello() throws Exception {
        // ¶ÔÏó
        Employee emp = new Employee();
        emp.setEmpName("小王");
        emp.setWorkDate(new Date());

        // »ñÈ¡¼ÓÔØÅäÖÃÎÄ¼þµÄ¹ÜÀíÀà¶ÔÏó
        Configuration config = new Configuration();
        config.configure();  // Ä¬ÈÏ¼ÓÔØsrc/hibenrate.cfg.xmlÎÄ¼þ
        // ´´½¨sessionµÄ¹¤³§¶ÔÏó
        SessionFactory sf = config.buildSessionFactory();
        // ´´½¨session (´ú±íÒ»¸ö»á»°£¬ÓëÊý¾Ý¿âÁ¬½ÓµÄ»á»°)
        Session session = sf.openSession();
        // ¿ªÆôÊÂÎñ
        Transaction tx = session.beginTransaction();
        //±£´æ-Êý¾Ý¿â
        session.save(emp);
        // Ìá½»ÊÂÎñ
        tx.commit();
        // ¹Ø±Õ
        session.close();
        sf.close();
    }
}
