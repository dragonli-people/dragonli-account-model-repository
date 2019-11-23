package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.models.PaymentEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface TransferRepository extends IAccountRepositoryExpand<PaymentEntity,Long> {
	PaymentEntity findByFromFlowerId(long id);
	PaymentEntity findFirstByEnterpriseIdOrderByAccountVersionDesc(long enterpriseId);
	PaymentEntity findByOrderId(String orderId);
}
