package org.pehlivan.c7_transactionalPropagation.repositories;

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
    //propagation = Propagation.REQUIRED default
    // transactiojnal kullanıldı
    // @Transactional(propagation = Propagation.REQUIRES_NEW) her bir method çağırısı için yeniden transaction
    // oluşur.
    // Propagation.MANDATORY  bu mehtodun çalışması için bir transaction vaşlatılması gerekir
    //  Propagation.SUPPORTS kendisinin dahil olduğu transactioın yöntemine dahil olur ve onun gibi davranır
    // kendisinden önce bir transaciton balkamamılsa nontransation gibi davranış sergiler

    @Transactional(propagation = Propagation.SUPPORTS)
    public void addProduct(String name){

        String sql = "insert into demo.product values(NULL,?)";
        jdbcTemplate.update(sql,name);
        count++;
        if (count == 5){
            try {
                Thread.sleep(30000);
            }catch (Exception e)
            {

            }
            throw new RuntimeException();
        }
    }
}
