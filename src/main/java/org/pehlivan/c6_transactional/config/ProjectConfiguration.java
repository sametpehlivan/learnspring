package org.pehlivan.c6_transactional.config;

import org.pehlivan.c6_transactional.repositories.ProductRepository;
import org.pehlivan.c6_transactional.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackageClasses = {ProductRepository.class, ProductService.class})
@EnableTransactionManagement
public class ProjectConfiguration
{
        @Bean(name = "dataSource")
        @Lazy
        public DataSource getDataSource(){
            System.out.println("DataSource getDataSource()");
            var dataSourceManager =  new DriverManagerDataSource();
            dataSourceManager.setUrl("jdbc:mysql://localhost:3306/demo");
            dataSourceManager.setUsername("root");
            dataSourceManager.setPassword("");
            return dataSourceManager;
        }
        @Bean (name = "jdbcTemplate")
        @Autowired
        @Lazy
        public JdbcTemplate getJdbcTemplate(@Lazy DataSource dataSource){
            System.out.println("DataSource getJdbcTemplate()");
            return new JdbcTemplate(dataSource);
        }
        @Bean(name = "platformTransactionManager")
        @Autowired
        @Lazy
        public PlatformTransactionManager transactionManager(@Lazy DataSource dataSource){
            return new DataSourceTransactionManager(dataSource);
        }
}
