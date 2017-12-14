package com.example.WSD.DAO;

import com.example.WSD.Model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Repository
public class TemplateDAO {

    JdbcTemplate jdbcTemplate;
    SessionFactory sessionFactory;


    public TemplateDAO() {
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void doSomething(){
        int i=1;
        int l=2;
        int l2=3;
        Session session = sessionFactory.openSession();
        User user =new User(2L,"K4","Kamil","Witkacy","a12@o2.pl","robotnik","root","12345");
        Room room = new Room(1l, RoomType.t1,"C104","EITI");
        Permission permission= new Permission(1l, PermType.normal,new Date("2012-01-13"),new Date("2019-01-13"),user,room,room);
        session.save(permission);
        session.flush();
        String hql = "FROM User";
        String hql2 = "FROM Permission";
        String hql3 = "FROM Room";
        Query query = session.createQuery(hql);
        Query query2 = session.createQuery(hql2);
        Query query3 = session.createQuery(hql3);
    }
}
