package com.azimka.multidatasource_spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    @Qualifier("profileJDBCTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getProfileCount() {
        return "77";
    }
}
