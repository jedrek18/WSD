package com.example.demo;

import com.example.demo.Model.WorkDay;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping("/lol")
    public String index() throws ParseException {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
        Session session = sessionFactory.openSession();
        Calendar myCalendar = new GregorianCalendar(2014, 2, 11);
        Date myDate = myCalendar.getTime();
//        WorkDay day = new WorkDay(1, myDate, 8.5, 10);
//        String hql = "FROM WorkDay";
//        Query query = session.createQuery(hql);
//        List results = query.list();
        return "123";
    }
}
