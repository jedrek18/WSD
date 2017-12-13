package com.example.WSD;

import com.example.WSD.DAO.TemplateDAO;
import com.example.WSD.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.TransactionManager;
import java.text.ParseException;
import java.util.Date;

@RestController
public class HelloController {


    TemplateDAO templateDAO;


    public TemplateDAO getTemplateDAO() {
        return templateDAO;
    }

    public void setTemplateDAO(TemplateDAO templateDAO) {
        this.templateDAO = templateDAO;
    }

    @RequestMapping("/lol")
    public String index() throws ParseException {
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//       configuration.addAnnotatedClass(User.class);
//        configuration.addAnnotatedClass(Room.class);
//        configuration.addAnnotatedClass(Permission.class);
////        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
//       SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//       User user =new User(2L,"K4","Kamil","Witkacy","a12@o2.pl","robotnik","root","12345");
//        Room room = new Room(1l, RoomType.t1,"C104","EITI");
//        Permission permission= new Permission(1l, PermType.normal,new Date("2012-01-13"),new Date("2019-01-13"),user,room);
//        session.save(permission);
//        session.flush();
//        String hql = "FROM User";
//        String hql2 = "FROM Permission";
//        String hql3 = "FROM Room";
//        Query query = session.createQuery(hql);
//        Query query2 = session.createQuery(hql2);
//        Query query3 = session.createQuery(hql3);
//        factory.close();
        templateDAO.test();
        return "123";
    }
}
