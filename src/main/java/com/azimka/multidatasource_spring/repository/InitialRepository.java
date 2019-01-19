package com.azimka.multidatasource_spring.repository;

import com.azimka.multidatasource_spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InitialRepository implements ApplicationRunner {

//    @Qualifier("dbProfileService")
//    @Autowired
//    private JdbcTemplate profileJdbcTemplate;
//
//    @Autowired
//    @Qualifier("dbTaskService")
//    private JdbcTemplate taskJdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("asd");

    }
}
