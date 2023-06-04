package org.pehlivan.c8_transactionIsolation.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductRepository
{
    int count = 0;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addProduct(String name){
        String sql = "insert into demo.product values(NULL,?)";
        jdbcTemplate.update(sql,name);
    }
}

