package com.azimka.multidatasource_spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    @Autowired
    @Qualifier("taskJDBCTemplate")
    private JdbcTemplate jdbcTemplate;

    public String getTaskCount() {
        return "99";
    }

}
