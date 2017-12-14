package com.example.WSD;

import com.example.WSD.DAO.TemplateDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainGate {

    TemplateDAO templateDAO;

    public static void main(String[] args) {
        new MainGate();
    }

    public MainGate() {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //TemplateDAO templateDAO2 = (TemplateDAO) ctx.getBean("templateDAO");
        JdbcTemplate temp = (JdbcTemplate) appContext.getBean(JdbcTemplate.class);
        temp.queryForList("select * from Room");
        int x = 1;
    }

}

