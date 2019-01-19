package com.azimka.multidatasource_spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepository {

    private static final String TASK_REQUEST_STUB_RESULT = "task request stub";

    @Qualifier("taskJDBCTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getTaskDBInfo() {
        return TASK_REQUEST_STUB_RESULT;
    }
}
