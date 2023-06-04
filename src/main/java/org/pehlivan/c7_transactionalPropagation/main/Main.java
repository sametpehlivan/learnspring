package org.pehlivan.c7_transactionalPropagation.main;

import org.pehlivan.c7_transactionalPropagation.config.Config;
import org.pehlivan.c7_transactionalPropagation.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(Config.class)){
            var service = context.getBean(ProductService.class);
            service.addTenProduct("product");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
