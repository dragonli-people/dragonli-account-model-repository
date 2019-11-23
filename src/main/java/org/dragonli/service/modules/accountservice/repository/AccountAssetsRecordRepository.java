package org.dragonli.service.modules.accountservice.repository;

import java.util.List;

import org.dragonli.service.modules.accountservice.entity.enums.AccountAssetsRecordStatus;
import org.dragonli.service.modules.accountservice.entity.models.AccountAssetsRecordEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface AccountAssetsRecordRepository extends IAccountRepositoryExpand<AccountAssetsRecordEntity, Long> {

    AccountAssetsRecordEntity findFirstByRecordStatusOrderById(AccountAssetsRecordStatus status);

    List<AccountAssetsRecordEntity> findTop10ByIdGreaterThanOrderById(long Id);

    List<AccountAssetsRecordEntity> findTop10ByIdGreaterThanAndRecordStatusOrderById(long Id,
            AccountAssetsRecordStatus status);

    AccountAssetsRecordEntity findFirstByOrderId(String orderId);
}
