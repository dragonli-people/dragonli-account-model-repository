package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.models.AccountAdjustmentEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface AccountAdjustmentRepository extends IAccountRepositoryExpand<AccountAdjustmentEntity,Long> {
    AccountAdjustmentEntity findFirstByOrderId(String orderId);
}
