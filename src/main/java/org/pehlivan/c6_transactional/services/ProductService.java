package org.pehlivan.c6_transactional.services;

import org.pehlivan.c6_transactional.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;
    @Transactional
    // bu vatandaş  run time exception oluştuğu zaman rollback yapar
    // bu dasvranışını iki biçimde değiştriebilirsin
    // birincisi
    // @Transactional(rollbackFor = Exception.class)
    // rollbackFor ile Exception fırlatıldılğında rollback yap
    // @Transactional(noRollback = RuntimeException.class)
    // Runtime exception'ı fırlatışdığında rollback yapma
    // @Transactional bir istisnada rollback yapması için o istinsanın fırlatılması gerekir.

    public void addProduct(String name){
        productRepository.addProduct(name);
        throw new RuntimeException(":'(");
    }
}
