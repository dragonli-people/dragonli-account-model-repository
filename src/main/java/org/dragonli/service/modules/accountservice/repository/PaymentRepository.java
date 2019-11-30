package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.models.PaymentEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

public interface PaymentRepository extends IAccountRepositoryExpand<PaymentEntity,Long> {
	PaymentEntity findByOrderId(String orderId);
}
