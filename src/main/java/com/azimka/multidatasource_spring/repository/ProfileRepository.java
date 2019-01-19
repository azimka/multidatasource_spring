package com.azimka.multidatasource_spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProfileRepository {

    private static final String PROFILE_REQUEST_RESULT_STUB = "Profile stub request result";

    @Qualifier("profileJDBCTemplate")
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getProfileDBInfo() {
        return PROFILE_REQUEST_RESULT_STUB;
    }
}
