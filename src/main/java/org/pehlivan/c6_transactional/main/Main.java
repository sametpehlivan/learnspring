package org.pehlivan.c6_transactional.main;

import org.pehlivan.c6_transactional.config.ProjectConfiguration;
import org.pehlivan.c6_transactional.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main
{
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class)){
            var service = context.getBean(ProductService.class);
            service.addProduct("msi");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
