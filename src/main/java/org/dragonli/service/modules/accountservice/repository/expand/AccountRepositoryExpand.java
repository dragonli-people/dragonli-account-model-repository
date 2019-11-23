package org.dragonli.service.modules.accountservice.repository.expand;

import org.dragonli.jpatools.repository.AbstractRepositoryExpand;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import javax.persistence.EntityManager;
import java.io.Serializable;

@SuppressWarnings("SpringJavaConstructorAutowiringInspection")
public class AccountRepositoryExpand<T, ID extends Serializable> extends AbstractRepositoryExpand<T, ID> {

    public AccountRepositoryExpand(Class<T> domainClass, EntityManager em) {
        super(domainClass, em);
    }

    public AccountRepositoryExpand(JpaEntityInformation<T, ?> entityInformation, EntityManager em) {
        super(entityInformation, em);
    }

    public String testFindExpandAssets(){return "findExpandAssets";}
//    public GeneralRepositoryExpand(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
//        super(entityInformation, entityManager);
//    }
}
