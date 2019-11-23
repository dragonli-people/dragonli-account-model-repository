package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.enums.WithdrawalStatus;
import org.dragonli.service.modules.accountservice.entity.models.WithdrawalEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface WithdrawalRepository extends IAccountRepositoryExpand<WithdrawalEntity,Long> {
    Page<WithdrawalEntity> findAllByEnterpriseIdAndEnuserIdAndCurrencyOrderByIdDesc(Long enterpriseId, String userId,
            String currency, Pageable page);

    WithdrawalEntity findFirstByOrderId(String orderId);

    List<WithdrawalEntity> findAllByStatus(WithdrawalStatus status);

    Page<WithdrawalEntity> findAllByApplicationIdAndEnuserIdAndCurrencyOrderByIdDesc(Long applicationId, String userId,
            String currency, Pageable page);
//    WithdrawalEntity findBy
}
