package org.dragonli.service.modules.accountservice.repository;

import org.dragonli.service.modules.accountservice.entity.enums.BusinessStatus;
import org.dragonli.service.modules.accountservice.entity.models.BusinessEntity;
import org.dragonli.service.modules.accountservice.repository.expand.IAccountRepositoryExpand;

import java.util.List;

public interface BusinessRepository extends IAccountRepositoryExpand<BusinessEntity,Long> {
//	BusinessEntity findFirstByUserIdOrderByAccountVersionDesc(long enterpriseId);
	BusinessEntity findByOrderId(String orderId);
	List<BusinessEntity> findAllByStatus(BusinessStatus status);
}
