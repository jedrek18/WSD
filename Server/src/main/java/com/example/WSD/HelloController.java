package com.example.WSD;

import com.example.WSD.Model.WorkDay;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource.xml");
        DataSource = context.get
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(ssrb.build());
        Session session = sessionFactory.openSession();
        Calendar myCalendar = new GregorianCalendar(2014, 2, 11);
        Date myDate = myCalendar.getTime();
        WorkDay day = new WorkDay(1, myDate, 8.5, 10);
        String hql = "FROM WorkDay";
        Query query = session.createQuery(hql);
        return "123";
    }
}
