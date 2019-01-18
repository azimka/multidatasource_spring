package com.azimka.multidatasource_spring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Bean("dbProfileService")
    @ConfigurationProperties(prefix = "spring.db-profile-service")
    public DataSource createProfileDatasouсe() {
        return DataSourceBuilder.create().build();
    }

    @Bean("dbTaskService")
    @ConfigurationProperties(prefix = "spring.db-task-service")
    public DataSource createTaskService() {
        return DataSourceBuilder.create().build();
    }

    @Bean("profileJDBCTemplate")
    @Autowired
    public JdbcTemplate createProfileJDBCTemplate(@Qualifier("dbProfileService") DataSource profileDatasource){
        return new JdbcTemplate(profileDatasource);
    }

    @Bean("taskJDBCTemplate")
    @Autowired
    public JdbcTemplate createTaskJDBCTemplate(@Qualifier("dbProfileService") DataSource taskDatasource){
        return new JdbcTemplate(taskDatasource);
    }
}
