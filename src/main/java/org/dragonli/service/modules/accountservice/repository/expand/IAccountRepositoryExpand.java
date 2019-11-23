package org.dragonli.service.modules.accountservice.repository.expand;

import org.dragonli.jpatools.repository.IRepositoryExpand;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface IAccountRepositoryExpand<T, ID extends Serializable> extends IRepositoryExpand<T, ID> {
}
