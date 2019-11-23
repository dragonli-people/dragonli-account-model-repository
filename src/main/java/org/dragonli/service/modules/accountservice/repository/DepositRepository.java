package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.enums.DepositStatus;
import org.dragonli.service.modules.accountservice.entity.models.DepositEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DepositRepository extends IAccountRepositoryExpand<DepositEntity, Long> {

    Page<DepositEntity> findAllByEnterpriseIdAndEnuserIdAndCurrencyOrderByIdDesc(Long enterpriseId, String userId,
            String currency, Pageable page);

    List<DepositEntity> findAllByDepositStatusOrderById(DepositStatus status);

    Page<DepositEntity> findAllByApplicationIdAndEnuserIdAndCurrencyOrderByIdDesc(Long applicationId, String userId,
            String currency, Pageable page);

    DepositEntity findFirstByOrderByIdDesc();
    DepositEntity findFirstByIdGreaterThanOrderById(Long id);

}
