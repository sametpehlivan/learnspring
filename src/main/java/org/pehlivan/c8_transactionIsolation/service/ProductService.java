package org.pehlivan.c8_transactionIsolation.service;

import org.pehlivan.c8_transactionIsolation.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    /*
    *
    * 1-
    *   TRANSACTION_READ_UNCOMMITTED
    *       bunda herhangi bir transaction beklenmeden veri okunur ve üç anomali de görğlmesi yüksektir.
    * 2-
    *   READ_COMMITTED
    *       Bu seviyede sadece COMMIT durumundaki transanction verisi okunabilir.
    *       Veri tabanına kayıt atan bir transactiondaki veri,
    *       commit olduktan sonra eş zamanda çalışan diğer transaction tarafından bu dataya ulaşılır.
    *       Bu seviyede “Dirty reads” anomalisi gerçekleşmez ama “non-repeatable_reads” ve “phantom_reads”
    *       anomalileri gerçekleşir.
    * 3-
    *   TRANSACTION_REPEATABLE_READ
    *       Yani eş zamanlı iki transactionda select yapan transactionın iki farklı dataya erişimi olmaz.
    *       Bu third level ya da 3.Seviye olarak adlandırılmaktadır.
    *       Bu seviyede sadece “non-repeatable_reads”anomalisi gerçekleşmez.
    * 4-
    *   TRANSACTION_SERIALIZABLE
    *       Bu seviyede hiç bir anomali gerçekleşmez ama transaction concurrency(eş zamanlılık) durumuna da
    *       izin vermez ve en az performanslı olan seviyedir.Eğer uygulamanızda isolation seviyesi belirlemezseniz
    *       o zaman datasourse olarak kullanıldığınız kütüphanedeki default değer kullanılır.
    * */

    @Transactional(isolation = Isolation.READ_COMMITTED)
    public void addTenProduct(String name){

    }
}