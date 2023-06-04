package org.pehlivan.c7_transactionalPropagation.config;

import org.pehlivan.c7_transactionalPropagation.repositories.ProductRepository;
import org.pehlivan.c7_transactionalPropagation.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackageClasses = {ProductRepository.class, ProductService.class})
public class Config
{
    @Bean("dataSource")
    public DataSource getDataSource(){
        var dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    }
    @Bean(name = "jdbcTemplate")
    @Autowired
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        return  new JdbcTemplate(dataSource);
    }
    @Bean(name = "platformTransactionManager")
    @Autowired
    public PlatformTransactionManager getTransactionManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
