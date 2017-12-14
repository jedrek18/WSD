package com.example.WSD.DAO;

import com.example.WSD.Model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Calendar;
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

    public void doSomething() {
//        int i = 1;
//        int l = 2;
//        int l2 = 3;
//        Session session = sessionFactory.openSession();
//        User user = new User(2L, "K4", "Kamil", "Witkacy", "a12@o2.pl", "robotnik", "root", "12345");
//        Room room = new Room(1l, RoomType.t1, "C104", "EITI");
//        Permission permission = new Permission(1l, PermType.normal, new Date("2012-01-13"), new Date("2019-01-13"), user, room, room);
//        session.save(permission);
//        session.flush();
//        String hql = "FROM User";
//        String hql2 = "FROM Permission";
//        String hql3 = "FROM Room";
//        Query query = session.createQuery(hql);
//        Query query2 = session.createQuery(hql2);
//        Query query3 = session.createQuery(hql3);
    }

    public Session getNewSession() {
        return sessionFactory.openSession();
    }

    public void closeSession(Session session) {
        session.close();
    }

    public void initDate() {
        Session session = getNewSession();
        Transaction trx = session.beginTransaction();
        String[] names = {"Wiesiek", "Olaf", "Kamil", "Jedrzej", "Michal", "Pawel", "Grzegorz", "Mateusz", "Stanislaw", "" +
                "Slawomir", "Wiktor", "Witold", "Patryk", "Cezary", "Marcin", "Lukasz", "Ignacy", "Kacper", "Bartek"};
        int sizeNames = names.length;
        RoomType [] roomTypeList = RoomType.values();
        PermType [] permTypeList = PermType.values();
        int roomTypeSize =roomTypeList.length;
        int permTypeSize =permTypeList.length;
        String password = "root123";
        ArrayList<User> userList= new ArrayList<User>();
        ArrayList<Room> roomList= new ArrayList<Room>();
        ArrayList<Permission> permList= new ArrayList<Permission>();

        for (int i = 0; i < 100; ++i) {
            int idx = (int) (Math.random() * sizeNames-1);
            int idx2 = (int) (Math.random() * sizeNames-1);
            Date dt = new Date();
            Date dt2 = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(dt2);
            c.add(Calendar.DATE, 10 * (i + 1));
            dt2 = c.getTime();
            User user = new User(Long.valueOf(i), names[idx] + i, names[idx], names[idx], names[idx2], "", password, String.valueOf(i + 100));
            Room room = new Room(Long.valueOf(i),roomTypeList[i%roomTypeSize],"Sala-"+i,"Wydzial-"+i);
            Permission permission = new Permission(Long.valueOf(i+1),permTypeList[i%permTypeSize],dt,dt2,user,room);
            session.saveOrUpdate(user);
            session.saveOrUpdate(room);
            session.saveOrUpdate(permission);
            userList.add(user);
            roomList.add(room);
            permList.add(permission);
        }

        for(int i = 0; i < 100; ++i){
            int idx = (int) (Math.random() * 98);
            int idx2 = (int) (Math.random() * 98);
            int idx3 = (int) (Math.random() * 98);
            Permission permission = new Permission(Long.valueOf(i+101),permTypeList[(i+2)%permTypeSize],permList.get(idx).getEffectiveDate(),
                    permList.get(idx).getExpiredDate(), userList.get(idx2),roomList.get(idx3));
            //session.saveOrUpdate(permission);

        }
        trx.commit();
        closeSession(session);
    }


}
